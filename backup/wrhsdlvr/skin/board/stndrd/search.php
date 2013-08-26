<?php
$g4_path = '../../../'; // common.php 의 상대 경로
include_once($g4_path . '/common.php');

$q = strtolower($_GET["term"]);
if (!$q) return;

$sql = "
SELECT
    p.wr_id
    , CONCAT(e.wr_subject, ' > ', p.wr_subject, ' > ', s.wr_subject) AS wr_subject
FROM {$g4['write_prefix']}stndrd s
LEFT OUTER JOIN {$g4['write_prefix']}prdnm p ON p.wr_id = s.wr_1
LEFT OUTER JOIN {$g4['write_prefix']}entrps e ON e.wr_id = p.wr_1
ORDER BY
    e.wr_subject
    , p.wr_subject
";
$result = sql_query($sql);
for ($i = 0; $row = sql_fetch_array($result); $i++) {
    $items[$row['wr_subject']] = sprintf('%010d', $row['wr_id']);
}

//var_dump($items);

function array_to_json( $array ){

    if( !is_array( $array ) ){
        return false;
    }

    $associative = count( array_diff( array_keys($array), array_keys( array_keys( $array )) ));
    if( $associative ){

        $construct = array();
        foreach( $array as $key => $value ){

            // We first copy each key/value pair into a staging array,
            // formatting each key and value properly as we go.

            // Format the key:
            if( is_numeric($key) ){
                $key = "key_$key";
            }
            $key = "\"".addslashes($key)."\"";

            // Format the value:
            if( is_array( $value )){
                $value = array_to_json( $value );
            } else if( !is_numeric( $value ) || is_string( $value ) ){
                $value = "\"".addslashes($value)."\"";
            }

            // Add to staging array:
            $construct[] = "$key: $value";
        }

        // Then we collapse the staging array into the JSON form:
        $result = "{ " . implode( ", ", $construct ) . " }";

    } else { // If the array is a vector (not associative):

        $construct = array();
        foreach( $array as $value ){

            // Format the value:
            if( is_array( $value )){
                $value = array_to_json( $value );
            } else if( !is_numeric( $value ) || is_string( $value ) ){
                $value = "'".addslashes($value)."'";
            }

            // Add to staging array:
            $construct[] = $value;
        }

        // Then we collapse the staging array into the JSON form:
        $result = "[ " . implode( ", ", $construct ) . " ]";
    }

    return $result;
}

$result = array();
foreach ($items as $key=>$value) {
	if (strpos(strtolower($key), $q) !== false) {
		array_push($result, array("id"=>$value, "label"=>$key, "value" => strip_tags($key)));
	}
	if (count($result) > 11)
		break;
}
echo array_to_json($result);

?>
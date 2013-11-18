<?php
$g4_path = '../../..'; // common.php 의 상대 경로

include_once($g4_path . '/common.php');

//var_dump($GLOBALS);

//var_dump($is_admin);

//var_dump(is_null($is_admin));

//if (is_null($is_admin) == true) {
//    exit;
//}

//echo $config['cf_title'];

//var_dump($g4);
?>

<?php
if (is_null($is_admin) == true) {
    exit;
}
?>



<?php
$sql = "
SELECT *
FROM {$g4['write_prefix']}pet
WHERE 1 = 1
AND wr_1 = '{$customer_wr_id}'
ORDER BY wr_num
";
$result = sql_query($sql);

//var_dump($result);

$rows = array();

while ($row = sql_fetch_array($result)) {
    $rows[] = $row;
//    $rows[] = urlencode($row['wr_subject']);
//    $rows[] = ($row['wr_subject']);
}

//var_dump($rows);

//print json_encode($rows);
//print var_dump(json_decode(json_encode($rows)));

$arr = array ('a'=>1,'b'=>2,'c'=>3,'d'=>4,'e'=>5,'rows'=>$rows);
echo json_encode($arr);

//$json = json_encode($result);
//$json = preg_replace('/"(-?\d+\.?\d*)"/', '$1', $json);

//echo $json;
?>

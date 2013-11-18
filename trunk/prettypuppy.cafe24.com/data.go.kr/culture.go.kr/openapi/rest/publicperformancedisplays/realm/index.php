<?php
header('Content-Type: application/xml; charset=utf-8');

include_once('../../../../../../vendor/scripts.incutio.com/httpclient/HttpClient.class.php');

$client = new HttpClient('www.culture.go.kr');

$from = empty($_REQUEST['from']) ? date("Y0101") : $_REQUEST['from'];
$to = empty($_REQUEST['to']) ? date("Y1231") : $_REQUEST['to'];
$cPage = empty($_REQUEST['cPage']) ? 1 : $_REQUEST['cPage'];

$realmCode = empty($_REQUEST['realmCode']) ? '' : $_REQUEST['realmCode'];

//$realmCode = 'A000'; // 연극
//$realmCode = 'B000'; // 음악
//$realmCode = 'C000'; // 무용
//$realmCode = 'D000'; // 미술
//$realmCode = 'E000'; // 건축
//$realmCode = 'F000'; //
//$realmCode = 'G000'; // 영상
//$realmCode = 'H000'; // 문학
//$realmCode = 'I000'; //
//$realmCode = 'J000'; // 축제문화공간
//$realmCode = 'K000'; //
//$realmCode = 'L000'; // 기타
//$realmCode = 'M000'; // 뮤지컬
//$realmCode = 'N000'; //
//$realmCode = 'O000'; //
//$realmCode = 'P000'; //
//$realmCode = 'Q000'; //
//$realmCode = 'R000'; //
//$realmCode = 'S000'; //
//$realmCode = 'T000'; //
//$realmCode = 'U000'; //
//$realmCode = 'V000'; //
//$realmCode = 'W000'; //
//$realmCode = 'X000'; //
//$realmCode = 'Y000'; //
//$realmCode = 'Z000'; //

if (!$client->get('/openapi/rest/publicperformancedisplays/realm',
    array(
        'realmCode' => $realmCode
        , 'cPage' => $cPage
        , 'rows' => '10'
        , 'from' => $from
        , 'to' => $to
        , 'sido' => ''
        , 'gugun' => ''
        , 'place' => ''
        , 'gpsxfrom' => ''
        , 'gpsyfrom' => ''
        , 'gpsxto' => ''
        , 'gpsyto' => ''
        , 'keyword' => ''
        , 'sortStdr' => '1'
        , 'ServiceKey' => 'xo9UBF3Ou5yKrNDG+Ff4kSS+1cLLTncVt/vk8dkGxDc9UGbxtsrWYEcmINe6TFg0YUYNUEhBozaSV8gTWDFJ1A=='
    )
)) {
    die('An error occurred: '.$client->getError());
}

$pageContents = $client->getContent();

//var_dump($pageContents);

echo $pageContents;
?>

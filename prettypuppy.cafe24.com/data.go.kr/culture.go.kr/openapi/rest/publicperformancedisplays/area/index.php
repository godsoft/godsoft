<?php
header('Content-Type: application/xml; charset=utf-8');

include_once('../../../../../../vendor/scripts.incutio.com/httpclient/HttpClient.class.php');

$client = new HttpClient('www.culture.go.kr');

$sido = empty($_REQUEST['sido']) ? '' : $_REQUEST['sido'];
$from = empty($_REQUEST['from']) ? date("Y0101") : $_REQUEST['from'];
$to = empty($_REQUEST['to']) ? date("Y1231") : $_REQUEST['to'];
$cPage = empty($_REQUEST['cPage']) ? 1 : $_REQUEST['cPage'];

//if ($sido == 'ÀüÃ¼') {
//    $sido = '';
//}

if (!$client->get('/openapi/rest/publicperformancedisplays/area',
    array(
        'sido' => $sido
        , 'gugun' => ''
        , 'from' => $from
        , 'to' => $to
        , 'place' => ''
        , 'gpsxfrom' => ''
        , 'gpsyfrom' => ''
        , 'gpsxto' => ''
        , 'gpsyto' => ''
        , 'cPage' => $cPage
        , 'rows' => '10'
        , 'keyword' => '1'
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

<?php
header('Content-Type: application/xml; charset=utf-8');

include_once('../../vendor/scripts.incutio.com/httpclient/HttpClient.class.php');

$client = new HttpClient('www.culture.go.kr');

//bool get($path, $data = false)

if (!$client->get('/openapi/rest/publicperformancedisplays/period',
    array(
//        'from' => '20101118'
//        , 'to' => '20101217'
        'from' => '20111101'
        , 'to' => '20111130'
//        'from' => '20111201'
//        , 'to' => '20111231'
//        'from' => '20120101'
//        , 'to' => '20120131'
        , 'cPage' => '1'
//        , 'cPage' => '2'
        , 'rows' => '10'
//        , 'rows' => '100'
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

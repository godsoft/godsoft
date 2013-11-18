<?php
header('Content-Type: application/xml; charset=utf-8');

include_once('../../../../../../vendor/scripts.incutio.com/httpclient/HttpClient.class.php');

$client = new HttpClient('www.culture.go.kr');

$seq = empty($_REQUEST['seq']) ? '0' : $_REQUEST['seq'];

if (!$client->get('/openapi/rest/publicperformancedisplays/d/',
    array(
        'seq' => $seq
        , 'ServiceKey' => 'xo9UBF3Ou5yKrNDG+Ff4kSS+1cLLTncVt/vk8dkGxDc9UGbxtsrWYEcmINe6TFg0YUYNUEhBozaSV8gTWDFJ1A=='
    )
)) {
    die('An error occurred: '.$client->getError());
}

$pageContents = $client->getContent();

//var_dump($pageContents);

echo $pageContents;
?>

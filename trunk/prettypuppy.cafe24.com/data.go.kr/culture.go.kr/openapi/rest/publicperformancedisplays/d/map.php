<?php
header('Content-Type: application/xml; charset=utf-8');

include_once('../../../../../../vendor/scripts.incutio.com/httpclient/HttpClient.class.php');

//http://map.naver.com/api/geocode.php?key=5e3695e51bd1a758bd6b5dc8bae69931&encoding=utf-8&coord=tm128&query=���� ���α� ��ȭ�� 70-1����

$client = new HttpClient('map.naver.com');

//bool get($path, $data = false)

if (!$client->get('/api/geocode.php',
    array(
        'key' => '5e3695e51bd1a758bd6b5dc8bae69931'
        , 'encoding' => 'utf-8'
        , 'query' => '���� ���α� ��ȭ�� 70-1����'
    )
)) {
    die('An error occurred: '.$client->getError());
}

$pageContents = $client->getContent();

//var_dump($pageContents);

echo $pageContents;
?>

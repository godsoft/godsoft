<?php
header('Content-Type: application/xml; charset=utf-8');

include_once('../../../../../../vendor/scripts.incutio.com/httpclient/HttpClient.class.php');

$client = new HttpClient('www.culture.go.kr');

// http://www.justin-cook.com/wp/2009/04/18/get-the-first-last-day-of-the-month-with-php/
// Get the first & last day of the month with PHP
//$from = empty($_REQUEST['from']) ? date('Ymd', strtotime(date('m') . '/01/' . date('Y') . ' 00:00:00')) : $_REQUEST['from'];
//$to = empty($_REQUEST['to']) ? date('Ymd', strtotime('-1 second', strtotime('+1 month', strtotime(date('m') . '/01/' . date('Y') . ' 00:00:00')))) : $_REQUEST['to'];

//$from = empty($_REQUEST['from']) ? date("Ym01") : $_REQUEST['from'];
//$to = empty($_REQUEST['to']) ? date("Ymt") : $_REQUEST['to'];

$from = empty($_REQUEST['from']) ? date("Y0101") : $_REQUEST['from'];
$to = empty($_REQUEST['to']) ? date("Y1231") : $_REQUEST['to'];

//$from = '20110101';
//$to = '20111231';
//
//$from = '';
//$to = '';
//
//$from = '20111101';
//$to = '20111122';

$cPage = empty($_REQUEST['cPage']) ? 1 : $_REQUEST['cPage'];

if (!$client->get('/openapi/rest/publicperformancedisplays/period',
    array(
        'from' => $from // ���۱Ⱓ
        , 'to' => $to // ����Ⱓ
        , 'cPage' => $cPage // ����������
        , 'rows' => '10' // �������� ROW��
        , 'place' => '' // ���
        , 'gpsxfrom' => '' // �浵 ����
        , 'gpsyfrom' => '' // ���� ����
        , 'gpsxto' => '' // �浵 ����
        , 'gpsyto' => '' // ���� ����
        , 'keyword' => '' // �˻�Ű����
        , 'sortStdr' => '1' // ���ı���, 1:�����, 2:������, 3:����
        , 'ServiceKey' => 'xo9UBF3Ou5yKrNDG+Ff4kSS+1cLLTncVt/vk8dkGxDc9UGbxtsrWYEcmINe6TFg0YUYNUEhBozaSV8gTWDFJ1A=='
    )
)) {
    die('An error occurred: '.$client->getError());
}

$pageContents = $client->getContent();

echo $pageContents;
?>

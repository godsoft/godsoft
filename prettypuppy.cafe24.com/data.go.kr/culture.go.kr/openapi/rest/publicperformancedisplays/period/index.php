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
        'from' => $from // 시작기간
        , 'to' => $to // 종료기간
        , 'cPage' => $cPage // 현재페이지
        , 'rows' => '10' // 페이지당 ROW수
        , 'place' => '' // 장소
        , 'gpsxfrom' => '' // 경도 하한
        , 'gpsyfrom' => '' // 위도 하한
        , 'gpsxto' => '' // 경도 상한
        , 'gpsyto' => '' // 위도 상한
        , 'keyword' => '' // 검색키워드
        , 'sortStdr' => '1' // 정렬기준, 1:등록일, 2:공연명, 3:지역
        , 'ServiceKey' => 'xo9UBF3Ou5yKrNDG+Ff4kSS+1cLLTncVt/vk8dkGxDc9UGbxtsrWYEcmINe6TFg0YUYNUEhBozaSV8gTWDFJ1A=='
    )
)) {
    die('An error occurred: '.$client->getError());
}

$pageContents = $client->getContent();

echo $pageContents;
?>

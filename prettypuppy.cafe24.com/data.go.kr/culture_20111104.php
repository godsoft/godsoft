<?php
//header('Content-Type: text/xml, charset=utf-8');

//header('Content-Type: text/xml, charset=utf-8');
//echo '<?xml version="1.0" encoding="utf-8"?>';

//header('Content-type: text/xml');

////echo 'test';
//
////String serviceUrl = "http://www.culture.go.kr/openapi/rest/publicperformancedisplays/period?from=20101118&to=20101217&cPage=1&rows=10&place=&gpsxfrom=&gpsyfrom=&gpsxto=&gpsyto=&keyword=&sortStdr=1";
////String serviceKey = "xo9UBF3Ou5yKrNDG+Ff4kSS+1cLLTncVt/vk8dkGxDc9UGbxtsrWYEcmINe6TFg0YUYNUEhBozaSV8gTWDFJ1A=="; // 서비스
//
////utf8_encode
//
//$filename = 'http://www.culture.go.kr/openapi/rest/publicperformancedisplays/period?from=20101118&to=20101217&cPage=1&rows=10&place=&gpsxfrom=&gpsyfrom=&gpsxto=&gpsyto=&keyword=&sortStdr=1&ServiceKey=';
////$filename .= utf8_encode('xo9UBF3Ou5yKrNDG+Ff4kSS+1cLLTncVt/vk8dkGxDc9UGbxtsrWYEcmINe6TFg0YUYNUEhBozaSV8gTWDFJ1A==');
//$filename .= urlencode('xo9UBF3Ou5yKrNDG+Ff4kSS+1cLLTncVt/vk8dkGxDc9UGbxtsrWYEcmINe6TFg0YUYNUEhBozaSV8gTWDFJ1A==');
////
////$html = implode('', file($filename));
////
////echo $html;
//
////$homepage = file_get_contents('http://www.naver.com/');
////echo $homepage;
//
////echo $filename;
//
//$filename = 'http://www.culture.go.kr/';
//
//$fp = fsockopen($filename, 80, $errno, $errstr, 30);
//
////echo $fp;
//
//if (!$fp) {
//    echo "$errstr ($errno)<br />\n";
//} else {
////    $out = "GET / HTTP/1.1\r\n";
//
////$header = "GET /ver2/login.php?id=user&pass=pass\r\n";
//// [출처] 제트스윙 블로그 - http://zetswing.com
//
//    $out = "GET /openapi/rest/publicperformancedisplays/period?from=20101118&to=20101217&cPage=1&rows=10&place=&gpsxfrom=&gpsyfrom=&gpsxto=&gpsyto=&keyword=&sortStdr=1&ServiceKey=" . urlencode('xo9UBF3Ou5yKrNDG+Ff4kSS+1cLLTncVt/vk8dkGxDc9UGbxtsrWYEcmINe6TFg0YUYNUEhBozaSV8gTWDFJ1A==') . " HTTP/1.1\r\n";
//
//    $out .= "Host: www.example.com\r\n";
//    $out .= "Connection: Close\r\n\r\n";
//    fwrite($fp, $out);
//    while (!feof($fp)) {
//        echo fgets($fp, 128);
//    }
//    fclose($fp);
//}
//
////http://www.culture.go.kr/openapi/rest/publicperformancedisplays/period?from=20101118&to=20101217&cPage=1&rows=10&place=&gpsxfrom=&gpsyfrom=&gpsxto=&gpsyto=&keyword=&sortStdr=1&ServiceKey=xo9UBF3Ou5yKrNDG%2BFf4kSS%2B1cLLTncVt%2Fvk8dkGxDc9UGbxtsrWYEcmINe6TFg0YUYNUEhBozaSV8gTWDFJ1A%3D%3D
////http://www.culture.go.kr/openapi/rest/publicperformancedisplays/period?from=20101118&to=20101217&cPage=1&rows=10&place=&gpsxfrom=&gpsyfrom=&gpsxto=&gpsyto=&keyword=&sortStdr=1&ServiceKey=xo9UBF3Ou5yKrNDG%2BFf4kSS%2B1cLLTncVt%2Fvk8dkGxDc9UGbxtsrWYEcmINe6TFg0YUYNUEhBozaSV8gTWDFJ1A%3D%3D

//// Parsing Daum OpenAPI REST Web Service results using
//// SimpleXML extension. PHP5 only.
//// Author: Rasmus Lerdorf, Yahoo! Inc.
////         Sang-Kil Park, Daum Communications Corp.
//
//error_reporting(E_ALL);
//
//$request = 'http://www.culture.go.kr/openapi/rest/publicperformancedisplays/period?from=20101118&to=20101217&cPage=1&rows=10&place=&gpsxfrom=&gpsyfrom=&gpsxto=&gpsyto=&keyword=&sortStdr=1&ServiceKey='.urlencode('xo9UBF3Ou5yKrNDG+Ff4kSS+1cLLTncVt/vk8dkGxDc9UGbxtsrWYEcmINe6TFg0YUYNUEhBozaSV8gTWDFJ1A==');
//
//$response = file_get_contents($request);
//
//if ($response === false) {
//	die('Request failed');
//}
//
//$phpobject = simplexml_load_string($response);
//
//if ($phpobject === false) {
//	die('Parsing failed');
//}
//
//// Output the data
//// SimpleXML returns the data as a SimpleXML object
//$channel = $phpobject->channel;
//
//echo "<h1>".$channel->title."</h1><br />";
//echo "<h2>검색결과: ".$channel->totalCount."</h2><br />";
//
//foreach($channel->item as $value) {
//	echo "제목: ".$value->title."<br />";
//	echo "내용: ".$value->description."<br />";
//	echo "<hr />";
//}

//    $xml = simplexml_load_file('http://naver.com/');
//
//    print_r($xml);




















//function getXML($query){
//     //웹서버 주소
//     $host = "www.culture.go.kr";
//     $port = 80;
//     $service_uri = "/openapi/rest/publicperformancedisplays/period";
//
//     $param = "?from=20101118&to=20101217&cPage=1&rows=10&place=&gpsxfrom=&gpsyfrom=&gpsxto=&gpsyto=&keyword=&sortStdr=1&ServiceKey=" . urlencode('xo9UBF3Ou5yKrNDG+Ff4kSS+1cLLTncVt/vk8dkGxDc9UGbxtsrWYEcmINe6TFg0YUYNUEhBozaSV8gTWDFJ1A==');
//     $getXmlData = getHtmls($host, $port, $service_uri, $param);
//     return $getXmlData;
// }
// /**
//  * 웹서버로 부터 xml 결과값을 가져온다
//  * @param host 웹서버 IP
//  * @param port 웨서버 port
//  * @param service_uri 파일명
//  * @param param 전달인자
//  * @return 웹서버로터의 결과 xml 값
//  */
// function getHtmls($host, $port, $service_uri, $param){
//         # compose HTTP request header
//         $header = "Host: " . $host . "\r\n";
//         $header .= "User-Agent: PHP Script\r\n";
//         $header .= "Content-Type: application/x-www-form-urlencoded\r\n";
//         $header .= "Content-Length: " .strlen($param). "\r\n";
//         $header .= "Connection: close\r\n\r\n";
//
//        // 파일 소켓 오픈
//         $fp = fsockopen($host, $port, $errno, $errstr, 10);
//
//        if (!$fp) {
//                //echo "$errstr ($errno)<br/>\n";
//                //echo $fp;
//         } else {
//             fputs($fp, "GET $service_uri  HTTP/1.1\r\n");
//             fputs($fp, $header.$param);
//
//             // 헤더 부분을 구한다.
//                 $_header = ""; // 헤더의 내용을 초기화 한다.
//                 while(trim($buffer = fgets($fp,1024)) != "") {
//                     $_header .= $buffer;
//                 }
//
//                 // 바디 부분을 구한다.
//                 $body="";
//                 while(!feof($fp)) {
//                     $body .= fgets($fp, 1024);
//                 }
//
//                 // 바디 값만 리턴
//                 fclose($fp);
//                 return $body;
//         }
// }
//
//echo getXML('');
?>




<?php
//http://scripts.incutio.com/httpclient/examples.php

include_once('HttpClient.class.php');

//$pageContents = HttpClient::quickGet('http://www.naver.com/');

$client = new HttpClient('www.culture.go.kr');
if (!$client->get('/openapi/rest/publicperformancedisplays/period',
    array(
        'from' => '20101118'
        , 'to' => '20101217'
        , 'cPage' => '1'
        , 'rows' => '10'
        , 'place' => ''
        , 'gpsxfrom' => ''
        , 'gpsyfrom' => ''
        , 'gpsxto' => ''
        , 'gpsyto' => ''
        , 'keyword' => ''
        , 'sortStdr' => '1'
        //, 'ServiceKey' => urlencode('xo9UBF3Ou5yKrNDG+Ff4kSS+1cLLTncVt/vk8dkGxDc9UGbxtsrWYEcmINe6TFg0YUYNUEhBozaSV8gTWDFJ1A==')
        , 'ServiceKey' => 'xo9UBF3Ou5yKrNDG+Ff4kSS+1cLLTncVt/vk8dkGxDc9UGbxtsrWYEcmINe6TFg0YUYNUEhBozaSV8gTWDFJ1A=='
    )
)) {
    die('An error occurred: '.$client->getError());
}
$pageContents = $client->getContent();

//echo $pageContents;

$phpobject = simplexml_load_string($pageContents);

var_dump($phpobject);


?>









<?php
//$fp = fsockopen("www.naver.com", 80, $errno, $errstr, 30);
//if (!$fp) {
//    echo "$errstr ($errno)<br />\n";
//} else {
//    $out = "GET / HTTP/1.1\r\n";
//    $out .= "Host: www.naver.com\r\n";
//    $out .= "Connection: Close\r\n\r\n";
//    fwrite($fp, $out);
//    while (!feof($fp)) {
//        //echo fgets($fp, 128);
//        echo fgets($fp);
//    }
//    fclose($fp);
//}
?>







<?php
function http_request(
     $verb = 'GET',             /* HTTP Request Method (GET and POST supported) */
     $ip,                       /* Target IP/Hostname */
     $port = 80,                /* Target TCP port */
     $uri = '/',                /* Target URI */
     $getdata = array(),        /* HTTP GET Data ie. array('var1' => 'val1', 'var2' => 'val2') */
     $postdata = array(),       /* HTTP POST Data ie. array('var1' => 'val1', 'var2' => 'val2') */
     $cookie = array(),         /* HTTP Cookie Data ie. array('var1' => 'val1', 'var2' => 'val2') */
     $custom_headers = array(), /* Custom HTTP headers ie. array('Referer: http://localhost/ */
     $timeout = 1000,           /* Socket timeout in milliseconds */
     $req_hdr = false,          /* Include HTTP request headers */
     $res_hdr = false           /* Include HTTP response headers */
     )
 {
     $ret = '';
     $verb = strtoupper($verb);
     $cookie_str = '';
     $getdata_str = count($getdata) ? '?' : '';
     $postdata_str = '';

     foreach ($getdata as $k => $v)
                 $getdata_str .= urlencode($k) .'='. urlencode($v) . '&';

     foreach ($postdata as $k => $v)
         $postdata_str .= urlencode($k) .'='. urlencode($v) .'&';

     foreach ($cookie as $k => $v)
         $cookie_str .= urlencode($k) .'='. urlencode($v) .'; ';

     $crlf = "\r\n";
     $req = $verb .' '. $uri . $getdata_str .' HTTP/1.1' . $crlf;
     $req .= 'Host: '. $ip . $crlf;
     $req .= 'User-Agent: Mozilla/5.0 Firefox/3.6.12' . $crlf;
     //$req .= 'Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8' . $crlf;
     $req .= 'Accept: application/xml;q=0.9,*/*;q=0.8' . $crlf;
     $req .= 'Accept-Language: en-us,en;q=0.5' . $crlf;
     $req .= 'Accept-Encoding: deflate' . $crlf;
     //$req .= 'Accept-Charset: ISO-8859-1,utf-8;q=0.7,*;q=0.7' . $crlf;
     $req .= 'Accept-Charset: utf-8;q=0.7,*;q=0.7' . $crlf;

     foreach ($custom_headers as $k => $v)
         $req .= $k .': '. $v . $crlf;

     if (!empty($cookie_str))
         $req .= 'Cookie: '. substr($cookie_str, 0, -2) . $crlf;

     if ($verb == 'POST' && !empty($postdata_str))
     {
         $postdata_str = substr($postdata_str, 0, -1);
         $req .= 'Content-Type: application/x-www-form-urlencoded' . $crlf;
         $req .= 'Content-Length: '. strlen($postdata_str) . $crlf . $crlf;
         $req .= $postdata_str;
     }
     else $req .= $crlf;

     if ($req_hdr)
         $ret .= $req;

     if (($fp = @fsockopen($ip, $port, $errno, $errstr)) == false)
         return "Error $errno: $errstr\n";

     stream_set_timeout($fp, 0, $timeout * 1000);

     fputs($fp, $req);
     while ($line = fgets($fp)) $ret .= $line;
     fclose($fp);

     if (!$res_hdr)
         $ret = substr($ret, strpos($ret, "\r\n\r\n") + 4);

     return $ret;
 }
?>



<?php
////echo http_request('GET', 'www.php.net');
//// echo http_request('GET', 'www.php.net', 80, '/manual/en/function.phpinfo.php');
//// echo http_request('GET', 'www.php.net', 80, '/manual/en/function.phpinfo.php', array('get1' => 'v_get1'), array(), array('cookie1' => 'v_cookie1'), array('X-My-Header' => 'My Value'));
//
////     $param = "?from=20101118&to=20101217&cPage=1&rows=10&place=&gpsxfrom=&gpsyfrom=&gpsxto=&gpsyto=&keyword=&sortStdr=1&ServiceKey=" . urlencode('xo9UBF3Ou5yKrNDG+Ff4kSS+1cLLTncVt/vk8dkGxDc9UGbxtsrWYEcmINe6TFg0YUYNUEhBozaSV8gTWDFJ1A==');
//
//$response = http_request('GET', 'www.culture.go.kr', 80, '/openapi/rest/publicperformancedisplays/period',
//array(
//    'from' => '20101118'
//    , 'to' => '20101217'
//    , 'cPage' => '1'
//    , 'rows' => '10'
//    , 'place' => ''
//    , 'gpsxfrom' => ''
//    , 'gpsyfrom' => ''
//    , 'gpsxto' => ''
//    , 'gpsyto' => ''
//    , 'keyword' => ''
//    , 'sortStdr' => '1'
//    //, 'ServiceKey' => urlencode('xo9UBF3Ou5yKrNDG+Ff4kSS+1cLLTncVt/vk8dkGxDc9UGbxtsrWYEcmINe6TFg0YUYNUEhBozaSV8gTWDFJ1A==')
//    , 'ServiceKey' => 'xo9UBF3Ou5yKrNDG+Ff4kSS+1cLLTncVt/vk8dkGxDc9UGbxtsrWYEcmINe6TFg0YUYNUEhBozaSV8gTWDFJ1A=='
//)
////, array(), array('cookie1' => 'v_cookie1'), array('X-My-Header' => 'My Value')
//);
//
//echo $response;
//
////$phpobject = simplexml_load_string($response);
////
////if ($phpobject === false) {
////	die('Parsing failed');
////}
////
////var_dump($phpobject);
//
////// Output the data
////// SimpleXML returns the data as a SimpleXML object
////$channel = $phpobject->channel;
////
////var_dump($channel);
//
////echo "<h1>".$channel->title."</h1><br />";
////echo "<h2>검색결과: ".$channel->totalCount."</h2><br />";
////
////foreach($channel->item as $value) {
////	echo "제목: ".$value->title."<br />";
////	echo "내용: ".$value->description."<br />";
////	echo "<hr />";
////}
//
//
//exit;
?>











<?php
// preconditions
$port = 80;
 $host = "www.culture.go.kr";
$method = "GET";
$contenttype = "text/xml";
$data = "<something>";

// script
if($port == 443)
       $sslhost = "ssl://".$host;
 else
       $sslhost = $host;
$fp = fsockopen($sslhost, $port);
fputs($fp, "$method $path HTTP/1.1\r\n");
fputs($fp, "Host: $host\r\n");
fputs($fp, "Content-type: $contenttype\r\n");
fputs($fp, "Content-length: ".strlen($data)."\r\n");
fputs($fp, "Connection: close\r\n");
fputs($fp, "\r\n");
?>















<?php
echo get_url_title("http://www.php.net/cal.php?id=409");

 function get_url_title($url, $timeout = 2)
 {
     $url = parse_url($url);

     if(!in_array($url['scheme'],array('','http')))
         return;

     $fp = fsockopen ($url['host'], ($url['port'] > 0 ? $url['port'] : 80), $errno, $errstr, $timeout);
     if (!$fp)
     {
         return;
         // echo "$errstr ($errno)<br>\n";
     }
     else
     {
         fputs ($fp, "GET /".$url['path'].($url['query'] ? '?'.$url['query'] : '')." HTTP/1.0\r\nHost: ".$url['host']."\r\n\r\n");
         $d = '';
         while (!feof($fp))
         {
             $d .= fgets ($fp,2048);

             if(preg_match('~(</head>|<body>|(<title>\s*(.*?)\s*</title>))~i', $d, $m))
                 break;
         }
         fclose ($fp);

         return $m[3];
     }
 }
?>

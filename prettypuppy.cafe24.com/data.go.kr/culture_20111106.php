<?php
//header('Content-Type: text/xml, charset=utf-8');

//http://scripts.incutio.com/httpclient/examples.php

include_once('HttpClient.class.php');

//$pageContents = HttpClient::quickGet('http://www.naver.com/');

$client = new HttpClient('www.culture.go.kr');
if (!$client->get('/openapi/rest/publicperformancedisplays/period',
    array(
        'from' => '20101118'
        , 'to' => '20101217'
//        'from' => '20110101'
//        , 'to' => '20110201'
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

//$xmlstr = simplexml_load_string($pageContents);

//var_dump($phpobject);

//var_dump($phpobject->response);

//var_dump($xml->comMsgHeader);

//var_dump($xml->response);

//$nodes = $x->xpath('/root/node');

$xml = new SimpleXMLElement($pageContents);

//var_dump($xml);

//foreach ($xml->xpath('//perforList') as $character) {
//    echo $character->seq, 'played by ', $character->title, '<br />';
//
////    var_dump($character);
//}
?>

<!DOCTYPE html>
<html>
	<head>
	<title>Page Title</title>

	<meta name="viewport" content="width=device-width, initial-scale=1">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.0rc2/jquery.mobile-1.0rc2.min.css" />
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.4.min.js"></script>
	<script type="text/javascript" src="http://code.jquery.com/mobile/1.0rc2/jquery.mobile-1.0rc2.min.js"></script>
</head>
<body>

<div data-role="page">

	<div data-role="header">
		<h1>Page Title</h1>
	</div><!-- /header -->

	<div data-role="content">
		<p>Page content goes here.</p>

<!--
<ul data-role="listview" data-theme="g">
	<li><a href="acura.html">Acura</a></li>
	<li><a href="audi.html">Audi</a></li>
	<li><a href="bmw.html">BMW</a></li>
</ul>
-->

<ul data-role="listview" class="ui-listview">

<!--
      <li data-theme="c" class="ui-btn ui-btn-icon-right ui-li-has-arrow ui-li ui-btn-up-c"><div aria-hidden="true" class="ui-btn-inner ui-li"><div class="ui-btn-text"><a href="#/demos/1.0rc2/docs/lists/lists-nested.html&amp;ui-page=0-8" class="ui-link-inherit"><h3 class="ui-li-heading">Animals</h3><p class="ui-li-desc">All your favorites from aarkvarks to zebras.</p></a></div><span class="ui-icon ui-icon-arrow-r ui-icon-shadow"></span></div></li>
			<li data-theme="c" class="ui-btn ui-btn-icon-right ui-li-has-arrow ui-li ui-btn-up-c"><div aria-hidden="true" class="ui-btn-inner ui-li"><div class="ui-btn-text"><a href="#/demos/1.0rc2/docs/lists/lists-nested.html&amp;ui-page=0-4" class="ui-link-inherit"><h3 class="ui-li-heading">Colors</h3><p class="ui-li-desc">Fresh colors from the magic rainbow.</p></a></div><span class="ui-icon ui-icon-arrow-r ui-icon-shadow"></span></div></li>
			<li data-theme="c" class="ui-btn ui-btn-icon-right ui-li-has-arrow ui-li ui-btn-up-c"><div aria-hidden="true" class="ui-btn-inner ui-li"><div class="ui-btn-text"><a href="#/demos/1.0rc2/docs/lists/lists-nested.html&amp;ui-page=0-3" class="ui-link-inherit"><h3 class="ui-li-heading">Vehicles</h3><p class="ui-li-desc">Everything from cars to planes.</p></a></div><span class="ui-icon ui-icon-arrow-r ui-icon-shadow"></span></div></li>
-->

<?php
foreach ($xml->xpath('//perforList') as $character) {
//    echo $character->seq, 'played by ', $character->title, '<br />';
//    var_dump($character);
?>

<li data-theme="c" class="ui-btn ui-btn-icon-right ui-li-has-arrow ui-li ui-btn-up-c">
  <div aria-hidden="true" class="ui-btn-inner ui-li">
    <div class="ui-btn-text">
      <a href="#/demos/1.0rc2/docs/lists/lists-nested.html&amp;ui-page=0-3" class="ui-link-inherit">
        <h3 class="ui-li-heading">
        <?php
        echo '일련번호: ' . $character->seq;
        echo '<br />제목: ' . $character->title;
        echo '<br />시작일: ' . $character->startDate;
        echo '<br />마감일: ' . $character->endDate;
        echo '<br />장소: ' . $character->place;
        echo '<br />분류명: ' . $character->realmName;
        echo '<br />지역: ' . $character->area;
        echo '<br />GPS-X좌표: ' . $character->gpsX;
        echo '<br />GPS-Y좌표: ' . $character->gpsY;
        ?>
        </h3>
        <p class="ui-li-desc"><img src="<?php echo $character->thumbnail; ?>" /></p>
      </a>
    </div>
    <span class="ui-icon ui-icon-arrow-r ui-icon-shadow"></span>
  </div>
</li>

<?php
}
?>

    </ul>

	</div><!-- /content -->

	<div data-role="footer">
		<h4>Page Footer</h4>
	</div><!-- /footer -->
</div><!-- /page -->

</body>
</html>

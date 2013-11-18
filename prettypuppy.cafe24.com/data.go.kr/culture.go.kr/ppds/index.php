<?php
include_once('../../HttpClient.class.php');

$client = new HttpClient('www.culture.go.kr');
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
//exit;

$xml = new SimpleXMLElement($pageContents);

// totalCount
$result = $xml->xpath('//totalCount');

while(list( , $node) = each($result)) {
//    echo '/a/b/c: ',$node,"\n";

    $totalCount = $node;
}

// from
$result = $xml->xpath('//from');

while(list( , $node) = each($result)) {
//    echo '/a/b/c: ',$node,"\n";

    $from = $node;
}

// to
$result = $xml->xpath('//to');

while(list( , $node) = each($result)) {
//    echo '/a/b/c: ',$node,"\n";

    $to = $node;
}

// cPage
$result = $xml->xpath('//cPage');

while(list( , $node) = each($result)) {
//    echo '/a/b/c: ',$node,"\n";

    $cPage = $node;
}

// rows
$result = $xml->xpath('//rows');

while(list( , $node) = each($result)) {
//    echo '/a/b/c: ',$node,"\n";

    $rows = $node;
}
?>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>기간별공연전시목록조회</title>
	<link rel="stylesheet"  href="/vendor/jquery.mobile/css/themes/default/" />
	<link rel="stylesheet" href="/vendor/jquery.mobile/docs/_assets/css/jqm-docs.css"/>
	<script src="/vendor/jquery.mobile/js/jquery.js"></script>
	<script src="/vendor/jquery.mobile/experiments/themeswitcher/jquery.mobile.themeswitcher.js"></script>
	<script src="/vendor/jquery.mobile/docs/_assets/js/jqm-docs.js"></script>
	<script src="/vendor/jquery.mobile/js/"></script>
</head>
<body>

	<div data-role="page" class="type-interior">

		<div data-role="header" data-theme="f">
		<h1>기간별공연전시목록조회</h1>
		<a href="/data.go.kr/www.culture.go.kr/" data-icon="home" data-iconpos="notext" data-direction="reverse" class="ui-btn-right jqm-home">Home</a>
	</div><!-- /header -->

	<div data-role="content">
		<div class="content-primary">
		<ul data-role="listview">
			<!-- <li><a href="index.html">
				<img src="images/album-bb.jpg" />
				<h3>Broken Bells</h3>
				<p>Broken Bells</p>
			</a></li>
			<li><a href="index.html">
				<img src="images/album-hc.jpg" />
				<h3>Warning</h3>
				<p>Hot Chip</p>
			</a></li>
			<li><a href="index.html">
				<img src="images/album-p.jpg" />
				<h3>Wolfgang Amadeus Phoenix</h3>
				<p>Phoenix</p>
			</a></li>
			<li><a href="index.html">
				<img src="images/album-ok.jpg" />
				<h3>Of The Blue Colour Of The Sky</h3>
				<p>Ok Go</p>
			</a></li>
			<li><a href="index.html">
				<img src="images/album-ws.jpg" />
				<h3>Elephant</h3>
				<p>The White Stripes</p>
			</a></li>
			<li><a href="index.html">
				<img src="images/album-rh.jpg" />
				<h3>Kid A</h3>
				<p>Radiohead</p>
			</a></li>
			<li><a href="index.html">
				<img src="images/album-xx.jpg" />
				<h3>XX</h3>
				<p>XX</p>
			</a></li>
			<li><a href="index.html">
				<img src="images/album-mg.jpg" />
				<h3>Congratulations</h3>
				<p>MGMT</p>
			</a></li>

			<li><a href="index.html">
				<img src="images/album-ag.jpg" />
				<h3>Ashes Grammar</h3>
				<p>A Sunny Day in Glasgow</p>
			</a></li>

			<li><a href="index.html">
				<img src="images/album-k.jpg" />
				<h3>Hot Fuss</h3>
				<p>Killers</p>
			</a></li>
			<li><a href="index.html">
				<img src="images/album-af.jpg" />
				<h3>The Suburbs</h3>
				<p>Arcade Fire</p>
			</a></li> -->

<?php
foreach ($xml->xpath('//perforList') as $character) {
//    echo $character->seq, 'played by ', $character->title, '<br />';
//    var_dump($character);
?>

			<li><a href="./d.php?seq=<?php echo $character->seq; ?>">
				<img src="<?php echo $character->thumbnail; ?>" />
				<h3><?php echo $character->title; ?></h3>
				<p>

        <?php
        echo '일련번호: ' . $character->seq;
//        echo ', 제목: ' . $character->title;
        echo ', 시작일: ' . $character->startDate;
        echo ', 마감일: ' . $character->endDate;
        echo ', 장소: ' . $character->place;
        echo ', 분류명: ' . $character->realmName;
        echo ', 지역: ' . $character->area;
        //echo ', GPS-X좌표: ' . $character->gpsX;
        //echo ', GPS-Y좌표: ' . $character->gpsY;
        ?>

</p>
			</a></li>

<?php
}
?>

		</ul>
		</div><!--/content-primary -->

		<div class="content-secondary">

			<div data-role="collapsible" data-collapsed="true" data-theme="b" data-content-theme="d">

					<!-- <h3>More in this section</h3>

					<ul data-role="listview" data-theme="c" data-dividertheme="d">

						<li data-role="list-divider">List views</li>
						<li><a href="docs-lists.html">List markup conventions</a></li>
						<li><a href="lists-ul.html">Basic linked list</a></li>
						<li><a href="lists-nested.html">Nested list</a></li>
						<li><a href="lists-ol.html">Numbered list</a></li>

						<li><a href="lists-split.html">Split button list</a></li>
						<li><a href="lists-divider.html">List dividers</a></li>
						<li><a href="lists-count.html">Count bubble</a></li>
						<li data-theme="a"><a href="lists-thumbnails.html">Thumbnails</a></li>
						<li><a href="lists-icons.html">Icons</a></li>
						<li><a href="lists-formatting.html">Content formatting</a></li>
						<li><a href="lists-search.html">Search filter bar</a></li>
						<li><a href="lists-search-inset.html">Inset search filter bar</a></li>
						<li><a href="lists-search-with-dividers.html">Search filter bar with dividers</a></li>

						<li><a href="lists-readonly.html">Read-only lists</a></li>
						<li><a href="lists-readonly-inset.html">Read-only inset lists</a></li>
						<li><a href="lists-forms.html">Lists with forms</a></li>
						<li><a href="lists-forms-inset.html">Inset lists with forms</a></li>

						<li><a href="lists-inset.html">Inset styled lists</a></li>
						<li><a href="lists-performance.html">List performance test</a></li>
						<li><a href="lists-themes.html">Theming lists</a></li>

					</ul> -->
			</div>
		</div>

	</div><!-- /content -->

	<div data-role="footer" class="footer-docs" data-theme="c">
			<p>&copy; 2011 문화포털</p>
	</div>

	</div><!-- /page -->

	</body>
	</html>

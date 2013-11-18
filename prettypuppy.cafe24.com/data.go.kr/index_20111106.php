<html class="ui-mobile landscape min-width-320px min-width-480px min-width-768px min-width-1024px"><head><base href="http://www.coldfusionjedi.com/demos/march132011/"><meta name="viewport" content="width=device-width, minimum-scale=1, maximum-scale=1">
	<title>Search Art</title>
	<link href="http://code.jquery.com/mobile/1.0a3/jquery.mobile-1.0a3.min.css" rel="stylesheet">
	<script src="http://code.jquery.com/jquery-1.5.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.0a3/jquery.mobile-1.0a3.min.js"></script>
<script>
$(document).ready(function() {

	$('.searchPage').live('swipeleft swiperight',function(event){
		console.log(event.type);
		if (event.type == "swipeleft") {
			var prev = $("#prevlink",$.mobile.activePage);
			if (prev.length) {
				var prevurl = $(prev).attr("href");
				console.log(prevurl);
				$.mobile.changePage(prevurl);
			}
		}
		if (event.type == "swiperight") {
			var next = $("#nextlink",$.mobile.activePage);
			if (next.length) {
				var nexturl = $(next).attr("href");
				console.log(nexturl);
				$.mobile.changePage(nexturl);
			}
		}
		event.preventDefault();
	});
});

</script>
</head>
<body class="ui-mobile-viewport">

<div data-theme="e" data-role="page" data-url="">

	<div data-role="header">
		<h1>Art Search</h1>
	</div>

	<div data-role="content">
		<div data-inline="true">
		<form method="post" action="search2.cfm">
		<input type="search" data-inline="true" name="search"> <input type="submit" data-inline="true" value="Search">
		</form>
		</div>
	</div>

</div>


<div data-theme="e" data-role="page" data-url="index2.cfm" class="ui-page ui-body-e">

	<div data-role="header" class="ui-bar-e ui-header" role="banner"><a data-icon="arrow-l" data-rel="back" class="ui-btn-left ui-btn ui-btn-up-e ui-btn-icon-left ui-btn-corner-all ui-shadow" href="#" data-theme="e"><span class="ui-btn-inner ui-btn-corner-all"><span class="ui-btn-text">Back</span><span class="ui-icon ui-icon-arrow-l ui-icon-shadow"></span></span></a>
		<h1 class="ui-title" tabindex="0" role="heading" aria-level="1">Art Search</h1>
	</div>

	<div data-role="content" class="ui-content" role="main">
		<div data-inline="true">
		<form method="post" action="search2.cfm">
		<div class="ui-input-search ui-shadow-inset ui-btn-corner-all ui-btn-shadow ui-icon-searchfield ui-body-e"><input type="true" data-type="search" data-inline="true" name="search" class="ui-input-text ui-body-null"><a title="clear text" class="ui-input-clear ui-btn ui-btn-up-e ui-btn-icon-notext ui-btn-corner-all ui-shadow" href="#" data-theme="e"><span class="ui-btn-inner ui-btn-corner-all"><span class="ui-btn-text">clear text</span><span class="ui-icon ui-icon-delete ui-icon-shadow"></span></span></a></div> <div data-theme="c" class="ui-btn ui-btn-up-c ui-btn-inline ui-btn-corner-all ui-shadow"><span class="ui-btn-inner ui-btn-corner-all"><span class="ui-btn-text">Search</span></span><input type="submit" data-inline="true" value="Search" class="ui-btn-hidden"></div>
		</form>
		</div>
	</div>

</div><div class="searchPage ui-page ui-body-e" data-theme="e" data-role="page" id="search#url.start#" data-url="search2.cfm">

	<div data-role="header" class="ui-bar-e ui-header" role="banner">
		<a data-rel="back" href="" class="ui-btn-left ui-btn ui-btn-up-e ui-btn-corner-all ui-shadow" data-theme="e"><span class="ui-btn-inner ui-btn-corner-all"><span class="ui-btn-text">Back</span></span></a>
		<h1 class="ui-title" tabindex="0" role="heading" aria-level="1">Search Results</h1>
		<a data-theme="b" href="index2.cfm" class="ui-btn-right ui-btn ui-btn-up-b ui-btn-corner-all ui-shadow"><span class="ui-btn-inner ui-btn-corner-all"><span class="ui-btn-text">Home</span></span></a>
	</div>

	<div data-role="content" class="ui-content" role="main">

			<ul data-role="listview" class="ui-listview" role="listbox">


				<li class="ui-li-has-thumb ui-btn ui-btn-icon-right ui-li ui-btn-up-c" role="option" tabindex="0" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/aiden01.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=1" class="ui-link-inherit">charles1</a></h3>
					<p class="ui-li-desc">Pastels/Charcoal</p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>



				<li class="ui-li-has-thumb ui-btn ui-btn-icon-right ui-li ui-btn-up-c" role="option" tabindex="-1" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/aiden02.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=2" class="ui-link-inherit">Michael</a></h3>
					<p class="ui-li-desc">Pastels/Charcoal</p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>



				<li class="ui-li-has-thumb ui-btn ui-btn-icon-right ui-li ui-btn-up-c" role="option" tabindex="-1" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/aiden03.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=3" class="ui-link-inherit">Freddy</a></h3>
					<p class="ui-li-desc">Pastels/Charcoal</p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>



				<li class="ui-li-has-thumb ui-btn ui-btn-icon-right ui-li ui-btn-up-c" role="option" tabindex="-1" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/aiden04.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=4" class="ui-link-inherit">Paulo</a></h3>
					<p class="ui-li-desc">Pastels/Charcoal</p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>



				<li class="ui-li-has-thumb ui-btn ui-btn-icon-right ui-li ui-btn-up-c" role="option" tabindex="-1" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/aiden05.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=5" class="ui-link-inherit">Mary</a></h3>
					<p class="ui-li-desc">Pastels/Charcoal</p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>



				<li class="ui-li-has-thumb ui-btn ui-btn-icon-right ui-li ui-btn-up-c" role="option" tabindex="-1" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/elecia01.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=6" class="ui-link-inherit">Space</a></h3>
					<p class="ui-li-desc">Mixed Media</p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>



				<li class="ui-li-has-thumb ui-btn ui-btn-icon-right ui-li ui-btn-up-c" role="option" tabindex="-1" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/elecia02.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=7" class="ui-link-inherit">Leaning House</a></h3>
					<p class="ui-li-desc">Mixed Media</p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>



				<li class="ui-li-has-thumb ui-btn ui-btn-icon-right ui-li ui-btn-up-c" role="option" tabindex="-1" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/elecia03.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=8" class="ui-link-inherit">Dude</a></h3>
					<p class="ui-li-desc">Mixed Media</p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>



				<li class="ui-li-has-thumb ui-btn ui-btn-icon-right ui-li ui-btn-up-c" role="option" tabindex="-1" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/elecia04.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=9" class="ui-link-inherit">Hang Ten</a></h3>
					<p class="ui-li-desc">Mixed Media</p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>



				<li class="ui-li-has-thumb ui-btn ui-btn-icon-right ui-li ui-btn-up-c" role="option" tabindex="-1" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/elecia05.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=10" class="ui-link-inherit">Life is a Horse</a></h3>
					<p class="ui-li-desc">Mixed Media</p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>


			</ul>

			<p>

			</p><div data-inline="true">





				<a data-inline="true" data-theme="b" data-role="button" href="search2.cfm?search=a&amp;start=11" id="nextlink" class="ui-btn ui-btn-inline ui-btn-corner-all ui-shadow ui-btn-up-b"><span class="ui-btn-inner ui-btn-corner-all"><span class="ui-btn-text">Next</span></span></a>


			</div>



	</div>

</div><div class="ui-loader ui-body-a ui-corner-all" style="top: 478.5px;"><span class="ui-icon ui-icon-loading spin"></span><h1>loading</h1></div><div class="searchPage ui-page ui-body-e ui-page-active" data-theme="e" data-role="page" id="search#url.start#" data-url="search2.cfm?search=a&amp;start=11">

	<div data-role="header" class="ui-bar-e ui-header" role="banner">
		<a data-rel="back" href="" class="ui-btn-left ui-btn ui-btn-up-e ui-btn-corner-all ui-shadow" data-theme="e"><span class="ui-btn-inner ui-btn-corner-all"><span class="ui-btn-text">Back</span></span></a>
		<h1 class="ui-title" tabindex="0" role="heading" aria-level="1">Search Results</h1>
		<a data-theme="b" href="index2.cfm" class="ui-btn-right ui-btn ui-btn-up-b ui-btn-corner-all ui-shadow"><span class="ui-btn-inner ui-btn-corner-all"><span class="ui-btn-text">Home</span></span></a>
	</div>

	<div data-role="content" class="ui-content" role="main">

			<ul data-role="listview" class="ui-listview" role="listbox">


				<li class="ui-li-has-thumb ui-btn ui-btn-up-c ui-btn-icon-right ui-li" role="option" tabindex="0" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/austin01.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=11" class="ui-link-inherit">1958</a></h3>
					<p class="ui-li-desc">Charcoal </p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>



				<li class="ui-li-has-thumb ui-btn ui-btn-up-c ui-btn-icon-right ui-li" role="option" tabindex="-1" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/austin02.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=12" class="ui-link-inherit">Toxic</a></h3>
					<p class="ui-li-desc">Charcoal</p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>



				<li class="ui-li-has-thumb ui-btn ui-btn-up-c ui-btn-icon-right ui-li" role="option" tabindex="-1" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/austin03.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=13" class="ui-link-inherit">Prize Fight</a></h3>
					<p class="ui-li-desc">Charcoal </p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>



				<li class="ui-li-has-thumb ui-btn ui-btn-icon-right ui-li ui-btn-up-c" role="option" tabindex="-1" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/austin04.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=14" class="ui-link-inherit">You Don't Know Me</a></h3>
					<p class="ui-li-desc">Charcoal</p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>



				<li class="ui-li-has-thumb ui-btn ui-btn-icon-right ui-li ui-btn-up-c" role="option" tabindex="-1" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/austin05.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=15" class="ui-link-inherit">Do it</a></h3>
					<p class="ui-li-desc">Charcoal</p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>



				<li class="ui-li-has-thumb ui-btn ui-btn-icon-right ui-li ui-btn-up-c" role="option" tabindex="-1" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/jeff03.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=18" class="ui-link-inherit">Naked</a></h3>
					<p class="ui-li-desc">Acrylic</p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>



				<li class="ui-li-has-thumb ui-btn ui-btn-icon-right ui-li ui-btn-up-c" role="option" tabindex="-1" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/maxwell03.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=23" class="ui-link-inherit">The Lake</a></h3>
					<p class="ui-li-desc">Oil</p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>



				<li class="ui-li-has-thumb ui-btn ui-btn-icon-right ui-li ui-btn-up-c" role="option" tabindex="-1" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/maxwell05.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=25" class="ui-link-inherit">Ideas</a></h3>
					<p class="ui-li-desc">Oil</p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>



				<li class="ui-li-has-thumb ui-btn ui-btn-icon-right ui-li ui-btn-up-c" role="option" tabindex="-1" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/lori01.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=26" class="ui-link-inherit">Christmas</a></h3>
					<p class="ui-li-desc">Pastels</p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>



				<li class="ui-li-has-thumb ui-btn ui-btn-icon-right ui-li ui-btn-up-c" role="option" tabindex="-1" data-theme="c"><div class="ui-btn-inner"><div class="ui-btn-text">
					<img src="artgallery/lori02.jpg" class="ui-li-thumb">
					<h3 class="ui-li-heading"><a href="detail.cfm?id=27" class="ui-link-inherit">Happiness</a></h3>
					<p class="ui-li-desc">Pastels</p>
				</div><span class="ui-icon ui-icon-arrow-r"></span></div></li>


			</ul>

			<p>

			</p><div data-inline="true">


				<a data-inline="true" data-role="button" href="search2.cfm?search=a&amp;start=1" id="prevlink" data-theme="e" class="ui-btn ui-btn-inline ui-btn-corner-all ui-shadow ui-btn-up-e"><span class="ui-btn-inner ui-btn-corner-all"><span class="ui-btn-text">Previous</span></span></a>


				<a data-inline="true" data-theme="b" data-role="button" href="search2.cfm?search=a&amp;start=21" id="nextlink" class="ui-btn ui-btn-inline ui-btn-corner-all ui-shadow ui-btn-up-b"><span class="ui-btn-inner ui-btn-corner-all"><span class="ui-btn-text">Next</span></span></a>


			</div>



	</div>

</div></body></html>

<?php
exit;
?>

<!DOCTYPE html>
<html>
	<head>
	<title>Page Title</title>

	<meta name="viewport" content="width=device-width, initial-scale=1">

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
			<li data-theme="c" class="ui-btn ui-btn-icon-right ui-li-has-arrow ui-li ui-btn-up-c"><div aria-hidden="true" class="ui-btn-inner ui-li"><div class="ui-btn-text"><a href="#/demos/1.0rc2/docs/lists/lists-nested.html&amp;ui-page=0-8" class="ui-link-inherit"><h3 class="ui-li-heading">Animals</h3><p class="ui-li-desc">All your favorites from aarkvarks to zebras.</p></a></div><span class="ui-icon ui-icon-arrow-r ui-icon-shadow"></span></div></li>
			<li data-theme="c" class="ui-btn ui-btn-icon-right ui-li-has-arrow ui-li ui-btn-up-c"><div aria-hidden="true" class="ui-btn-inner ui-li"><div class="ui-btn-text"><a href="#/demos/1.0rc2/docs/lists/lists-nested.html&amp;ui-page=0-4" class="ui-link-inherit"><h3 class="ui-li-heading">Colors</h3><p class="ui-li-desc">Fresh colors from the magic rainbow.</p></a></div><span class="ui-icon ui-icon-arrow-r ui-icon-shadow"></span></div></li>
			<li data-theme="c" class="ui-btn ui-btn-icon-right ui-li-has-arrow ui-li ui-btn-up-c"><div aria-hidden="true" class="ui-btn-inner ui-li"><div class="ui-btn-text"><a href="#/demos/1.0rc2/docs/lists/lists-nested.html&amp;ui-page=0-3" class="ui-link-inherit"><h3 class="ui-li-heading">Vehicles</h3><p class="ui-li-desc">Everything from cars to planes.</p></a></div><span class="ui-icon ui-icon-arrow-r ui-icon-shadow"></span></div></li>
		</ul>

	</div><!-- /content -->

	<div data-role="footer">
		<h4>Page Footer</h4>
	</div><!-- /footer -->
</div><!-- /page -->

</body>
</html>
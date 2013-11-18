	<link rel="stylesheet"  href="/vendor/jquery.mobile/css/themes/default/" />
	<link rel="stylesheet" href="/vendor/jquery.mobile/docs/_assets/css/jqm-docs.css"/>
	<script src="/vendor/jquery.mobile/js/jquery.js"></script>
	<script src="/vendor/jquery.mobile/experiments/themeswitcher/jquery.mobile.themeswitcher.js"></script>
	<script src="/vendor/jquery.mobile/docs/_assets/js/jqm-docs.js"></script>
	<script src="/vendor/jquery.mobile/js/"></script>

<div id="pagination"></div>

<!-- <script src="http://code.jquery.com/jquery-1.6.2.min.js"></script> -->

<script>

$("#pagination").paging(1337, {
        format: '[< ncnnn >]',
        onSelect: function (page) {
                // add code which gets executed when user selects a page
        },
        onFormat: function (type) {
                switch (type) {
                case 'block': // n and c
                        return '<a>' + this.value + '</a>';
                case 'next': // >
                        return '<a>&gt;</a>';
                case 'prev': // <
                        return '<a>&lt;</a>';
                case 'first': // [
                        return '<a>first</a>';
                case 'last': // ]
                        return '<a>last</a>';
                }
        }
});

</script>

<?php
exit;

define('BASEPATH', '');

include_once('Pagination.php');

echo 'test';

//$this->load->library('pagination');
//
//$config['base_url'] = 'http://example.com/index.php/test/page/';
//$config['total_rows'] = 200;
//$config['per_page'] = 20;
//
//$this->pagination->initialize($config);
//
//echo $this->pagination->create_links();
?>
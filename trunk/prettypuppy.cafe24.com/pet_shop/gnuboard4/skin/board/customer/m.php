<?php
$g4_path = '../../..'; // common.php 의 상대 경로

include_once($g4_path . '/common.php');

//var_dump($GLOBALS);

//var_dump($is_admin);

//var_dump(is_null($is_admin));

//if (is_null($is_admin) == true) {
//    exit;
//}

//echo $config['cf_title'];

//var_dump($g4);
?>

<?php
if (is_null($is_admin) == true) {
?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title><?php echo $config['cf_title']; ?> 로그인</title>
  </head>

  <body >

    <form method="post" action="<?php echo $g4['bbs_path']; ?>/login_check.php">
      <input type="hidden" id="url" name="url" value="<?php echo $g4['url'] . '/skin/board/customer/m.php'; ?>" />

      <ul>
        <li><label for="mb_id">아이디:</label> <input type="text" id="mb_id" name="mb_id" value="" /></li>
        <li><label for="mb_password">패스워드:</label> <input type="password" id="mb_password" name="mb_password" value="" /></li>
        <li><input type="submit" value="로그인" /></li>
      </ul>

    </form>

  </body>
</html>

<?php
} else {
    $sql = "
    SELECT
        wr_id
        , wr_subject
        , wr_content
        , wr_1
        , wr_2
        , wr_3
    FROM {$g4['write_prefix']}customer customer
    ORDER BY wr_num
    LIMIT 0, 10000
    ";

//        , (SELECT COUNT(*) FROM {$g4['write_prefix']}pet WHERE wr_1 = customer.wr_id) AS pet_count
//        , (SELECT COUNT(*) FROM {$g4['write_prefix']}sale WHERE wr_1 = customer.wr_id) AS sale_count

    $result = sql_query($sql);
?>

<!doctype html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no, target-densitydpi=medium-dpi" />
    <title><?php echo $config['cf_title']; ?></title>

<link rel="stylesheet" href="http://code.jquery.com/mobile/1.2.1/jquery.mobile-1.2.1.min.css" />
<script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
<script src="http://code.jquery.com/mobile/1.2.1/jquery.mobile-1.2.1.min.js"></script>

<script>
$(document).ready(function() {
    $('.ui-input-search.ui-shadow-inset.ui-btn-corner-all.ui-btn-shadow.ui-icon-searchfield.ui-body-c').css('margin', '30px');
});

function prettypuppy_pet_list(customer_wr_id) {
    var data = {
        customer_wr_id : customer_wr_id
    };

    jQuery.get('/pet_shop/gnuboard4/skin/board/pet/json.php', data, function(data, textStatus, jqXHR) {
        $('.customer-div').hide();

        var htmlString = '';
        htmlString += '';

        htmlString += '<ul data-role="listview" data-filter="true" data-filter-placeholder="검색 판매..." data-inset="true">';

        $(data.rows).each(function(index, Element) {
            console.log(index + ', ' + Element.wr_subject);

            var li = '';
            
            li += '<a onclick="">';
            li += index + ', ' + Element.wr_subject;
            li += '</a>';

            htmlString += '<li>' + li + '</li>';
        });
        
        htmlString += '</ul>';

        $('.pet-div ul').html(htmlString);
        $('.pet-div').show();
    }, 'json');
}
</script>

  </head>

  <body>

<div class="customer-div">

<!--<ul data-role="listview">-->
<!--<ul data-role="listview" data-filter="true" data-filter-reveal="true" data-filter-placeholder="Search fruits..." data-inset="true">-->
<ol data-role="listview" data-filter="true" data-filter-placeholder="검색 고객명..." data-inset="true" data-count-theme="b">

<?php
while ($row = sql_fetch_array($result)) {
//    var_dump($row);

    $li = '';

    $li .= $row['wr_subject'];
    $li .= ', ' . $row['wr_content'];
    $li .= ', ' . $row['wr_1'];
    $li .= ', ' . $row['wr_2'];
    $li .= ', ' . $row['wr_3'];

    $customer_wr_id = sprintf('%010d', $row['wr_id']);
//    $li .= ', ' . $customer_wr_id;

//    $li .= ', ' . $row['pet_count'] . '마리';
?>

    <!--<li><a onclick="prettypuppy_pet_list('<?php echo $customer_wr_id; ?>');"><?php echo $li; ?></a></li>-->
    <li>
        <a href="/pet_shop/gnuboard4/skin/board/pet/m.php?customer_wr_id=<?php echo $customer_wr_id; ?>"><?php echo $li; ?></a>
<!--
        <span class="ui-li-count">
            애견(<?php echo $row['pet_count']; ?>)
            , 판매(<?php echo $row['sale_count']; ?>)
        </span>
-->
    </li>

<?php
}
?>

</ol>

</div>

<!--
<div class="pet-div">
    <ul data-role="listview" data-filter="true" data-filter-placeholder="검색 고객명..." data-inset="true">
    </ul>
</div>
-->

  </body>
</html>


<?php
}
?>

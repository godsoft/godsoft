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
    $title = '';
    $title .= $config['cf_title'];
    $title .= ' - 고객 검색';
?>

<!DOCTYPE html>
<html>
<head>
    <title><?php echo $title; ?></title>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.css" />
    <script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
    <script src="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js"></script>
</head>
<body>

<div data-role="page">

    <div data-role="header">
        <h1 style="white-space: normal;"><?php echo $title; ?></h1>
    </div><!-- /header -->

    <div data-role="content">

<form action="m3-customer.php">
    <input type="hidden" name="searchUseYn" value="Y" />

    <select name="searchCondition" id="searchCondition">
        <option>선택...</option>
        <!--<option value="고객번호">고객번호</option>-->
        <option value="고객명">고객명</option>
        <option value="비고">비고</option>
        <option value="휴대 전화">휴대 전화</option>
        <option value="전화">전화</option>
        <option value="주소">주소</option>
    </select>

     <!-- <label for="searchKeyword">검색:</label> -->
     <input type="search" name="searchKeyword" id="searchKeyword" value="">

     <input type="submit" value="검색">
</form>

    </div><!-- /content -->

    <div data-role="footer">
        <h4><?php echo $config['cf_title']; ?></h4>
    </div><!-- /footer -->
</div><!-- /page -->

<script type="text/javascript">
<!--
$( document ).ready(function() {
    $('select[name=searchCondition]').val('고객명');

//    $( "select[name=searchCondition]" ).selectmenu( "option", "고객명", true );

    $('#searchKeyword').focus();
});
//-->
</script>

</body>
</html>

<?php
}
?>

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
    $title .= ' - 애견관리';

    $sql = "
    SELECT
        pet.wr_id AS pet_wr_id
        , pet.wr_subject AS pet_wr_subject
        , pet.wr_content AS pet_wr_content
        , pet.wr_1 AS pet_wr_1
        , (SELECT COUNT(*) FROM {$g4['write_prefix']}sale sale WHERE sale.wr_2 = pet.wr_id) AS sale_count
    FROM {$g4['write_prefix']}pet pet
    WHERE 1 = 1
    AND pet.wr_1 = '{$customer_wr_id}'
    ORDER BY
        pet.wr_num
    ";

    $result = sql_query($sql);
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
        <a href="m3.php" data-role="button" data-icon="home">홈</a>
        <h1 style="white-space: normal;"><?php echo $title; ?></h1>
        <a href="" data-role="button" data-icon="back" data-rel="back">뒤로</a>
    </div><!-- /header -->

    <div data-role="content">

<ul data-role="listview" data-inset="true">

<?php
$i = 1;

while ($row = sql_fetch_array($result)) {
//    var_dump($row);
?>

    <li><a href="m3-sale.php?pet_wr_id=<?php echo sprintf('%010d', $row['pet_wr_id']); ?>">
        <img src="http://view.jquerymobile.com/1.3.2/dist/demos/_assets/img/album-bb.jpg">
        <h2 style="white-space: normal;"><?php echo $i; ?>. 애견명: <?php echo $row['pet_wr_subject']; ?></h2>
        <!--<p style="white-space: normal;">애견번호: <?php echo $row['pet_wr_id']; ?></p>-->
        <p style="white-space: normal;">비고: <?php echo $row['pet_wr_content']; ?></p>
        <!--<p style="white-space: normal;">고객번호: <?php echo $row['pet_wr_1']; ?></p>-->
        </a>

        <span class="ui-li-count"><?php echo $row['sale_count']; ?></span>
    </li>

<?php
    $i++;
}
?>

</ul>

    </div><!-- /content -->

    <div data-role="footer">
        <h4><?php echo $config['cf_title']; ?></h4>
    </div><!-- /footer -->
</div><!-- /page -->

</body>
</html>

<?php
}
?>

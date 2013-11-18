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
    $title .= ' - 고객관리';

    if ($_REQUEST['searchUseYn'] == 'Y') {
        $where = "";

        // 고객
        if ($_REQUEST['searchCondition'] == '고객번호') {
            $where .= "AND customer.wr_id LIKE '%{$_REQUEST['searchKeyword']}%'";
        }

        if ($_REQUEST['searchCondition'] == '고객명') {
            $where .= "AND customer.wr_subject LIKE '%{$_REQUEST['searchKeyword']}%'";
        }

        if ($_REQUEST['searchCondition'] == '비고') {
            $where .= "AND customer.wr_content LIKE '%{$_REQUEST['searchKeyword']}%'";
        }

        if ($_REQUEST['searchCondition'] == '휴대 전화') {
            $where .= "AND customer.wr_1 LIKE '%{$_REQUEST['searchKeyword']}%'";
        }

        if ($_REQUEST['searchCondition'] == '전화') {
            $where .= "AND customer.wr_2 LIKE '%{$_REQUEST['searchKeyword']}%'";
        }

        if ($_REQUEST['searchCondition'] == '주소') {
            $where .= "AND customer.wr_3 LIKE '%{$_REQUEST['searchKeyword']}%'";
        }

        // 애견
        if ($_REQUEST['searchCondition'] == '애견번호') {
            $where .= "AND pet.wr_id LIKE '%{$_REQUEST['searchKeyword']}%'";
        }

        if ($_REQUEST['searchCondition'] == '애견명') {
            $where .= "AND pet.wr_subject LIKE '%{$_REQUEST['searchKeyword']}%'";
        }

        // 판매
        if ($_REQUEST['searchCondition'] == '분류') {
            $where .= "AND sale.wr_subject LIKE '%{$_REQUEST['searchKeyword']}%'";
        }

        if ($_REQUEST['searchCondition'] == '금액') {
            $where .= "AND sale.wr_3 LIKE '%{$_REQUEST['searchKeyword']}%'";
        }

        if ($_REQUEST['searchCondition'] == '날짜') {
            $where .= "AND sale.wr_4 LIKE '%{$_REQUEST['searchKeyword']}%'";
        }

        $sql = "
        SELECT
            customer.wr_id AS customer_wr_id
            , customer.wr_subject AS customer_wr_subject
            , customer.wr_content AS customer_wr_content
            , customer.wr_1 AS customer_wr_1
            , customer.wr_2 AS customer_wr_2
            , customer.wr_3 AS customer_wr_3
            , (SELECT COUNT(*) FROM {$g4['write_prefix']}pet pet WHERE pet.wr_1 = customer.wr_id) AS pet_count
        FROM {$g4['write_prefix']}customer customer
        WHERE 1 = 1
        {$where}
        ORDER BY
            customer.wr_num
        ";

        $result = sql_query($sql);
    }
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

<?php if ($_REQUEST['searchUseYn'] == 'Y') { ?>

<ul data-role="listview" data-inset="true">

<?php
$i = 1;

while ($row = sql_fetch_array($result)) {
//    var_dump($row);
?>

    <li><a href="m3-pet.php?customer_wr_id=<?php echo sprintf('%010d', $row['customer_wr_id']); ?>">
        <img src="http://view.jquerymobile.com/1.3.2/dist/demos/_assets/img/album-bb.jpg">
        <h2 style="white-space: normal;"><?php echo $i; ?>. 고객명: <?php echo $row['customer_wr_subject']; ?></h2>
        <!--<p style="white-space: normal;">고객번호: <?php echo $row['customer_wr_id']; ?></p>-->
        <p style="white-space: normal;">비고: <?php echo $row['customer_wr_content']; ?></p>
        <p style="white-space: normal;">휴대 전화: <?php echo $row['customer_wr_1']; ?></p>
        <p style="white-space: normal;">전화: <?php echo $row['customer_wr_2']; ?></p>
        <p style="white-space: normal;">주소: <?php echo $row['customer_wr_3']; ?></p>
        </a>
        
        <span class="ui-li-count"><?php echo $row['pet_count']; ?></span>
    </li>

<?php
    $i++;
}
?>

</ul>

<?php } ?>

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

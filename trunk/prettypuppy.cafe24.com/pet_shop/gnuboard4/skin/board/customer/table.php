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

            , pet.wr_id AS pet_wr_id
            , pet.wr_subject AS pet_wr_subject

            , sale.wr_id AS sale_wr_id
            , sale.wr_subject AS sale_wr_subject
            , sale.wr_content AS sale_wr_content
            , sale.wr_1 AS sale_wr_1
            , sale.wr_2 AS sale_wr_2
            , sale.wr_3 AS sale_wr_3
            , sale.wr_4 AS sale_wr_4
        FROM {$g4['write_prefix']}customer customer
        LEFT OUTER JOIN {$g4['write_prefix']}pet pet ON pet.wr_1 = customer.wr_id
        LEFT OUTER JOIN {$g4['write_prefix']}sale sale ON sale.wr_2 = pet.wr_id
        WHERE 1 = 1
        {$where}
        ORDER BY
            customer.wr_num
            , sale.wr_4 DESC
        ";

        $result = sql_query($sql);
    }
?>

<!doctype html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no, target-densitydpi=medium-dpi" />
    <title>고객, 애견, 판매</title>
  </head>

  <body>

<form>
    <input type="hidden" name="searchUseYn" value="Y" />

    <select name="searchCondition">
        <option value="">-----고객-----</option>
        <option value="고객번호">고객번호</option>
        <option value="고객명">고객명</option>
        <option value="비고">비고</option>
        <option value="휴대 전화">휴대 전화</option>
        <option value="전화">전화</option>
        <option value="주소">주소</option>

        <option value="">-----애견-----</option>
        <option value="애견번호">애견번호</option>
        <option value="애견명">애견명</option>

        <option value="">-----판매-----</option>
        <option value="분류">분류</option>
        <!-- <option value="고객번호">고객번호</option>
        <option value="애견번호">애견번호</option> -->
        <option value="금액">금액</option>
        <option value="날짜">날짜</option>
    </select>

    <input type="text" name="searchKeyword" value="<?php echo $_REQUEST['searchKeyword']; ?>" />

    <input type="submit" value="검색" />

    <a href="table.php">홈</a>
</form>

<?php if ($_REQUEST['searchUseYn'] == 'Y') { ?>

<table border="1">

    <thead>
        <tr>
            <th scope="col" rowspan="2">번호</th>
            <th scope="col" colspan="6">고객</th>
            <th scope="col" colspan="2">애견</th>
            <th scope="col" colspan="5">판매</th>
        </tr>
        <tr>
            <th scope="col">고객번호</th>
            <th scope="col">고객명</th>
            <th scope="col">비고</th>
            <th scope="col">휴대 전화</th>
            <th scope="col">전화</th>
            <th scope="col">주소</th>

            <th scope="col">애견번호</th>
            <th scope="col">애견명</th>

            <th scope="col">분류</th>
            <th scope="col">고객번호</th>
            <th scope="col">애견번호</th>
            <th scope="col">금액</th>
            <th scope="col">날짜</th>
        </tr>
        </thead>

    <tbody>

<?php
$i = 1;
while ($row = sql_fetch_array($result)) {
//    var_dump($row);
?>

    <tr>
        <td><?php echo $i; ?></td>

        <td><?php echo $row['customer_wr_id']; ?></td>
        <td><?php echo $row['customer_wr_subject']; ?></td>
        <td><?php echo $row['customer_wr_content']; ?></td>
        <td><?php echo $row['customer_wr_1']; ?></td>
        <td><?php echo $row['customer_wr_2']; ?></td>
        <td><?php echo $row['customer_wr_3']; ?></td>

        <td><?php echo $row['pet_wr_id']; ?></td>
        <td><?php echo $row['pet_wr_subject']; ?></td>

        <td><?php echo $row['sale_wr_subject']; ?></td>
        <td><?php echo $row['sale_wr_1']; ?></td>
        <td><?php echo $row['sale_wr_2']; ?></td>
        <td><?php echo number_format($row['sale_wr_3']); ?></td>
        <td><?php echo $row['sale_wr_4']; ?></td>
    </tr>

<?php
    $i++;
}
?>

    </tbody>
</table>

<?php } ?>

<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>

<script type="text/javascript">
<!--
$( document ).ready(function() {
    $('select[name=searchCondition]').val('<?php echo $_REQUEST['searchCondition']; ?>');
});
//-->
</script>

  </body>
</html>

<?php
}
?>

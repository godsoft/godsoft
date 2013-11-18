<?php
$g4_path = "../../.."; // common.php 의 상대 경로
include_once("$g4_path/common.php");

//var_dump($is_admin);

//var_dump(is_null($is_admin));

if (is_null($is_admin) == true) {
    exit;
}

//define('ROOT_DIR', '../');
//require_once(ROOT_DIR . 'classes/classes.php');
//$obj = new Beauty;
//
$year      = ('' == $year)  ? date('Y') : $year;
$month     = ('' == $month) ? date('m') : $month;
$day       = date('d');
$totalDays = date('t', mktime(0, 0, 1, $month, 1, $year)); // 해당연월의 일수를 계산한다.
$firstDay  = date('w', mktime(0, 0, 0, $month, 1, $year));
$col       = 0;

//var_dump($year);

//$result = $obj->select("RIGHT(yyyymmdd, 2), FORMAT(SUM(price), 0)", "GROUP BY yyyymmdd", 0);
//while ($row = mysql_fetch_array($result)) {
//    $arr['yyyymmdd'][$row[0]] = $row[0];
//    $arr['price'][$row[0]]    = $row[1];
//}

//$sql = "SELECT ca_name, wr_1, wr_2, wr_3, wr_4
//FROM g4_write_sale
//WHERE (wr_4 >= '2011-05-01' and wr_4 <= '2011-05-18')
//";

$sql = "
SELECT a.wr_id, a.ca_name, a.wr_1, a.wr_2, a.wr_3, a.wr_4, SUBSTRING(a.wr_4, 9, 2) AS day, b.wr_subject AS customer, c.wr_subject AS pet
FROM g4_write_sale a
LEFT OUTER JOIN {$g4['write_prefix']}customer b ON b.wr_id = a.wr_1
LEFT OUTER JOIN {$g4['write_prefix']}pet c ON c.wr_id = a.wr_2
WHERE (a.wr_4 >= '{$year}-{$month}-01' AND a.wr_4 <= '{$year}-{$month}-31')
ORDER BY a.wr_4 ASC
";

//var_dump($sql);

$result = sql_query($sql);

//while ($row = sql_fetch_array($result)) {
//    //var_dump($row);
//    echo '<p>' . $row['ca_name'] . '</p>';
//}
//
//mysql_data_seek($result, 0);
//
//while ($row = sql_fetch_array($result)) {
//    //var_dump($row);
//    echo '<p>' . $row['ca_name'] . '</p>';
//}

//var_dump($row);

// 판매 날짜, 분류별 조회
$sql2 = "
SELECT wr_4, ca_name, SUM(wr_3) AS wr_3, COUNT(*) AS count, SUBSTRING(wr_4, 9, 2) AS day
FROM g4_write_sale
WHERE (wr_4 >= '{$year}-{$month}-01' and wr_4 <= '{$year}-{$month}-31')
GROUP BY wr_4, ca_name
ORDER BY wr_4 ASC, ca_name ASC
";

$result2 = sql_query($sql2);

//var_dump($g4);

//echo $g4['board_table'] . '_customer'
?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
 <head>
  <title>판매 달력</title>

  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

  <meta name="generator" content="예쁜강아지" />
  <meta name="author" content="예쁜강아지" />
  <meta name="keywords" content="예쁜강아지" />
  <meta name="description" content="예쁜강아지" />
 </head>

 <body>

    <form action="" method="get" name="form1">

      <select name="year" onchange="document.form1.submit()">
        <!-- <option value="all">전체</option> -->
        <?php for ($i = 1900; $i < 2100; $i++) { ?>
        <option value="<?= $i ?>"<?= ($i == $year) ? ' selected="selected"' : '' ?>><?= $i ?>년</option>
        <?php } ?>
      </select>

      <select name="month" onchange="document.form1.submit()">
        <!-- <option value="all">전체</option> -->
        <?php for ($i = 1; $i < 13; $i++) { ?>
        <option value="<?= sprintf('%02d', $i) ?>"<?= ($i == $month) ? ' selected="selected"' : '' ?>><?= $i ?>월</option>
        <?php } ?>
      </select>

      <br /><br />

      <table width="100%" border="1" cellspacing="0" cellpadding="0">
        <tr align="center">
          <td width="14%" style="color: red;">일</td>
          <td width="14%">월</td>
          <td width="14%">화</td>
          <td width="14%">수</td>
          <td width="14%">목</td>
          <td width="14%">금</td>
          <td width="14%" style="color: blue;">토</td>
        </tr>
        <tr align="right">
        <?php
        for ($i = 0; $i < $firstDay; $i++) {
        ?>
          <td>&nbsp;</td>
        <?php
            $col++;
        }

        for ($j = 1; $j <= $totalDays; $j++) {
            //var_dump($j);

//            $price = '';
//
//            while ($row = sql_fetch_array($result)) {
//                //var_dump($row);
//                //echo '<p>' . $row['ca_name'] . '</p>';
//
////                $price = $row['price'];
//////                $price += ', ' . $row['wr4'];
//////                $price += ', ' . $row['price'];
////                $price += '<br />';
//                //var_dump($j . ', '. $row['price']);
//
//                //$price = '<br />' . $j . ', '. (int) $row['day'] . '<br />';
//
////                if ($j == (int) $row['day']) {
////                    $price .= '<br />' . $row['ca_name'];
////                    $price .= ', ' . $row['wr_1'];
////                    $price .= ', ' . $row['wr_2'];
////                    $price .= ', ' . $row['wr_3'];
////                    $price .= ', ' . $row['wr_4'];
////                    $price .= ', ' . $row['day'];
////                    $price .= '<br />';
////                }
//            }
//
//            $price .= '<br />';
//
//            mysql_data_seek($result, 0);

//            if ($j == $arr['yyyymmdd'][$j]) {
//                $price = $arr['price'][$j];
//            } else {
//                $price = '';
//            }

            $price = '';

            $price .= '<ol>';

            $sale_price_sum = 0;

            while ($row2 = sql_fetch_array($result2)) {
                //echo $j . ' == ' . $row2['day'] . '<br />';

                if ($j == $row2['day']) {
                    $price .= '<li>';
                    $price .= $row2['ca_name'] . '';
                    $price .= '(' . $row2['count'] . ')';
                    $price .= ' ' . number_format($row2['wr_3']) . '원';
                    $price .= '</li>';

                    $sale_price_sum += $row2['wr_3'];
                }
            }

            mysql_data_seek($result2, 0);

            if ($sale_price_sum > 0) {
                $price .= '<li style="font-weight: bold;">';
                $price .= '합계: ' . number_format($sale_price_sum) . '원';
                $price .= '</li>';
            }

            $price .= '</ol>';
        ?>
          <td<?= ($j == $day) ? ' style="background-color: blue; color: white"' : ''?> valign="top">
            <?= $j ?><br />
            <?= $price ?><br />
            <span id="day_<?php echo $j; ?>"></span>
          </td>
        <?php
            $col++;

            if (7 == $col) {
        ?>
        </tr>
        <?php
                if ($totalDays != $j) {
        ?>
        <tr align="right">
        <?php
                }

                $col = 0;
            }
        }
        while (($col > 0) && ($col < 7)) {
        ?>
          <td>&nbsp;</td>
        <?php
            $col++;
        }
        ?>
        </tr>
      </table>

    </form>

<?php
if (false) {
?>

<ol id="day2_<?php echo $row['wr_id']; ?>">

<?php
$total = 0;

while ($row = sql_fetch_array($result)) {
?>
  <li><?php echo $row['ca_name']; ?>, <?php echo $row['wr_1']; ?>, <?php echo $row['wr_2']; ?>, <?php echo number_format($row['wr_3']); ?>원, <?php echo $row['wr_4']; ?>: <span id="day2_<?php echo $row['wr_id']; ?>"><?php echo $row['ca_name']; ?>, <?php echo number_format($row['wr_3']); ?>원</span></li>
<?php
    $total += $row['wr_3'];
}
?>

</ol>

총 <?php echo number_format($total); ?>원

</div>

<script type="text/javascript">
<!--
//for (var i = 1; i < 31; i++) {
//    if (document.getElementById('day2_' + i) != null) {
//        alert(document.getElementById('day2_' + i).innerHTML);
//    }
//
//    //document.getElementById('day_' + i).innerHTML = '';
//}

<?php
mysql_data_seek($result, 0);

while ($row = sql_fetch_array($result)) {
?>
document.getElementById('day_<?php echo (int) $row['day']; ?>').innerHTML += '<br />' + document.getElementById('day2_<?php echo $row['wr_id']; ?>').innerHTML;
<?php
}
?>
//-->
</script>

<?php
}
?>

<br />

<table border="1">

  <caption>판매 날짜, 분류별 전체 상세 판매 내역</caption>

  <tr>
    <th>번호</th>
    <th>판매 날짜</th>
    <th>분류</th>
    <th>고객 아이디</th>
    <th>애견 아이디</th>
    <th>판매 금액</th>
  </tr>

<?php
mysql_data_seek($result, 0);

$i = 1;

$sale_price_sum = 0;

while ($row = sql_fetch_array($result)) {
?>

  <tr>
    <td><?php echo $i; ?></td>
    <td><?php echo $row['wr_4']; ?></td>
    <td><?php echo $row['ca_name']; ?></td>
    <td><?php echo $row['customer'] . '(' . $row['wr_1'] . ')'; ?></td>
    <td><?php echo $row['pet'] . '(' . $row['wr_2'] . ')'; ?></td>
    <td><?php echo number_format($row['wr_3']); ?>원</td>
  </tr>

<?php
    $i++;

    $sale_price_sum += $row['wr_3'];
}
?>

  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td><?php echo number_format($sale_price_sum); ?>원</td>
    <td></td>
  </tr>

</table>

<?php
if (false) {
?>

<br />

<table border="1">

  <caption>판매 날짜, 분류별 판매 금액</caption>

<?php
//mysql_data_seek($result2, 0);

while ($row2 = sql_fetch_array($result2)) {
?>

  <tr>
    <td><?php echo $row2['day']; ?></td>
    <td><?php echo $row2['wr_4']; ?></td>
    <td><?php echo $row2['ca_name']; ?></td>
    <td><?php echo $row2['count']; ?></td>
    <td><?php echo number_format($row2['wr_3']); ?></td>

  </tr>

<?php
}
?>

</table>

<?php
}
?>

<br />

<table border="1">

  <caption>용품 상세 판매 내역</caption>

  <tr>
    <th>번호</th>
    <th>분류</th>
    <th>고객 아이디</th>
    <th>애견 아이디</th>
    <th>판매 금액</th>
    <th>판매 날짜</th>
  </tr>

<?php
mysql_data_seek($result, 0);

$i = 1;

$sale_price_sum = 0;

while ($row = sql_fetch_array($result)) {
    if ($row['ca_name'] == '용품') {
?>

  <tr>
    <td><?php echo $i; ?></td>
    <td><?php echo $row['ca_name']; ?></td>
    <td><?php echo $row['customer'] . '(' . $row['wr_1'] . ')'; ?></td>
    <td><?php echo $row['pet'] . '(' . $row['wr_2'] . ')'; ?></td>
    <td><?php echo number_format($row['wr_3']); ?>원</td>
    <td><?php echo $row['wr_4']; ?></td>
  </tr>

<?php
    $i++;

    $sale_price_sum += $row['wr_3'];
    }
}
?>

  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td><?php echo number_format($sale_price_sum); ?>원</td>
    <td></td>
  </tr>

</table>

<br />

<table border="1">

  <caption>미용 상세 판매 내역</caption>

  <tr>
    <th>번호</th>
    <th>분류</th>
    <th>고객 아이디</th>
    <th>애견 아이디</th>
    <th>판매 금액</th>
    <th>판매 날짜</th>
  </tr>

<?php
mysql_data_seek($result, 0);

$i = 1;

$sale_price_sum = 0;

while ($row = sql_fetch_array($result)) {
    if ($row['ca_name'] == '미용') {
?>

  <tr>
    <td><?php echo $i; ?></td>
    <td><?php echo $row['ca_name']; ?></td>
    <td><?php echo $row['customer'] . '(' . $row['wr_1'] . ')'; ?></td>
    <td><?php echo $row['pet'] . '(' . $row['wr_2'] . ')'; ?></td>
    <td><?php echo number_format($row['wr_3']); ?>원</td>
    <td><?php echo $row['wr_4']; ?></td>
  </tr>

<?php
    $i++;

    $sale_price_sum += $row['wr_3'];
    }
}
?>

  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td><?php echo number_format($sale_price_sum); ?>원</td>
    <td></td>
  </tr>

</table>

<br />

<table border="1">

  <caption>목욕 상세 판매 내역</caption>

  <tr>
    <th>번호</th>
    <th>분류</th>
    <th>고객 아이디</th>
    <th>애견 아이디</th>
    <th>판매 금액</th>
    <th>판매 날짜</th>
  </tr>

<?php
mysql_data_seek($result, 0);

$i = 1;

$sale_price_sum = 0;

while ($row = sql_fetch_array($result)) {
    if ($row['ca_name'] == '목욕') {
?>

  <tr>
    <td><?php echo $i; ?></td>
    <td><?php echo $row['ca_name']; ?></td>
    <td><?php echo $row['customer'] . '(' . $row['wr_1'] . ')'; ?></td>
    <td><?php echo $row['pet'] . '(' . $row['wr_2'] . ')'; ?></td>
    <td><?php echo number_format($row['wr_3']); ?>원</td>
    <td><?php echo $row['wr_4']; ?></td>
  </tr>

<?php
    $i++;

    $sale_price_sum += $row['wr_3'];
    }
}
?>

  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td><?php echo number_format($sale_price_sum); ?>원</td>
    <td></td>
  </tr>

</table>

<!-- 용품 -->

<br />

<table border="1">

  <caption>교배 상세 판매 내역</caption>

  <tr>
    <th>번호</th>
    <th>분류</th>
    <th>고객 아이디</th>
    <th>애견 아이디</th>
    <th>판매 금액</th>
    <th>판매 날짜</th>
  </tr>

<?php
mysql_data_seek($result, 0);

$i = 1;

$sale_price_sum = 0;

while ($row = sql_fetch_array($result)) {
    if ($row['ca_name'] == '교배') {
?>

  <tr>
    <td><?php echo $i; ?></td>
    <td><?php echo $row['ca_name']; ?></td>
    <td><?php echo $row['customer'] . '(' . $row['wr_1'] . ')'; ?></td>
    <td><?php echo $row['pet'] . '(' . $row['wr_2'] . ')'; ?></td>
    <td><?php echo number_format($row['wr_3']); ?>원</td>
    <td><?php echo $row['wr_4']; ?></td>
  </tr>

<?php
    $i++;

    $sale_price_sum += $row['wr_3'];
    }
}
?>

  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td><?php echo number_format($sale_price_sum); ?>원</td>
    <td></td>
  </tr>

</table>

<br />

<table border="1">

  <caption>분양 상세 판매 내역</caption>

  <tr>
    <th>번호</th>
    <th>분류</th>
    <th>고객 아이디</th>
    <th>애견 아이디</th>
    <th>판매 금액</th>
    <th>판매 날짜</th>
  </tr>

<?php
mysql_data_seek($result, 0);

$i = 1;

$sale_price_sum = 0;

while ($row = sql_fetch_array($result)) {
    if ($row['ca_name'] == '분양') {
?>

  <tr>
    <td><?php echo $i; ?></td>
    <td><?php echo $row['ca_name']; ?></td>
    <td><?php echo $row['customer'] . '(' . $row['wr_1'] . ')'; ?></td>
    <td><?php echo $row['pet'] . '(' . $row['wr_2'] . ')'; ?></td>
    <td><?php echo number_format($row['wr_3']); ?>원</td>
    <td><?php echo $row['wr_4']; ?></td>
  </tr>

<?php
    $i++;

    $sale_price_sum += $row['wr_3'];
    }
}
?>

  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td><?php echo number_format($sale_price_sum); ?>원</td>
    <td></td>
  </tr>

</table>

<br />

<table border="1">

  <caption>호텔 상세 판매 내역</caption>

  <tr>
    <th>번호</th>
    <th>분류</th>
    <th>고객 아이디</th>
    <th>애견 아이디</th>
    <th>판매 금액</th>
    <th>판매 날짜</th>
  </tr>

<?php
mysql_data_seek($result, 0);

$i = 1;

$sale_price_sum = 0;

while ($row = sql_fetch_array($result)) {
    if ($row['ca_name'] == '호텔') {
?>

  <tr>
    <td><?php echo $i; ?></td>
    <td><?php echo $row['ca_name']; ?></td>
    <td><?php echo $row['customer'] . '(' . $row['wr_1'] . ')'; ?></td>
    <td><?php echo $row['pet'] . '(' . $row['wr_2'] . ')'; ?></td>
    <td><?php echo number_format($row['wr_3']); ?>원</td>
    <td><?php echo $row['wr_4']; ?></td>
  </tr>

<?php
    $i++;

    $sale_price_sum += $row['wr_3'];
    }
}
?>

  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td><?php echo number_format($sale_price_sum); ?>원</td>
    <td></td>
  </tr>

</table>

 </body>
</html>

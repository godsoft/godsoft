<?php
$g4_path = '../../../'; // common.php 의 상대 경로
include_once($g4_path . '/common.php');

//echo($wrhousng_wr_id) . '<br/>';

// 입고수량
$sql = "
SELECT wr_3
FROM {$g4['write_prefix']}wrhousng
WHERE 1 = 1
AND wr_id = {$wrhousng_wr_id}
";

//$result = sql_query($sql);

//for ($i = 0; $row = sql_fetch_array($result); $i++) {
//    var_dump($row['wr_3']);
//}

$row = sql_fetch($sql);

$wrhousng_qy = $row['wr_3'];

//echo($wrhousng_qy) . '<br/>';
?>

<table border="1">

<tr>
  <th></th>
  <!-- <th>입고번호</th>
  <th>주유소번호</th>
  <th>담당자번호</th>
  <th>출고일자</th> -->
  <th>입고수량</th>
  <th>출고수량</th>
  <th>현재고(입고수량 - 출고수량)</th>
</tr>

<?php
// 출고수량
$sql = "
SELECT *
FROM {$g4['write_prefix']}dlivy
WHERE 1 = 1
AND wr_1 = {$wrhousng_wr_id}
";

$result = sql_query($sql);

$dlivy_qy = 0;

for ($i = 0; $row = sql_fetch_array($result); $i++) {
    $dlivy_qy += $row['wr_5'];
?>

<tr>
  <td><?php echo $row['wr_subject']; ?></td>
  <!-- <td><?php echo $row['wr_1']; ?></td>
  <td><?php echo $row['wr_2']; ?></td>
  <td><?php echo $row['wr_3']; ?></td>
  <td><?php echo $row['wr_4']; ?></td> -->
  <td></td>
  <td><?php echo $row['wr_5']; ?></td>
  <td></td>
</tr>

<?php
    //echo($row['wr_5']) . '<br/>';
}
?>

<tr>
  <td></td>
  <td><?php echo $wrhousng_qy; ?></td>
  <td><?php echo $dlivy_qy; ?></td>
  <td><?php echo $wrhousng_qy - $dlivy_qy; ?></td>
</tr>

</table>

<?php
$wr_5 = $wrhousng_qy - $dlivy_qy;

$sql = "
UPDATE {$g4['write_prefix']}wrhousng
SET
    wr_4 = '{$dlivy_qy}'
    , wr_5 = '{$wr_5}'
WHERE 1 = 1
AND wr_id = {$wrhousng_wr_id}
";

//echo($sql) . '<br/>';

sql_query($sql);
?>
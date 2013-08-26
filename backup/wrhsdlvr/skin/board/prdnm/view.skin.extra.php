<?php
//var_dump($view);

//var_dump(is_numeric($view['wr_1']));

// 업체번호명
$entrps_name = '';

if (is_numeric($view['wr_1']) == true) {
    $wr_1 = $view['wr_1'];
    //$wr_id = sprintf('%010d', $wr_id);

    $sql = "
    SELECT
        wr_subject
    FROM {$g4['write_prefix']}entrps
    WHERE 1 = 1
    AND wr_id = {$wr_1}
    ";
    //echo $sql;
    $row = sql_fetch($sql);
    //echo $row['wr_subject'];

    $entrps_name = $row['wr_subject'];
}
?>

<fieldset>
  <!-- <legend>여분 필드</legend> -->

  <dl>
    <dt><?php echo $board['bo_1_subj']; ?>:</dt>
    <dd><?php echo $write['wr_1']; ?>, <?php echo $entrps_name; ?></dd>
  </dl>

</fieldset>

<br/>

<?php
//var_dump($view);

//var_dump(is_numeric($view['wr_1']));

// 품명번호명
$prdnm_name = '';

if (is_numeric($view['wr_1']) == true) {
    $wr_1 = $view['wr_1'];
    //$wr_id = sprintf('%010d', $wr_id);

    $sql = "
    SELECT
        p.wr_id
        , CONCAT(e.wr_subject, ' - ', p.wr_subject) AS wr_subject
    FROM {$g4['write_prefix']}prdnm p
    LEFT OUTER JOIN {$g4['write_prefix']}entrps e ON e.wr_id = p.wr_1
    WHERE 1 = 1
    AND p.wr_id = {$wr_1}
    ORDER BY
        e.wr_subject
    ";
    //echo $sql;
    $row = sql_fetch($sql);
    //echo $row['wr_subject'];

    $prdnm_name = $row['wr_subject'];
}
?>

<fieldset>
  <!-- <legend>여분 필드</legend> -->

  <dl>
    <dt><?php echo $board['bo_1_subj']; ?>:</dt>
    <dd><?php echo $view['wr_1']; ?>, <?php echo $prdnm_name; ?></dd>
  </dl>

</fieldset>

<br/>

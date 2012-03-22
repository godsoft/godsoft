<?
if (!defined("_GNUBOARD_")) exit; // 개별 페이지 접근 불가

// 업체번호명
$sql = "SELECT * FROM {$g4['write_prefix']}entrps";
//echo $sql;
$result = sql_query($sql);
$entrps_array = array();
for ($i = 0; $row = sql_fetch_array($result); $i++) {
    //var_dump($row);

    //echo $row['wr_subject'] . '<br/>';
    //echo $row['wr_id'] . '<br/>';

    //$entrps_array[$row['wr_id']] = $row['wr_subject'];
    $entrps_array[$row['wr_subject']] = $row['wr_id'];
}

//var_dump($entrps_array);

//$key = array_search('2', $entrps_array); // $key = 2;

//echo $key;
?>

<table width=100% cellpadding=0 cellspacing=0>
<tr>
    <td width=14><img src='<?=$latest_skin_path?>/img/latest_t01.gif'></td>
    <td width='100%' background='<?=$latest_skin_path?>/img/bg_latest.gif'>&nbsp;&nbsp;<strong><a href='<?=$g4[bbs_path]?>/board.php?bo_table=<?=$bo_table?>'><?=$board[bo_subject]?></a></strong></td>
    <td width=37 background='<?=$latest_skin_path?>/img/bg_latest.gif'><a href='<?=$g4[bbs_path]?>/board.php?bo_table=<?=$bo_table?>'><img src='<?=$latest_skin_path?>/img/more.gif' border=0></a></td>
    <td width=14><img src='<?=$latest_skin_path?>/img/latest_t02.gif'></td>
</tr>
</table>

<table width=100% cellpadding=0 cellspacing=0>
<? for ($i=0; $i<count($list); $i++) { ?>
<tr>
    <td colspan=4 align=center>
        <table width=95%>
        <tr>
            <td height=25><img src='<?=$latest_skin_path?>/img/latest_icon.gif' align=absmiddle>&nbsp;&nbsp;
            <?
            //echo $list[$i]['wr_1'] . " ";
            echo array_search($list[$i]['wr_1'], $entrps_array) . " > ";

            echo $list[$i]['icon_reply'] . " ";
            echo "<a href='{$list[$i]['href']}'>";
            if ($list[$i]['is_notice'])
                echo "<font style='font-family:돋움; font-size:9pt; color:#2C88B9;'><strong>{$list[$i]['subject']}</strong></font>";
            else
                echo "<font style='font-family:돋움; font-size:9pt; color:#6A6A6A;'>{$list[$i]['subject']}</font>";
            echo "</a>";

            if ($list[$i]['comment_cnt'])
                echo " <a href=\"{$list[$i]['comment_href']}\"><span style='font-family:돋움; font-size:8pt; color:#9A9A9A;'>{$list[$i]['comment_cnt']}</span></a>";

            // if ($list[$i]['link']['count']) { echo "[{$list[$i]['link']['count']}]"; }
            // if ($list[$i]['file']['count']) { echo "<{$list[$i]['file']['count']}>"; }

            echo " " . $list[$i]['icon_new'];
            echo " " . $list[$i]['icon_file'];
            echo " " . $list[$i]['icon_link'];
            echo " " . $list[$i]['icon_hot'];
            echo " " . $list[$i]['icon_secret'];
            ?></td></tr>
        <tr><td bgcolor=#EBEBEB height=1></td></tr>
        </table></td>
</tr>
<? } ?>

<? if (count($list) == 0) { ?><tr><td colspan=4 align=center height=50><font color=#6A6A6A>게시물이 없습니다.</a></td></tr><? } ?>

</table>

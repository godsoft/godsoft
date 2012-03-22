<?php
// 업체번호명
$entrps_name = '';

if (is_numeric($write['wr_1']) == true) {
    $wr_1 = $write['wr_1'];
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

//echo $entrps_name;
?>

<link rel="stylesheet" href="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/themes/base/jquery.ui.all.css">
<script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/jquery-1.7.1.js"></script>
<script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/ui/jquery.ui.core.js"></script>
<script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/ui/jquery.ui.widget.js"></script>
<script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/ui/jquery.ui.position.js"></script>
<script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/ui/jquery.ui.autocomplete.js"></script>
<link rel="stylesheet" href="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/demos/demos.css">
<style>
.ui-autocomplete-loading { background: white url('/js/jquery/jquery-ui-1.8.18.custom/development-bundle/demos/autocomplete/images/ui-anim_basic_16x16.gif') right center no-repeat; }
</style>
<script>
$(function() {
    $( "#birds-wr_1" ).autocomplete({
        source: "../skin/board/entrps/search.php",
        minLength: 1,
        select: function( event, ui ) {
            $('#wr_1').val(ui.item.id);
        }
    });
});
</script>

<tr>
    <td class=write_head><label for="wr_1"><?php echo $board['bo_1_subj']; ?></label></td>
    <td><input class='ed' style="" name="wr_1" id="wr_1" itemname="<?php echo $board['bo_1_subj']; ?>" required value="<?php echo $write['wr_1']; ?>" readonly="readonly">

      <input id="birds-wr_1" value="<?php echo $entrps_name; ?>" />

    </td></tr>
<tr><td colspan=2 height=1 bgcolor=#e7e7e7></td></tr>

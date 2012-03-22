<?php
//var_dump(is_null($_GET['w']));

if (is_null($_GET['w']) == true) {
    $write['wr_4'] = date('Ymd');

    $write['wr_1'] = $wr_1;
}

$olt_name = '';

if ($_GET['w'] == 'u') {
    // 주유소번호명
    $sql = "
    SELECT
        wr_subject
    FROM {$g4['write_prefix']}olt
    WHERE 1 = 1
    AND wr_id = {$write['wr_2']}
    ";
    //echo $sql;
    $row = sql_fetch($sql);
    //echo $row['wr_subject'];

    $olt_name = $row['wr_subject'];

    // 담당자번호명
    $sql = "
    SELECT
        wr_subject
    FROM {$g4['write_prefix']}charger
    WHERE 1 = 1
    AND wr_id = {$write['wr_2']}
    ";
    //echo $sql;
    $row = sql_fetch($sql);
    //echo $row['wr_subject'];

    $charger_name = $row['wr_subject'];
}
?>

<link rel="stylesheet" href="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/themes/base/jquery.ui.all.css">
<script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/jquery-1.7.1.js"></script>
<script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/ui/jquery.ui.core.js"></script>
<script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/ui/jquery.ui.widget.js"></script>
<script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/ui/jquery.ui.position.js"></script>
<script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/ui/jquery.ui.autocomplete.js"></script>

<script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/ui/jquery.ui.datepicker.js"></script>
<script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/ui/i18n/jquery.ui.datepicker-ko.js"></script>

<link rel="stylesheet" href="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/demos/demos.css">
<style>
.ui-autocomplete-loading { background: white url('/js/jquery/jquery-ui-1.8.18.custom/development-bundle/demos/autocomplete/images/ui-anim_basic_16x16.gif') right center no-repeat; }
</style>
<script>
$(function() {
    $( "#birds-wr_2" ).autocomplete({
        source: "../skin/board/olt/search.php",
        minLength: 1,
        select: function( event, ui ) {
            $('#wr_2').val(ui.item.id);
        }
    });

    $( "#birds-wr_3" ).autocomplete({
        source: "../skin/board/charger/search.php",
        minLength: 1,
        select: function( event, ui ) {
            $('#wr_3').val(ui.item.id);
        }
    });

    $.datepicker.setDefaults( $.datepicker.regional[ "kr" ] );

    $( "#datepicker" ).datepicker({
        numberOfMonths: 3,
        showButtonPanel: true,

        changeMonth: true,
        changeYear: true,

        dateFormat: 'yymmdd',

        onSelect: function(dateText, inst) {
            //alert(dateText + ', ' + inst);

            $('#wr_4').val(dateText);
        }
    });

    $('#birds-wr_2').focus();
});

function extra_onblur() {
//return;

//alert(f);

    var extra_field = $('#wr_1').val();
    extra_field += ' > ' + $('#birds-wr_2').val();
    extra_field += ' > ' + $('#birds-wr_3').val();
    extra_field += ' > ' + $('#wr_4').val().substring(0, 4) + '-' + $('#wr_4').val().substring(4, 6) + '-' + $('#wr_4').val().substring(6, 8);
    extra_field += ' > ' + $('#wr_5').val();

//alert(extra_field);

    $('#wr_subject').val(extra_field);
    $('#wr_content').val(extra_field);
}
</script>

<tr>
    <td class=write_head><label for="wr_1"><?php echo $board['bo_1_subj']; ?></label></td>
    <td><input class='ed' style="" name="wr_1" id="wr_1" itemname="<?php echo $board['bo_1_subj']; ?>" required value="<?php echo $write['wr_1']; ?>" readonly="readonly"></td></tr>
<tr><td colspan=2 height=1 bgcolor=#e7e7e7></td></tr>

<tr>
    <td class=write_head><label for="wr_2"><?php echo $board['bo_2_subj']; ?></label></td>
    <td><input class='ed' style="" name="wr_2" id="wr_2" itemname="<?php echo $board['bo_2_subj']; ?>" required value="<?php echo $write['wr_2']; ?>" onblur="extra_onblur();" readonly="readonly">

      <input id="birds-wr_2" value="<?php echo $olt_name; ?>" onblur="extra_onblur();" />

    </td></tr>
<tr><td colspan=2 height=1 bgcolor=#e7e7e7></td></tr>

<tr>
    <td class=write_head><label for="wr_3"><?php echo $board['bo_3_subj']; ?></label></td>
    <td><input class='ed' style="" name="wr_3" id="wr_3" itemname="<?php echo $board['bo_3_subj']; ?>" required value="<?php echo $write['wr_3']; ?>" onblur="extra_onblur();" readonly="readonly">

      <input id="birds-wr_3" value="<?php echo $charger_name; ?>" onblur="extra_onblur();" />

    </td></tr>
<tr><td colspan=2 height=1 bgcolor=#e7e7e7></td></tr>

<tr>
    <td class=write_head><label for="wr_4"><?php echo $board['bo_4_subj']; ?></label></td>
    <td><input class='ed' style="" name="wr_4" id="wr_4" itemname="<?php echo $board['bo_4_subj']; ?>" required value="<?php echo $write['wr_4']; ?>" onblur="extra_onblur();">

      <input type="text" id="datepicker">

    </td></tr>
<tr><td colspan=2 height=1 bgcolor=#e7e7e7></td></tr>

<tr>
    <td class=write_head><label for="wr_5"><?php echo $board['bo_5_subj']; ?></label></td>
    <td><input class='ed' style="" name="wr_5" id="wr_5" itemname="<?php echo $board['bo_5_subj']; ?>" required value="<?php echo $write['wr_5']; ?>" onblur="extra_onblur();"></td></tr>
<tr><td colspan=2 height=1 bgcolor=#e7e7e7></td></tr>

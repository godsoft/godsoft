<?php
//var_dump(is_null($_GET['w']));

if (is_null($_GET['w']) == true) {
    $write['wr_2'] = date('Ymd');
}

$stndrd_name = '';

if ($_GET['w'] == 'u') {
    // 규격번호명
    $sql = "
    SELECT
        CONCAT(e.wr_subject, ' > ', p.wr_subject, ' > ', s.wr_subject) AS wr_subject
    FROM {$g4['write_prefix']}stndrd s
    LEFT OUTER JOIN {$g4['write_prefix']}prdnm p ON p.wr_id = s.wr_1
    LEFT OUTER JOIN {$g4['write_prefix']}entrps e ON e.wr_id = p.wr_1
    WHERE 1 = 1
    AND p.wr_id = {$write['wr_1']}
    ";
    //echo $sql;
    $row = sql_fetch($sql);
    //echo $row['wr_subject'];

    $stndrd_name = $row['wr_subject'];
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
    $( "#birds-wr_1" ).autocomplete({
        source: "../skin/board/stndrd/search.php",
        minLength: 1,
        select: function( event, ui ) {
            $('#wr_1').val(ui.item.id);
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

            $('#wr_2').val(dateText);
        }
    });

    $('#birds-wr_1').focus();
});

function extra_onblur() {
//alert(f);

    var extra_field = '\'' + $('#birds-wr_1').val() + '\'';
    extra_field += ' > ' + $('#wr_2').val().substring(0, 4) + '-' + $('#wr_2').val().substring(4, 6) + '-' + $('#wr_2').val().substring(6, 8);
    extra_field += ' > ' + $('#wr_3').val();

//alert(extra_field);

    $('#wr_subject').val(extra_field);
    $('#wr_content').val(extra_field);
}
</script>

<tr>
    <td class=write_head><label for="wr_1"><?php echo $board['bo_1_subj']; ?></label></td>
    <td><input class='ed' style="" name="wr_1" id="wr_1" itemname="<?php echo $board['bo_1_subj']; ?>" required value="<?php echo $write['wr_1']; ?>" readonly="readonly">

      <input id="birds-wr_1" value="<?php echo $stndrd_name; ?>" onblur="extra_onblur();" />

    </td></tr>
<tr><td colspan=2 height=1 bgcolor=#e7e7e7></td></tr>

<tr>
    <td class=write_head><label for="wr_2"><?php echo $board['bo_2_subj']; ?></label></td>
    <td><input class='ed' style="" name="wr_2" id="wr_2" itemname="<?php echo $board['bo_2_subj']; ?>" required value="<?php echo $write['wr_2']; ?>" onblur="extra_onblur();">

      <input type="text" id="datepicker">

    </td></tr>
<tr><td colspan=2 height=1 bgcolor=#e7e7e7></td></tr>

<tr>
    <td class=write_head><label for="wr_3"><?php echo $board['bo_3_subj']; ?></label></td>
    <td><input class='ed' style="" name="wr_3" id="wr_3" itemname="<?php echo $board['bo_3_subj']; ?>" required value="<?php echo $write['wr_3']; ?>" onblur="extra_onblur();"></td></tr>
<tr><td colspan=2 height=1 bgcolor=#e7e7e7></td></tr>

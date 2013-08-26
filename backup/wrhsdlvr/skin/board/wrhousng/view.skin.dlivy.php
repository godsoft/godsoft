<?php
//var_dump($wr_id);

//echo $wr_id;
?>

  <link rel="stylesheet" href="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/themes/base/jquery.ui.all.css">
  <script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/jquery-1.7.1.js"></script>
  <script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/external/jquery.bgiframe-2.1.2.js"></script>
  <script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/ui/jquery.ui.core.js"></script>
  <script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/ui/jquery.ui.widget.js"></script>
  <script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/ui/jquery.ui.mouse.js"></script>
  <script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/ui/jquery.ui.draggable.js"></script>
  <script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/ui/jquery.ui.position.js"></script>
  <script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/ui/jquery.ui.resizable.js"></script>
  <script src="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/ui/jquery.ui.dialog.js"></script>
  <link rel="stylesheet" href="/js/jquery/jquery-ui-1.8.18.custom/development-bundle/demos/demos.css">
  <script>
  $(function() {
    // a workaround for a flaw in the demo system (http://dev.jqueryui.com/ticket/4375), ignore!
    //$( "#dialog:ui-dialog" ).dialog( "destroy" );

    $( "#dialog-modal" ).dialog({
      width: 800,
      height: 600,
      modal: true,

      autoOpen: false
    });

//    $( "#create-user" )
//      .button()
//      .click(function() {
//alert(1);
//        //$( "#dialog-modal" ).dialog( "open" );
//      });
  });

  function dlivy_onclick() {
      var bbs_path = '<?php echo $g4['bbs_path']; ?>';

      var src = '';
      src += bbs_path;
      src += '/write.php?bo_table=dlivy&wr_1=<?php echo sprintf('%010d', $wr_id);?>';

//alert(src);

      //$('#dlivy_iframe').src = src;
      $("#dlivy_iframe").attr("src", src);

      $( "#dialog-modal" ).dialog( "option", "title", '출고' );

      $( "#dialog-modal" ).dialog( "open" );
  }

  function dlivy_list_onclick() {
      var bbs_path = '<?php echo $g4['bbs_path']; ?>';

      var src = '';
      src += bbs_path;
      src += '/board.php?bo_table=dlivy&sca=&sfl=wr_1&stx=<?php echo sprintf('%010d', $wr_id);?>&x=19&y=17&sop=and';

//alert(src);

      //$('#dlivy_iframe').src = src;
      $("#dlivy_iframe").attr("src", src);

      $( "#dialog-modal" ).dialog( "option", "title", '출고목록' );

      $( "#dialog-modal" ).dialog( "open" );
  }

  function invntry_onclick(wrhousng_wr_id) {
      var src = '';
      src += '<?php echo $board_skin_path; ?>';
      src += '/invntry.php';
      src += '?wrhousng_wr_id=' + wrhousng_wr_id;

      $("#dlivy_iframe").attr("src", src);

      $( "#dialog-modal" ).dialog( "option", "title", '현재고 계산' );

      $( "#dialog-modal" ).dialog( "open" );
  }
  </script>

<div id="dialog-modal" title="출고관리">
  <iframe id="dlivy_iframe" style="width: 100%; height: 90%;"></iframe>
</div>

<button id="create-user" onclick="dlivy_onclick()">출고</button>
<button id="create-user" onclick="dlivy_list_onclick()">출고목록</button>
<button id="create-user" onclick="invntry_onclick('<?php echo $wr_id; ?>')">현재고 계산</button>

<table border="1">
<tr>
  <th>입고수량</th>
  <th>출고수량</th>
  <th>현재고(입고수량 - 출고수량)</th>
</tr>
<tr>
  <td><?php echo $view['wr_3']; ?></td>
  <td><?php echo $view['wr_4']; ?></td>
  <td><?php echo $view['wr_5']; ?></td>
</tr>
</table>

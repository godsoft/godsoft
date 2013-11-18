<?php
header('Location: bbs/board.php?bo_table=customer');
exit;
?>

<?php
if (false) {
?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
 <head>
  <title>예쁜강아지</title>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="generator" content="예쁜강아지" />
  <meta name="author" content="예쁜강아지" />
  <meta name="keywords" content="예쁜강아지" />
  <meta name="description" content="예쁜강아지" />
 </head>

  <!-- <frameset rows="," cols="30%,30%,40%">
    <frame src="bbs/board.php?bo_table=customer" id="customer_frame" name="customer_frame" />
    <frame src="bbs/board.php?bo_table=pet" id="pet_frame" name="pet_frame" />
    <frame src="bbs/board.php?bo_table=sale" id="sale_frame" name="sale_frame" />
  </frameset> -->

  <frameset rows="," cols="50%,50%">
    <frame src="bbs/board.php?bo_table=customer" id="customer_frame" name="customer_frame" />
    <frame src="bbs/board.php?bo_table=pet" id="pet_frame" name="pet_frame" />
  </frameset>

 <body>

 </body>
</html>

<?php
}
//exit;
?>

<?
include_once("./_common.php");
include_once("$g4[path]/lib/latest.lib.php");

$g4['title'] = "";
include_once("./_head.php");
?>

<?php
//var_dump($member['mb_id']);

if (is_null($member['mb_id']) == true) {
?>

<!-- 로그인 이전 -->

<?php
} else {
?>

<!-- 로그인 이후 -->

    <!-- 메인화면 최신글 시작 -->
    <table width="100%" cellpadding=0 cellspacing=0><tr><td valign=top>
    <?
    //  최신글
    $sql = " select bo_table, bo_subject from $g4[board_table] where bo_table = 'customer' order by gr_id, bo_table ";
    //$sql = " select bo_table, bo_subject from $g4[board_table] order by gr_id, bo_table ";
    $result = sql_query($sql);
    for ($i=0; $row=sql_fetch_array($result); $i++) {
        // 이 함수가 바로 최신글을 추출하는 역할을 합니다.
        // 스킨은 입력하지 않을 경우 관리자 > 환경설정의 최신글 스킨경로를 기본 스킨으로 합니다.

        // 사용방법
        // latest(스킨, 게시판아이디, 출력라인, 글자수);
        echo latest("basic", $row['bo_table'], 10, 70);
        echo "<p>\n";
    }
    ?>
    </td></tr></table>
    <!-- 메인화면 최신글 끝 -->

<?php
}
?>

<?
include_once("./_tail.php");
?>

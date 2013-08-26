<?
include_once("./_common.php");
include_once("$g4[path]/lib/latest.lib.php");

$g4['title'] = "";
include_once("./_head.php");
?>

<!-- 메인화면 최신글 시작 -->
<table width="100%" cellpadding=0 cellspacing=0><tr><td valign=top>
<?
//  최신글
$sql = " select bo_table, bo_subject
from $g4[board_table]
WHERE 1 = 1
AND bo_table != 'dlivy'
order by gr_id, bo_order_search ";
$result = sql_query($sql);
for ($i=0; $row=sql_fetch_array($result); $i++) {
    // 이 함수가 바로 최신글을 추출하는 역할을 합니다.
    // 스킨은 입력하지 않을 경우 관리자 > 환경설정의 최신글 스킨경로를 기본 스킨으로 합니다.

    // 사용방법
    // latest(스킨, 게시판아이디, 출력라인, 글자수);

//$skin_dir=""

//echo $row['bo_table'];

    if ($row['bo_table'] == 'prdnm' || $row['bo_table'] == 'stndrd' || $row['bo_table'] == 'wrhousng') {
        $skin_dir = $row['bo_table'];
    } else {
        $skin_dir = 'basic';
    }

    echo latest($skin_dir, $row['bo_table'], 10, 170);
    echo "<p>\n";
}
?>
</td></tr></table>
<!-- 메인화면 최신글 끝 -->

<?
include_once("./_tail.php");
?>

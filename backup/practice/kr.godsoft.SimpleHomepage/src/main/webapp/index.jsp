<%--
  Class Name : index.jsp
  Description : 최초화면으로 메인화면으로 이동한다.(system)
  Modification Information
 
      수정일         수정자                   수정내용
    -------    --------    ---------------------------
     2011.08.31  JJY       경량환경 버전 생성
 
    author   : 실행환경 개발팀 JJY
    since    : 2011.08.31
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:forward page="/cmm/main/mainPage.do"/>

<%/*
메인  EgovMainView    단순홈페이지 메인  
<br>
<br>로그인 EgovLoginUsr    단순홈페이지 로그인  <a href="<c:url value='uat/uia/egovLoginUsr.do'/>">uat/uia/egovLoginUsr.do</a> 
<br>협업  EgovIndvdlSchdulManageMonthList 일정관리 월별 목록 <a href="<c:url value='cop/smt/sim/EgovIndvdlSchdulManageMonthList.do'/>">/cop/smt/sim/EgovIndvdlSchdulManageMonthList.do</a>
<br>협업  EgovIndvdlSchdulManageWeekList  일정관리 주간별 목록조회 <a href="<c:url value='cop/smt/sim/EgovIndvdlSchdulManageWeekList.do'/>">cop/smt/sim/EgovIndvdlSchdulManageWeekList.do</a>
<br>협업  EgovIndvdlSchdulManageDailyList 일정관리 일별 목록조회 <a href="<c:url value='cop/smt/sim/EgovIndvdlSchdulManageDailyList.do'/>">cop/smt/sim/EgovIndvdlSchdulManageDailyList.do</a>
<br>협업  EgovIndvdlSchdulManageDetail    일정관리상세조회 <a href="<c:url value=''/>"></a>
<br>협업  EgovIndvdlSchdulManageRegist    일정관리등록 <a href="<c:url value=''/>"></a>
<br>협업  EgovIndvdlSchdulManageModify    일정관리수정 <a href="<c:url value=''/>"></a>
<br>협업  EgovIndvdlSchdulManageList 탭일정 <a href="<c:url value='cop/smt/sim/EgovIndvdlSchdulManageList.do'/>">cop/smt/sim/EgovIndvdlSchdulManageList.do</a>
<br>협업  EgovAllSchdulManageList 전체일정조회 <a href="<c:url value=''/>"></a>
<br>협업  EgovNoticeRegist    게시물 등록 <a href="<c:url value=''/>"></a>
<br>협업  EgovNoticeList  게시물 목록조회 <a href="<c:url value=''/>"></a>
<br>협업  EgovNoticeInqire    게시물조회 <a href="<c:url value=''/>"></a>
<br>협업  EgovNoticeUpdt  게시물 수정 <a href="<c:url value=''/>"></a>
<br>협업  EgovNoticeReply 답글 작성 <a href="<c:url value=''/>"></a>
<br>협업  EgovBoardMstrRegist 게시판 생성 <a href="<c:url value='cop/bbs/addBBSMaster.do'/>">cop/bbs/addBBSMaster.do</a>
<br>협업  EgovBoardMstrUpdt   게시판 수정 <a href="<c:url value=''/>"></a>
<br>협업  EgovBoardMstrList   게시판 목록조회 <a href="<c:url value='cop/bbs/SelectBBSMasterInfs.do'/>">cop/bbs/SelectBBSMasterInfs.do</a>
<br>협업  EgovTemplateRegist  템플릿 등록 <a href="<c:url value='cop/com/insertTemplateInf.do'/>">cop/com/insertTemplateInf.do</a>
<br>협업  EgovTemplateList    템플릿 목록 조회  <a href="<c:url value='cop/com/selectTemplateInfs.do'/>">cop/com/selectTemplateInfs.do</a>
<br>협업  EgovTemplateUpdt    템플릿 수정 <a href="<c:url value=''/>"></a>
<br>협업  EgovTemplateInqirePopup 템플릿 조회팝업 <a href="<c:url value=''/>"></a>
<br>협업  EgovBoardUseInfList 게시물사용목록조회 <a href="<c:url value='cop/com/selectBBSUseInfs.do'/>">cop/com/selectBBSUseInfs.do</a>
<pre>
${pageContext.request.contextPath}
</pre>
*/ %>
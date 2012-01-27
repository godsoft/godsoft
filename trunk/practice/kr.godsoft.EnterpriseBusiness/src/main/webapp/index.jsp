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

<jsp:forward page="/uat/uia/egovLoginUsr.do"/>

<%-- 
메인  EgovMainHome    내부업무 메인
<br>
<br>로그인 EgovLoginUsr    내부업무 로그인 <a href="<c:url value='uat/uia/egovLoginUsr.do'/>">uat/uia/egovLoginUsr.do</a>
<br>사용자지원   EgovIdDplctCnfirm   아이디중복확인
<br>사용자지원   EgovUserInsert  사용자등록 <a href="<c:url value='uss/umt/user/EgovUserInsertView.do'/>">uss/umt/user/EgovUserInsertView.do</a>
<br>사용자지원   EgovUserSelectUpdt  사용자상세조회,수정
<br>사용자지원   EgovUserPasswordUpdt    사용자암호수정
<br>사용자지원   EgovUserManage  사용자관리(조회,삭제)<a href="<c:url value='uss/umt/user/EgovUserManage.do'/>">uss/umt/user/EgovUserManage.do</a>
<br>사용자지원   EgovUserAbsnceList  사용자부재관리 <a href="<c:url value='uss/ion/uas/selectUserAbsnceListView.do'/>">uss/ion/uas/selectUserAbsnceListView.do</a>
<br>사용자지원   EgovUserAbsnceRegist    사용자부재등록
<br>사용자지원   EgovUserAbsnceUpdt  사용자부재수정 <a href="<c:url value='uss/ion/uas/updtUserAbsnce.do'/>">uss/ion/uas/updtUserAbsnce.do</a>
<br>보안  EgovAuthorManage    권한관리 <a href="<c:url value='/sec/ram/EgovAuthorList.do'/>">/sec/ram/EgovAuthorList.do</a>
<br>보안  EgovAuthorUpdt  권한수정  
<br>보안  EgovAuthorInsert    권한등록<a href="<c:url value='/sec/ram/EgovAuthorInsertView.do'/>">/sec/ram/EgovAuthorInsertView.do</a>
<br>보안  EgovAuthorRoleManage    권한 롤 관리<a href="<c:url value='/sec/ram/EgovAuthorRoleList.do'/>">/sec/ram/EgovAuthorRoleList.do</a>
<br>보안  EgovRoleManage  롤관리  <a href="<c:url value='/sec/rmt/EgovRoleList.do'/>">/sec/rmt/EgovRoleList.do</a>
<br>보안  EgovRoleUpdt    롤수정
<br>보안  EgovRoleInsert  롤등록<a href="<c:url value='/sec/rmt/EgovRoleInsertView.do'/>">/sec/rmt/EgovRoleInsertView.do</a>
<br>보안  EgovAuthorGroupManage   권한그룹관리 <a href="<c:url value='/sec/rgm/EgovAuthorGroupListView.do'/>">/sec/rgm/EgovAuthorGroupListView.do</a>
<br>보안  EgovGroupManage 그룹관리 <a href="<c:url value='/sec/gmt/EgovGroupList.do'/>">/sec/gmt/EgovGroupList.do</a>
<br>보안  EgovGroupUpdt   그룹수정
<br>보안  EgovGroupInsert 그룹등록 <a href="<c:url value='/sec/gmt/EgovGroupInsertView.do'/>">/sec/gmt/EgovGroupInsertView.do</a>
<br>사용자디렉토리/로그인 EgovLoginPolicyList 로그인정책관리 <a href="<c:url value='/uat/uap/selectLoginPolicyList.do'/>">/uat/uap/selectLoginPolicyList.do</a>
<br>사용자디렉토리/로그인 EgovLoginPolicyRegist   로그인정책등록
<br>사용자디렉토리/로그인 EgovLoginPolicyUpdt 로그인정책수정
<br>시스템관리   EgovProgramListManage   프로그램목록관리 <a href="<c:url value='/sym/prm/EgovProgramListManageSelect.do'/>">sym/prm/EgovProgramListManageSelect.do</a> 
<br>시스템관리   EgovProgramListRegist   프로그램목록등록
<br>시스템관리   EgovProgramListDetailSelectUpdt 프로그램목록상세조회/수정
<br>시스템관리   EgovMenuManage  메뉴관리 <a href="<c:url value='/sym/mnu/mpm/EgovMenuManageSelect.do'/>">/sym/mnu/mpm/EgovMenuManageSelect.do</a>
<br>시스템관리   EgovMenuRegist  메뉴등록<a href="<c:url value='/sym/mnu/mpm/EgovMenuRegistInsert.do'/>">/sym/mnu/mpm/EgovMenuRegistInsert.do</a>
<br>시스템관리   EgovFileNmSearch.jsp    파일명검색
<br>시스템관리   EgovMenuDetailSelectUpdt    메뉴상세조회/수정
<br>시스템관리   EgovMenuBndeRegist  메뉴일괄등록
<br>시스템관리   EgovMenuList    메뉴목록 <a href="<c:url value='/sym/mnu/mpm/EgovMenuListSelect.do'/>">/sym/mnu/mpm/EgovMenuListSelect.do</a> 
<br>시스템관리   EgovMenuMvmn.jsp    메뉴이동
<br>시스템관리   EgovMenuCreatManage 메뉴생성관리 <a href="<c:url value='/sym/mnu/mcm/EgovMenuCreatManageSelect.do'/>">/sym/mnu/mcm/EgovMenuCreatManageSelect.do</a>
<br>시스템관리   EgovMenuCreat   메뉴생성
<br>공통코드관리  EgovCcmCmmnClCodeList   공통분류코드목록 조회  <a href="<c:url value='/sym/ccm/ccc/EgovCcmCmmnClCodeList.do'/>">/sym/ccm/ccc/EgovCcmCmmnClCodeList.do</a>
<br>공통코드관리  EgovCcmCmmnClCodeRegist 공통분류코드 등록 
<br>공통코드관리  EgovCcmCmmnClCodeDetail 공통분류코드 상세조회 
<br>공통코드관리  EgovCcmCmmnClCodeModify 공통분류코드 수정 
<br>공통코드관리  EgovCcmCmmnDetailCodeList   공통상세코드목록 조회   <a href="<c:url value='/sym/ccm/cde/EgovCcmCmmnDetailCodeList.do'/>">/sym/ccm/cde/EgovCcmCmmnDetailCodeList.do</a> 
<br>공통코드관리  EgovCcmCmmnDetailCodeRegist 공통상세코드 등록 
<br>공통코드관리  EgovCcmCmmnDetailCodeDetail 공통상세코드 상세조회 
<br>공통코드관리  EgovCcmCmmnDetailCodeModify 공통상세코드 수정 
<br>공통코드관리  EgovCcmCmmnCodeList 공통코드목록 조회 <a href="<c:url value='/sym/ccm/cca/EgovCcmCmmnCodeList.do'/>">/sym/ccm/cca/EgovCcmCmmnCodeList.do</a>
<br>공통코드관리  EgovCcmCmmnCodeRegist   공통코드 등록 
<br>공통코드관리  EgovCcmCmmnCodeDetail   공통코드 상세조회 
<br>공통코드관리  EgovCcmCmmnCodeModify   공통코드 수정 
<br>공통코드관리  EgovCcmZipSearchPopup   우편번호 찾기 
<br>공통코드관리  EgovCcmZipList  우편번호목록 조회 <a href="<c:url value='/sym/ccm/zip/EgovCcmZipList.do'/>">/sym/ccm/zip/EgovCcmZipList.do</a> 
<br>공통코드관리  EgovCcmZipRegist    우편번호 등록 
<br>공통코드관리  EgovCcmExcelZipRegist   우편번호 엑셀파일 등록<a href="<c:url value='/sym/ccm/zip/EgovCcmExcelZipRegist.do'/>">/sym/ccm/zip/EgovCcmExcelZipRegist.do</a>
<br>공통코드관리  EgovCcmZipDetail    우편번호 상세조회 
<br>공통코드관리  EgovCcmZipModify    우편번호 수정 
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
<br>시스템관리   EgovLoginLogList    로그인로그조회 <a href="<c:url value='/sym/log/clg/SelectLoginLogList.do'/>">/sym/log/clg/SelectLoginLogList.do</a>
<br>시스템관리   EgovLoginLogInqire  로그인로그상세조회
<br>통계/리포팅  EgovConectStats 접속통계 <a href="<c:url value='/sts/cst/selectConectStats.do'/>">/sts/cst/selectConectStats.do</a>
<pre>
${pageContext.request.contextPath}
</pre>
--%>
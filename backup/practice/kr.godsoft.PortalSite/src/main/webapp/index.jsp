<%--
  Class Name : index.jsp
  Description : 최초화면으로 메인화면으로 이동한다.
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
<%--
메인  EgovMainHome    포털사이트 메인
<br>
<br>로그인 EgovLoginUsr 포털사이트 로그인<a href="<c:url value='/uat/uia/egovLoginUsr.do'/>">/uat/uia/egovLoginUsr.do</a>
<br>사용자지원   EgovStplatListInqire 약관목록조회<a href="<c:url value='/uss/sam/stp/StplatListInqire.do'/>">/uss/sam/stp/StplatListInqire.do</a>
<br>사용자지원   EgovStplatCnRegist 약관내용등록<a href="<c:url value='/uss/sam/stp/StplatCnRegistView.do'/>">/uss/sam/stp/StplatCnRegistView.do</a>
<br>사용자지원   EgovStplatDetailInqire 약관상세조회
<br>사용자지원   EgovStplatCnUpdt 약관내용수정
<br>사용자지원   EgovIndvdlInfoPolicyList 개인정보보호정책 목록조회<a href="<c:url value='/uss/sam/ipm/listIndvdlInfoPolicy.do'/>">/uss/sam/ipm/listIndvdlInfoPolicy.do</a>
<br>사용자지원   EgovIndvdlInfoPolicyRegist 개인정보보호정책 등록<a href="<c:url value='/uss/sam/ipm/registIndvdlInfoPolicy.do'/>">/uss/sam/ipm/registIndvdlInfoPolicy.do</a>
<br>사용자지원   EgovIndvdlInfoPolicyDetail 개인정보보호정책 상세조회
<br>사용자지원   EgovIndvdlInfoPolicyUpdt 개인정보보호정책 수정
<br>사용자지원   EgovIdDplctCnfirm   아이디중복확인
<br>사용자지원   EgovMberSbscrb  일반회원가입신청<a href="<c:url value='/uss/umt/cmm/EgovMberSbscrbView.do'/>">/uss/umt/cmm/EgovMberSbscrbView.do</a>
<br>사용자지원   EgovMberInsert  일반회원등록
<br>사용자지원   EgovMberSelectUpdt  일반회원상세조회,수정
<br>사용자지원   EgovMberPasswordUpdt    일반회원암호수정
<br>사용자지원   EgovMberManage  일반회원관리(조회,삭제)<a href="<c:url value='/uss/umt/mber/EgovMberManage.do'/>">/uss/umt/mber/EgovMberManage.do</a>
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
<br>사용자지원   EgovQustnrManageList    설문관리목록조회<a href="<c:url value='/uss/olp/qmc/EgovQustnrManageList.do'/>">/uss/olp/qmc/EgovQustnrManageList.do</a>
<br>사용자지원   EgovQustnrManagePopupList   설문관리목록팝업
<br>사용자지원   EgovQustnrManageDetail  설문관리상세조회
<br>사용자지원   EgovQustnrManageRegist  설문관리등록<a href="<c:url value='/uss/olp/qmc/EgovQustnrManageRegist.do'/>">/uss/olp/qmc/EgovQustnrManageRegist.do</a>
<br>사용자지원   EgovQustnrManageModify  설문관리수정
<br>사용자지원   EgovQustnrRespondInfoManageList 설문참여목록조회<a href="<c:url value='/uss/olp/qnn/EgovQustnrRespondInfoManageList.do'/>">/uss/olp/qnn/EgovQustnrRespondInfoManageList.do</a>
<br>사용자지원   EgovQustnrRespondInfoManageRegist   설문참여등록<a href="<c:url value='uuu'/>">uuu</a>
<br>사용자지원   EgovQustnrRespondInfoManageStatistics   설문통계<a href="<c:url value='/uss/olp/qqm/EgovQustnrQestnManageStatistics.do'/>">/uss/olp/qqm/EgovQustnrQestnManageStatistics.do</a>
<br>사용자지원   EgovQustnrRespondInfoList   설문조사 목록조회<a href="<c:url value='/uss/olp/qri/EgovQustnrRespondInfoList.do'/>">/uss/olp/qri/EgovQustnrRespondInfoList.do</a>
<br>사용자지원   EgovQustnrRespondInfoDetail 설문조사상세조회
<br>사용자지원   EgovQustnrRespondInfoRegist 설문조사등록 <a href="<c:url value='/uss/olp/qnn/EgovQustnrRespondInfoManageRegist.do'/>">/uss/olp/qnn/EgovQustnrRespondInfoManageRegist.do</a>
<br>사용자지원   EgovQustnrRespondInfoModify 설문조사수정    
<br>사용자지원   EgovQustnrTmplatManageList  설문템플릿 목록조회<a href="<c:url value='/uss/olp/qtm/EgovQustnrTmplatManageList.do'/>">/uss/olp/qtm/EgovQustnrTmplatManageList.do</a>
<br>사용자지원   EgovQustnrTmplatManageDetail    설문템플릿 상세조회
<br>사용자지원   EgovQustnrTmplatManageRegist    설문템플릿 등록<a href="<c:url value='/uss/olp/qtm/EgovQustnrTmplatManageRegist.do'/>">/uss/olp/qtm/EgovQustnrTmplatManageRegist.do</a>
<br>사용자지원   EgovQustnrTmplatManageModify    설문템플릿 수정
<br>사용자지원   EgovQustnrRespondManageList 응답자관리 목록조회<a href="<c:url value='/uss/olp/qrm/EgovQustnrRespondManageList.do'/>">/uss/olp/qrm/EgovQustnrRespondManageList.do</a>
<br>사용자지원   EgovQustnrRespondManageDetail   응답자관리 상세조회
<br>사용자지원   EgovQustnrRespondManageRegist   응답자관리 등록<a href="<c:url value='/uss/olp/qrm/EgovQustnrRespondManageRegist.do'/>">/uss/olp/qrm/EgovQustnrRespondManageRegist.do</a>
<br>사용자지원   EgovQustnrRespondManageModify   응답자관리 수정
<br>사용자지원   EgovQustnrQestnManageList   문항관리 목록조회<a href="<c:url value='/uss/olp/qqm/EgovQustnrQestnManageList.do'/>">/uss/olp/qqm/EgovQustnrQestnManageList.do</a>
<br>사용자지원   EgovQustnrQestnManageListPopup  문항관리 목록 팝업<a href="<c:url value='/uss/olp/qqm/EgovQustnrQestnManageListPopup.do'/>">/uss/olp/qqm/EgovQustnrQestnManageListPopup.do</a>
<br>사용자지원   EgovQustnrQestnManageStatistics 문항관리통계<a href="<c:url value='/uss/olp/qqm/EgovQustnrQestnManageStatistics.do'/>">/uss/olp/qqm/EgovQustnrQestnManageStatistics.do</a>
<br>사용자지원   EgovQustnrQestnManageDetail 문항관리상세조회
<br>사용자지원   EgovQustnrQestnManageRegist 문항관리등록<a href="<c:url value='/uss/olp/qqm/EgovQustnrQestnManageRegist.do'/>">/uss/olp/qqm/EgovQustnrQestnManageRegist.do</a>
<br>사용자지원   EgovQustnrQestnManageModify 문항관리수정
<br>사용자지원   EgovQustnrItemManageList    항목관리목록 <a href="<c:url value='/uss/olp/qim/EgovQustnrItemManageList.do'/>">/uss/olp/qim/EgovQustnrItemManageList.do</a>
<br>사용자지원   EgovQustnrItemManageDetail  항목관리상세조회
<br>사용자지원   EgovQustnrItemManageRegist  항목관리등록<a href="<c:url value='/uss/olp/qim/EgovQustnrItemManageRegist.do'/>">/uss/olp/qim/EgovQustnrItemManageRegist.do</a>
<br>사용자지원   EgovQustnrItemManageModify  항목관리수정
<br>사용자지원   EgovBannerList 배너관리<a href="<c:url value='/uss/ion/bnr/selectBannerList.do'/>">/uss/ion/bnr/selectBannerList.do</a>
<br>사용자지원   EgovBannerRegist 배너등록<a href="<c:url value='/uss/ion/bnr/addBanner.do'/>">/uss/ion/bnr/addBanner.do</a>
<br>사용자지원   EgovBannerUpdt 배너수정
<br>사용자지원   EgovFaqListInqire FAQ목록조회<a href="<c:url value='/uss/olh/faq/FaqListInqire.do'/>">/uss/olh/faq/FaqListInqire.do</a>
<br>사용자지원   EgovFaqCnRegist FAQ내용등록<a href="<c:url value='/uss/olh/faq/FaqCnRegistView.do'/>">/uss/olh/faq/FaqCnRegistView.do</a>
<br>사용자지원   EgovFaqDetailInqire FAQ상세조회
<br>사용자지원   EgovFaqCnUpdt FAQ내용수정
<br>사용자지원   EgovQnaListInqire Q&amp;A목록조회<a href="<c:url value='/uss/olh/qna/QnaListInqire.do'/>">/uss/olh/qna/QnaListInqire.do</a>
<br>사용자지원   EgovQnaCnRegist Q&amp;A내용등록<a href="<c:url value='/uss/olh/qna/QnaCnRegistView.do'/>">/uss/olh/qna/QnaCnRegistView.do</a>
<br>사용자지원   EgovQnaDetailInqire Q&amp;A상세조회
<br>사용자지원   EgovQnaPasswordConfirm  Q&amp;A작성비밀번호 확인
<br>사용자지원   EgovQnaCnUpdt   Q&amp;A내용수정
<br>사용자지원   EgovQnaAnswerListInqire Q&amp;A답변목록조회<a href="<c:url value='/uss/olh/qnm/QnaAnswerListInqire.do'/>">/uss/olh/qnm/QnaAnswerListInqire.do</a>
<br>사용자지원   EgovQnaAnswerDetailInqire   Q&amp;A답변상세조회
<br>사용자지원   EgovQnaCnAnswerUpdt Q&amp;A내용답변수정
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
--%>
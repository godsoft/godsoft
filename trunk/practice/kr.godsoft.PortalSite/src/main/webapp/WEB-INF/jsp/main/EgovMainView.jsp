<%--
  Class Name : EgovMainView.jsp 
  Description : 메인화면
  Modification Information
 
      수정일         수정자                   수정내용
    -------    --------    ---------------------------
     2011.08.31   JJY       경량환경 버전 생성
 
    author   : 실행환경개발팀 JJY
    since    : 2011.08.31 
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="content-language" content="ko">
<title>경량환경 템플릿 포털사이트</title>
<link href="<c:url value='/'/>css/default.css" rel="stylesheet" type="text/css" >
</head>
<body>
<noscript><p>자바스크립트를 지원하지 않는 브라우저에서는 일부 기능을 사용하실 수 없습니다.</p></noscript>	
<!-- login status start -->
<div id="login_area"><c:import url="/EgovPageLink.do?link=main/inc/EgovIncTborder" /></div>
<!-- //login status end -->
<!-- wrap start -->
<div id="wrap">	
	<!-- header start -->
	<div id="header"><c:import url="/sym/mms/EgovMainMenuHead.do?flag=MAIN" /></div>
	<!-- //header end -->
	<!-- 타이틀이미지, 로그인 시작 -->
	<div id="titlewrap">
		<div class="main_img"><img src="<c:url value='/'/>images/header/img_portal_title.gif" width="719" height="94" alt="" /></div>
		<div class="main_login">
		<ul>
		    <li><h3>[로그인정보 제공]</h3></li>
		    <li>홍길동님 로그인하셨습니다.</li>
		    <li>2011-08-30 12:45</li>
		    <li>받은 쪽지 : 3건</li>
		</ul>
		<!-- 메인화면 로그인 사용하는 경우 
			<ul>
				<li>
					<label for="user_id"></label>
					<input type="text" class="input_style" maxlength="25" title="아이디를 입력하세요." id="user_id" name="user_id" />
				</li>
				<li>
					<label for="user_password"></label>
					<input type="password" class="input_style" maxlength="25" title="비밀번호를 입력하세요." id="user_password" name="user_password" />
				</li>
			</ul>
			<ul class="btn_area">
				<li><input type="checkbox" id="idsave"><label for="idsave">아이디 저장</label></li>
				<li><input type="image" alt="로그인" src="<c:url value='/'/>images/header/btn_login.gif" />	</li>
			</ul>						
			<div class="find_idpw"><a href="#LINK">ID/PW찾기</a></div>
	     -->
		</div>
	</div> 
	<!-- //타이틀이미지, 로그인 끝 -->
	<div id="bodywrap">
		<div id="leftcontent_wrap">
			<!-- 한번에 신청하는 민원 시작 -->
			<div class="leftcontent01">
				<div class="leftcontent01_title"><img src="<c:url value='/'/>images/header/img_leftcontent_title01.gif" width="228" height="31" alt="한번에 신청하는 민원" /></div>
				<div class="btn_detail01"><a href="#LINK"><img src="<c:url value='/'/>images/header/btn_detailview.gif" width="71" height="17" alt="자세히 보기" /></a></div>
				<div class="leftcontent01_btn">
					<ul>
						<li><a href="#LINK"><img src="<c:url value='/'/>images/header/btn_leftcontent01.gif" width="70" height="87" alt="기술지원 필요 시 유지보수 민원" /></a></li>
						<li><a href="#LINK"><img src="<c:url value='/'/>images/header/btn_leftcontent02.gif" width="67" height="87" alt="구매제품  A/S민원" /></a></li>
					</ul>
				</div>			
			</div>
			<!-- //한번에 신청하는 민원 끝 -->
			<div class="leftcontent02">
				<div class="leftcontent02_title"><img src="<c:url value='/'/>images/header/img_leftcontent_title02.gif" width="210" height="71" alt="" /></div>
				<div class="btn_detail02"><a href="#LINK"><img src="<c:url value='/'/>images/header/btn_detailview.gif" width="71" height="17" alt="자세히 보기" /></a></div>
			</div>
			<div class="leftcontent03">
				<div class="leftcontent03_title"><img src="<c:url value='/'/>images/header/img_leftcontent_title03.gif" width="228" height="44" alt="포털설문참여" /></div>
				<div class="vote01">
					<ul>
						<li><h3>신규 오픈 포털사이트 만족도 조사</h3>
							<ul>
								<li><input type="radio" id="vt01" name="vt01" checked="checked">100%만족</li>
								<li><input type="radio" id="vt02" name="vt02">70%만족</li>
								<li><input type="radio" id="vt03" name="vt03">60%만족</li>  
								<li><img alt="참여하기" src="<c:url value='/'/>images/header/btn_vote.gif" /><img alt="결과보기" src="<c:url value='/'/>images/header/btn_result.gif" /></li>
							</ul>
						</li>
					</ul>
				</div>
				<div class="vote02">
					<ul>
						<li><h3>템플릿 적용가능 업무분야 의견수렴</h3>
							<ul>
								<li><input type="radio" id="vt04" name="" checked="checked"><label for="vt04">경량환경 템플릿</label></li>
								<li><input type="radio" id="vt05" name=""><label for="vt05">홈페이지 템플릿</label></li>
								<li><input type="radio" id="vt06" name=""><label for="vt06">포털사이트 템플릿</label></li>  
								<li><img alt="참여하기" src="<c:url value='/'/>images/header/btn_vote.gif" /><img alt="결과보기" src="<c:url value='/'/>images/header/btn_result.gif" /></li>							
							</ul>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<!-- 중간 영역 시작 -->
		<div id="middlecontent_wrap">
			<div id="news">
				<ul>
					<li><img alt="공지사항" src="<c:url value='/'/>images/header/tab01_on.gif" /></li>
					<li><img alt="묻고답하기" src="<c:url value='/'/>images/header/tab02_off.gif" /></li>
					<li class="li_line" ><span class="btn_more_board"><a href="<c:url value='/cop/bbs/selectBoardList.do?bbsId=BBSMSTR_AAAAAAAAAAAA'/>"><img src="<c:url value='/'/>images/header/bg_more.gif" alt="게시물 더보기"/></a></span></li>
				</ul>
			</div>
			<div id="content01" style="display: visible;">
				<ul>
					<li><div class="boardtext"><a href="#LINK">7월보안점검행사안내입니다(행사장소:표준프레임워크 1층 로비) </a></div><div class="date">2011-07-29</div></li>
					<li><div class="boardtext"><a href="#LINK">7월보안점검행사안내입니다(행사장소:표준프레임워크 1층 로비) </a></div><div class="date">2011-07-29</div></li>
					<li><div class="boardtext"><a href="#LINK">7월보안점검행사안내입니다(행사장소:표준프레임워크 1층 로비) </a></div><div class="date">2011-07-29</div></li>
					<li><div class="boardtext"><a href="#LINK">7월보안점검행사안내입니다(행사장소:표준프레임워크 1층 로비) </a></div><div class="date">2011-07-29</div></li>
					<li><div class="boardtext"><a href="#LINK">7월보안점검행사안내입니다(행사장소:표준프레임워크 1층 로비) </a></div><div class="date">2011-07-29</div></li>
				</ul>			
			</div>	
			<div id="content02" style="display:none;">
				<ul>
					<li><div class="boardtext"><a href="#LINK">7월보안점검행사안내입니다(행사장소:표준프레임워크 1층 로비) </a></div><div class="date">2011-07-29</div></li>
					<li><div class="boardtext"><a href="#LINK">7월보안점검행사안내입니다(행사장소:표준프레임워크 1층 로비) </a></div><div class="date">2011-07-29</div></li>
					<li><div class="boardtext"><a href="#LINK">7월보안점검행사안내입니다(행사장소:표준프레임워크 1층 로비) </a></div><div class="date">2011-07-29</div></li>
					<li><div class="boardtext"><a href="#LINK">7월보안점검행사안내입니다(행사장소:표준프레임워크 1층 로비) </a></div><div class="date">2011-07-29</div></li>
					<li><div class="boardtext"><a href="#LINK">7월보안점검행사안내입니다(행사장소:표준프레임워크 1층 로비) </a></div><div class="date">2011-07-29</div></li>
				</ul>			
			</div>	
			<div id="faq_div">
				<div class="faq_img1"><img alt="FAQ목록" src="<c:url value='/'/>images/header/img_middlecontent_title02.gif" /><span class="btn_more_board"><a href="<c:url value='/uss/olh/faq/FaqListInqire.do' />"><img src="<c:url value='/'/>images/header/bg_more.gif" alt="FAQ더보기"/></a></span></div>
				<div class="faq_img2"><img alt="프레임워크 경량화 서비스에 대해 자주 사용하는 질문 등에 대한 일반적인 답변들을 확인할 수 있습니다." src="<c:url value='/'/>images/header/img_middlecontent_subtitle.gif" /></div>
				<div class="faq_list">
					<ul>
						<li class="q">/WEB-INF/tlds/egovc.tld 파일이 없는데.. 어디서 받을 수 있나요?</li>
						<li class="a">해당 tag library는 공통컴포넌트에 포함되어 있는 "CrossSite Tag Replace Special Html Code Convert(JSTL 1.1 core library 기반)"입니다.</li>
					</ul>
				</div>
				<div class="faq_list2">				
					<ul>
						<li class="q">공통컴포넌트 query 파일이 없습니다.</li>
						<li class="a">공통컴포넌트 전체 query 파일을 첨부해 놓았습니다. 필요하신 query를 src/main/resources/egovframework/sqlmap 밑에 
적용하시면 됩니다.</li>
					</ul>
				</div>
				<div class="faq_list3">				
					<ul>
						<li class="q">Hudson 이용한 빌드위치 변경 원합니다.</li>
						<li class="a">
hudson의 경우 기본적으로 'HUDSON_HOME' 환경변수 를 참조하여, 
그 하위 경로를 working 디렉토리로 사용하며, 환경변수가 없는 경두 디폴트로 
로그인 계정 하위에 .hudson 디렉토리를 사용합니다. </li>
					</ul>
				</div>
			</div>	
		</div>
		<!-- //중간 영역 끝 -->
		<div id="rightcontent_wrap">
			<div id="download_div">
				<div class="download_img"><img alt="최신다운로드 순위" src="<c:url value='/'/>images/header/img_rightcontent_title01.gif" /></div>
				<ol>
					<li><img src="<c:url value='/'/>images/header/num01.gif" alt="" />egovframe builder v1.30</li>
					<li><img src="<c:url value='/'/>images/header/num02.gif" alt="" />egovframework install shield v3.01</li>
					<li><img src="<c:url value='/'/>images/header/num03.gif" alt="" />egovframework install shield v3.01</li>
					<li><img src="<c:url value='/'/>images/header/num04.gif" alt="" />egovframework install shield v3.01</li>
					<li><img src="<c:url value='/'/>images/header/num05.gif" alt="" />egovframework install shield v3.01</li>
					<li><img src="<c:url value='/'/>images/header/num06.gif" alt="" />egovframework install shield v3.01</li>
					<li><img src="<c:url value='/'/>images/header/num07.gif" alt="" />egovframework install shield v3.01</li>
					<li><img src="<c:url value='/'/>images/header/num08.gif" alt="" />egovframework install shield v3.01</li>
					<li><img src="<c:url value='/'/>images/header/num09.gif" alt="" />egovframework install shield v3.01</li>
					<li><img src="<c:url value='/'/>images/header/num10.gif" alt="" />egovframework install shield v3.01</li>
				</ol>
			</div>
			<div id="banner_div">
				<div class="bnpadtop"><img src="<c:url value='/'/>images/header/banner_location.gif" alt="프레임워크센터 방문하는 방법" /></div>
				<div class="bnpadding"><img src="<c:url value='/'/>images/header/banner_mopas.gif" alt="행정안전부" /></div>
				<div class="bnpadding"><img src="<c:url value='/'/>images/header/banner_nia.gif" alt="한국정보화진흥원" /></div>
				<div class="bnpadding"><img src="<c:url value='/'/>images/header/banner_egovportal.gif" alt="전자정부표준프레임워크 포털" /></div>
				<div class="bnpadding"><img src="<c:url value='/'/>images/header/banner_opencmm.gif" alt="오픈커뮤니티" /></div>
			</div>
		</div>
	</div>
	<!-- footer 시작 -->
	<div id="footer"><c:import url="/EgovPageLink.do?link=main/inc/EgovIncFooter" /></div>
	<!-- //footer 끝 -->
</div>
<!-- //wrap end -->
</body>
</html>
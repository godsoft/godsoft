<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
    <title>EgovFrame 일반로그인</title> 
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        
        <!-- eGovFrame Common import -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/egovframework/mbl/cmm/jquery.mobile-1.0b3.min.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/egovframework/mbl/cmm/EgovMobile.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/egovframework/mbl/com/uss/ussCommon.css" />
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/egovframework/mbl/cmm/jquery-1.6.2.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/egovframework/mbl/cmm/jquery.mobile-1.0b3.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/egovframework/mbl/cmm/EgovMobile.js"></script>

		<script type="text/javascript">
		<!--

		function actionLogin() {
			if (document.loginForm.id.value =="") {
				jAlert("아이디를 입력하세요",'EgovFrame', 'a');
			} else if (document.loginForm.password.value =="") {
				jAlert("비밀번호를 입력하세요",'EgovFrame', 'a');
			}
			else {
				var check = $('input[name=rdoSlctUsr]:checked').val();
				$('#userSe').val(check);

		        document.loginForm.action="${pageContext.request.contextPath}/uat/uia/actionLogin.mdo";

				document.loginForm.submit();
			}
		}

		function setCookie (name, value, expires) {
			document.cookie = name + "=" + escape (value) + "; path=/; expires=" + expires.toGMTString();
		}

		function getCookie(Name) {
			var search = Name + "="
			if (document.cookie.length > 0) { // 쿠키가 설정되어 있다면
				offset = document.cookie.indexOf(search)
				if (offset != -1) { // 쿠키가 존재하면
					offset += search.length
					// set index of beginning of value
					end = document.cookie.indexOf(";", offset)
					// 쿠키 값의 마지막 위치 인덱스 번호 설정
					if (end == -1)
						end = document.cookie.length
					return unescape(document.cookie.substring(offset, end))
				}
			}
			return "";
		}

		function saveid(form) {
			var expdate = new Date();
			// 기본적으로 30일동안 기억하게 함. 일수를 조절하려면 * 30에서 숫자를 조절하면 됨
			if (form.checkId.checked)
				expdate.setTime(expdate.getTime() + 1000 * 3600 * 24 * 30); // 30일
			else
				expdate.setTime(expdate.getTime() - 1); // 쿠키 삭제조건
			setCookie("saveid", form.id.value, expdate);
		}

		function getid(form) {
			form.checkId.checked = ((form.id.value = getCookie("saveid")) != "");
		}

		function fnInit() {
			var message = document.loginForm.message.value;
			if (message != "") {
				alert(message);
			}
			getid(document.loginForm);
			// 포커스
			//document.loginForm.rdoSlctUsr.focus();
		}


			var message = "${message}";
			if (message != "") {
				alert(message);
			}

		-->
		</script>
</head>

<body>

    <!-- 메인 페이지 -->
    <div data-role="page" id="NoticeInire" data-url="page_main"  data-theme="b" class="com-copIndex">

		<!-- header start -->
		<div data-role="header" data-theme="z" class="com-egovHeaderBar">
				<h1><img src="${pageContext.request.contextPath}/images/egovframework/mbl/bod/logo.png" alt="logo" /></h1>  
			</div>
		<!-- header end -->

		<!-- content start -->
        <div data-role="content" class="com-logContent">   

			<form name="loginForm" action ="${pageContext.request.contextPath}/mbl/com/uat/uia/actionLogin.do" method="post">
			<input type="hidden" id="userSe" name="userSe" value="USR"/>      
			<fieldset data-role="controlgroup" data-type="horizontal" data-role="fieldcontain" class="logUser">
			<legend><strong>일반로그인</strong></legend> 
				<input type="radio" name="rdoSlctUsr" id="radio-choice-1a" value="GNR"  />
				<label for="radio-choice-1a" >일반</label>  
				
				<input type="radio" name="rdoSlctUsr" id="radio-choice-2a" value="ENT" />
				<label for="radio-choice-2a">기업</label>  
				
				<input type="radio" name="rdoSlctUsr" id="radio-choice-3a" checked="checked" value="USR"  />
			<label for="radio-choice-3a">업무</label>   
			</fieldset>
			
			<div data-role="fieldcontain" class="com-logId">
			<label for="id"><strong>아이디</strong></label>
			<input type="text" name="id" id="id" value="" data-theme="c" />
            </div>

			<div data-role="fieldcontain"  class="com-logPw">
			<label for="password"><strong>비밀번호</strong></label>
			<input type="password" name="password" id="password" value="" data-theme="c" />
			</div>
			<div data-role="fieldcontain" class="com-logLogin">   
			<a href="javascript:actionLogin();" data-role="button" data-theme="b">로그인</a>
			</div>
			<input name="j_username" type="hidden"/>
			</form>

        </div>
		<!-- content end -->

		<!-- footer start -->
		<div data-role="footer"  data-theme="z" data-position="fixed">
			<h4>Copyright (c) Ministry of Public Administration and Security.</h4>
		</div>
		<!-- footer end -->

	</div>
	<!-- 메인 페이지 end -->
</body>
</html>


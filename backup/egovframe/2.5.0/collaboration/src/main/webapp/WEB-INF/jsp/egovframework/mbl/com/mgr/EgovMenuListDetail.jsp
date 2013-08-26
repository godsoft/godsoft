<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%--
  Class Name : EgovMenuListDetail.jsp
  Description :  detail
  Modification Information

                  수정일                수정자           수정내용
    -------------    --------    ---------------------
     2011.08.23      김민지         최초 생성
     2011.09.15      구지연         수정
 
    author   : 모바일 개발환경 개발팀 김민지
    since    : 2011.08.23
--%>
<!DOCTYPE html>
<html>
<head>
    <title><spring:message code="mgr.menuDetail" /></title> 
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    
    <!-- eGovFrame Common import -->
    <link href="<c:url value='/css/egovframework/mbl/cmm/jquery.mobile-1.1.1.min.css' />" rel="stylesheet" type="text/css" />
    <link href="<c:url value='/css/egovframework/mbl/cmm/EgovMobile-1.1.1.css' />" rel="stylesheet" type="text/css" />
    
    <!-- 개발환경 import -->
 	<link href="<c:url value='/css/egovframework/mbl/com/dev/egovDev.css' />" rel="stylesheet" type="text/css" />
 	
    <script type="text/javascript" src="<c:url value='/js/egovframework/mbl/cmm/jquery-1.7.1.min.js' />"></script>
    <script type="text/javascript" src="<c:url value='/js/egovframework/mbl/cmm/jquery.mobile-1.1.1.min.js' />"></script>
	<script type="text/javascript" src="<c:url value='/js/egovframework/mbl/cmm/EgovMobile-1.1.1.js' />"></script>
	
	
	<script type="text/javascript">

		function fn_egov_select_menuList() {

			document.menuVO.action = "<c:url value='/mgr/EgovMainMenu.mdo'/>";
			document.menuVO.submit();
		}

		function fn_egov_select_menuUpdate() {
			
			document.menuVO.action = "<c:url value='/mgr/EgovMenuUpdatePage.mdo'/>";
			document.menuVO.submit();
		}
		
		function fn_egov_delete_menu() {

			jConfirm('<spring:message code="common.delete.msg" />', 'Notification', 'a', function(r) {
				if(r){
					document.menuVO.action = "<c:url value='/mgr/EgovDelete.mdo'/>";
				    document.menuVO.submit();
				}
		    });
		}

	</script>
		
</head>

<body>

	<form name="menuVO" method="post" action="">
		<input type="hidden" name="menuCode" value='<c:out value="${result.menuCode}" />' />
		<input type="hidden" name="menuNm" value='<c:out value="${result.menuNm}" />' />
		<input type="hidden" name="upperMenuId" value='<c:out value="${result.upperMenuId}" />' />
		<input type="hidden" name="cnncUrl" value='<c:out value="${result.cnncUrl}" /> ' />
		<input type="hidden" name="actvtyAt" value='<c:out value="${result.actvtyAt}" />' />
		<input type="hidden" name="menuDc" value='<c:out value="${result.menuDc}" />' />
	</form>

	<!-- 메인 페이지 -->
	<div data-role="page">
		<div data-role="header" data-theme="a" data-position="inline">
			<a href="javascript:fn_egov_select_menuList()" data-icon="home" class="ui-btn-left"  data-theme="d"><spring:message code="button.home" /></a>
			<h1><spring:message code="mgr.menuDetail" /></h1> 
			<a href="<c:url value='javascript:history.back()' />" data-icon="back" data-theme="d" data-role="button"><spring:message code="button.back" /></a>
		</div>
		
		<div data-role="content" class="com-copContent">
			<ul class="dev-Detail">
				<li>
					<span class="uss-tit"><b><spring:message code="mgr.menuCode" /></b></span>
					<span class="uss-con"><label for="name-d"><strong><c:out value="${result.menuCode}" /></strong></label></span>
				</li>
				<li>
					<span class="uss-tit"><b><spring:message code="mgr.menuNm" /></b></span>
					<span class="uss-con"><label for="name-d"><c:out value="${result.menuNm}" /></label></span>
				</li>
				<li>
					<span class="uss-tit"><b><spring:message code="mgr.UpperMenu" /></b></span>
					<span class="uss-con"><label for="name-d"><c:out value="${result.upperMenuNm}" /></label></span>
				</li>
				<li>
					<span class="uss-tit"><b><spring:message code="mgr.cnncUrl" /></b></span>
					<span class="uss-con"><label for="name-d"><c:out value="${result.cnncUrl}" /></label></span>
				</li>
				<li>
					<span class="uss-tit"><b><spring:message code="mgr.actvtyAt" /></b></span>
					<c:if test="${result.actvtyAt == 'true'}">
					      <span class="uss-con"><label for="name-d"><spring:message code="button.yes" /></label></span>
				     </c:if>
				     <c:if test="${result.actvtyAt == 'false'}">
					      <span class="uss-con"><label for="name-d"><spring:message code="button.no" /></label></span>
				     </c:if>
				</li>
				<li>
					<span class="uss-tit"><b><spring:message code="mgr.menuDc" /></b></span>
					<span class="uss-con"><label for="name-d"><c:out value="${result.menuDc}" /></label></span>
				</li>
			</ul>
			
			<div class="ui-grid-a devBtn">
			 	<div class="ui-block-a"><a href="javascript:fn_egov_select_menuUpdate();" data-role="button" data-theme="b" ><spring:message code="button.update" /></a></div>
				<div class="ui-block-b"><a href="<c:url value='javascript:fn_egov_delete_menu();' />" data-role="button" data-theme="b" ><spring:message code="button.delete" /></a></div>
			</div>
			
		</div>
	
		<div data-role="footer" data-theme="a" data-position="fixed">
			<h4>Copyright (c) Ministry of Public Administration and Security.</h4>
		</div>
	
	</div>
</body>
</html>
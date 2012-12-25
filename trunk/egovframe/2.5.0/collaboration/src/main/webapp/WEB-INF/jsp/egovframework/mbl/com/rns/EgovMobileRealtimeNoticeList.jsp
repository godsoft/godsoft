<%
 /**
  * @Class Name : EgovMobileRealtimeNoticeList.jsp
  * @Description : EgovMobileRealtimeNoticeList 화면
  * @Modification Information
  * @
  * @  수정일   	수정자		수정내용
  * @ ----------	------		---------------------------
  * @ 2011.08.11	조준형		최초 생성
  * @ 2011.09.06	조준형		페이징 추가
  *
  *  @author 조준형
  *  @since 2011.08.11
  *  @version 1.0
  *  @see
  *  
  */
%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html> 
<html> 
    <head> 
       	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
       	<title>모바일 화면</title>
        
		<!-- eGovFrame Common import -->
		<link rel="stylesheet" href="<c:url value='/css/egovframework/mbl/cmm/jquery.mobile-1.1.1.min.css' />" />
		<link rel="stylesheet" href="<c:url value='/css/egovframework/mbl/cmm/EgovMobile-1.1.1.css' />" />
		<script type="text/javascript" src="<c:url value='/js/egovframework/mbl/cmm/jquery-1.7.1.min.js' />"></script>
		<!-- History.js -->
		<script type="text/javascript" src="<c:url value="/js/egovframework/mbl/cmm/jquery.history.js"/>"></script>
		<script type="text/javascript" src="<c:url value='/js/egovframework/mbl/cmm/jquery.mobile-1.1.1.min.js' />"></script>
		<script type="text/javascript" src="<c:url value='/js/egovframework/mbl/cmm/EgovMobile-1.1.1.js' />"></script>
	  
		<!-- 신규공통컴포넌트 import -->
		<link rel="stylesheet" href="<c:url value='/css/egovframework/mbl/mcomd/egovMcomd.css' />" />

        <script type="text/javascript">
        	var contextPath = "${pageContext.request.contextPath}";	// js uri 적용을 위한 contextpath
			var fetchRowIdx = 1;
			/*********************************************************
			 * 실시간 공지 서비스 관리자 초기화
			 ******************************************************** */			
    		$(document).ready(function() {
				// 1. 실시간 공지 서비스 목록 조회
	    		fn_rnsList();

	        });
        </script>
   		<!-- 실시간공지 서비스 js -->
		<script type="text/javascript" src="<c:url value='/js/egovframework/mbl/com/rns/rns.js' />"></script>
	</head>

	<body>
	 	<form:form name="frmRns" method="post" commandName="searchVO" >
	 		<input type="hidden" name="searchSn"/>
	 	</form:form>		
		<!-- 실시간공지 서비스 목록 -->
	    <div id="list" data-role="page" data-theme="d">
		    <!-- header start -->
		    <div data-role="header" data-theme="z">
	   			<a href="<c:url value='/index.jsp'/>" data-ajax="false" data-icon="home" class="ui-btn-left">메인</a>
				<h1><img src="<c:url value='/images/egovframework/mbl/mcomd/h1_logo.png'/>"  /></h1>
				<div class="ui-body-a mcomd-title"><h3>실시간 공지 서비스</h3></div>
			</div>
		    <!-- header end -->
		
		    <!-- content start -->
			<div data-role="content"  class="egov-mcomdContent">
				<ul data-role="listview" data-inset="true"></ul>
			</div>
			
			<div class="mcomd-more" id="pageNavi"><a href="javascript:fn_moreFetch();"><div> 더보기 </div></a></div>
			<!-- content end -->
		
		    <!-- footer start -->
			<div data-role="footer" data-theme="z" data-position="fixed">
				<div class="ui-bar-a mcomdBtn">
					<a href="javascript:fn_goRnsInsert();" id="registBtn" data-role="button" data-inline="true"  data-theme="a">글쓰기</a>			
				</div>
				<h4>Copyright(c)2011 Ministry of republic administration and security.</h4>
			</div>
		    <!-- footer end -->
	    </div>
	    
	</body>
</html>    
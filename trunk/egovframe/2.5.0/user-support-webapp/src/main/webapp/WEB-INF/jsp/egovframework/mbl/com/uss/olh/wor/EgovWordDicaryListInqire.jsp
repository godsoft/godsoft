<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<title>용어사전목록조회</title>
	
 		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/egovframework/mbl/cmm/jquery.mobile-1.1.1.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/egovframework/mbl/cmm/EgovMobile-1.1.1.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/egovframework/mbl/com/uss/ussCommon.css" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/egovframework/mbl/cmm/jquery-1.7.1.min.js"></script>
		<!-- History.js -->
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/egovframework/mbl/cmm/jquery.history.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/egovframework/mbl/cmm/jquery.mobile-1.1.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/egovframework/mbl/cmm/EgovMobile-1.1.1.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/egovframework/mbl/com/EgovCom.js"></script>
		
		<script type="text/javaScript" language="javascript" defer="defer">
			<!--		

			$('#list').live('pageshow', initList);
			
			function initList() {
							
       			$.getJSON("${pageContext.request.contextPath}/uss/olh/wor/WordDicaryListInqireActor.mdo", $('#searchVO').serialize(), function(json){
           			
					var html = "";
						
						html += '<form id="searchVO" name="searchVO" method="post">';
						html += '	<div class="uss-Search">';
		                html += '	<select id="searchCondition" name="searchCondition">';
		                html += '    	<option value="wordNm" >용어명</option>';
		                html += '    	<option value="engNm" >영문명</option>';
		                html += '	</select>';
		                html += '	<div class="uss-SearchBox">';
		                html += '	<input type="text" name="searchKeyword" id="searchKeyword" class="type-text" value=\'' + json.searchVO.searchKeyword +'\'/>';
		                html += '	</div>';
						html += '	<input type="hidden" name="pageIndex" id="pageIndex" value=\"'+ json.searchVO.pageIndex +'\"/>';
		                html += '	<input type="button" name="btnWordDicarySearch" id="btnWordDicarySearch" value="조회" class="uss-SearchBtn" onclick="javascript:fn_show_list(1);">';						
						html += '	</div>';
						html += '</form>';

		                $('#searchview').html(html);
		                $("#searchCondition option[value='" + json.searchVO.searchCondition + "']").attr('selected', 'selected');
    
		             	html = "";
					if(json.wordDicaryList.length == 0) {
						html += '<li class="com-egovNodata">';
	               		html += '    <spring:message code="common.nodata.msg"/>';
	               		html += '</li>';
					}
					else {
						for ( var i = 0; i < json.wordDicaryList.length; i++) {
							
							var wordDicary =  json.wordDicaryList[i];
							
							html += '<li>';
							html += '	<a href="${pageContext.request.contextPath}/uss/olh/wor/WordDicaryDetailInqire.mdo?wordId=' + wordDicary.wordId + '">';
							html += '		<h3>' + wordDicary.wordNm + '</h3>'; 
							html += '		<p class="uss-Eng">' + wordDicary.engNm + '</p>'; 
							html += '		<p><span class="uss-txtBlack">' + wordDicary.emplyrNm + '</span><span class="uss-txtDate">' + wordDicary.frstRegisterPnttm + '</span></p>';
							html += '	</a>';
							html += '</li>';			
										
						}
					}

					$('div[id="list"] ul[data-role="listview"]').html(html).listview('refresh');

					$('#pageNavi').html(pagenationRenderer(json.paginationInfo, "fn_show_list"));
       		 	});
       		 	
			}

			function fn_show_list(pageIndex) {

				$('#pageIndex').val(pageIndex);
				initList();
				
			}

			function fn_show_page() {
				
				$.mobile.changePage( $("#list"), { transition: "slideup" });
				
			}

			        	
        	-->
		</script>
				
	</head>
	
	<body>
	
		<!-- 용어사전 List start -->
		<div id="list" data-role="page" >

			<!-- header start -->
			<div data-role="header" >
				<a href="${pageContext.request.contextPath}/index.jsp" data-icon="home" rel="external">홈</a>
			    <h1>용어사전목록조회</h1>
			</div>
			<!-- header end -->
			
			<!-- contents start -->
			<div data-role="content">
				
				<div id="searchview">

				</div>
				
				<ul data-role="listview">
				
				</ul>
				
				<div id="pageNavi" class="com-egovPaging">
				
				</div>
				
			</div>
			<!-- contents end -->

			<!-- footer start -->
			<div data-role="footer" data-position="fixed">
				<h4>Copyright (c) Ministry of Public Administration and Security.</h4>
			</div>
			<!-- footer end -->
			
		</div>
		<!-- 용어사전 List end -->		
		
	</body>
	
</html>

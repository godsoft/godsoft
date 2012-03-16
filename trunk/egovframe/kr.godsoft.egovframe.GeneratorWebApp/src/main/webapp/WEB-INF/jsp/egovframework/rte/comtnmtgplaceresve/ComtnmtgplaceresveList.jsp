<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtnmtgplaceresveList.jsp
  * @Description : Comtnmtgplaceresve List 화면
  * @Modification Information
  * 
  * @author 이백행
  * @since 2012-03-16
  * @version 1.0
  * @see
  *  
  * Copyright (C) All right reserved.
  */
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select(resveId) {
	document.getElementById("listForm").resveId.value = resveId;
   	document.getElementById("listForm").action = "<c:url value='/comtnmtgplaceresve/updateComtnmtgplaceresveView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/comtnmtgplaceresve/addComtnmtgplaceresveView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/comtnmtgplaceresve/ComtnmtgplaceresveList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" method="post">
	<input type="hidden" name="resveId" />
<div id="content_pop">
	<!-- 타이틀 -->
	<div id="title">
		<ul>
			<li><img src="<c:url value='/images/egovframework/rte/title_dot.gif'/>" alt="title" /> List </li>
		</ul>
	</div>
	<!-- // 타이틀 -->
	<!-- List -->
	<div id="table">
		<table width="100%" border="0" cellpadding="0" cellspacing="0">
			<colgroup>
								<col/>				
								<col/>				
								<col/>				
								<col/>				
								<col/>				
								<col/>				
								<col/>				
								<col/>				
								<col/>				
								<col/>				
								<col/>				
								<col/>				
								<col/>				
							</colgroup>		  
			<tr>
								<th align="center">ResveId</th>
								<th align="center">MtgrumId</th>
								<th align="center">MtgSj</th>
								<th align="center">RsvctmId</th>
								<th align="center">ResveDe</th>
								<th align="center">ResveBeginTm</th>
								<th align="center">ResveEndTm</th>
								<th align="center">AtndncNmpr</th>
								<th align="center">MtgCn</th>
								<th align="center">FrstRegisterId</th>
								<th align="center">FrstRegistPnttm</th>
								<th align="center">LastUpdusrId</th>
								<th align="center">LastUpdtPnttm</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
																											
												<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.resveId}"/>')"><c:out value="${result.resveId}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mtgrumId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mtgSj}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.rsvctmId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.resveDe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.resveBeginTm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.resveEndTm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.atndncNmpr}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mtgCn}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.frstRegisterId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.frstRegistPnttm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lastUpdusrId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lastUpdtPnttm}"/>&nbsp;</td>
											</tr>
			</c:forEach>
		</table>
	</div>
	<!-- /List -->
	<div id="paging">
		<ui:pagination paginationInfo = "${paginationInfo}"
				   type="image"
				   jsFunction="fn_egov_link_page"
				   />
		<form:hidden path="pageIndex" />
	</div>
	<div id="sysbtn1">
		<ul>
			<li>
				<div id="sysbtn">
					<span class="btn_blue_l"><a href="javascript:fn_egov_addView();">등록</a><img src="<c:url value='/images/egovframework/rte/btn_bg_r.gif'/>" alt="" />
					</span>
				</div>
			</li>
		</ul>
	</div>
</div>
</form:form>
</body>
</html>

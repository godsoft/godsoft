<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : MgvAllTablesList.jsp
  * @Description : MgvAllTables List 화면
  * @Modification Information
  * 
  * @author 이백행
  * @since 2012-03-30
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
<title>mgv_all_tables 목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select() {
   	document.getElementById("listForm").action = "<c:url value='/mgvAllTables/updateMgvAllTablesView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/mgvAllTables/addMgvAllTablesView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/mgvAllTables/MgvAllTablesList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" id="listForm" method="post">
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
								<th align="center">project_id</th>
								<th align="center">project_name</th>
								<th align="center">connection_id</th>
								<th align="center">host</th>
								<th align="center">port</th>
								<th align="center">username</th>
								<th align="center">dburl</th>
								<th align="center">catalog_id</th>
								<th align="center">catalog_name</th>
								<th align="center">schema_id</th>
								<th align="center">schema_name</th>
								<th align="center">table_id</th>
								<th align="center">table_name</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
															
												<td align="center" class="listtd"><c:out value="${result.projectId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.projectName}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.connectionId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.host}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.port}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.username}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.dburl}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.catalogId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.catalogName}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.schemaId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.schemaName}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.tableId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.tableName}"/>&nbsp;</td>
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

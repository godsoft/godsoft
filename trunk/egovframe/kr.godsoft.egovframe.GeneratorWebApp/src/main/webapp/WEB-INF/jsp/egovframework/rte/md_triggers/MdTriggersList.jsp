<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : MdTriggersList.jsp
  * @Description : MdTriggers List 화면
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
<title>For storing information about triggers. 목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select(id) {
	document.getElementById("listForm").id.value = id;
   	document.getElementById("listForm").action = "<c:url value='/mdTriggers/updateMdTriggersView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/mdTriggers/addMdTriggersView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/mdTriggers/MdTriggersList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" id="listForm" method="post">
	<input type="hidden" name="id" />
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
								<col/>				
								<col/>				
								<col/>				
							</colgroup>		  
			<tr>
								<th align="center">Primary Key</th>
								<th align="center">Table on which this trigger fires</th>
								<th align="center">Flag to show iif the trigger is on a table or a view.  If it is a table this should be 'T'. If it is on a view this should be 'V'</th>
								<th align="center">Name of the trigger //OBJECTNAME</th>
								<th align="center">before, after ,etc.</th>
								<th align="center">insert, delete, etc.</th>
								<th align="center">The actual trigger that gets fired </th>
								<th align="center">The full definition </th>
								<th align="center">UInique identifer for this object at source</th>
								<th align="center">//PUBLIC</th>
								<th align="center">comments</th>
								<th align="center">security_group_id</th>
								<th align="center">created_on</th>
								<th align="center">created_by</th>
								<th align="center">last_updated_on</th>
								<th align="center">last_updated_by</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
																											
												<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.id}"/>')"><c:out value="${result.id}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.tableOrViewIdFk}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.triggerOnFlag}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.triggerName}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.triggerTiming}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.triggerOperation}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.triggerEvent}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.nativeSql}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.nativeKey}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.language}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.comments}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.securityGroupId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.createdOn}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.createdBy}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lastUpdatedOn}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lastUpdatedBy}"/>&nbsp;</td>
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

<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : MgvAllTablesRegister.jsp
  * @Description : MgvAllTables Register 화면
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
<title>mgv_all_tables <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="mgvAllTablesVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/mgvAllTables/MgvAllTablesList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/mgvAllTables/deleteMgvAllTables.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/mgvAllTables/addMgvAllTables.do' : '/mgvAllTables/updateMgvAllTables.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="mgvAllTablesVO" name="detailForm" id="detailForm">
<div id="content_pop">
	<!-- 타이틀 -->
	<div id="title">
		<ul>
			<li><img src="<c:url value='/images/egovframework/rte/title_dot.gif'/>" alt="" /><c:out value="${registerFlag}"/></li>
		</ul>
	</div>
	<!-- // 타이틀 -->
	<div id="table">
	<table width="100%" border="1" cellpadding="0" cellspacing="0" >
		<colgroup>
			<col width="150"/>
			<col width=""/>
		</colgroup>
			
		<c:if test="${registerFlag == '수정'}">
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		</c:if>		
		
		<tr>
			<th>project_id</th>
			<td>
					<form:input path="projectId" cssClass="txt"/>
					&nbsp;<form:errors path="projectId" />
			</td>
		</tr>	
		<tr>
			<th>project_name</th>
			<td>
					<form:input path="projectName" cssClass="txt"/>
					&nbsp;<form:errors path="projectName" />
			</td>
		</tr>	
		<tr>
			<th>connection_id</th>
			<td>
					<form:input path="connectionId" cssClass="txt"/>
					&nbsp;<form:errors path="connectionId" />
			</td>
		</tr>	
		<tr>
			<th>host</th>
			<td>
					<form:input path="host" cssClass="txt"/>
					&nbsp;<form:errors path="host" />
			</td>
		</tr>	
		<tr>
			<th>port</th>
			<td>
					<form:input path="port" cssClass="txt"/>
					&nbsp;<form:errors path="port" />
			</td>
		</tr>	
		<tr>
			<th>username</th>
			<td>
					<form:input path="username" cssClass="txt"/>
					&nbsp;<form:errors path="username" />
			</td>
		</tr>	
		<tr>
			<th>dburl</th>
			<td>
					<form:input path="dburl" cssClass="txt"/>
					&nbsp;<form:errors path="dburl" />
			</td>
		</tr>	
		<tr>
			<th>catalog_id</th>
			<td>
					<form:input path="catalogId" cssClass="txt"/>
					&nbsp;<form:errors path="catalogId" />
			</td>
		</tr>	
		<tr>
			<th>catalog_name</th>
			<td>
					<form:input path="catalogName" cssClass="txt"/>
					&nbsp;<form:errors path="catalogName" />
			</td>
		</tr>	
		<tr>
			<th>schema_id</th>
			<td>
					<form:input path="schemaId" cssClass="txt"/>
					&nbsp;<form:errors path="schemaId" />
			</td>
		</tr>	
		<tr>
			<th>schema_name</th>
			<td>
					<form:input path="schemaName" cssClass="txt"/>
					&nbsp;<form:errors path="schemaName" />
			</td>
		</tr>	
		<tr>
			<th>table_id</th>
			<td>
					<form:input path="tableId" cssClass="txt"/>
					&nbsp;<form:errors path="tableId" />
			</td>
		</tr>	
		<tr>
			<th>table_name</th>
			<td>
					<form:input path="tableName" cssClass="txt"/>
					&nbsp;<form:errors path="tableName" />
			</td>
		</tr>	
	</table>
  </div>
	<div id="sysbtn">
		<ul>
			<li><span class="btn_blue_l"><a href="javascript:fn_egov_selectList();">List</a><img src="<c:url value='/images/egovframework/rte/btn_bg_r.gif'/>" alt="" /></span></li>
			<li><span class="btn_blue_l"><a href="javascript:fn_egov_save();"><c:out value='${registerFlag}'/></a><img src="<c:url value='/images/egovframework/rte/btn_bg_r.gif'/>" alt="" /></span></li>
			<c:if test="${registerFlag == '수정'}">
			<li><span class="btn_blue_l"><a href="javascript:fn_egov_delete();">삭제</a><img src="<c:url value='/images/egovframework/rte/btn_bg_r.gif'/>" alt="" /></span></li>
			</c:if>
			<li><span class="btn_blue_l"><a href="javascript:document.getElementById("detailForm").reset();">Reset</a><img src="<c:url value='/images/egovframework/rte/btn_bg_r.gif'/>" alt="" /></span></li></ul>
	</div>
</div>
<!-- 검색조건 유지 -->
<input type="hidden" name="searchCondition" value="<c:out value='${searchVO.searchCondition}'/>"/>
<input type="hidden" name="searchKeyword" value="<c:out value='${searchVO.searchKeyword}'/>"/>
<input type="hidden" name="pageIndex" value="<c:out value='${searchVO.pageIndex}'/>"/>
</form:form>
</body>
</html>


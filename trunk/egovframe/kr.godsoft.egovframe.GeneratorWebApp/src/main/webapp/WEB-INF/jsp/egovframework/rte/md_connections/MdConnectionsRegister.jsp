<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : MdConnectionsRegister.jsp
  * @Description : MdConnections Register 화면
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
<c:set var="registerFlag" value="${empty mdConnectionsVO.id ? '등록' : '수정'}"/>
<title>This table is used to store connection information.  For example, in migrations, we could be carrying out a consolidation which occurs across many connections. <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="mdConnectionsVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/mdConnections/MdConnectionsList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/mdConnections/deleteMdConnections.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/mdConnections/addMdConnections.do' : '/mdConnections/updateMdConnections.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="mdConnectionsVO" name="detailForm" id="detailForm">
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
		<tr>
			<th>Primary key *</th>
			<td>
				<form:input path="id" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		<tr>
			<th>Primary key *</th>
			<td>
				<form:input path="id" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		</c:if>		
		
		<tr>
			<th>The project to which this connection belongs //PARENTFIELD</th>
			<td>
					<form:input path="projectIdFk" cssClass="txt"/>
					&nbsp;<form:errors path="projectIdFk" />
			</td>
		</tr>	
		<tr>
			<th>The type of the connection - For example it could be used to store "ORACLE" or "MYSQL"</th>
			<td>
					<form:input path="type" cssClass="txt"/>
					&nbsp;<form:errors path="type" />
			</td>
		</tr>	
		<tr>
			<th>The host to which this connection connects.</th>
			<td>
					<form:input path="host" cssClass="txt"/>
					&nbsp;<form:errors path="host" />
			</td>
		</tr>	
		<tr>
			<th>The port to which this connection connects</th>
			<td>
					<form:input path="port" cssClass="txt"/>
					&nbsp;<form:errors path="port" />
			</td>
		</tr>	
		<tr>
			<th>The username used to make the connection</th>
			<td>
					<form:input path="username" cssClass="txt"/>
					&nbsp;<form:errors path="username" />
			</td>
		</tr>	
		<tr>
			<th>The password used to make this connection</th>
			<td>
					<form:input path="password" cssClass="txt"/>
					&nbsp;<form:errors path="password" />
			</td>
		</tr>	
		<tr>
			<th>The database url used to make this connection</th>
			<td>
					<form:input path="dburl" cssClass="txt"/>
					&nbsp;<form:errors path="dburl" />
			</td>
		</tr>	
		<tr>
			<th>//OBJECTNAME</th>
			<td>
					<form:input path="name" cssClass="txt"/>
					&nbsp;<form:errors path="name" />
			</td>
		</tr>	
		<tr>
			<th>The native sql used to create this connection</th>
			<td>
					<form:input path="nativeSql" cssClass="txt"/>
					&nbsp;<form:errors path="nativeSql" />
			</td>
		</tr>	
		<tr>
			<th>num_catalogs</th>
			<td>
					<form:input path="numCatalogs" cssClass="txt"/>
					&nbsp;<form:errors path="numCatalogs" />
			</td>
		</tr>	
		<tr>
			<th>num_columns</th>
			<td>
					<form:input path="numColumns" cssClass="txt"/>
					&nbsp;<form:errors path="numColumns" />
			</td>
		</tr>	
		<tr>
			<th>num_constraints</th>
			<td>
					<form:input path="numConstraints" cssClass="txt"/>
					&nbsp;<form:errors path="numConstraints" />
			</td>
		</tr>	
		<tr>
			<th>num_groups</th>
			<td>
					<form:input path="numGroups" cssClass="txt"/>
					&nbsp;<form:errors path="numGroups" />
			</td>
		</tr>	
		<tr>
			<th>num_roles</th>
			<td>
					<form:input path="numRoles" cssClass="txt"/>
					&nbsp;<form:errors path="numRoles" />
			</td>
		</tr>	
		<tr>
			<th>num_indexes</th>
			<td>
					<form:input path="numIndexes" cssClass="txt"/>
					&nbsp;<form:errors path="numIndexes" />
			</td>
		</tr>	
		<tr>
			<th>num_other_objects</th>
			<td>
					<form:input path="numOtherObjects" cssClass="txt"/>
					&nbsp;<form:errors path="numOtherObjects" />
			</td>
		</tr>	
		<tr>
			<th>num_packages</th>
			<td>
					<form:input path="numPackages" cssClass="txt"/>
					&nbsp;<form:errors path="numPackages" />
			</td>
		</tr>	
		<tr>
			<th>num_privileges</th>
			<td>
					<form:input path="numPrivileges" cssClass="txt"/>
					&nbsp;<form:errors path="numPrivileges" />
			</td>
		</tr>	
		<tr>
			<th>num_schemas</th>
			<td>
					<form:input path="numSchemas" cssClass="txt"/>
					&nbsp;<form:errors path="numSchemas" />
			</td>
		</tr>	
		<tr>
			<th>num_sequences</th>
			<td>
					<form:input path="numSequences" cssClass="txt"/>
					&nbsp;<form:errors path="numSequences" />
			</td>
		</tr>	
		<tr>
			<th>num_stored_programs</th>
			<td>
					<form:input path="numStoredPrograms" cssClass="txt"/>
					&nbsp;<form:errors path="numStoredPrograms" />
			</td>
		</tr>	
		<tr>
			<th>num_synonyms</th>
			<td>
					<form:input path="numSynonyms" cssClass="txt"/>
					&nbsp;<form:errors path="numSynonyms" />
			</td>
		</tr>	
		<tr>
			<th>num_tables</th>
			<td>
					<form:input path="numTables" cssClass="txt"/>
					&nbsp;<form:errors path="numTables" />
			</td>
		</tr>	
		<tr>
			<th>num_tablespaces</th>
			<td>
					<form:input path="numTablespaces" cssClass="txt"/>
					&nbsp;<form:errors path="numTablespaces" />
			</td>
		</tr>	
		<tr>
			<th>num_triggers</th>
			<td>
					<form:input path="numTriggers" cssClass="txt"/>
					&nbsp;<form:errors path="numTriggers" />
			</td>
		</tr>	
		<tr>
			<th>num_user_defined_data_types</th>
			<td>
					<form:input path="numUserDefinedDataTypes" cssClass="txt"/>
					&nbsp;<form:errors path="numUserDefinedDataTypes" />
			</td>
		</tr>	
		<tr>
			<th>num_users</th>
			<td>
					<form:input path="numUsers" cssClass="txt"/>
					&nbsp;<form:errors path="numUsers" />
			</td>
		</tr>	
		<tr>
			<th>num_views</th>
			<td>
					<form:input path="numViews" cssClass="txt"/>
					&nbsp;<form:errors path="numViews" />
			</td>
		</tr>	
		<tr>
			<th>comments</th>
			<td>
					<form:input path="comments" cssClass="txt"/>
					&nbsp;<form:errors path="comments" />
			</td>
		</tr>	
		<tr>
			<th>security_group_id</th>
			<td>
					<form:input path="securityGroupId" cssClass="txt"/>
					&nbsp;<form:errors path="securityGroupId" />
			</td>
		</tr>	
		<tr>
			<th>created_on</th>
			<td>
					<form:input path="createdOn" cssClass="txt"/>
					&nbsp;<form:errors path="createdOn" />
			</td>
		</tr>	
		<tr>
			<th>created_by</th>
			<td>
					<form:input path="createdBy" cssClass="txt"/>
					&nbsp;<form:errors path="createdBy" />
			</td>
		</tr>	
		<tr>
			<th>last_updated_on</th>
			<td>
					<form:input path="lastUpdatedOn" cssClass="txt"/>
					&nbsp;<form:errors path="lastUpdatedOn" />
			</td>
		</tr>	
		<tr>
			<th>last_updated_by</th>
			<td>
					<form:input path="lastUpdatedBy" cssClass="txt"/>
					&nbsp;<form:errors path="lastUpdatedBy" />
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


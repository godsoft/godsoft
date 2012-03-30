<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : MdMigrParameterRegister.jsp
  * @Description : MdMigrParameter Register 화면
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
<c:set var="registerFlag" value="${empty mdMigrParameterVO.id ? '등록' : '수정'}"/>
<title>md_migr_parameter <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="mdMigrParameterVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/mdMigrParameter/MdMigrParameterList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/mdMigrParameter/deleteMdMigrParameter.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/mdMigrParameter/addMdMigrParameter.do' : '/mdMigrParameter/updateMdMigrParameter.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="mdMigrParameterVO" name="detailForm" id="detailForm">
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
			<th>id *</th>
			<td>
				<form:input path="id" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		<tr>
			<th>id *</th>
			<td>
				<form:input path="id" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		</c:if>		
		
		<tr>
			<th>the connection in which this belongs //PARENTFIELD</th>
			<td>
					<form:input path="connectionIdFk" cssClass="txt"/>
					&nbsp;<form:errors path="connectionIdFk" />
			</td>
		</tr>	
		<tr>
			<th>object_id</th>
			<td>
					<form:input path="objectId" cssClass="txt"/>
					&nbsp;<form:errors path="objectId" />
			</td>
		</tr>	
		<tr>
			<th>object_type</th>
			<td>
					<form:input path="objectType" cssClass="txt"/>
					&nbsp;<form:errors path="objectType" />
			</td>
		</tr>	
		<tr>
			<th>1 represents a new parameter for PL/SQL that was not present in the origional. 0 represents a n existing parameter that was present in the origional</th>
			<td>
					<form:input path="paramExisting" cssClass="txt"/>
					&nbsp;<form:errors path="paramExisting" />
			</td>
		</tr>	
		<tr>
			<th>IF -1 THEN THIS PARAM IS A RETURN PARAMETER. 1 WILL BE THE FIRST PARAMETER IN THE PARAMETER LIST</th>
			<td>
					<form:input path="paramOrder" cssClass="txt"/>
					&nbsp;<form:errors path="paramOrder" />
			</td>
		</tr>	
		<tr>
			<th>param_name</th>
			<td>
					<form:input path="paramName" cssClass="txt"/>
					&nbsp;<form:errors path="paramName" />
			</td>
		</tr>	
		<tr>
			<th>param_type</th>
			<td>
					<form:input path="paramType" cssClass="txt"/>
					&nbsp;<form:errors path="paramType" />
			</td>
		</tr>	
		<tr>
			<th>param_data_type</th>
			<td>
					<form:input path="paramDataType" cssClass="txt"/>
					&nbsp;<form:errors path="paramDataType" />
			</td>
		</tr>	
		<tr>
			<th>percision</th>
			<td>
					<form:input path="percision" cssClass="txt"/>
					&nbsp;<form:errors path="percision" />
			</td>
		</tr>	
		<tr>
			<th>scale</th>
			<td>
					<form:input path="scale" cssClass="txt"/>
					&nbsp;<form:errors path="scale" />
			</td>
		</tr>	
		<tr>
			<th>nullable</th>
			<td>
					<form:input path="nullable" cssClass="txt"/>
					&nbsp;<form:errors path="nullable" />
			</td>
		</tr>	
		<tr>
			<th>default_value</th>
			<td>
					<form:input path="defaultValue" cssClass="txt"/>
					&nbsp;<form:errors path="defaultValue" />
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


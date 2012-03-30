<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : MdSynonymsRegister.jsp
  * @Description : MdSynonyms Register 화면
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
<c:set var="registerFlag" value="${empty mdSynonymsVO.id ? '등록' : '수정'}"/>
<title>For storing synonym information. <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="mdSynonymsVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/mdSynonyms/MdSynonymsList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/mdSynonyms/deleteMdSynonyms.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/mdSynonyms/addMdSynonyms.do' : '/mdSynonyms/updateMdSynonyms.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="mdSynonymsVO" name="detailForm" id="detailForm">
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
			<th>Primary Key *</th>
			<td>
				<form:input path="id" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		<tr>
			<th>Primary Key *</th>
			<td>
				<form:input path="id" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		</c:if>		
		
		<tr>
			<th>The schema to which this object belongs //PARENTFIELD</th>
			<td>
					<form:input path="schemaIdFk" cssClass="txt"/>
					&nbsp;<form:errors path="schemaIdFk" />
			</td>
		</tr>	
		<tr>
			<th>Synonym name //OBJECTNAME</th>
			<td>
					<form:input path="name" cssClass="txt"/>
					&nbsp;<form:errors path="name" />
			</td>
		</tr>	
		<tr>
			<th>What object this is a synonym for</th>
			<td>
					<form:input path="synonymForId" cssClass="txt"/>
					&nbsp;<form:errors path="synonymForId" />
			</td>
		</tr>	
		<tr>
			<th>The type this is a synonym for (e.g. INDEX)</th>
			<td>
					<form:input path="forObjectType" cssClass="txt"/>
					&nbsp;<form:errors path="forObjectType" />
			</td>
		</tr>	
		<tr>
			<th>Visibility - Private or Public.  If Private_visibility = 'Y' means this is a private synonym.  Anything else means it is a public synonym</th>
			<td>
					<form:input path="privateVisibility" cssClass="txt"/>
					&nbsp;<form:errors path="privateVisibility" />
			</td>
		</tr>	
		<tr>
			<th>The SQL used to create this object at source</th>
			<td>
					<form:input path="nativeSql" cssClass="txt"/>
					&nbsp;<form:errors path="nativeSql" />
			</td>
		</tr>	
		<tr>
			<th>An identifier for this object at source.</th>
			<td>
					<form:input path="nativeKey" cssClass="txt"/>
					&nbsp;<form:errors path="nativeKey" />
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


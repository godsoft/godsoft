<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtnfiledetailRegister.jsp
  * @Description : Comtnfiledetail Register 화면
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
<c:set var="registerFlag" value="${empty comtnfiledetailVO.atchFileId ? '등록' : '수정'}"/>
<c:set var="registerFlag" value="${empty comtnfiledetailVO.fileSn ? '등록' : '수정'}"/>
<title>comtnfiledetail <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="comtnfiledetailVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/comtnfiledetail/ComtnfiledetailList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/comtnfiledetail/deleteComtnfiledetail.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/comtnfiledetail/addComtnfiledetail.do' : '/comtnfiledetail/updateComtnfiledetail.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="comtnfiledetailVO" name="detailForm" id="detailForm">
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
			<th>atch_file_id *</th>
			<td>
				<form:input path="atchFileId" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		<tr>
			<th>file_sn *</th>
			<td>
				<form:input path="fileSn" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		<tr>
			<th>atch_file_id *</th>
			<td>
				<form:input path="atchFileId" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		<tr>
			<th>file_sn *</th>
			<td>
				<form:input path="fileSn" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		</c:if>		
		
		<tr>
			<th>file_stre_cours</th>
			<td>
					<form:input path="fileStreCours" cssClass="txt"/>
					&nbsp;<form:errors path="fileStreCours" />
			</td>
		</tr>	
		<tr>
			<th>stre_file_nm</th>
			<td>
					<form:input path="streFileNm" cssClass="txt"/>
					&nbsp;<form:errors path="streFileNm" />
			</td>
		</tr>	
		<tr>
			<th>orignl_file_nm</th>
			<td>
					<form:input path="orignlFileNm" cssClass="txt"/>
					&nbsp;<form:errors path="orignlFileNm" />
			</td>
		</tr>	
		<tr>
			<th>file_extsn</th>
			<td>
					<form:input path="fileExtsn" cssClass="txt"/>
					&nbsp;<form:errors path="fileExtsn" />
			</td>
		</tr>	
		<tr>
			<th>file_cn</th>
			<td>
					<form:input path="fileCn" cssClass="txt"/>
					&nbsp;<form:errors path="fileCn" />
			</td>
		</tr>	
		<tr>
			<th>file_size</th>
			<td>
					<form:input path="fileSize" cssClass="txt"/>
					&nbsp;<form:errors path="fileSize" />
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


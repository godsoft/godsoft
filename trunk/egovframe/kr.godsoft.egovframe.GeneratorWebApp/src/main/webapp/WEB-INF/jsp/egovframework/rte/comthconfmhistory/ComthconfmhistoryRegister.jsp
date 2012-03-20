<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComthconfmhistoryRegister.jsp
  * @Description : Comthconfmhistory Register 화면
  * @Modification Information
  * 
  * @author 이백행
  * @since 2012-03-20
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
<c:set var="registerFlag" value="${empty comthconfmhistoryVO.confmNo ? '등록' : '수정'}"/>
<title>comthconfmhistory <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="comthconfmhistoryVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/comthconfmhistory/ComthconfmhistoryList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/comthconfmhistory/deleteComthconfmhistory.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/comthconfmhistory/addComthconfmhistory.do' : '/comthconfmhistory/updateComthconfmhistory.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="comthconfmhistoryVO" name="detailForm" id="detailForm">
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
			<th>confm_no *</th>
			<td>
				<form:input path="confmNo" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		<tr>
			<th>confm_no *</th>
			<td>
				<form:input path="confmNo" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		</c:if>		
		
		<tr>
			<th>confm_rqester_id</th>
			<td>
				<form:input path="confmRqesterId" cssClass="txt"/>
				&nbsp;<form:errors path="confmRqesterId" />
			</td>
		</tr>	
		<tr>
			<th>confmer_id</th>
			<td>
				<form:input path="confmerId" cssClass="txt"/>
				&nbsp;<form:errors path="confmerId" />
			</td>
		</tr>	
		<tr>
			<th>confm_de</th>
			<td>
				<form:input path="confmDe" cssClass="txt"/>
				&nbsp;<form:errors path="confmDe" />
			</td>
		</tr>	
		<tr>
			<th>confm_ty_code</th>
			<td>
				<form:input path="confmTyCode" cssClass="txt"/>
				&nbsp;<form:errors path="confmTyCode" />
			</td>
		</tr>	
		<tr>
			<th>confm_sttus_code</th>
			<td>
				<form:input path="confmSttusCode" cssClass="txt"/>
				&nbsp;<form:errors path="confmSttusCode" />
			</td>
		</tr>	
		<tr>
			<th>opert_ty_code</th>
			<td>
				<form:input path="opertTyCode" cssClass="txt"/>
				&nbsp;<form:errors path="opertTyCode" />
			</td>
		</tr>	
		<tr>
			<th>opert_id</th>
			<td>
				<form:input path="opertId" cssClass="txt"/>
				&nbsp;<form:errors path="opertId" />
			</td>
		</tr>	
		<tr>
			<th>trget_job_ty_code</th>
			<td>
				<form:input path="trgetJobTyCode" cssClass="txt"/>
				&nbsp;<form:errors path="trgetJobTyCode" />
			</td>
		</tr>	
		<tr>
			<th>trget_job_id</th>
			<td>
				<form:input path="trgetJobId" cssClass="txt"/>
				&nbsp;<form:errors path="trgetJobId" />
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


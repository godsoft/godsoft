<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtntroblinfoRegister.jsp
  * @Description : Comtntroblinfo Register 화면
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
<c:set var="registerFlag" value="${empty comtntroblinfoVO.troblId ? '등록' : '수정'}"/>
<title>comtntroblinfo <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="comtntroblinfoVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/comtntroblinfo/ComtntroblinfoList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/comtntroblinfo/deleteComtntroblinfo.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/comtntroblinfo/addComtntroblinfo.do' : '/comtntroblinfo/updateComtntroblinfo.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="comtntroblinfoVO" name="detailForm" id="detailForm">
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
			<th>trobl_id *</th>
			<td>
				<form:input path="troblId" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		<tr>
			<th>trobl_id *</th>
			<td>
				<form:input path="troblId" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		</c:if>		
		
		<tr>
			<th>trobl_nm</th>
			<td>
				<form:input path="troblNm" cssClass="txt"/>
				&nbsp;<form:errors path="troblNm" />
			</td>
		</tr>	
		<tr>
			<th>trobl_knd</th>
			<td>
				<form:input path="troblKnd" cssClass="txt"/>
				&nbsp;<form:errors path="troblKnd" />
			</td>
		</tr>	
		<tr>
			<th>trobl_dc</th>
			<td>
				<form:input path="troblDc" cssClass="txt"/>
				&nbsp;<form:errors path="troblDc" />
			</td>
		</tr>	
		<tr>
			<th>trobl_occrrnc_time</th>
			<td>
				<form:input path="troblOccrrncTime" cssClass="txt"/>
				&nbsp;<form:errors path="troblOccrrncTime" />
			</td>
		</tr>	
		<tr>
			<th>trobl_rqester_nm</th>
			<td>
				<form:input path="troblRqesterNm" cssClass="txt"/>
				&nbsp;<form:errors path="troblRqesterNm" />
			</td>
		</tr>	
		<tr>
			<th>trobl_requst_time</th>
			<td>
				<form:input path="troblRequstTime" cssClass="txt"/>
				&nbsp;<form:errors path="troblRequstTime" />
			</td>
		</tr>	
		<tr>
			<th>trobl_process_result</th>
			<td>
				<form:input path="troblProcessResult" cssClass="txt"/>
				&nbsp;<form:errors path="troblProcessResult" />
			</td>
		</tr>	
		<tr>
			<th>trobl_opetr_nm</th>
			<td>
				<form:input path="troblOpetrNm" cssClass="txt"/>
				&nbsp;<form:errors path="troblOpetrNm" />
			</td>
		</tr>	
		<tr>
			<th>trobl_process_time</th>
			<td>
				<form:input path="troblProcessTime" cssClass="txt"/>
				&nbsp;<form:errors path="troblProcessTime" />
			</td>
		</tr>	
		<tr>
			<th>process_sttus</th>
			<td>
				<form:input path="processSttus" cssClass="txt"/>
				&nbsp;<form:errors path="processSttus" />
			</td>
		</tr>	
		<tr>
			<th>frst_register_id</th>
			<td>
				<form:input path="frstRegisterId" cssClass="txt"/>
				&nbsp;<form:errors path="frstRegisterId" />
			</td>
		</tr>	
		<tr>
			<th>frst_regist_pnttm</th>
			<td>
				<form:input path="frstRegistPnttm" cssClass="txt"/>
				&nbsp;<form:errors path="frstRegistPnttm" />
			</td>
		</tr>	
		<tr>
			<th>last_updusr_id</th>
			<td>
				<form:input path="lastUpdusrId" cssClass="txt"/>
				&nbsp;<form:errors path="lastUpdusrId" />
			</td>
		</tr>	
		<tr>
			<th>last_updt_pnttm</th>
			<td>
				<form:input path="lastUpdtPnttm" cssClass="txt"/>
				&nbsp;<form:errors path="lastUpdtPnttm" />
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


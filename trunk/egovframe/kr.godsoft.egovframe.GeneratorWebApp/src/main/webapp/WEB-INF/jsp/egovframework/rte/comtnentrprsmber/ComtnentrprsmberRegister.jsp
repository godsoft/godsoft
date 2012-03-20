<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtnentrprsmberRegister.jsp
  * @Description : Comtnentrprsmber Register 화면
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
<c:set var="registerFlag" value="${empty comtnentrprsmberVO.entrprsMberId ? '등록' : '수정'}"/>
<title>comtnentrprsmber <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="comtnentrprsmberVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/comtnentrprsmber/ComtnentrprsmberList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/comtnentrprsmber/deleteComtnentrprsmber.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/comtnentrprsmber/addComtnentrprsmber.do' : '/comtnentrprsmber/updateComtnentrprsmber.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="comtnentrprsmberVO" name="detailForm" id="detailForm">
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
			<th>entrprs_mber_id *</th>
			<td>
				<form:input path="entrprsMberId" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		<tr>
			<th>entrprs_mber_id *</th>
			<td>
				<form:input path="entrprsMberId" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		</c:if>		
		
		<tr>
			<th>entrprs_se_code</th>
			<td>
				<form:input path="entrprsSeCode" cssClass="txt"/>
				&nbsp;<form:errors path="entrprsSeCode" />
			</td>
		</tr>	
		<tr>
			<th>bizrno</th>
			<td>
				<form:input path="bizrno" cssClass="txt"/>
				&nbsp;<form:errors path="bizrno" />
			</td>
		</tr>	
		<tr>
			<th>jurirno</th>
			<td>
				<form:input path="jurirno" cssClass="txt"/>
				&nbsp;<form:errors path="jurirno" />
			</td>
		</tr>	
		<tr>
			<th>cmpny_nm</th>
			<td>
				<form:input path="cmpnyNm" cssClass="txt"/>
				&nbsp;<form:errors path="cmpnyNm" />
			</td>
		</tr>	
		<tr>
			<th>cxfc</th>
			<td>
				<form:input path="cxfc" cssClass="txt"/>
				&nbsp;<form:errors path="cxfc" />
			</td>
		</tr>	
		<tr>
			<th>zip</th>
			<td>
				<form:input path="zip" cssClass="txt"/>
				&nbsp;<form:errors path="zip" />
			</td>
		</tr>	
		<tr>
			<th>adres</th>
			<td>
				<form:input path="adres" cssClass="txt"/>
				&nbsp;<form:errors path="adres" />
			</td>
		</tr>	
		<tr>
			<th>entrprs_middle_telno</th>
			<td>
				<form:input path="entrprsMiddleTelno" cssClass="txt"/>
				&nbsp;<form:errors path="entrprsMiddleTelno" />
			</td>
		</tr>	
		<tr>
			<th>fxnum</th>
			<td>
				<form:input path="fxnum" cssClass="txt"/>
				&nbsp;<form:errors path="fxnum" />
			</td>
		</tr>	
		<tr>
			<th>induty_code</th>
			<td>
				<form:input path="indutyCode" cssClass="txt"/>
				&nbsp;<form:errors path="indutyCode" />
			</td>
		</tr>	
		<tr>
			<th>applcnt_nm</th>
			<td>
				<form:input path="applcntNm" cssClass="txt"/>
				&nbsp;<form:errors path="applcntNm" />
			</td>
		</tr>	
		<tr>
			<th>applcnt_ihidnum</th>
			<td>
				<form:input path="applcntIhidnum" cssClass="txt"/>
				&nbsp;<form:errors path="applcntIhidnum" />
			</td>
		</tr>	
		<tr>
			<th>sbscrb_de</th>
			<td>
				<form:input path="sbscrbDe" cssClass="txt"/>
				&nbsp;<form:errors path="sbscrbDe" />
			</td>
		</tr>	
		<tr>
			<th>entrprs_mber_sttus</th>
			<td>
				<form:input path="entrprsMberSttus" cssClass="txt"/>
				&nbsp;<form:errors path="entrprsMberSttus" />
			</td>
		</tr>	
		<tr>
			<th>entrprs_mber_password</th>
			<td>
				<form:input path="entrprsMberPassword" cssClass="txt"/>
				&nbsp;<form:errors path="entrprsMberPassword" />
			</td>
		</tr>	
		<tr>
			<th>entrprs_mber_password_hint</th>
			<td>
				<form:input path="entrprsMberPasswordHint" cssClass="txt"/>
				&nbsp;<form:errors path="entrprsMberPasswordHint" />
			</td>
		</tr>	
		<tr>
			<th>entrprs_mber_password_cnsr</th>
			<td>
				<form:input path="entrprsMberPasswordCnsr" cssClass="txt"/>
				&nbsp;<form:errors path="entrprsMberPasswordCnsr" />
			</td>
		</tr>	
		<tr>
			<th>group_id</th>
			<td>
				<form:input path="groupId" cssClass="txt"/>
				&nbsp;<form:errors path="groupId" />
			</td>
		</tr>	
		<tr>
			<th>detail_adres</th>
			<td>
				<form:input path="detailAdres" cssClass="txt"/>
				&nbsp;<form:errors path="detailAdres" />
			</td>
		</tr>	
		<tr>
			<th>entrprs_end_telno</th>
			<td>
				<form:input path="entrprsEndTelno" cssClass="txt"/>
				&nbsp;<form:errors path="entrprsEndTelno" />
			</td>
		</tr>	
		<tr>
			<th>area_no</th>
			<td>
				<form:input path="areaNo" cssClass="txt"/>
				&nbsp;<form:errors path="areaNo" />
			</td>
		</tr>	
		<tr>
			<th>applcnt_email_adres</th>
			<td>
				<form:input path="applcntEmailAdres" cssClass="txt"/>
				&nbsp;<form:errors path="applcntEmailAdres" />
			</td>
		</tr>	
		<tr>
			<th>esntl_id</th>
			<td>
				<form:input path="esntlId" cssClass="txt"/>
				&nbsp;<form:errors path="esntlId" />
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


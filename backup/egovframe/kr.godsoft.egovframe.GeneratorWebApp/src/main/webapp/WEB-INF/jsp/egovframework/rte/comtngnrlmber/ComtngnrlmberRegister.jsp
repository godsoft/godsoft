<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtngnrlmberRegister.jsp
  * @Description : Comtngnrlmber Register 화면
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
<c:set var="registerFlag" value="${empty comtngnrlmberVO.mberId ? '등록' : '수정'}"/>
<title>comtngnrlmber <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="comtngnrlmberVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/comtngnrlmber/ComtngnrlmberList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/comtngnrlmber/deleteComtngnrlmber.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/comtngnrlmber/addComtngnrlmber.do' : '/comtngnrlmber/updateComtngnrlmber.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="comtngnrlmberVO" name="detailForm" id="detailForm">
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
			<th>mber_id *</th>
			<td>
				<form:input path="mberId" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		<tr>
			<th>mber_id *</th>
			<td>
				<form:input path="mberId" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		</c:if>		
		
		<tr>
			<th>password</th>
			<td>
					<form:input path="password" cssClass="txt"/>
					&nbsp;<form:errors path="password" />
			</td>
		</tr>	
		<tr>
			<th>password_hint</th>
			<td>
					<form:input path="passwordHint" cssClass="txt"/>
					&nbsp;<form:errors path="passwordHint" />
			</td>
		</tr>	
		<tr>
			<th>password_cnsr</th>
			<td>
					<form:input path="passwordCnsr" cssClass="txt"/>
					&nbsp;<form:errors path="passwordCnsr" />
			</td>
		</tr>	
		<tr>
			<th>ihidnum</th>
			<td>
					<form:input path="ihidnum" cssClass="txt"/>
					&nbsp;<form:errors path="ihidnum" />
			</td>
		</tr>	
		<tr>
			<th>mber_nm</th>
			<td>
					<form:input path="mberNm" cssClass="txt"/>
					&nbsp;<form:errors path="mberNm" />
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
			<th>area_no</th>
			<td>
					<form:input path="areaNo" cssClass="txt"/>
					&nbsp;<form:errors path="areaNo" />
			</td>
		</tr>	
		<tr>
			<th>mber_sttus</th>
			<td>
					<form:input path="mberSttus" cssClass="txt"/>
					&nbsp;<form:errors path="mberSttus" />
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
			<th>end_telno</th>
			<td>
					<form:input path="endTelno" cssClass="txt"/>
					&nbsp;<form:errors path="endTelno" />
			</td>
		</tr>	
		<tr>
			<th>mbtlnum</th>
			<td>
					<form:input path="mbtlnum" cssClass="txt"/>
					&nbsp;<form:errors path="mbtlnum" />
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
			<th>mber_fxnum</th>
			<td>
					<form:input path="mberFxnum" cssClass="txt"/>
					&nbsp;<form:errors path="mberFxnum" />
			</td>
		</tr>	
		<tr>
			<th>mber_email_adres</th>
			<td>
					<form:input path="mberEmailAdres" cssClass="txt"/>
					&nbsp;<form:errors path="mberEmailAdres" />
			</td>
		</tr>	
		<tr>
			<th>middle_telno</th>
			<td>
					<form:input path="middleTelno" cssClass="txt"/>
					&nbsp;<form:errors path="middleTelno" />
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
			<th>sexdstn_code</th>
			<td>
					<form:input path="sexdstnCode" cssClass="txt"/>
					&nbsp;<form:errors path="sexdstnCode" />
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


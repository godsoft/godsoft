<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtnncrdRegister.jsp
  * @Description : Comtnncrd Register 화면
  * @Modification Information
  * 
  * @author 이백행
  * @since 2012-03-16
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
<c:set var="registerFlag" value="${empty comtnncrdVO.id ? '등록' : '수정'}"/>
<title> <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="comtnncrdVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/comtnncrd/ComtnncrdList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/comtnncrd/deleteComtnncrd.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/comtnncrd/addComtnncrd.do' : '/comtnncrd/updateComtnncrd.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="comtnncrdVO" name="detailForm">
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
			<th>NCRD_ID *</th>
			<td>
				<form:input path="ncrdId" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		<tr>
			<th>NCRD_ID *</th>
			<td>
				<form:input path="ncrdId" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		</c:if>		
		
		<tr>
			<th>NCRD_TRGTER_ID</th>
			<td>
				<form:input path="ncrdTrgterId" cssClass="txt"/>
				&nbsp;<form:errors path="ncrdTrgterId" />
			</td>
		</tr>	
		<tr>
			<th>NM</th>
			<td>
				<form:input path="nm" cssClass="txt"/>
				&nbsp;<form:errors path="nm" />
			</td>
		</tr>	
		<tr>
			<th>TELNO</th>
			<td>
				<form:input path="telno" cssClass="txt"/>
				&nbsp;<form:errors path="telno" />
			</td>
		</tr>	
		<tr>
			<th>NATION_NO</th>
			<td>
				<form:input path="nationNo" cssClass="txt"/>
				&nbsp;<form:errors path="nationNo" />
			</td>
		</tr>	
		<tr>
			<th>AREA_NO</th>
			<td>
				<form:input path="areaNo" cssClass="txt"/>
				&nbsp;<form:errors path="areaNo" />
			</td>
		</tr>	
		<tr>
			<th>MIDDLE_TELNO</th>
			<td>
				<form:input path="middleTelno" cssClass="txt"/>
				&nbsp;<form:errors path="middleTelno" />
			</td>
		</tr>	
		<tr>
			<th>END_TELNO</th>
			<td>
				<form:input path="endTelno" cssClass="txt"/>
				&nbsp;<form:errors path="endTelno" />
			</td>
		</tr>	
		<tr>
			<th>MBTLNUM</th>
			<td>
				<form:input path="mbtlnum" cssClass="txt"/>
				&nbsp;<form:errors path="mbtlnum" />
			</td>
		</tr>	
		<tr>
			<th>IDNTFC_NO</th>
			<td>
				<form:input path="idntfcNo" cssClass="txt"/>
				&nbsp;<form:errors path="idntfcNo" />
			</td>
		</tr>	
		<tr>
			<th>MIDDLE_MBTLNUM</th>
			<td>
				<form:input path="middleMbtlnum" cssClass="txt"/>
				&nbsp;<form:errors path="middleMbtlnum" />
			</td>
		</tr>	
		<tr>
			<th>END_MBTLNUM</th>
			<td>
				<form:input path="endMbtlnum" cssClass="txt"/>
				&nbsp;<form:errors path="endMbtlnum" />
			</td>
		</tr>	
		<tr>
			<th>EMAIL_ADRES</th>
			<td>
				<form:input path="emailAdres" cssClass="txt"/>
				&nbsp;<form:errors path="emailAdres" />
			</td>
		</tr>	
		<tr>
			<th>CMPNY_NM</th>
			<td>
				<form:input path="cmpnyNm" cssClass="txt"/>
				&nbsp;<form:errors path="cmpnyNm" />
			</td>
		</tr>	
		<tr>
			<th>DEPT_NM</th>
			<td>
				<form:input path="deptNm" cssClass="txt"/>
				&nbsp;<form:errors path="deptNm" />
			</td>
		</tr>	
		<tr>
			<th>ADRES</th>
			<td>
				<form:input path="adres" cssClass="txt"/>
				&nbsp;<form:errors path="adres" />
			</td>
		</tr>	
		<tr>
			<th>DETAIL_ADRES</th>
			<td>
				<form:input path="detailAdres" cssClass="txt"/>
				&nbsp;<form:errors path="detailAdres" />
			</td>
		</tr>	
		<tr>
			<th>OFCPS_NM</th>
			<td>
				<form:input path="ofcpsNm" cssClass="txt"/>
				&nbsp;<form:errors path="ofcpsNm" />
			</td>
		</tr>	
		<tr>
			<th>CLSF_NM</th>
			<td>
				<form:input path="clsfNm" cssClass="txt"/>
				&nbsp;<form:errors path="clsfNm" />
			</td>
		</tr>	
		<tr>
			<th>EXTRL_USER_AT</th>
			<td>
				<form:input path="extrlUserAt" cssClass="txt"/>
				&nbsp;<form:errors path="extrlUserAt" />
			</td>
		</tr>	
		<tr>
			<th>OTHBC_AT</th>
			<td>
				<form:input path="othbcAt" cssClass="txt"/>
				&nbsp;<form:errors path="othbcAt" />
			</td>
		</tr>	
		<tr>
			<th>RM</th>
			<td>
				<form:input path="rm" cssClass="txt"/>
				&nbsp;<form:errors path="rm" />
			</td>
		</tr>	
		<tr>
			<th>FRST_REGIST_PNTTM</th>
			<td>
				<form:input path="frstRegistPnttm" cssClass="txt"/>
				&nbsp;<form:errors path="frstRegistPnttm" />
			</td>
		</tr>	
		<tr>
			<th>FRST_REGISTER_ID</th>
			<td>
				<form:input path="frstRegisterId" cssClass="txt"/>
				&nbsp;<form:errors path="frstRegisterId" />
			</td>
		</tr>	
		<tr>
			<th>LAST_UPDT_PNTTM</th>
			<td>
				<form:input path="lastUpdtPnttm" cssClass="txt"/>
				&nbsp;<form:errors path="lastUpdtPnttm" />
			</td>
		</tr>	
		<tr>
			<th>LAST_UPDUSR_ID</th>
			<td>
				<form:input path="lastUpdusrId" cssClass="txt"/>
				&nbsp;<form:errors path="lastUpdusrId" />
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


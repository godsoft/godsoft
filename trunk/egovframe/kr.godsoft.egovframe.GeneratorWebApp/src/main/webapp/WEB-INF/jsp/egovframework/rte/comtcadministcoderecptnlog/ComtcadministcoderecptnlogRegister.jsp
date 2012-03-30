<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtcadministcoderecptnlogRegister.jsp
  * @Description : Comtcadministcoderecptnlog Register 화면
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
<c:set var="registerFlag" value="${empty comtcadministcoderecptnlogVO.occrrncDe ? '등록' : '수정'}"/>
<c:set var="registerFlag" value="${empty comtcadministcoderecptnlogVO.administZoneSe ? '등록' : '수정'}"/>
<c:set var="registerFlag" value="${empty comtcadministcoderecptnlogVO.administZoneCode ? '등록' : '수정'}"/>
<c:set var="registerFlag" value="${empty comtcadministcoderecptnlogVO.opertSn ? '등록' : '수정'}"/>
<title>comtcadministcoderecptnlog <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="comtcadministcoderecptnlogVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/comtcadministcoderecptnlog/ComtcadministcoderecptnlogList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/comtcadministcoderecptnlog/deleteComtcadministcoderecptnlog.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/comtcadministcoderecptnlog/addComtcadministcoderecptnlog.do' : '/comtcadministcoderecptnlog/updateComtcadministcoderecptnlog.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="comtcadministcoderecptnlogVO" name="detailForm" id="detailForm">
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
			<th>occrrnc_de *</th>
			<td>
				<form:input path="occrrncDe" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		<tr>
			<th>administ_zone_se *</th>
			<td>
				<form:input path="administZoneSe" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		<tr>
			<th>administ_zone_code *</th>
			<td>
				<form:input path="administZoneCode" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		<tr>
			<th>opert_sn *</th>
			<td>
				<form:input path="opertSn" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		<tr>
			<th>occrrnc_de *</th>
			<td>
				<form:input path="occrrncDe" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		<tr>
			<th>administ_zone_se *</th>
			<td>
				<form:input path="administZoneSe" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		<tr>
			<th>administ_zone_code *</th>
			<td>
				<form:input path="administZoneCode" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		<tr>
			<th>opert_sn *</th>
			<td>
				<form:input path="opertSn" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		</c:if>		
		
		<tr>
			<th>change_se_code</th>
			<td>
					<form:input path="changeSeCode" cssClass="txt"/>
					&nbsp;<form:errors path="changeSeCode" />
			</td>
		</tr>	
		<tr>
			<th>process_se</th>
			<td>
					<form:input path="processSe" cssClass="txt"/>
					&nbsp;<form:errors path="processSe" />
			</td>
		</tr>	
		<tr>
			<th>administ_zone_nm</th>
			<td>
					<form:input path="administZoneNm" cssClass="txt"/>
					&nbsp;<form:errors path="administZoneNm" />
			</td>
		</tr>	
		<tr>
			<th>lowest_administ_zone_nm</th>
			<td>
					<form:input path="lowestAdministZoneNm" cssClass="txt"/>
					&nbsp;<form:errors path="lowestAdministZoneNm" />
			</td>
		</tr>	
		<tr>
			<th>ctprvn_code</th>
			<td>
					<form:input path="ctprvnCode" cssClass="txt"/>
					&nbsp;<form:errors path="ctprvnCode" />
			</td>
		</tr>	
		<tr>
			<th>signgu_code</th>
			<td>
					<form:input path="signguCode" cssClass="txt"/>
					&nbsp;<form:errors path="signguCode" />
			</td>
		</tr>	
		<tr>
			<th>emd_code</th>
			<td>
					<form:input path="emdCode" cssClass="txt"/>
					&nbsp;<form:errors path="emdCode" />
			</td>
		</tr>	
		<tr>
			<th>li_code</th>
			<td>
					<form:input path="liCode" cssClass="txt"/>
					&nbsp;<form:errors path="liCode" />
			</td>
		</tr>	
		<tr>
			<th>creat_de</th>
			<td>
					<form:input path="creatDe" cssClass="txt"/>
					&nbsp;<form:errors path="creatDe" />
			</td>
		</tr>	
		<tr>
			<th>abl_de</th>
			<td>
					<form:input path="ablDe" cssClass="txt"/>
					&nbsp;<form:errors path="ablDe" />
			</td>
		</tr>	
		<tr>
			<th>abl_ennc</th>
			<td>
					<form:input path="ablEnnc" cssClass="txt"/>
					&nbsp;<form:errors path="ablEnnc" />
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


<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtnservereqpmninfoRegister.jsp
  * @Description : Comtnservereqpmninfo Register 화면
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
<c:set var="registerFlag" value="${empty comtnservereqpmninfoVO.serverEqpmnId ? '등록' : '수정'}"/>
<title>comtnservereqpmninfo <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="comtnservereqpmninfoVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/comtnservereqpmninfo/ComtnservereqpmninfoList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/comtnservereqpmninfo/deleteComtnservereqpmninfo.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/comtnservereqpmninfo/addComtnservereqpmninfo.do' : '/comtnservereqpmninfo/updateComtnservereqpmninfo.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="comtnservereqpmninfoVO" name="detailForm" id="detailForm">
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
			<th>server_eqpmn_id *</th>
			<td>
				<form:input path="serverEqpmnId" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		<tr>
			<th>server_eqpmn_id *</th>
			<td>
				<form:input path="serverEqpmnId" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		</c:if>		
		
		<tr>
			<th>server_eqpmn_nm</th>
			<td>
					<form:input path="serverEqpmnNm" cssClass="txt"/>
					&nbsp;<form:errors path="serverEqpmnNm" />
			</td>
		</tr>	
		<tr>
			<th>server_eqpmn_ip</th>
			<td>
					<form:input path="serverEqpmnIp" cssClass="txt"/>
					&nbsp;<form:errors path="serverEqpmnIp" />
			</td>
		</tr>	
		<tr>
			<th>server_eqpmn_mngr</th>
			<td>
					<form:input path="serverEqpmnMngr" cssClass="txt"/>
					&nbsp;<form:errors path="serverEqpmnMngr" />
			</td>
		</tr>	
		<tr>
			<th>mngr_email_adres</th>
			<td>
					<form:input path="mngrEmailAdres" cssClass="txt"/>
					&nbsp;<form:errors path="mngrEmailAdres" />
			</td>
		</tr>	
		<tr>
			<th>opersysm_info</th>
			<td>
					<form:input path="opersysmInfo" cssClass="txt"/>
					&nbsp;<form:errors path="opersysmInfo" />
			</td>
		</tr>	
		<tr>
			<th>cpu_info</th>
			<td>
					<form:input path="cpuInfo" cssClass="txt"/>
					&nbsp;<form:errors path="cpuInfo" />
			</td>
		</tr>	
		<tr>
			<th>mory_info</th>
			<td>
					<form:input path="moryInfo" cssClass="txt"/>
					&nbsp;<form:errors path="moryInfo" />
			</td>
		</tr>	
		<tr>
			<th>hddisk</th>
			<td>
					<form:input path="hddisk" cssClass="txt"/>
					&nbsp;<form:errors path="hddisk" />
			</td>
		</tr>	
		<tr>
			<th>etc_info</th>
			<td>
					<form:input path="etcInfo" cssClass="txt"/>
					&nbsp;<form:errors path="etcInfo" />
			</td>
		</tr>	
		<tr>
			<th>rgsde</th>
			<td>
					<form:input path="rgsde" cssClass="txt"/>
					&nbsp;<form:errors path="rgsde" />
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


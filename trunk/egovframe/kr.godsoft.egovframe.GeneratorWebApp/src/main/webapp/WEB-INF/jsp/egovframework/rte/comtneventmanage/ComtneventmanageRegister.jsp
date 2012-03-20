<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtneventmanageRegister.jsp
  * @Description : Comtneventmanage Register 화면
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
<c:set var="registerFlag" value="${empty comtneventmanageVO.eventId ? '등록' : '수정'}"/>
<title>comtneventmanage <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="comtneventmanageVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/comtneventmanage/ComtneventmanageList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/comtneventmanage/deleteComtneventmanage.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/comtneventmanage/addComtneventmanage.do' : '/comtneventmanage/updateComtneventmanage.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="comtneventmanageVO" name="detailForm" id="detailForm">
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
			<th>event_id *</th>
			<td>
				<form:input path="eventId" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		<tr>
			<th>event_id *</th>
			<td>
				<form:input path="eventId" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		</c:if>		
		
		<tr>
			<th>event_se</th>
			<td>
				<form:input path="eventSe" cssClass="txt"/>
				&nbsp;<form:errors path="eventSe" />
			</td>
		</tr>	
		<tr>
			<th>event_nm</th>
			<td>
				<form:input path="eventNm" cssClass="txt"/>
				&nbsp;<form:errors path="eventNm" />
			</td>
		</tr>	
		<tr>
			<th>event_purps</th>
			<td>
				<form:input path="eventPurps" cssClass="txt"/>
				&nbsp;<form:errors path="eventPurps" />
			</td>
		</tr>	
		<tr>
			<th>event_bgnde</th>
			<td>
				<form:input path="eventBgnde" cssClass="txt"/>
				&nbsp;<form:errors path="eventBgnde" />
			</td>
		</tr>	
		<tr>
			<th>event_endde</th>
			<td>
				<form:input path="eventEndde" cssClass="txt"/>
				&nbsp;<form:errors path="eventEndde" />
			</td>
		</tr>	
		<tr>
			<th>event_auspc_instt_nm</th>
			<td>
				<form:input path="eventAuspcInsttNm" cssClass="txt"/>
				&nbsp;<form:errors path="eventAuspcInsttNm" />
			</td>
		</tr>	
		<tr>
			<th>event_mngt_instt_nm</th>
			<td>
				<form:input path="eventMngtInsttNm" cssClass="txt"/>
				&nbsp;<form:errors path="eventMngtInsttNm" />
			</td>
		</tr>	
		<tr>
			<th>event_place</th>
			<td>
				<form:input path="eventPlace" cssClass="txt"/>
				&nbsp;<form:errors path="eventPlace" />
			</td>
		</tr>	
		<tr>
			<th>event_cn</th>
			<td>
				<form:input path="eventCn" cssClass="txt"/>
				&nbsp;<form:errors path="eventCn" />
			</td>
		</tr>	
		<tr>
			<th>ct_occrrnc_at</th>
			<td>
				<form:input path="ctOccrrncAt" cssClass="txt"/>
				&nbsp;<form:errors path="ctOccrrncAt" />
			</td>
		</tr>	
		<tr>
			<th>partcpt_ct</th>
			<td>
				<form:input path="partcptCt" cssClass="txt"/>
				&nbsp;<form:errors path="partcptCt" />
			</td>
		</tr>	
		<tr>
			<th>garden</th>
			<td>
				<form:input path="garden" cssClass="txt"/>
				&nbsp;<form:errors path="garden" />
			</td>
		</tr>	
		<tr>
			<th>refrn_url</th>
			<td>
				<form:input path="refrnUrl" cssClass="txt"/>
				&nbsp;<form:errors path="refrnUrl" />
			</td>
		</tr>	
		<tr>
			<th>rcept_bgnde</th>
			<td>
				<form:input path="rceptBgnde" cssClass="txt"/>
				&nbsp;<form:errors path="rceptBgnde" />
			</td>
		</tr>	
		<tr>
			<th>rcept_endde</th>
			<td>
				<form:input path="rceptEndde" cssClass="txt"/>
				&nbsp;<form:errors path="rceptEndde" />
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


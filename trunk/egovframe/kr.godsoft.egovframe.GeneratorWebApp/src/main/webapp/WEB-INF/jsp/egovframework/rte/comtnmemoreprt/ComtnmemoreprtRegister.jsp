<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtnmemoreprtRegister.jsp
  * @Description : Comtnmemoreprt Register 화면
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
<c:set var="registerFlag" value="${empty comtnmemoreprtVO.id ? '등록' : '수정'}"/>
<title> <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="comtnmemoreprtVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/comtnmemoreprt/ComtnmemoreprtList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/comtnmemoreprt/deleteComtnmemoreprt.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/comtnmemoreprt/addComtnmemoreprt.do' : '/comtnmemoreprt/updateComtnmemoreprt.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="comtnmemoreprtVO" name="detailForm">
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
			<th>REPRT_ID *</th>
			<td>
				<form:input path="reprtId" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		<tr>
			<th>REPRT_ID *</th>
			<td>
				<form:input path="reprtId" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		</c:if>		
		
		<tr>
			<th>REPRT_SJ</th>
			<td>
				<form:input path="reprtSj" cssClass="txt"/>
				&nbsp;<form:errors path="reprtSj" />
			</td>
		</tr>	
		<tr>
			<th>REPORT_DE</th>
			<td>
				<form:input path="reportDe" cssClass="txt"/>
				&nbsp;<form:errors path="reportDe" />
			</td>
		</tr>	
		<tr>
			<th>WRTER_ID</th>
			<td>
				<form:input path="wrterId" cssClass="txt"/>
				&nbsp;<form:errors path="wrterId" />
			</td>
		</tr>	
		<tr>
			<th>REPORTR_ID</th>
			<td>
				<form:input path="reportrId" cssClass="txt"/>
				&nbsp;<form:errors path="reportrId" />
			</td>
		</tr>	
		<tr>
			<th>REPORT_CN</th>
			<td>
				<form:input path="reportCn" cssClass="txt"/>
				&nbsp;<form:errors path="reportCn" />
			</td>
		</tr>	
		<tr>
			<th>ATCH_FILE_ID</th>
			<td>
				<form:input path="atchFileId" cssClass="txt"/>
				&nbsp;<form:errors path="atchFileId" />
			</td>
		</tr>	
		<tr>
			<th>DRCT_MATTER</th>
			<td>
				<form:input path="drctMatter" cssClass="txt"/>
				&nbsp;<form:errors path="drctMatter" />
			</td>
		</tr>	
		<tr>
			<th>DRCT_MATTER_REGIST_DT</th>
			<td>
				<form:input path="drctMatterRegistDt" cssClass="txt"/>
				&nbsp;<form:errors path="drctMatterRegistDt" />
			</td>
		</tr>	
		<tr>
			<th>REPORTR_INQIRE_DT</th>
			<td>
				<form:input path="reportrInqireDt" cssClass="txt"/>
				&nbsp;<form:errors path="reportrInqireDt" />
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
			<th>FRST_REGIST_PNTTM</th>
			<td>
				<form:input path="frstRegistPnttm" cssClass="txt"/>
				&nbsp;<form:errors path="frstRegistPnttm" />
			</td>
		</tr>	
		<tr>
			<th>LAST_UPDUSR_ID</th>
			<td>
				<form:input path="lastUpdusrId" cssClass="txt"/>
				&nbsp;<form:errors path="lastUpdusrId" />
			</td>
		</tr>	
		<tr>
			<th>LAST_UPDT_PNTTM</th>
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


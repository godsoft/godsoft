<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtnqainfoRegister.jsp
  * @Description : Comtnqainfo Register 화면
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
<c:set var="registerFlag" value="${empty comtnqainfoVO.id ? '등록' : '수정'}"/>
<title> <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="comtnqainfoVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/comtnqainfo/ComtnqainfoList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/comtnqainfo/deleteComtnqainfo.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/comtnqainfo/addComtnqainfo.do' : '/comtnqainfo/updateComtnqainfo.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="comtnqainfoVO" name="detailForm">
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
			<th>QA_ID *</th>
			<td>
				<form:input path="qaId" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		<tr>
			<th>QA_ID *</th>
			<td>
				<form:input path="qaId" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		</c:if>		
		
		<tr>
			<th>QESTN_SJ</th>
			<td>
				<form:input path="qestnSj" cssClass="txt"/>
				&nbsp;<form:errors path="qestnSj" />
			</td>
		</tr>	
		<tr>
			<th>QESTN_CN</th>
			<td>
				<form:input path="qestnCn" cssClass="txt"/>
				&nbsp;<form:errors path="qestnCn" />
			</td>
		</tr>	
		<tr>
			<th>WRITNG_DE</th>
			<td>
				<form:input path="writngDe" cssClass="txt"/>
				&nbsp;<form:errors path="writngDe" />
			</td>
		</tr>	
		<tr>
			<th>RDCNT</th>
			<td>
				<form:input path="rdcnt" cssClass="txt"/>
				&nbsp;<form:errors path="rdcnt" />
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
		<tr>
			<th>QNA_PROCESS_STTUS_CODE</th>
			<td>
				<form:input path="qnaProcessSttusCode" cssClass="txt"/>
				&nbsp;<form:errors path="qnaProcessSttusCode" />
			</td>
		</tr>	
		<tr>
			<th>WRTER_NM</th>
			<td>
				<form:input path="wrterNm" cssClass="txt"/>
				&nbsp;<form:errors path="wrterNm" />
			</td>
		</tr>	
		<tr>
			<th>ANSWER_CN</th>
			<td>
				<form:input path="answerCn" cssClass="txt"/>
				&nbsp;<form:errors path="answerCn" />
			</td>
		</tr>	
		<tr>
			<th>WRITNG_PASSWORD</th>
			<td>
				<form:input path="writngPassword" cssClass="txt"/>
				&nbsp;<form:errors path="writngPassword" />
			</td>
		</tr>	
		<tr>
			<th>ANSWER_DE</th>
			<td>
				<form:input path="answerDe" cssClass="txt"/>
				&nbsp;<form:errors path="answerDe" />
			</td>
		</tr>	
		<tr>
			<th>EMAIL_ANSWER_AT</th>
			<td>
				<form:input path="emailAnswerAt" cssClass="txt"/>
				&nbsp;<form:errors path="emailAnswerAt" />
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


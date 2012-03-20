<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtninsttcodeRegister.jsp
  * @Description : Comtninsttcode Register 화면
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
<c:set var="registerFlag" value="${empty comtninsttcodeVO.insttCode ? '등록' : '수정'}"/>
<title>comtninsttcode <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="comtninsttcodeVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/comtninsttcode/ComtninsttcodeList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/comtninsttcode/deleteComtninsttcode.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/comtninsttcode/addComtninsttcode.do' : '/comtninsttcode/updateComtninsttcode.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="comtninsttcodeVO" name="detailForm" id="detailForm">
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
			<th>instt_code *</th>
			<td>
				<form:input path="insttCode" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		<tr>
			<th>instt_code *</th>
			<td>
				<form:input path="insttCode" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		</c:if>		
		
		<tr>
			<th>all_instt_nm</th>
			<td>
				<form:input path="allInsttNm" cssClass="txt"/>
				&nbsp;<form:errors path="allInsttNm" />
			</td>
		</tr>	
		<tr>
			<th>lowest_instt_nm</th>
			<td>
				<form:input path="lowestInsttNm" cssClass="txt"/>
				&nbsp;<form:errors path="lowestInsttNm" />
			</td>
		</tr>	
		<tr>
			<th>instt_abrv_nm</th>
			<td>
				<form:input path="insttAbrvNm" cssClass="txt"/>
				&nbsp;<form:errors path="insttAbrvNm" />
			</td>
		</tr>	
		<tr>
			<th>odr</th>
			<td>
				<form:input path="odr" cssClass="txt"/>
				&nbsp;<form:errors path="odr" />
			</td>
		</tr>	
		<tr>
			<th>ord</th>
			<td>
				<form:input path="ord" cssClass="txt"/>
				&nbsp;<form:errors path="ord" />
			</td>
		</tr>	
		<tr>
			<th>instt_odr</th>
			<td>
				<form:input path="insttOdr" cssClass="txt"/>
				&nbsp;<form:errors path="insttOdr" />
			</td>
		</tr>	
		<tr>
			<th>upper_instt_code</th>
			<td>
				<form:input path="upperInsttCode" cssClass="txt"/>
				&nbsp;<form:errors path="upperInsttCode" />
			</td>
		</tr>	
		<tr>
			<th>best_instt_code</th>
			<td>
				<form:input path="bestInsttCode" cssClass="txt"/>
				&nbsp;<form:errors path="bestInsttCode" />
			</td>
		</tr>	
		<tr>
			<th>reprsnt_instt_code</th>
			<td>
				<form:input path="reprsntInsttCode" cssClass="txt"/>
				&nbsp;<form:errors path="reprsntInsttCode" />
			</td>
		</tr>	
		<tr>
			<th>instt_ty_lclas</th>
			<td>
				<form:input path="insttTyLclas" cssClass="txt"/>
				&nbsp;<form:errors path="insttTyLclas" />
			</td>
		</tr>	
		<tr>
			<th>instt_ty_mlsfc</th>
			<td>
				<form:input path="insttTyMlsfc" cssClass="txt"/>
				&nbsp;<form:errors path="insttTyMlsfc" />
			</td>
		</tr>	
		<tr>
			<th>instt_ty_sclas</th>
			<td>
				<form:input path="insttTySclas" cssClass="txt"/>
				&nbsp;<form:errors path="insttTySclas" />
			</td>
		</tr>	
		<tr>
			<th>telno</th>
			<td>
				<form:input path="telno" cssClass="txt"/>
				&nbsp;<form:errors path="telno" />
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
			<th>change_de</th>
			<td>
				<form:input path="changeDe" cssClass="txt"/>
				&nbsp;<form:errors path="changeDe" />
			</td>
		</tr>	
		<tr>
			<th>change_time</th>
			<td>
				<form:input path="changeTime" cssClass="txt"/>
				&nbsp;<form:errors path="changeTime" />
			</td>
		</tr>	
		<tr>
			<th>bsis_de</th>
			<td>
				<form:input path="bsisDe" cssClass="txt"/>
				&nbsp;<form:errors path="bsisDe" />
			</td>
		</tr>	
		<tr>
			<th>sort_ordr</th>
			<td>
				<form:input path="sortOrdr" cssClass="txt"/>
				&nbsp;<form:errors path="sortOrdr" />
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


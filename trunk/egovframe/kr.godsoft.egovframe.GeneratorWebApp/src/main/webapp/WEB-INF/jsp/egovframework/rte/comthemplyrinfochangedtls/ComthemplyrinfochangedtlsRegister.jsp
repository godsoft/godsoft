<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComthemplyrinfochangedtlsRegister.jsp
  * @Description : Comthemplyrinfochangedtls Register 화면
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
<c:set var="registerFlag" value="${empty comthemplyrinfochangedtlsVO.emplyrId ? '등록' : '수정'}"/>
<c:set var="registerFlag" value="${empty comthemplyrinfochangedtlsVO.changeDe ? '등록' : '수정'}"/>
<title>comthemplyrinfochangedtls <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="comthemplyrinfochangedtlsVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/comthemplyrinfochangedtls/ComthemplyrinfochangedtlsList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/comthemplyrinfochangedtls/deleteComthemplyrinfochangedtls.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/comthemplyrinfochangedtls/addComthemplyrinfochangedtls.do' : '/comthemplyrinfochangedtls/updateComthemplyrinfochangedtls.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="comthemplyrinfochangedtlsVO" name="detailForm" id="detailForm">
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
			<th>emplyr_id *</th>
			<td>
				<form:input path="emplyrId" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		<tr>
			<th>change_de *</th>
			<td>
				<form:input path="changeDe" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		<tr>
			<th>emplyr_id *</th>
			<td>
				<form:input path="emplyrId" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		<tr>
			<th>change_de *</th>
			<td>
				<form:input path="changeDe" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		</c:if>		
		
		<tr>
			<th>orgnzt_id</th>
			<td>
					<form:input path="orgnztId" cssClass="txt"/>
					&nbsp;<form:errors path="orgnztId" />
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
			<th>empl_no</th>
			<td>
					<form:input path="emplNo" cssClass="txt"/>
					&nbsp;<form:errors path="emplNo" />
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
			<th>brthdy</th>
			<td>
					<form:input path="brthdy" cssClass="txt"/>
					&nbsp;<form:errors path="brthdy" />
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
			<th>house_adres</th>
			<td>
					<form:input path="houseAdres" cssClass="txt"/>
					&nbsp;<form:errors path="houseAdres" />
			</td>
		</tr>	
		<tr>
			<th>house_end_telno</th>
			<td>
					<form:input path="houseEndTelno" cssClass="txt"/>
					&nbsp;<form:errors path="houseEndTelno" />
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
			<th>detail_adres</th>
			<td>
					<form:input path="detailAdres" cssClass="txt"/>
					&nbsp;<form:errors path="detailAdres" />
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
			<th>offm_telno</th>
			<td>
					<form:input path="offmTelno" cssClass="txt"/>
					&nbsp;<form:errors path="offmTelno" />
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
			<th>email_adres</th>
			<td>
					<form:input path="emailAdres" cssClass="txt"/>
					&nbsp;<form:errors path="emailAdres" />
			</td>
		</tr>	
		<tr>
			<th>house_middle_telno</th>
			<td>
					<form:input path="houseMiddleTelno" cssClass="txt"/>
					&nbsp;<form:errors path="houseMiddleTelno" />
			</td>
		</tr>	
		<tr>
			<th>pstinst_code</th>
			<td>
					<form:input path="pstinstCode" cssClass="txt"/>
					&nbsp;<form:errors path="pstinstCode" />
			</td>
		</tr>	
		<tr>
			<th>emplyr_sttus_code</th>
			<td>
					<form:input path="emplyrSttusCode" cssClass="txt"/>
					&nbsp;<form:errors path="emplyrSttusCode" />
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


<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtnrssRegister.jsp
  * @Description : Comtnrss Register 화면
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
<c:set var="registerFlag" value="${empty comtnrssVO.id ? '등록' : '수정'}"/>
<title> <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="comtnrssVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/comtnrss/ComtnrssList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/comtnrss/deleteComtnrss.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/comtnrss/addComtnrss.do' : '/comtnrss/updateComtnrss.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="comtnrssVO" name="detailForm">
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
			<th>RSS_ID *</th>
			<td>
				<form:input path="rssId" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		<tr>
			<th>RSS_ID *</th>
			<td>
				<form:input path="rssId" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		</c:if>		
		
		<tr>
			<th>TRGET_SVC_NM</th>
			<td>
				<form:input path="trgetSvcNm" cssClass="txt"/>
				&nbsp;<form:errors path="trgetSvcNm" />
			</td>
		</tr>	
		<tr>
			<th>TRGET_SVC_TABLE</th>
			<td>
				<form:input path="trgetSvcTable" cssClass="txt"/>
				&nbsp;<form:errors path="trgetSvcTable" />
			</td>
		</tr>	
		<tr>
			<th>TRGET_SVC_LIST_CO</th>
			<td>
				<form:input path="trgetSvcListCo" cssClass="txt"/>
				&nbsp;<form:errors path="trgetSvcListCo" />
			</td>
		</tr>	
		<tr>
			<th>HDER_TITLE</th>
			<td>
				<form:input path="hderTitle" cssClass="txt"/>
				&nbsp;<form:errors path="hderTitle" />
			</td>
		</tr>	
		<tr>
			<th>HDER_LINK</th>
			<td>
				<form:input path="hderLink" cssClass="txt"/>
				&nbsp;<form:errors path="hderLink" />
			</td>
		</tr>	
		<tr>
			<th>HDER_DC</th>
			<td>
				<form:input path="hderDc" cssClass="txt"/>
				&nbsp;<form:errors path="hderDc" />
			</td>
		</tr>	
		<tr>
			<th>HDER_TAG</th>
			<td>
				<form:input path="hderTag" cssClass="txt"/>
				&nbsp;<form:errors path="hderTag" />
			</td>
		</tr>	
		<tr>
			<th>HDER_ETC</th>
			<td>
				<form:input path="hderEtc" cssClass="txt"/>
				&nbsp;<form:errors path="hderEtc" />
			</td>
		</tr>	
		<tr>
			<th>BDT_TITLE</th>
			<td>
				<form:input path="bdtTitle" cssClass="txt"/>
				&nbsp;<form:errors path="bdtTitle" />
			</td>
		</tr>	
		<tr>
			<th>BDT_LINK</th>
			<td>
				<form:input path="bdtLink" cssClass="txt"/>
				&nbsp;<form:errors path="bdtLink" />
			</td>
		</tr>	
		<tr>
			<th>BDT_DC</th>
			<td>
				<form:input path="bdtDc" cssClass="txt"/>
				&nbsp;<form:errors path="bdtDc" />
			</td>
		</tr>	
		<tr>
			<th>BDT_TAG</th>
			<td>
				<form:input path="bdtTag" cssClass="txt"/>
				&nbsp;<form:errors path="bdtTag" />
			</td>
		</tr>	
		<tr>
			<th>BDT_ETC_TAG</th>
			<td>
				<form:input path="bdtEtcTag" cssClass="txt"/>
				&nbsp;<form:errors path="bdtEtcTag" />
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


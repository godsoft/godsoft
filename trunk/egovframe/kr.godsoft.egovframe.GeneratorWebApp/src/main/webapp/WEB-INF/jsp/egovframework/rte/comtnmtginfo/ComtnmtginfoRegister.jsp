<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtnmtginfoRegister.jsp
  * @Description : Comtnmtginfo Register 화면
  * @Modification Information
  * 
  * @author 이백행
  * @since 2012.03.13
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
<c:set var="registerFlag" value="${empty comtnmtginfoVO.mtgId ? '등록' : '수정'}"/>
<title> <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="comtnmtginfoVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/comtnmtginfo/ComtnmtginfoList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/comtnmtginfo/deleteComtnmtginfo.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/comtnmtginfo/addComtnmtginfo.do' : '/comtnmtginfo/updateComtnmtginfo.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="comtnmtginfoVO" name="detailForm" id="detailForm">
<div id="content_pop">
	<!-- 타이틀 -->
	<div id="title">
		<ul>
			<li><img src="<c:url value='/images/egovframework/rte/title_dot.gif'/>" alt="" /> <c:out value="${registerFlag}"/></li>
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
			<th> *</th>
			<td>
				<form:input path="mtgId" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		<tr>
			<th> *</th>
			<td>
				<form:input path="mtgId" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		</c:if>		
		
		<tr>
			<th></th>
			<td>
	
				<form:input path="mtgNm" cssClass="txt"/>


				&nbsp;<form:errors path="mtgNm" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="mtgMtrCn" cssClass="txt"/>


				&nbsp;<form:errors path="mtgMtrCn" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="mtgSn" cssClass="txt"/>


				&nbsp;<form:errors path="mtgSn" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="mtgCo" cssClass="txt"/>


				&nbsp;<form:errors path="mtgCo" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="mtgDe" cssClass="txt"/>


				&nbsp;<form:errors path="mtgDe" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="mtgPlace" cssClass="txt"/>


				&nbsp;<form:errors path="mtgPlace" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="mtgBeginTm" cssClass="txt"/>


				&nbsp;<form:errors path="mtgBeginTm" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="mtgEndTm" cssClass="txt"/>


				&nbsp;<form:errors path="mtgEndTm" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="clsdrMtgAt" cssClass="txt"/>


				&nbsp;<form:errors path="clsdrMtgAt" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="readngBgnde" cssClass="txt"/>


				&nbsp;<form:errors path="readngBgnde" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="readngAt" cssClass="txt"/>


				&nbsp;<form:errors path="readngAt" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="mtgResultCn" cssClass="txt"/>


				&nbsp;<form:errors path="mtgResultCn" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="mtgResultEnnc" cssClass="txt"/>


				&nbsp;<form:errors path="mtgResultEnnc" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="etcMatter" cssClass="txt"/>


				&nbsp;<form:errors path="etcMatter" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="mngtDeptId" cssClass="txt"/>


				&nbsp;<form:errors path="mngtDeptId" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="mnaerId" cssClass="txt"/>


				&nbsp;<form:errors path="mnaerId" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="mnaerDeptId" cssClass="txt"/>


				&nbsp;<form:errors path="mnaerDeptId" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="mtgAt" cssClass="txt"/>


				&nbsp;<form:errors path="mtgAt" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="nonatdrnCo" cssClass="txt"/>


				&nbsp;<form:errors path="nonatdrnCo" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="atdrnCo" cssClass="txt"/>


				&nbsp;<form:errors path="atdrnCo" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="frstRegistPnttm" cssClass="txt"/>


				&nbsp;<form:errors path="frstRegistPnttm" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="frstRegisterId" cssClass="txt"/>


				&nbsp;<form:errors path="frstRegisterId" />
			</td>
		</tr>	
		<tr>
			<th></th>
			<td>
	
				<form:input path="lastUpdtPnttm" cssClass="txt"/>


				&nbsp;<form:errors path="lastUpdtPnttm" />
			</td>
		</tr>	
		<tr>
			<th></th>
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


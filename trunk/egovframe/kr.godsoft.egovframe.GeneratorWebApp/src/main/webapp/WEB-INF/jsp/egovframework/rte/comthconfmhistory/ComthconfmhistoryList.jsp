<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComthconfmhistoryList.jsp
  * @Description : Comthconfmhistory List 화면
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
<title>comthconfmhistory 목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select(confmNo) {
	document.getElementById("listForm").confmNo.value = confmNo;
   	document.getElementById("listForm").action = "<c:url value='/comthconfmhistory/updateComthconfmhistoryView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/comthconfmhistory/addComthconfmhistoryView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/comthconfmhistory/ComthconfmhistoryList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" id="listForm" method="post">
	<input type="hidden" name="confmNo" />
<div id="content_pop">
	<!-- 타이틀 -->
	<div id="title">
		<ul>
			<li><img src="<c:url value='/images/egovframework/rte/title_dot.gif'/>" alt="title" /> List </li>
		</ul>
	</div>
	<!-- // 타이틀 -->
	<!-- List -->
	<div id="table">
		<table width="100%" border="0" cellpadding="0" cellspacing="0">
			<colgroup>
								<col/>				
								<col/>				
								<col/>				
								<col/>				
								<col/>				
								<col/>				
								<col/>				
								<col/>				
								<col/>				
								<col/>				
							</colgroup>		  
			<tr>
								<th align="center">confm_no</th>
								<th align="center">confm_rqester_id</th>
								<th align="center">confmer_id</th>
								<th align="center">confm_de</th>
								<th align="center">confm_ty_code</th>
								<th align="center">confm_sttus_code</th>
								<th align="center">opert_ty_code</th>
								<th align="center">opert_id</th>
								<th align="center">trget_job_ty_code</th>
								<th align="center">trget_job_id</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
																											
												<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.confmNo}"/>')"><c:out value="${result.confmNo}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.confmRqesterId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.confmerId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.confmDe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.confmTyCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.confmSttusCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.opertTyCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.opertId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.trgetJobTyCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.trgetJobId}"/>&nbsp;</td>
											</tr>
			</c:forEach>
		</table>
	</div>
	<!-- /List -->
	<div id="paging">
		<ui:pagination paginationInfo = "${paginationInfo}"
				   type="image"
				   jsFunction="fn_egov_link_page"
				   />
		<form:hidden path="pageIndex" />
	</div>
	<div id="sysbtn1">
		<ul>
			<li>
				<div id="sysbtn">
					<span class="btn_blue_l"><a href="javascript:fn_egov_addView();">등록</a><img src="<c:url value='/images/egovframework/rte/btn_bg_r.gif'/>" alt="" />
					</span>
				</div>
			</li>
		</ul>
	</div>
</div>
</form:form>
</body>
</html>

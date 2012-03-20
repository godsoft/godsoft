<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtnextrlhrinfoList.jsp
  * @Description : Comtnextrlhrinfo List 화면
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
<title>comtnextrlhrinfo 목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select(eventId, extrlHrId) {
	document.getElementById("listForm").eventId.value = eventId;
	document.getElementById("listForm").extrlHrId.value = extrlHrId;
   	document.getElementById("listForm").action = "<c:url value='/comtnextrlhrinfo/updateComtnextrlhrinfoView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/comtnextrlhrinfo/addComtnextrlhrinfoView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/comtnextrlhrinfo/ComtnextrlhrinfoList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" id="listForm" method="post">
	<input type="hidden" name="eventId" />
	<input type="hidden" name="extrlHrId" />
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
								<col/>				
								<col/>				
								<col/>				
								<col/>				
								<col/>				
							</colgroup>		  
			<tr>
								<th align="center">event_id</th>
								<th align="center">extrl_hr_id</th>
								<th align="center">sexdstn_code</th>
								<th align="center">extrl_hr_nm</th>
								<th align="center">occp_ty_code</th>
								<th align="center">psitn_instt_nm</th>
								<th align="center">brthdy</th>
								<th align="center">area_no</th>
								<th align="center">middle_telno</th>
								<th align="center">end_telno</th>
								<th align="center">email_adres</th>
								<th align="center">frst_regist_pnttm</th>
								<th align="center">frst_register_id</th>
								<th align="center">last_updt_pnttm</th>
								<th align="center">last_updusr_id</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
																																							
												<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.eventId}"/>', '<c:out value="${result.extrlHrId}"/>')"><c:out value="${result.eventId}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.eventId}"/>', '<c:out value="${result.extrlHrId}"/>')"><c:out value="${result.extrlHrId}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.sexdstnCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.extrlHrNm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.occpTyCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.psitnInsttNm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.brthdy}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.areaNo}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.middleTelno}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.endTelno}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.emailAdres}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.frstRegistPnttm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.frstRegisterId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lastUpdtPnttm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lastUpdusrId}"/>&nbsp;</td>
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

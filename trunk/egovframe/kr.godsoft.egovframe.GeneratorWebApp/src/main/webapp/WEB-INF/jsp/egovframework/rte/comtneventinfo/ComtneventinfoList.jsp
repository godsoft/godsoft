<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtneventinfoList.jsp
  * @Description : Comtneventinfo List 화면
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
<title>comtneventinfo 목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select(eventId) {
	document.getElementById("listForm").eventId.value = eventId;
   	document.getElementById("listForm").action = "<c:url value='/comtneventinfo/updateComtneventinfoView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/comtneventinfo/addComtneventinfoView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/comtneventinfo/ComtneventinfoList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" id="listForm" method="post">
	<input type="hidden" name="eventId" />
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
								<col/>				
							</colgroup>		  
			<tr>
								<th align="center">event_id</th>
								<th align="center">bsns_year</th>
								<th align="center">bsns_code</th>
								<th align="center">event_cn</th>
								<th align="center">event_svc_bgnde</th>
								<th align="center">svc_use_nmpr_co</th>
								<th align="center">charger_nm</th>
								<th align="center">prparetg_cn</th>
								<th align="center">frst_regist_pnttm</th>
								<th align="center">frst_register_id</th>
								<th align="center">last_updt_pnttm</th>
								<th align="center">last_updusr_id</th>
								<th align="center">event_svc_endde</th>
								<th align="center">event_ty_code</th>
								<th align="center">event_confm_at</th>
								<th align="center">event_confm_de</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
																											
												<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.eventId}"/>')"><c:out value="${result.eventId}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.bsnsYear}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.bsnsCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.eventCn}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.eventSvcBgnde}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.svcUseNmprCo}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.chargerNm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.prparetgCn}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.frstRegistPnttm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.frstRegisterId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lastUpdtPnttm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lastUpdusrId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.eventSvcEndde}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.eventTyCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.eventConfmAt}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.eventConfmDe}"/>&nbsp;</td>
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

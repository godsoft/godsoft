<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtnwikmnthngreprtList.jsp
  * @Description : Comtnwikmnthngreprt List 화면
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
<title>comtnwikmnthngreprt 목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select(reprtId) {
	document.getElementById("listForm").reprtId.value = reprtId;
   	document.getElementById("listForm").action = "<c:url value='/comtnwikmnthngreprt/updateComtnwikmnthngreprtView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/comtnwikmnthngreprt/addComtnwikmnthngreprtView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/comtnwikmnthngreprt/ComtnwikmnthngreprtList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" id="listForm" method="post">
	<input type="hidden" name="reprtId" />
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
								<col/>				
							</colgroup>		  
			<tr>
								<th align="center">reprt_id</th>
								<th align="center">reprt_se</th>
								<th align="center">reprt_sj</th>
								<th align="center">report_de</th>
								<th align="center">wrter_id</th>
								<th align="center">reportr_id</th>
								<th align="center">report_bgnde</th>
								<th align="center">report_endde</th>
								<th align="center">thswik_report_cn</th>
								<th align="center">nextwik_report_cn</th>
								<th align="center">partclr_matter</th>
								<th align="center">atch_file_id</th>
								<th align="center">confm_dt</th>
								<th align="center">frst_register_id</th>
								<th align="center">frst_regist_pnttm</th>
								<th align="center">last_updusr_id</th>
								<th align="center">last_updt_pnttm</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
																											
												<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.reprtId}"/>')"><c:out value="${result.reprtId}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.reprtSe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.reprtSj}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.reportDe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.wrterId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.reportrId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.reportBgnde}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.reportEndde}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.thswikReportCn}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.nextwikReportCn}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.partclrMatter}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.atchFileId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.confmDt}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.frstRegisterId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.frstRegistPnttm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lastUpdusrId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lastUpdtPnttm}"/>&nbsp;</td>
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

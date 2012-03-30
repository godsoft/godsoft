<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtnadbkList.jsp
  * @Description : Comtnadbk List 화면
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
<title>comtnadbk 목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select(adbkConstntId, adbkId) {
	document.getElementById("listForm").adbkConstntId.value = adbkConstntId;
	document.getElementById("listForm").adbkId.value = adbkId;
   	document.getElementById("listForm").action = "<c:url value='/comtnadbk/updateComtnadbkView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/comtnadbk/addComtnadbkView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/comtnadbk/ComtnadbkList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" id="listForm" method="post">
	<input type="hidden" name="adbkConstntId" />
	<input type="hidden" name="adbkId" />
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
							</colgroup>		  
			<tr>
								<th align="center">emplyr_id</th>
								<th align="center">ncrd_id</th>
								<th align="center">frst_regist_pnttm</th>
								<th align="center">last_updt_pnttm</th>
								<th align="center">frst_register_id</th>
								<th align="center">last_updusr_id</th>
								<th align="center">adbk_constnt_id</th>
								<th align="center">nm</th>
								<th align="center">email_adres</th>
								<th align="center">mbtlnum</th>
								<th align="center">fxnum</th>
								<th align="center">offm_telno</th>
								<th align="center">house_telno</th>
								<th align="center">adbk_id</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
																																							
												<td align="center" class="listtd"><c:out value="${result.emplyrId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.ncrdId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.frstRegistPnttm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lastUpdtPnttm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.frstRegisterId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lastUpdusrId}"/>&nbsp;</td>
																<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.adbkConstntId}"/>', '<c:out value="${result.adbkId}"/>')"><c:out value="${result.adbkConstntId}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.nm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.emailAdres}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mbtlnum}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.fxnum}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.offmTelno}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.houseTelno}"/>&nbsp;</td>
																<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.adbkConstntId}"/>', '<c:out value="${result.adbkId}"/>')"><c:out value="${result.adbkId}"/></a>&nbsp;</td>
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

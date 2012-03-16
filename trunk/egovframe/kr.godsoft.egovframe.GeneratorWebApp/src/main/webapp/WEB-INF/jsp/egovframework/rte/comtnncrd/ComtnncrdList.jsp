<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtnncrdList.jsp
  * @Description : Comtnncrd List 화면
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
<title>목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select(ncrdId) {
	document.getElementById("listForm").ncrdId.value = ncrdId;
   	document.getElementById("listForm").action = "<c:url value='/comtnncrd/updateComtnncrdView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/comtnncrd/addComtnncrdView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/comtnncrd/ComtnncrdList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" method="post">
	<input type="hidden" name="ncrdId" />
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
								<th align="center">NcrdId</th>
								<th align="center">NcrdTrgterId</th>
								<th align="center">Nm</th>
								<th align="center">Telno</th>
								<th align="center">NationNo</th>
								<th align="center">AreaNo</th>
								<th align="center">MiddleTelno</th>
								<th align="center">EndTelno</th>
								<th align="center">Mbtlnum</th>
								<th align="center">IdntfcNo</th>
								<th align="center">MiddleMbtlnum</th>
								<th align="center">EndMbtlnum</th>
								<th align="center">EmailAdres</th>
								<th align="center">CmpnyNm</th>
								<th align="center">DeptNm</th>
								<th align="center">Adres</th>
								<th align="center">DetailAdres</th>
								<th align="center">OfcpsNm</th>
								<th align="center">ClsfNm</th>
								<th align="center">ExtrlUserAt</th>
								<th align="center">OthbcAt</th>
								<th align="center">Rm</th>
								<th align="center">FrstRegistPnttm</th>
								<th align="center">FrstRegisterId</th>
								<th align="center">LastUpdtPnttm</th>
								<th align="center">LastUpdusrId</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
																											
												<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.ncrdId}"/>')"><c:out value="${result.ncrdId}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.ncrdTrgterId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.nm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.telno}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.nationNo}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.areaNo}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.middleTelno}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.endTelno}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mbtlnum}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.idntfcNo}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.middleMbtlnum}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.endMbtlnum}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.emailAdres}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.cmpnyNm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.deptNm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.adres}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.detailAdres}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.ofcpsNm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.clsfNm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.extrlUserAt}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.othbcAt}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.rm}"/>&nbsp;</td>
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

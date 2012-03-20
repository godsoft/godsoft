<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtcadministcodeList.jsp
  * @Description : Comtcadministcode List 화면
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
<title>comtcadministcode 목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select(administZoneSe, administZoneCode) {
	document.getElementById("listForm").administZoneSe.value = administZoneSe;
	document.getElementById("listForm").administZoneCode.value = administZoneCode;
   	document.getElementById("listForm").action = "<c:url value='/comtcadministcode/updateComtcadministcodeView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/comtcadministcode/addComtcadministcodeView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/comtcadministcode/ComtcadministcodeList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" id="listForm" method="post">
	<input type="hidden" name="administZoneSe" />
	<input type="hidden" name="administZoneCode" />
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
							</colgroup>		  
			<tr>
								<th align="center">administ_zone_se</th>
								<th align="center">행정구역코드</th>
								<th align="center">사용여부</th>
								<th align="center">행정구역명</th>
								<th align="center">상위행정구역코드</th>
								<th align="center">생성일자</th>
								<th align="center">폐지일자</th>
								<th align="center">최초등록시점</th>
								<th align="center">최초등록자ID</th>
								<th align="center">최종수정시점</th>
								<th align="center">최종수정자ID</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
																																							
												<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.administZoneSe}"/>', '<c:out value="${result.administZoneCode}"/>')"><c:out value="${result.administZoneSe}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.administZoneSe}"/>', '<c:out value="${result.administZoneCode}"/>')"><c:out value="${result.administZoneCode}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.useAt}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.administZoneNm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.upperAdministZoneCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.creatDe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.ablDe}"/>&nbsp;</td>
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

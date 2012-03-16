<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtngnrlmberList.jsp
  * @Description : Comtngnrlmber List 화면
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
function fn_egov_select(mberId) {
	document.getElementById("listForm").mberId.value = mberId;
   	document.getElementById("listForm").action = "<c:url value='/comtngnrlmber/updateComtngnrlmberView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/comtngnrlmber/addComtngnrlmberView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/comtngnrlmber/ComtngnrlmberList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" method="post">
	<input type="hidden" name="mberId" />
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
							</colgroup>		  
			<tr>
								<th align="center">MberId</th>
								<th align="center">Password</th>
								<th align="center">PasswordHint</th>
								<th align="center">PasswordCnsr</th>
								<th align="center">Ihidnum</th>
								<th align="center">MberNm</th>
								<th align="center">Zip</th>
								<th align="center">Adres</th>
								<th align="center">AreaNo</th>
								<th align="center">MberSttus</th>
								<th align="center">DetailAdres</th>
								<th align="center">EndTelno</th>
								<th align="center">Mbtlnum</th>
								<th align="center">GroupId</th>
								<th align="center">MberFxnum</th>
								<th align="center">MberEmailAdres</th>
								<th align="center">MiddleTelno</th>
								<th align="center">SbscrbDe</th>
								<th align="center">SexdstnCode</th>
								<th align="center">EsntlId</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
																											
												<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.mberId}"/>')"><c:out value="${result.mberId}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.password}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.passwordHint}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.passwordCnsr}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.ihidnum}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mberNm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.zip}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.adres}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.areaNo}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mberSttus}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.detailAdres}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.endTelno}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mbtlnum}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.groupId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mberFxnum}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mberEmailAdres}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.middleTelno}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.sbscrbDe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.sexdstnCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.esntlId}"/>&nbsp;</td>
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

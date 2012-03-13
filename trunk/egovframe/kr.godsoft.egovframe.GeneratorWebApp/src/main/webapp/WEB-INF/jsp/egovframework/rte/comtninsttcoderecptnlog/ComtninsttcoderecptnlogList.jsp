<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtninsttcoderecptnlogList.jsp
  * @Description : Comtninsttcoderecptnlog List 화면
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
<title> 목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select(occrrncDe, insttCode, opertSn) {
	document.getElementById("listForm").occrrncDe.value = occrrncDe;
	document.getElementById("listForm").insttCode.value = insttCode;
	document.getElementById("listForm").opertSn.value = opertSn;
   	document.getElementById("listForm").action = "<c:url value='/comtninsttcoderecptnlog/updateComtninsttcoderecptnlogView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/comtninsttcoderecptnlog/addComtninsttcoderecptnlogView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/comtninsttcoderecptnlog/ComtninsttcoderecptnlogList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" id="listForm" method="post">
	<input type="hidden" name="occrrncDe" />
	<input type="hidden" name="insttCode" />
	<input type="hidden" name="opertSn" />
<div id="content_pop">
	<!-- 타이틀 -->
	<div id="title">
		<ul>
			<li><img src="<c:url value='/images/egovframework/rte/title_dot.gif'/>" alt="title" />  목록</li>
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
								<col/>				
								<col/>				
								<col/>				
								<col/>				
								<col/>				
							</colgroup>		  
			<tr>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
								<th align="center"></th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
																																																			
												<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.occrrncDe}"/>', '<c:out value="${result.insttCode}"/>', '<c:out value="${result.opertSn}"/>')"><c:out value="${result.occrrncDe}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.occrrncDe}"/>', '<c:out value="${result.insttCode}"/>', '<c:out value="${result.opertSn}"/>')"><c:out value="${result.insttCode}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.occrrncDe}"/>', '<c:out value="${result.insttCode}"/>', '<c:out value="${result.opertSn}"/>')"><c:out value="${result.opertSn}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.changeSeCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.processSe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.etcCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.allInsttNm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lowestInsttNm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.insttAbrvNm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.odr}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.ord}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.insttOdr}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.upperInsttCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.bestInsttCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.reprsntInsttCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.insttTyLclas}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.insttTyMlsfc}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.insttTySclas}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.telno}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.fxnum}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.creatDe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.ablDe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.ablEnnc}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.changeDe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.changeTime}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.bsisDe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.sortOrdr}"/>&nbsp;</td>
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

<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComthemplyrinfochangedtlsList.jsp
  * @Description : Comthemplyrinfochangedtls List 화면
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
<title>comthemplyrinfochangedtls 목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select(emplyrId, changeDe) {
	document.getElementById("listForm").emplyrId.value = emplyrId;
	document.getElementById("listForm").changeDe.value = changeDe;
   	document.getElementById("listForm").action = "<c:url value='/comthemplyrinfochangedtls/updateComthemplyrinfochangedtlsView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/comthemplyrinfochangedtls/addComthemplyrinfochangedtlsView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/comthemplyrinfochangedtls/ComthemplyrinfochangedtlsList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" id="listForm" method="post">
	<input type="hidden" name="emplyrId" />
	<input type="hidden" name="changeDe" />
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
								<th align="center">emplyr_id</th>
								<th align="center">change_de</th>
								<th align="center">orgnzt_id</th>
								<th align="center">group_id</th>
								<th align="center">empl_no</th>
								<th align="center">sexdstn_code</th>
								<th align="center">brthdy</th>
								<th align="center">fxnum</th>
								<th align="center">house_adres</th>
								<th align="center">house_end_telno</th>
								<th align="center">area_no</th>
								<th align="center">detail_adres</th>
								<th align="center">zip</th>
								<th align="center">offm_telno</th>
								<th align="center">mbtlnum</th>
								<th align="center">email_adres</th>
								<th align="center">house_middle_telno</th>
								<th align="center">pstinst_code</th>
								<th align="center">emplyr_sttus_code</th>
								<th align="center">esntl_id</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
																																							
												<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.emplyrId}"/>', '<c:out value="${result.changeDe}"/>')"><c:out value="${result.emplyrId}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.emplyrId}"/>', '<c:out value="${result.changeDe}"/>')"><c:out value="${result.changeDe}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.orgnztId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.groupId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.emplNo}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.sexdstnCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.brthdy}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.fxnum}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.houseAdres}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.houseEndTelno}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.areaNo}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.detailAdres}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.zip}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.offmTelno}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mbtlnum}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.emailAdres}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.houseMiddleTelno}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.pstinstCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.emplyrSttusCode}"/>&nbsp;</td>
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

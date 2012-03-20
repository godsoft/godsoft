<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtcadministcoderecptnlogList.jsp
  * @Description : Comtcadministcoderecptnlog List 화면
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
<title>comtcadministcoderecptnlog 목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select(occrrncDe, administZoneSe, administZoneCode, opertSn) {
	document.getElementById("listForm").occrrncDe.value = occrrncDe;
	document.getElementById("listForm").administZoneSe.value = administZoneSe;
	document.getElementById("listForm").administZoneCode.value = administZoneCode;
	document.getElementById("listForm").opertSn.value = opertSn;
   	document.getElementById("listForm").action = "<c:url value='/comtcadministcoderecptnlog/updateComtcadministcoderecptnlogView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/comtcadministcoderecptnlog/addComtcadministcoderecptnlogView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/comtcadministcoderecptnlog/ComtcadministcoderecptnlogList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" id="listForm" method="post">
	<input type="hidden" name="occrrncDe" />
	<input type="hidden" name="administZoneSe" />
	<input type="hidden" name="administZoneCode" />
	<input type="hidden" name="opertSn" />
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
							</colgroup>		  
			<tr>
								<th align="center">occrrnc_de</th>
								<th align="center">administ_zone_se</th>
								<th align="center">administ_zone_code</th>
								<th align="center">opert_sn</th>
								<th align="center">change_se_code</th>
								<th align="center">process_se</th>
								<th align="center">administ_zone_nm</th>
								<th align="center">lowest_administ_zone_nm</th>
								<th align="center">ctprvn_code</th>
								<th align="center">signgu_code</th>
								<th align="center">emd_code</th>
								<th align="center">li_code</th>
								<th align="center">creat_de</th>
								<th align="center">abl_de</th>
								<th align="center">abl_ennc</th>
								<th align="center">frst_register_id</th>
								<th align="center">frst_regist_pnttm</th>
								<th align="center">last_updusr_id</th>
								<th align="center">last_updt_pnttm</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
																																																															
												<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.occrrncDe}"/>', '<c:out value="${result.administZoneSe}"/>', '<c:out value="${result.administZoneCode}"/>', '<c:out value="${result.opertSn}"/>')"><c:out value="${result.occrrncDe}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.occrrncDe}"/>', '<c:out value="${result.administZoneSe}"/>', '<c:out value="${result.administZoneCode}"/>', '<c:out value="${result.opertSn}"/>')"><c:out value="${result.administZoneSe}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.occrrncDe}"/>', '<c:out value="${result.administZoneSe}"/>', '<c:out value="${result.administZoneCode}"/>', '<c:out value="${result.opertSn}"/>')"><c:out value="${result.administZoneCode}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.occrrncDe}"/>', '<c:out value="${result.administZoneSe}"/>', '<c:out value="${result.administZoneCode}"/>', '<c:out value="${result.opertSn}"/>')"><c:out value="${result.opertSn}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.changeSeCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.processSe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.administZoneNm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lowestAdministZoneNm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.ctprvnCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.signguCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.emdCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.liCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.creatDe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.ablDe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.ablEnnc}"/>&nbsp;</td>
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

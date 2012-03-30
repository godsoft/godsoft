<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtnctsnnmanageList.jsp
  * @Description : Comtnctsnnmanage List 화면
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
<title>comtnctsnnmanage 목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select(ctsnnId) {
	document.getElementById("listForm").ctsnnId.value = ctsnnId;
   	document.getElementById("listForm").action = "<c:url value='/comtnctsnnmanage/updateComtnctsnnmanageView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/comtnctsnnmanage/addComtnctsnnmanageView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/comtnctsnnmanage/ComtnctsnnmanageList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" id="listForm" method="post">
	<input type="hidden" name="ctsnnId" />
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
								<th align="center">ctsnn_id</th>
								<th align="center">user_id</th>
								<th align="center">ctsnn_code</th>
								<th align="center">reqst_de</th>
								<th align="center">ctsnn_nm</th>
								<th align="center">trgter_nm</th>
								<th align="center">brthdy</th>
								<th align="center">occrrnc_de</th>
								<th align="center">relate</th>
								<th align="center">rm</th>
								<th align="center">sanctner_id</th>
								<th align="center">confm_at</th>
								<th align="center">sanctn_dt</th>
								<th align="center">return_resn</th>
								<th align="center">infrml_sanctn_id</th>
								<th align="center">frst_register_id</th>
								<th align="center">frst_regist_pnttm</th>
								<th align="center">last_updusr_id</th>
								<th align="center">last_updt_pnttm</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
																											
												<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.ctsnnId}"/>')"><c:out value="${result.ctsnnId}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.userId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.ctsnnCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.reqstDe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.ctsnnNm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.trgterNm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.brthdy}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.occrrncDe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.relate}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.rm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.sanctnerId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.confmAt}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.sanctnDt}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.returnResn}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.infrmlSanctnId}"/>&nbsp;</td>
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

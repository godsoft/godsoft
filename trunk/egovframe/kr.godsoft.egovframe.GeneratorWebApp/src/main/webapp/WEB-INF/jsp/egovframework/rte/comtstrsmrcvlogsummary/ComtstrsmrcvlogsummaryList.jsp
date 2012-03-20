<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtstrsmrcvlogsummaryList.jsp
  * @Description : Comtstrsmrcvlogsummary List 화면
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
<title>comtstrsmrcvlogsummary 목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select(occrrncDe, trsmrcvSeCode, provdInsttId, provdSysId, provdSvcId, requstInsttId, requstSysId) {
	document.getElementById("listForm").occrrncDe.value = occrrncDe;
	document.getElementById("listForm").trsmrcvSeCode.value = trsmrcvSeCode;
	document.getElementById("listForm").provdInsttId.value = provdInsttId;
	document.getElementById("listForm").provdSysId.value = provdSysId;
	document.getElementById("listForm").provdSvcId.value = provdSvcId;
	document.getElementById("listForm").requstInsttId.value = requstInsttId;
	document.getElementById("listForm").requstSysId.value = requstSysId;
   	document.getElementById("listForm").action = "<c:url value='/comtstrsmrcvlogsummary/updateComtstrsmrcvlogsummaryView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/comtstrsmrcvlogsummary/addComtstrsmrcvlogsummaryView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/comtstrsmrcvlogsummary/ComtstrsmrcvlogsummaryList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" id="listForm" method="post">
	<input type="hidden" name="occrrncDe" />
	<input type="hidden" name="trsmrcvSeCode" />
	<input type="hidden" name="provdInsttId" />
	<input type="hidden" name="provdSysId" />
	<input type="hidden" name="provdSvcId" />
	<input type="hidden" name="requstInsttId" />
	<input type="hidden" name="requstSysId" />
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
							</colgroup>		  
			<tr>
								<th align="center">occrrnc_de</th>
								<th align="center">trsmrcv_se_code</th>
								<th align="center">provd_instt_id</th>
								<th align="center">provd_sys_id</th>
								<th align="center">provd_svc_id</th>
								<th align="center">requst_instt_id</th>
								<th align="center">requst_sys_id</th>
								<th align="center">rdcnt</th>
								<th align="center">error_co</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
																																																																																																			
												<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.occrrncDe}"/>', '<c:out value="${result.trsmrcvSeCode}"/>', '<c:out value="${result.provdInsttId}"/>', '<c:out value="${result.provdSysId}"/>', '<c:out value="${result.provdSvcId}"/>', '<c:out value="${result.requstInsttId}"/>', '<c:out value="${result.requstSysId}"/>')"><c:out value="${result.occrrncDe}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.occrrncDe}"/>', '<c:out value="${result.trsmrcvSeCode}"/>', '<c:out value="${result.provdInsttId}"/>', '<c:out value="${result.provdSysId}"/>', '<c:out value="${result.provdSvcId}"/>', '<c:out value="${result.requstInsttId}"/>', '<c:out value="${result.requstSysId}"/>')"><c:out value="${result.trsmrcvSeCode}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.occrrncDe}"/>', '<c:out value="${result.trsmrcvSeCode}"/>', '<c:out value="${result.provdInsttId}"/>', '<c:out value="${result.provdSysId}"/>', '<c:out value="${result.provdSvcId}"/>', '<c:out value="${result.requstInsttId}"/>', '<c:out value="${result.requstSysId}"/>')"><c:out value="${result.provdInsttId}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.occrrncDe}"/>', '<c:out value="${result.trsmrcvSeCode}"/>', '<c:out value="${result.provdInsttId}"/>', '<c:out value="${result.provdSysId}"/>', '<c:out value="${result.provdSvcId}"/>', '<c:out value="${result.requstInsttId}"/>', '<c:out value="${result.requstSysId}"/>')"><c:out value="${result.provdSysId}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.occrrncDe}"/>', '<c:out value="${result.trsmrcvSeCode}"/>', '<c:out value="${result.provdInsttId}"/>', '<c:out value="${result.provdSysId}"/>', '<c:out value="${result.provdSvcId}"/>', '<c:out value="${result.requstInsttId}"/>', '<c:out value="${result.requstSysId}"/>')"><c:out value="${result.provdSvcId}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.occrrncDe}"/>', '<c:out value="${result.trsmrcvSeCode}"/>', '<c:out value="${result.provdInsttId}"/>', '<c:out value="${result.provdSysId}"/>', '<c:out value="${result.provdSvcId}"/>', '<c:out value="${result.requstInsttId}"/>', '<c:out value="${result.requstSysId}"/>')"><c:out value="${result.requstInsttId}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.occrrncDe}"/>', '<c:out value="${result.trsmrcvSeCode}"/>', '<c:out value="${result.provdInsttId}"/>', '<c:out value="${result.provdSysId}"/>', '<c:out value="${result.provdSvcId}"/>', '<c:out value="${result.requstInsttId}"/>', '<c:out value="${result.requstSysId}"/>')"><c:out value="${result.requstSysId}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.rdcnt}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.errorCo}"/>&nbsp;</td>
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

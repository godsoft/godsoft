<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtnmtginfoList.jsp
  * @Description : Comtnmtginfo List 화면
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
<title>comtnmtginfo 목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select(mtgId) {
	document.getElementById("listForm").mtgId.value = mtgId;
   	document.getElementById("listForm").action = "<c:url value='/comtnmtginfo/updateComtnmtginfoView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/comtnmtginfo/addComtnmtginfoView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/comtnmtginfo/ComtnmtginfoList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" id="listForm" method="post">
	<input type="hidden" name="mtgId" />
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
							</colgroup>		  
			<tr>
								<th align="center">mtg_id</th>
								<th align="center">mtg_nm</th>
								<th align="center">mtg_mtr_cn</th>
								<th align="center">mtg_sn</th>
								<th align="center">mtg_co</th>
								<th align="center">mtg_de</th>
								<th align="center">mtg_place</th>
								<th align="center">mtg_begin_tm</th>
								<th align="center">mtg_end_tm</th>
								<th align="center">clsdr_mtg_at</th>
								<th align="center">readng_bgnde</th>
								<th align="center">readng_at</th>
								<th align="center">mtg_result_cn</th>
								<th align="center">mtg_result_ennc</th>
								<th align="center">etc_matter</th>
								<th align="center">mngt_dept_id</th>
								<th align="center">mnaer_id</th>
								<th align="center">mnaer_dept_id</th>
								<th align="center">mtg_at</th>
								<th align="center">nonatdrn_co</th>
								<th align="center">atdrn_co</th>
								<th align="center">frst_regist_pnttm</th>
								<th align="center">frst_register_id</th>
								<th align="center">last_updt_pnttm</th>
								<th align="center">last_updusr_id</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
																											
												<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.mtgId}"/>')"><c:out value="${result.mtgId}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mtgNm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mtgMtrCn}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mtgSn}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mtgCo}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mtgDe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mtgPlace}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mtgBeginTm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mtgEndTm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.clsdrMtgAt}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.readngBgnde}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.readngAt}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mtgResultCn}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mtgResultEnnc}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.etcMatter}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mngtDeptId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mnaerId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mnaerDeptId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.mtgAt}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.nonatdrnCo}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.atdrnCo}"/>&nbsp;</td>
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

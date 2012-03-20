<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtndamknoifmList.jsp
  * @Description : Comtndamknoifm List 화면
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
<title>comtndamknoifm 목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select(knwldgId) {
	document.getElementById("listForm").knwldgId.value = knwldgId;
   	document.getElementById("listForm").action = "<c:url value='/comtndamknoifm/updateComtndamknoifmView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/comtndamknoifm/addComtndamknoifmView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/comtndamknoifm/ComtndamknoifmList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" id="listForm" method="post">
	<input type="hidden" name="knwldgId" />
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
							</colgroup>		  
			<tr>
								<th align="center">knwldg_id</th>
								<th align="center">knwldg_ty_code</th>
								<th align="center">orgnzt_id</th>
								<th align="center">expert_id</th>
								<th align="center">emplyr_id</th>
								<th align="center">knwldg_nm</th>
								<th align="center">knwldg_cn</th>
								<th align="center">kwrd</th>
								<th align="center">othbc_at</th>
								<th align="center">knwldg_evl</th>
								<th align="center">colct_de</th>
								<th align="center">evl_de</th>
								<th align="center">atch_file_id</th>
								<th align="center">frst_register_id</th>
								<th align="center">frst_regist_pnttm</th>
								<th align="center">last_updusr_id</th>
								<th align="center">last_updt_pnttm</th>
								<th align="center">dsuse_de</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
																											
												<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.knwldgId}"/>')"><c:out value="${result.knwldgId}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.knwldgTyCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.orgnztId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.expertId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.emplyrId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.knwldgNm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.knwldgCn}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.kwrd}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.othbcAt}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.knwldgEvl}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.colctDe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.evlDe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.atchFileId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.frstRegisterId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.frstRegistPnttm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lastUpdusrId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lastUpdtPnttm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.dsuseDe}"/>&nbsp;</td>
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

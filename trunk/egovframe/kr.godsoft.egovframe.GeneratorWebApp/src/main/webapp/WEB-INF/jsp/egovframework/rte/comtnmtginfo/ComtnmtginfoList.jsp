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
<form:form commandName="searchVO" name="listForm" method="post">
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
								<th align="center">MtgId</th>
								<th align="center">MtgNm</th>
								<th align="center">MtgMtrCn</th>
								<th align="center">MtgSn</th>
								<th align="center">MtgCo</th>
								<th align="center">MtgDe</th>
								<th align="center">MtgPlace</th>
								<th align="center">MtgBeginTm</th>
								<th align="center">MtgEndTm</th>
								<th align="center">ClsdrMtgAt</th>
								<th align="center">ReadngBgnde</th>
								<th align="center">ReadngAt</th>
								<th align="center">MtgResultCn</th>
								<th align="center">MtgResultEnnc</th>
								<th align="center">EtcMatter</th>
								<th align="center">MngtDeptId</th>
								<th align="center">MnaerId</th>
								<th align="center">MnaerDeptId</th>
								<th align="center">MtgAt</th>
								<th align="center">NonatdrnCo</th>
								<th align="center">AtdrnCo</th>
								<th align="center">FrstRegistPnttm</th>
								<th align="center">FrstRegisterId</th>
								<th align="center">LastUpdtPnttm</th>
								<th align="center">LastUpdusrId</th>
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

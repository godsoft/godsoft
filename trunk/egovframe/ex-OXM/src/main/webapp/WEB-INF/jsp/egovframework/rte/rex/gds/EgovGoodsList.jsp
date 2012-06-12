<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
/**
 * @JSP Name : EgovGoodsList.jsp
 * @Description : 카테고리 리스트 화면
 * @Modification Information
 * 
 *   수정일         수정자                   수정내용
 *  -------    --------    ---------------------------
 *  2011.07.11  신혜연          최초 생성
 *
 * author 실행환경팀 
 * Copyright (C) 2011 by MOPAS  All right reserved.
 */
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
<meta http-equiv="content-language" content="ko">
<title>상품 목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/egov.css'/>">
<script type="text/javaScript" language="javascript" defer="defer">

/* 검색 후 리스트화면 function */
function fn_egov_selectList() {
	document.listForm.action = "<c:url value='/gds/selectListGoods.do'/>";
   	document.listForm.submit();
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.listForm.pageIndex.value = pageNo;
	document.listForm.action = "<c:url value='/gds/selectListGoods.do'/>";
   	document.listForm.submit();
}

/* xml 변환 페이지 링크 function */
function fn_egov_xml(){
	document.listForm.action = "<c:url value='/gds/viewXML.do'/>";
   	document.listForm.submit();
}

/* excel download function */
function fn_egov_excel(){
	document.listForm.action = "<c:url value='/gds/excelDownload.do'/>";
   	document.listForm.submit();
}


</script>
</head>
<body style="text-align:center; margin:0 auto; display:inline; padding-top:100px;">
<!-- content 시작 -->
<div id="content_pop">
<form:form commandName="searchVO" name="listForm" method="post">
<input type="hidden" name="selectedId" />
	<!-- 타이틀 -->
	<div id="title">
		<ul>
			<li><img src="<c:url value='/images/egovframework/rte/title_dot.gif'/>" alt=""/> <spring:message code="goods.list.title" /> </li>
		</ul>
	</div>
	<!-- // 타이틀 -->
	<div id="search">
		<ul>
		<li>
			<spring:message code="goods.goodsNm"/>			
		</li>
		<li><form:input path="searchKeyword" cssClass="txt" title="품목 명"/></li>
		<li><span class="btn_blue_l" title="<spring:message code="button.search" />"><a href="#link" onClick="fn_egov_selectList(); return false;"><spring:message code="button.search" /></a><img src="<c:url value='/images/egovframework/rte/btn_bg_r.gif'/>" style="margin-left:6px;" alt="검색"/></span></li></ul>		
	</div>
	
	<!-- List -->
	<div id="table">
		<table width="100%" border="0" cellpadding="0" cellspacing="0"  summary="품목을 확인 할 수 있습니다.">
		<caption>품목 리스트</caption>
			<colgroup>
				<col width="60" >				
				<col width="100" >
				<col width="400" >
				<col width="120" >
			</colgroup>	
			<thead>	  
			<tr>
				<th align="center"><spring:message code="goods.header.no" /></th>
				<th align="center"><spring:message code="goods.header.image" /></th>
				<th align="center"><spring:message code="goods.header.name" /></th>
				<th align="center"><spring:message code="goods.header.price" /></th>
			</tr>
			</thead>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
				<td align="center" class="listtd"><c:out value="${(paginationInfo.currentPageNo - 1) * paginationInfo.pageSize + status.count}"/></td>
				<td align="left" class="listtd"><img src="<c:url value='/GoodsImage/${result.goodsImageId}'/>" style="margin-left:6px;" height="100" width="100" alt="image"/>&nbsp;</td>
				<td align="center" class="listtd"><c:out value="${result.goodsNm}"/>&nbsp;</td>
				<td align="center" class="listtd"><c:out value="${result.price}"/><spring:message code="cart.won" /></td>
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
		<div id="sysbtn">
			<ul>
				<li><span class="btn_blue_l" title="xml"><a href="#link" onClick="fn_egov_xml(); return false;">xml</a><img src="<c:url value='/images/egovframework/rte/btn_bg_r.gif'/>" style="margin-left:6px;" alt="xml"/></span></li>
				<li><input type="submit" style="display:none" title="submit"/></li>
			</ul>
		</div>
</form:form>
</div>

<!-- //content 끝-->
</body>
</html>

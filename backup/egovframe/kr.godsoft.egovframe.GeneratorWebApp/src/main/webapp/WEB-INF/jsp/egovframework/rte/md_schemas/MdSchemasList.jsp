<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : MdSchemasList.jsp
  * @Description : MdSchemas List 화면
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
<title>This is the holder for schemas 목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select(id) {
	document.getElementById("listForm").id.value = id;
   	document.getElementById("listForm").action = "<c:url value='/mdSchemas/updateMdSchemasView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/mdSchemas/addMdSchemasView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/mdSchemas/MdSchemasList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" id="listForm" method="post">
	<input type="hidden" name="id" />
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
							</colgroup>		  
			<tr>
								<th align="center">Primary Key</th>
								<th align="center">Catalog to which this schema blongs //PARENTFIELD</th>
								<th align="center">Name of the schema //OBJECTNAME</th>
								<th align="center">Type of this schema.  Eaxamples are 'CAPTURED' OR 'CONVERTED'</th>
								<th align="center">The characterset of this schema</th>
								<th align="center">A version string that can be used for tagging/baseling a schema</th>
								<th align="center">The native SQL used to create this schema</th>
								<th align="center">A unique identifier that this schema is known as in its source state.</th>
								<th align="center">comments</th>
								<th align="center">security_group_id</th>
								<th align="center">created_on</th>
								<th align="center">created_by</th>
								<th align="center">last_updated_on</th>
								<th align="center">last_updated_by</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
																											
												<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.id}"/>')"><c:out value="${result.id}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.catalogIdFk}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.name}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.type}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.characterSet}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.versionTag}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.nativeSql}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.nativeKey}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.comments}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.securityGroupId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.createdOn}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.createdBy}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lastUpdatedOn}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lastUpdatedBy}"/>&nbsp;</td>
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

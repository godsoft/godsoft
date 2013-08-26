<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtncnsltlistList.jsp
  * @Description : Comtncnsltlist List 화면
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
<title>comtncnsltlist 목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select(cnsltId) {
	document.getElementById("listForm").cnsltId.value = cnsltId;
   	document.getElementById("listForm").action = "<c:url value='/comtncnsltlist/updateComtncnsltlistView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* 글 등록 화면 function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/comtncnsltlist/addComtncnsltlistView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/comtncnsltlist/ComtncnsltlistList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" id="listForm" method="post">
	<input type="hidden" name="cnsltId" />
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
							</colgroup>		  
			<tr>
								<th align="center">cnslt_id</th>
								<th align="center">cnslt_sj</th>
								<th align="center">othbc_at</th>
								<th align="center">email_adres</th>
								<th align="center">cnslt_cn</th>
								<th align="center">managt_cn</th>
								<th align="center">managt_de</th>
								<th align="center">rdcnt</th>
								<th align="center">atch_file_id</th>
								<th align="center">frst_regist_pnttm</th>
								<th align="center">frst_register_id</th>
								<th align="center">last_updt_pnttm</th>
								<th align="center">last_updusr_id</th>
								<th align="center">area_no</th>
								<th align="center">middle_telno</th>
								<th align="center">end_telno</th>
								<th align="center">frst_mbtlnum</th>
								<th align="center">middle_mbtlnum</th>
								<th align="center">end_mbtlnum</th>
								<th align="center">writng_de</th>
								<th align="center">wrter_nm</th>
								<th align="center">email_answer_at</th>
								<th align="center">qna_process_sttus_code</th>
								<th align="center">writng_password</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
																											
												<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.cnsltId}"/>')"><c:out value="${result.cnsltId}"/></a>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.cnsltSj}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.othbcAt}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.emailAdres}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.cnsltCn}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.managtCn}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.managtDe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.rdcnt}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.atchFileId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.frstRegistPnttm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.frstRegisterId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lastUpdtPnttm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.lastUpdusrId}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.areaNo}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.middleTelno}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.endTelno}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.frstMbtlnum}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.middleMbtlnum}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.endMbtlnum}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.writngDe}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.wrterNm}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.emailAnswerAt}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.qnaProcessSttusCode}"/>&nbsp;</td>
																<td align="center" class="listtd"><c:out value="${result.writngPassword}"/>&nbsp;</td>
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

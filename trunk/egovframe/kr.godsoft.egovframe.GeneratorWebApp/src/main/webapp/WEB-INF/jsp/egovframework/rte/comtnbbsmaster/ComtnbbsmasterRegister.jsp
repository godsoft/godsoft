<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtnbbsmasterRegister.jsp
  * @Description : Comtnbbsmaster Register 화면
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
<c:set var="registerFlag" value="${empty comtnbbsmasterVO.bbsId ? '등록' : '수정'}"/>
<title>comtnbbsmaster <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="comtnbbsmasterVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/comtnbbsmaster/ComtnbbsmasterList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 삭제 function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/comtnbbsmaster/deleteComtnbbsmaster.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* 글 등록 function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validation기능 보완 */
	
  	frm.action = "<c:url value="${registerFlag == '등록' ? '/comtnbbsmaster/addComtnbbsmaster.do' : '/comtnbbsmaster/updateComtnbbsmaster.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="comtnbbsmasterVO" name="detailForm" id="detailForm">
<div id="content_pop">
	<!-- 타이틀 -->
	<div id="title">
		<ul>
			<li><img src="<c:url value='/images/egovframework/rte/title_dot.gif'/>" alt="" /><c:out value="${registerFlag}"/></li>
		</ul>
	</div>
	<!-- // 타이틀 -->
	<div id="table">
	<table width="100%" border="1" cellpadding="0" cellspacing="0" >
		<colgroup>
			<col width="150"/>
			<col width=""/>
		</colgroup>
			
		<c:if test="${registerFlag == '수정'}">
		<tr>
			<th>bbs_id *</th>
			<td>
				<form:input path="bbsId" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>					
		</c:if>
		<c:if test="${registerFlag == '등록'}">
		<tr>
			<th>bbs_id *</th>
			<td>
				<form:input path="bbsId" cssClass="txt" readonly="false" />
			</td>			
		</tr>					
		</c:if>		
		
		<tr>
			<th>bbs_nm</th>
			<td>
				<form:input path="bbsNm" cssClass="txt"/>
				&nbsp;<form:errors path="bbsNm" />
			</td>
		</tr>	
		<tr>
			<th>bbs_intrcn</th>
			<td>
				<form:input path="bbsIntrcn" cssClass="txt"/>
				&nbsp;<form:errors path="bbsIntrcn" />
			</td>
		</tr>	
		<tr>
			<th>bbs_ty_code</th>
			<td>
				<form:input path="bbsTyCode" cssClass="txt"/>
				&nbsp;<form:errors path="bbsTyCode" />
			</td>
		</tr>	
		<tr>
			<th>bbs_attrb_code</th>
			<td>
				<form:input path="bbsAttrbCode" cssClass="txt"/>
				&nbsp;<form:errors path="bbsAttrbCode" />
			</td>
		</tr>	
		<tr>
			<th>reply_posbl_at</th>
			<td>
				<form:input path="replyPosblAt" cssClass="txt"/>
				&nbsp;<form:errors path="replyPosblAt" />
			</td>
		</tr>	
		<tr>
			<th>file_atch_posbl_at</th>
			<td>
				<form:input path="fileAtchPosblAt" cssClass="txt"/>
				&nbsp;<form:errors path="fileAtchPosblAt" />
			</td>
		</tr>	
		<tr>
			<th>atch_posbl_file_number</th>
			<td>
				<form:input path="atchPosblFileNumber" cssClass="txt"/>
				&nbsp;<form:errors path="atchPosblFileNumber" />
			</td>
		</tr>	
		<tr>
			<th>atch_posbl_file_size</th>
			<td>
				<form:input path="atchPosblFileSize" cssClass="txt"/>
				&nbsp;<form:errors path="atchPosblFileSize" />
			</td>
		</tr>	
		<tr>
			<th>use_at</th>
			<td>
				<form:input path="useAt" cssClass="txt"/>
				&nbsp;<form:errors path="useAt" />
			</td>
		</tr>	
		<tr>
			<th>tmplat_id</th>
			<td>
				<form:input path="tmplatId" cssClass="txt"/>
				&nbsp;<form:errors path="tmplatId" />
			</td>
		</tr>	
		<tr>
			<th>frst_register_id</th>
			<td>
				<form:input path="frstRegisterId" cssClass="txt"/>
				&nbsp;<form:errors path="frstRegisterId" />
			</td>
		</tr>	
		<tr>
			<th>frst_regist_pnttm</th>
			<td>
				<form:input path="frstRegistPnttm" cssClass="txt"/>
				&nbsp;<form:errors path="frstRegistPnttm" />
			</td>
		</tr>	
		<tr>
			<th>last_updusr_id</th>
			<td>
				<form:input path="lastUpdusrId" cssClass="txt"/>
				&nbsp;<form:errors path="lastUpdusrId" />
			</td>
		</tr>	
		<tr>
			<th>last_updt_pnttm</th>
			<td>
				<form:input path="lastUpdtPnttm" cssClass="txt"/>
				&nbsp;<form:errors path="lastUpdtPnttm" />
			</td>
		</tr>	
	</table>
  </div>
	<div id="sysbtn">
		<ul>
			<li><span class="btn_blue_l"><a href="javascript:fn_egov_selectList();">List</a><img src="<c:url value='/images/egovframework/rte/btn_bg_r.gif'/>" alt="" /></span></li>
			<li><span class="btn_blue_l"><a href="javascript:fn_egov_save();"><c:out value='${registerFlag}'/></a><img src="<c:url value='/images/egovframework/rte/btn_bg_r.gif'/>" alt="" /></span></li>
			<c:if test="${registerFlag == '수정'}">
			<li><span class="btn_blue_l"><a href="javascript:fn_egov_delete();">삭제</a><img src="<c:url value='/images/egovframework/rte/btn_bg_r.gif'/>" alt="" /></span></li>
			</c:if>
			<li><span class="btn_blue_l"><a href="javascript:document.getElementById("detailForm").reset();">Reset</a><img src="<c:url value='/images/egovframework/rte/btn_bg_r.gif'/>" alt="" /></span></li></ul>
	</div>
</div>
<!-- 검색조건 유지 -->
<input type="hidden" name="searchCondition" value="<c:out value='${searchVO.searchCondition}'/>"/>
<input type="hidden" name="searchKeyword" value="<c:out value='${searchVO.searchKeyword}'/>"/>
<input type="hidden" name="pageIndex" value="<c:out value='${searchVO.pageIndex}'/>"/>
</form:form>
</body>
</html>


<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtnsyslogRegister.jsp
  * @Description : Comtnsyslog Register 화면
  * @Modification Information
  *
  * @author 이백행
  * @since 2013-01-13
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
<c:set var="registerFlag" value="${empty comtnsyslogVO.requstId ? '등록' : '수정'}"/>
<title> <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="comtnsyslogVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
    document.getElementById("detailForm").action = "<c:url value='/comtnsyslog/selectComtnsyslogList.do'/>";
    document.getElementById("detailForm").method = "get";
    document.getElementById("detailForm").submit();
}

/* 글 삭제 function */
function fn_egov_delete() {
    document.getElementById("detailForm").action = "<c:url value='/comtnsyslog/deleteComtnsyslog.do'/>";
    document.getElementById("detailForm").submit();
}

/* 글 등록 function */
function fn_egov_save() {
    var form = document.getElementById("detailForm");

    /* TODO Validation기능 보완 */
    form.action = "<c:url value="${registerFlag == '등록' ? '/comtnsyslog/addComtnsyslog.do' : '/comtnsyslog/updateComtnsyslog.do'}"/>";
    form.submit();
}
//-->
</script>
</head>
<body>

<form:form commandName="comtnsyslogVO" name="detailForm" id="detailForm">
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
            <th>requst_id *</th>
            <td>
                <form:input path="requstId" cssClass="essentiality" readonly="true" />
            </td>
        </tr>
        </c:if>
        <c:if test="${registerFlag == '등록'}">
        <tr>
            <th>requst_id *</th>
            <td>
                <form:input path="requstId" cssClass="txt" readonly="false" />
            </td>
        </tr>
        </c:if>
        
        <tr>
            <th>job_se_code</th>
            <td>
                <form:input path="jobSeCode" cssClass="txt"/>
                &nbsp;<form:errors path="jobSeCode" />
            </td>
        </tr>
        <tr>
            <th>instt_code</th>
            <td>
                <form:input path="insttCode" cssClass="txt"/>
                &nbsp;<form:errors path="insttCode" />
            </td>
        </tr>
        <tr>
            <th>occrrnc_de</th>
            <td>
                <form:input path="occrrncDe" cssClass="txt"/>
                &nbsp;<form:errors path="occrrncDe" />
            </td>
        </tr>
        <tr>
            <th>rqester_ip</th>
            <td>
                <form:input path="rqesterIp" cssClass="txt"/>
                &nbsp;<form:errors path="rqesterIp" />
            </td>
        </tr>
        <tr>
            <th>rqester_id</th>
            <td>
                <form:input path="rqesterId" cssClass="txt"/>
                &nbsp;<form:errors path="rqesterId" />
            </td>
        </tr>
        <tr>
            <th>trget_menu_nm</th>
            <td>
                <form:input path="trgetMenuNm" cssClass="txt"/>
                &nbsp;<form:errors path="trgetMenuNm" />
            </td>
        </tr>
        <tr>
            <th>svc_nm</th>
            <td>
                <form:input path="svcNm" cssClass="txt"/>
                &nbsp;<form:errors path="svcNm" />
            </td>
        </tr>
        <tr>
            <th>method_nm</th>
            <td>
                <form:input path="methodNm" cssClass="txt"/>
                &nbsp;<form:errors path="methodNm" />
            </td>
        </tr>
        <tr>
            <th>process_se_code</th>
            <td>
                <form:input path="processSeCode" cssClass="txt"/>
                &nbsp;<form:errors path="processSeCode" />
            </td>
        </tr>
        <tr>
            <th>process_co</th>
            <td>
                <form:input path="processCo" cssClass="txt"/>
                &nbsp;<form:errors path="processCo" />
            </td>
        </tr>
        <tr>
            <th>process_time</th>
            <td>
                <form:input path="processTime" cssClass="txt"/>
                &nbsp;<form:errors path="processTime" />
            </td>
        </tr>
        <tr>
            <th>rspns_code</th>
            <td>
                <form:input path="rspnsCode" cssClass="txt"/>
                &nbsp;<form:errors path="rspnsCode" />
            </td>
        </tr>
        <tr>
            <th>error_se</th>
            <td>
                <form:input path="errorSe" cssClass="txt"/>
                &nbsp;<form:errors path="errorSe" />
            </td>
        </tr>
        <tr>
            <th>error_co</th>
            <td>
                <form:input path="errorCo" cssClass="txt"/>
                &nbsp;<form:errors path="errorCo" />
            </td>
        </tr>
        <tr>
            <th>error_code</th>
            <td>
                <form:input path="errorCode" cssClass="txt"/>
                &nbsp;<form:errors path="errorCode" />
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


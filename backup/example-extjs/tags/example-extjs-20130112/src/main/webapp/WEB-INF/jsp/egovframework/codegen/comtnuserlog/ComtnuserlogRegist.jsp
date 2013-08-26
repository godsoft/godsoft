<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : ComtnuserlogRegister.jsp
  * @Description : Comtnuserlog Register 화면
  * @Modification Information
  *
  * @author 이백행
  * @since 2013-01-09
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
<c:set var="registerFlag" value="${empty comtnuserlogVO.id ? '등록' : '수정'}"/>
<title> <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="comtnuserlogVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 목록 화면 function */
function fn_egov_selectList() {
    document.getElementById("detailForm").action = "<c:url value='/comtnuserlog/selectComtnuserlogList.do'/>";
    document.getElementById("detailForm").method = "get";
    document.getElementById("detailForm").submit();
}

/* 글 삭제 function */
function fn_egov_delete() {
    document.getElementById("detailForm").action = "<c:url value='/comtnuserlog/deleteComtnuserlog.do'/>";
    document.getElementById("detailForm").submit();
}

/* 글 등록 function */
function fn_egov_save() {
    var form = document.getElementById("detailForm");

    /* TODO Validation기능 보완 */
    form.action = "<c:url value="${registerFlag == '등록' ? '/comtnuserlog/addComtnuserlog.do' : '/comtnuserlog/updateComtnuserlog.do'}"/>";
    form.submit();
}
//-->
</script>
</head>
<body>

<form:form commandName="comtnuserlogVO" name="detailForm" id="detailForm">
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
            <th>occrrnc_de *</th>
            <td>
                <form:input path="occrrncDe" cssClass="essentiality" readonly="true" />
            </td>
        </tr>
        <tr>
            <th>rqester_id *</th>
            <td>
                <form:input path="rqesterId" cssClass="essentiality" readonly="true" />
            </td>
        </tr>
        <tr>
            <th>svc_nm *</th>
            <td>
                <form:input path="svcNm" cssClass="essentiality" readonly="true" />
            </td>
        </tr>
        <tr>
            <th>method_nm *</th>
            <td>
                <form:input path="methodNm" cssClass="essentiality" readonly="true" />
            </td>
        </tr>
        </c:if>
        <c:if test="${registerFlag == '등록'}">
        <tr>
            <th>occrrnc_de *</th>
            <td>
                <form:input path="occrrncDe" cssClass="txt" readonly="false" />
            </td>
        </tr>
        <tr>
            <th>rqester_id *</th>
            <td>
                <form:input path="rqesterId" cssClass="txt" readonly="false" />
            </td>
        </tr>
        <tr>
            <th>svc_nm *</th>
            <td>
                <form:input path="svcNm" cssClass="txt" readonly="false" />
            </td>
        </tr>
        <tr>
            <th>method_nm *</th>
            <td>
                <form:input path="methodNm" cssClass="txt" readonly="false" />
            </td>
        </tr>
        </c:if>
        
        <tr>
            <th>creat_co</th>
            <td>
                <form:input path="creatCo" cssClass="txt"/>
                &nbsp;<form:errors path="creatCo" />
            </td>
        </tr>
        <tr>
            <th>updt_co</th>
            <td>
                <form:input path="updtCo" cssClass="txt"/>
                &nbsp;<form:errors path="updtCo" />
            </td>
        </tr>
        <tr>
            <th>rdcnt</th>
            <td>
                <form:input path="rdcnt" cssClass="txt"/>
                &nbsp;<form:errors path="rdcnt" />
            </td>
        </tr>
        <tr>
            <th>delete_co</th>
            <td>
                <form:input path="deleteCo" cssClass="txt"/>
                &nbsp;<form:errors path="deleteCo" />
            </td>
        </tr>
        <tr>
            <th>outpt_co</th>
            <td>
                <form:input path="outptCo" cssClass="txt"/>
                &nbsp;<form:errors path="outptCo" />
            </td>
        </tr>
        <tr>
            <th>error_co</th>
            <td>
                <form:input path="errorCo" cssClass="txt"/>
                &nbsp;<form:errors path="errorCo" />
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


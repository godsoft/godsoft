<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : selectComtnsyslogList.jsp
  * @Description : Comtnsyslog List 화면
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
<title>목록</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* 글 수정 화면 function */
function fn_egov_select(requstId) {
    document.getElementById("listForm").requstId.value = requstId;
    document.getElementById("listForm").action = "<c:url value='/comtnsyslog/updateComtnsyslogView.do'/>";
    document.getElementById("listForm").submit();
}

/* 글 등록 화면 function */
function fn_egov_addView() {
    document.getElementById("listForm").action = "<c:url value='/comtnsyslog/addComtnsyslogView.do'/>";
    document.getElementById("listForm").submit();
}

/* pagination 페이지 링크 function */
function fn_egov_link_page(pageNo){
    document.getElementById("listForm").pageIndex.value = pageNo;
    document.getElementById("listForm").action = "<c:url value='/comtnsyslog/selectComtnsyslogList.do'/>";
    document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" id="listForm" method="get">
    <input type="hidden" name="requstId" />
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
                            </colgroup>
            <tr>
                                <th align="center">RequstId</th>
                                <th align="center">JobSeCode</th>
                                <th align="center">InsttCode</th>
                                <th align="center">OccrrncDe</th>
                                <th align="center">RqesterIp</th>
                                <th align="center">RqesterId</th>
                                <th align="center">TrgetMenuNm</th>
                                <th align="center">SvcNm</th>
                                <th align="center">MethodNm</th>
                                <th align="center">ProcessSeCode</th>
                                <th align="center">ProcessCo</th>
                                <th align="center">ProcessTime</th>
                                <th align="center">RspnsCode</th>
                                <th align="center">ErrorSe</th>
                                <th align="center">ErrorCo</th>
                                <th align="center">ErrorCode</th>
                            </tr>
            <c:forEach var="result" items="${resultList}" varStatus="status">
            <tr>
                                                                                                            
                                                <td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.requstId}"/>')"><c:out value="${result.requstId}"/></a>&nbsp;</td>
                                                                <td align="center" class="listtd"><c:out value="${result.jobSeCode}"/>&nbsp;</td>
                                                                <td align="center" class="listtd"><c:out value="${result.insttCode}"/>&nbsp;</td>
                                                                <td align="center" class="listtd"><c:out value="${result.occrrncDe}"/>&nbsp;</td>
                                                                <td align="center" class="listtd"><c:out value="${result.rqesterIp}"/>&nbsp;</td>
                                                                <td align="center" class="listtd"><c:out value="${result.rqesterId}"/>&nbsp;</td>
                                                                <td align="center" class="listtd"><c:out value="${result.trgetMenuNm}"/>&nbsp;</td>
                                                                <td align="center" class="listtd"><c:out value="${result.svcNm}"/>&nbsp;</td>
                                                                <td align="center" class="listtd"><c:out value="${result.methodNm}"/>&nbsp;</td>
                                                                <td align="center" class="listtd"><c:out value="${result.processSeCode}"/>&nbsp;</td>
                                                                <td align="center" class="listtd"><c:out value="${result.processCo}"/>&nbsp;</td>
                                                                <td align="center" class="listtd"><c:out value="${result.processTime}"/>&nbsp;</td>
                                                                <td align="center" class="listtd"><c:out value="${result.rspnsCode}"/>&nbsp;</td>
                                                                <td align="center" class="listtd"><c:out value="${result.errorSe}"/>&nbsp;</td>
                                                                <td align="center" class="listtd"><c:out value="${result.errorCo}"/>&nbsp;</td>
                                                                <td align="center" class="listtd"><c:out value="${result.errorCode}"/>&nbsp;</td>
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

<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @JSP Name : example.jsp
  * @Description : 게시판 화면
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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="content-language" content="ko">
<title>ajax example</title>

<link type="text/css" rel="stylesheet" href="<c:url value='/css/jquery-ui-1.8.14.custom.css'/>" >
<script type="text/javaScript" src="<c:url value='/js/jquery-1.5.1.min.js'/>"></script>
<script type="text/javaScript" src="<c:url value='/js/jquery-ui-1.8.14.custom.min.js'/>"></script>

<script type="text/javaScript" language="javascript" defer="defer">

$(function(){
	$('#tabs').tabs();
	ajaxCall('Restful');
	$("#tabs").bind('tabsselect', function(event, ui) {
		ajaxCall(ui.tab.innerHTML);
	});
});

function ajaxCall(tabName){
	$.ajax({
		  url:  '<c:url value="/com/ajax.do" />',
		  data: "tabName="+tabName,
		  dataType: 'json',
		  success: function(data) { 
			  $(data.divId).html(data.description);
		}
	});
}

</script>

</head>
<body>

		<div id="tabs">
					<ul>
						<li><a href="#tabs-1">Restful</a></li>
						<li><a href="#tabs-2">ORM</a></li>
						<li><a href="#tabs-3">Excel</a></li>
						<li><a href="#tabs-4">OXM</a></li>
					</ul>
					<div id="tabs-1" class="Restful" style="height: 250px;"></div>
					<div id="tabs-2" class="ORM" style="height: 250px;"></div>
					<div id="tabs-3" class="Excel" style="height: 250px;"></div>
					<div id="tabs-4" class="OXM" style="height: 250px;"></div>
		</div>
</body>
</html>
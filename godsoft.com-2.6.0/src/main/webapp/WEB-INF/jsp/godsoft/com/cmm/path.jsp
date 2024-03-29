<%@page import="godsoft.com.cmm.service.Globals"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%
	/**
	 * @Class Name : EgovBdUseInfListByTrget.jsp
	 * @Description : 게시판  사용정보  목록화면
	 * @Modification Information
	 * @
	 * @  수정일      수정자            수정내용
	 * @ -------        --------    ---------------------------
	 * @ 2009.04.02   이삼섭          최초 생성
	 *
	 *  @author 공통서비스 개발팀 이삼섭
	 *  @since 2009.04.02
	 *  @version 1.0
	 *  @see
	 *
	 */
%>

<c:set var="pathWebapp"><%=Globals.PATH_WEBAPP%></c:set>
<c:set var="pathWeb"><%=Globals.PATH_WEB%></c:set>
<c:set var="pathVendor"><%=Globals.PATH_VENDOR%></c:set>

<script type="text/javascript">
	var godsoft = {};
	godsoft.com = {};
	godsoft.com.cmm = {};
	godsoft.com.cmm.path = {
		webapp : '${pathWebapp}',
		web : '${pathWeb}',
		vendor : '${pathVendor}'
	};
</script>

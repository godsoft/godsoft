<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%pageContext.setAttribute("crlf", "\r\n"); %>

<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<!DOCTYPE html> 
<html> 
    <head>
    <title>스크랩 등록</title> 
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        
         
        <!-- eGovFrame Common import -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/egovframework/mbl/cmm/jquery.mobile-1.0b3.min.css" />
	    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/egovframework/mbl/cmm/EgovMobile.css" />
	    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/egovframework/mbl/com/uss/ussCommon.css" />
	    <script type="text/javascript" src="${pageContext.request.contextPath}/js/egovframework/mbl/cmm/jquery-1.6.2.min.js"></script>		  
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/egovframework/mbl/cmm/jquery.mobile-1.0b3.min.js"></script>   
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/egovframework/mbl/cmm/EgovMobile.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/egovframework/mbl/com/EgovCom.js"></script>
		
		<c:if test="${anonymous == 'true'}"><c:set var="prefix" value="/anonymous"/></c:if>
		<script type="text/javascript" src="${pageContext.request.contextPath}/validator.do"></script>
		<validator:javascript formName="scrap" staticJavascript="false" xhtml="true" cdata="false"/>

		<script type="text/javascript">
			function fn_egov_update_scrap() {

				if (!validateScrap(document.scrap)){
					return;
				}
				
					document.scrap.action = "${pageContext.request.contextPath}/cop/scp/insertScrap.mdo";
					document.scrap.submit();			
			}
			
			function fn_egov_select_scrap(){
				var form = document.scrap;
				form.action = "${pageContext.request.contextPath}/cop/scp/selectScrapList.mdo";
				form.submit();	
			}	

			function fn_egov_inqire_notice(nttId, bbsId) {
				document.scrap.nttId.value = nttId;
				document.scrap.bbsId.value = bbsId;
				document.scrap.action =  "${pageContext.request.contextPath}/cop/bbs${prefix}/selectBoardArticle.mdo";
				document.scrap.submit();			
			}	
		</script>
    </head>

<body>

    <!-- 메인 페이지 -->egov
    <div data-role="page" id="NoticeInire" data-url="page_main" >

		<form:form commandName="scrap" name="scrap" method="post" action="${pageContext.request.contextPath}/cop/scp/updateScrap.mdo">
		<input name="pageIndex" type="hidden" value="<c:out value='${searchVO.pageIndex}'/>">
		<input type="hidden" name="bbsId" value="<c:out value='${board.bbsId}'/>" >
		<input type="hidden" name="nttId" value="<c:out value='${board.nttId}'/>" >
		<input type="hidden" name="scrapId" value="<c:out value='${scrap.scrapId}'/>" >
		
		<div data-role="header" data-theme="a" data-position="inline">
			<a href="javascript:fn_egov_inqire_notice('<c:out value="${board.nttId}"/>','<c:out value="${board.bbsId}"/>')" data-icon="arrow-l" data-ajax="false">뒤로</a>
			<h1>스크랩 등록하기</h1> 
		</div>
        <div data-role="content" class="com-copContent">
            <dl class="com-addTxt">
            <dt>스크랩명</dt>
            <dd><input type="text" name="scrapNm" id="name" value="<c:out value='${scrap.scrapNm}'/>" class="com-inpSubject" /></dd>
            </dl>
			<ul class="uss-hpcDetail">
				<li>
					<span class="uss-tit">게시물 제목</span>
					<span class="uss-con"><label for="name-d"><c:out value="${board.nttSj}" /></label></span>
				</li>
				<li>
					<span class="uss-tit">게시물 작성자 </span>
					<span class="uss-con"><label for="name-d">                    
										<c:choose>
											<c:when test="${board.ntcrNm == ''}">
											<c:out value="${board.frstRegisterNm}" />
											</c:when>
											<c:otherwise>
											    <c:out value="${board.ntcrNm}" />
											</c:otherwise>
										</c:choose>
									</label></span>
				</li>
				<li>
					<span class="uss-tit">게시물 작성시간 </span>
					<span class="uss-con"><label for="name-d"><c:out value="${board.frstRegisterPnttm}" /></label></span>
				</li>
				<li>
					<span class="uss-tit">게시물 조회수 </span>
					<span class="uss-con"><label for="name-d"><c:out value="${board.inqireCo}" /></label></span>
				</li>
				<li>
					<span class="uss-tit">글내용 </span>
				</li>		
				<li class="uss-contentsView">
					<c:out value="${fn:replace(board.nttCn , crlf , '<br>')}"  escapeXml="false"/>  
				</li>
			</ul>
         </div>
		<div class="com-addBgBtn">
			 <a href="javascript:fn_egov_update_scrap();" data-role="button" data-theme="b" data-icon="check">등록</a>
		</div>  
    </form:form>
                
			<!-- footer start -->
			<div data-role="footer"  data-theme="a" data-position="fixed">
				<h4>Copyright (c) Ministry of Public Administration and Security.</h4>
			</div>
			<!-- footer end -->
</div>	
	
</body>

</html>
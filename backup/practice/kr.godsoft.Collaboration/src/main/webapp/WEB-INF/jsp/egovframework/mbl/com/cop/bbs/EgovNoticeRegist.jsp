<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page import="egovframework.com.cmm.service.EgovProperties" %>  


 
<!DOCTYPE html> 
<html>  
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
        	
    <title>${bdMstr.bbsNm}</title> 

   	<!-- eGovFrame Common import -->
   	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/egovframework/mbl/cmm/jquery.mobile-1.0b3.min.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/egovframework/mbl/cmm/EgovMobile.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/egovframework/mbl/com/uss/ussCommon.css" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/egovframework/mbl/cmm/jquery-1.6.2.min.js"></script>	
		<script type="text/javascript">
          $( document ).bind( "mobileinit", function(){
              $.mobile.page.prototype.options.degradeInputs.date = 'text';
          }); 
      </script>
      <script type="text/javascript">
		_editor_area = "nttCn";
		_editor_url = "${pageContext.request.contextPath}/html/egovframework/com/cmm/utl/htmlarea3.0/";
		</script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/html/egovframework/com/cmm/utl/htmlarea3.0/htmlarea.js"></script>
      <script type="text/javascript" src="${pageContext.request.contextPath}/js/egovframework/mbl/cmm/jquery.mobile-1.0b3.min.js"></script>   
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/egovframework/mbl/cmm/EgovMobile.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/egovframework/mbl/com/EgovCom.js"></script>
		<!-- datebox  import-->        
      <script type="text/javascript" src="${pageContext.request.contextPath}/js/egovframework/mbl/cmm/datepicker/jquery.mobile.datebox.js"></script> 
      <script type="text/javascript" src="${pageContext.request.contextPath}/validator.do"></script>
      <validator:javascript formName="board" staticJavascript="false" xhtml="true" cdata="false"/>
      
	<c:if test="${anonymous == 'true'}"><c:set var="prefix" value="/anonymous"/></c:if>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/egovframework/com/cop/bbs/EgovBBSMng.js" ></script>
	<script type="text/javascript">

			function fn_showList() {
				var bbsId = document.board.bbsId.value;
				document.board.action = "${pageContext.request.contextPath}/cop/bbs${prefix}/selectBoardList.mdo";
				document.board.bbsId.value = bbsId;
				document.board.submit();
				
			}
			function fn_egov_regist_notice() {
				var ntceBgnde = document.board.ntceBgnde.value; 
				var ntceEndde = document.board.ntceEndde.value;
				var bbsId = document.board.bbsId.value;

				if(ntceBgnde > ntceEndde){
					alert("게시기간 종료일이 시작일보다 빠릅니다.");
					return;		
				}

				if (!validateBoard(document.board)){
					return;
				}
					document.board.bbsId.value=bbsId;
					document.board.action = "${pageContext.request.contextPath}/cop/bbs${prefix}/insertBoardArticle.mdo";
					document.board.submit();
			}

      </script>
</head>

<body>

<!--등록 페이지 -->
<div data-role="page" id="Add_Page">
	<div data-role="header">
		<a href="javascript:fn_showList();" data-icon="arrow-l">뒤로</a>
		<h1>게시글 쓰기</h1> 
	</div>
<form:form commandName="board" name="board" method="post" enctype="multipart/form-data">
					
	<div data-role="content" class="com-ussContent">
		<div data-role="fieldcontain" data-inline="true">
			<div class="uss-regist" data-inline="true">
				<label for="nttSj"><strong>제목</strong></label><br>
        		<input name="nttSj" id="name"  type="text" maxlength="20"  size="20" placeholder="제목을 입력해주세요." >
			</div>
			<div class="uss-regist" data-inline="true">
				<label for="nttCn"><strong>글내용</strong></label><br>
	        	<textarea cols="40" rows="40" name="nttCn" id="nttCn" placeholder="글내용을 입력해주세요." class="com-textContents"></textarea>
			</div>
			<c:choose>
			  	<c:when test="${brdMstrVO.bbsAttrbCode == 'BBSA01'}"> 
					<div class="uss-regist" data-inline="true">
						<label for="ntceBgnde"><strong>시작일자</strong></label><br>
		        		<input name="ntceBgnde" id="defandroid" type="text"  data-role="datebox"  readonly="true" >
					</div>
					<div class="uss-regist" data-inline="true">
						<label for="ntceEndde"><strong>종료일자</strong></label><br>
			        	<input name="ntceEndde" id="defandroid" type="text"  data-role="datebox"  readonly="true" >
					</div>
				</c:when>
			  	<c:when test="${anonymous == 'true'}"><!-- 익명글 -->
					<div class="uss-regist" data-inline="true">
						<label for="ntcrNm"><strong>작성자</strong></label><br>
		        		<input name="ntcrNm" type="text" maxlength="10" size="20">
					</div>
					<div class="uss-regist" data-inline="true">
						<label for="password"><strong>비밀번호</strong></label><br>
			        	<input name="password" type="password" maxlength="20" >
					</div>
				</c:when>
			  	<c:otherwise>
			  	
			  	</c:otherwise> 
			</c:choose>
		<fieldset class="ui-grid-a addBgBtn">
			<div class="ui-block-a">
                <input type="button" value="등록" onclick="fn_egov_regist_notice()" data-icon="plus" data-theme="b" data-ajax="false" >
			</div>
			<div class="ui-block-b">
                <input type="reset" value="초기화" data-theme="b" data-icon="refresh" />
			</div>
		</fieldset>
		
		<input name="pageIndex" type="hidden" value="<c:out value='${searchVO.pageIndex}'/>"/>
		<!-- 잠시적으로 bbsId=BBSMSTR_000000000550 mappping java에서 -->
		<input type="hidden" name="bbsId" value="<c:out value='${brdMstrVO.bbsId}'/>" />
		<input type="hidden" name="bbsAttrbCode" value="<c:out value='${brdMstrVO.bbsAttrbCode}'/>" />
		<input type="hidden" name="bbsTyCode" value="<c:out value='${brdMstrVO.bbsTyCode}'/>" />
		<input type="hidden" name="replyPosblAt" value="<c:out value='${brdMstrVO.replyPosblAt}'/>" />
		<input type="hidden" name="fileAtchPosblAt" value="<c:out value='${brdMstrVO.fileAtchPosblAt}'/>" />
		<input type="hidden" name="tmplatId" value="<c:out value='${brdMstrVO.tmplatId}'/>" />
		<input type="hidden" name="frstRegisterNm" value="<c:out value='${brdMstrVO.frstRegisterNm}'/>" />
		
		<input type="hidden" name="searchCnd" value="<c:out value='${searchVO.searchCnd}'/>">
		<input type="hidden" name="searchWrd" value="<c:out value='${searchVO.searchWrd}'/>">
			
		<!-- <input type="hidden" name="cal_url" value="${pageContext.request.contextPath}/sym/cmm/EgovNormalCalPopup.do" />  -->
		<input type="hidden" name="authFlag" value="<c:out value='${brdMstrVO.authFlag}'/>" />
		
		<c:if test="${anonymous != 'true'}">
		<input type="hidden" name="ntcrNm" value="dummy">   <!-- validator 처리를 위해 지정 -->
		<input type="hidden" name="password" value="dummy"> <!-- validator 처리를 위해 지정 -->
		</c:if>
		
		<c:if test="${bdMstr.bbsAttrbCode != 'BBSA01'}">
		<input name="ntceBgnde" type="hidden" value="10000101">
		<input name="ntceEndde" type="hidden" value="99991231">
		</c:if>
		</div>
		
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

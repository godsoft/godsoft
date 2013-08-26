/**
 * @fileoverview 모바일 전자정부 하이브리드 앱 GPS API 가이드 프로그램 JavaScript JavaScript.
 * 
 * @author 나신일
 * @version 1.0
 */

/**
 * iScroll 객체 생성
 * @type iScroll
 */
var myScroll = null;

/**
 * 위도
 * @type
 */
var lat;

/**
 * 경도
 * @type
 */
var lon;


/*******************************************************************************
 * HTML 및 이벤트 관련 함수
 ******************************************************************************/

/**
 * 화면을 위한 관련 이벤트
 */
$(function(){
	$('#goMyLocation').click(function () {
		// 3G 사용시 과금이 발생 할 수 있다는 경고 메시지 표시
		if(!fn_egov_network_check(false)) {
			return;
		}
		$.mobile.changePage("#myLocation", "slide", false, false);
		$.mobile.showPageLoadingMsg('a');
		navigator.geolocation.getCurrentPosition(fn_egov_success, fn_egov_error);
	});
	  
	$('#goGpsInfoList').click(function () {
		fn_egov_go_gpsInfoList();
	});
	$('#saveBtn').click(function () {
		fn_egov_go_addGpsInfo();
	});
	$('#deleteBtn').click(function () {
		fn_egov_go_deleteGpsInfo();
	});
	$('#reloadBtn').click(function () {
		navigator.geolocation.getCurrentPosition(fn_egov_success, fn_egov_error);
	});
	
	$("#main").live("pageshow", function(event, ui){
        
        if(myScroll != null) {
            
            myScroll.destroy();
        }
        loaded('wrapperInfo');
    });
    
    $("#gpsInfoList").live("pageshow", function(event, ui){
        
        if(myScroll != null) {
            
            myScroll.destroy();
        }
        loaded('wrapperList');
    });
});

/**
 * iScroll 적용
 * @returns 
 * @type 
 */
function loaded(scrollTarget) {
    
    // Use this for high compatibility (iDevice + Android)
    setTimeout(function () {
        myScroll = new iScroll(scrollTarget, {
            onBeforeScrollStart : function(e) {
                var target = e.target;
                while (target.nodeType != 1)
                    target = target.parentNode;
    
                if (target.tagName != 'SELECT' && target.tagName != 'INPUT'
                        && target.tagName != 'TEXTAREA')
                    e.preventDefault();
            }
        });
    });

    document.addEventListener('touchmove', function(e) {
        e.preventDefault();
    }, false);
}

/**
 * PhoneGap 초기화 이벤트에서 호출하는 function
 * 
 * @returns iscroll 과 Back 버튼 event 추가
 * @type
 */
function onDeviceReady() {	
    document.addEventListener("backbutton", backKeyDown, false);
	loaded('wrapperInfo');
}

/**
 * Android Back 버튼 클릭 이벤트 function.
 * 
 * @returns intro or importanceList 화면에서 종료하고 나머지 화면에선 back 처리
 * @type
 */
function backKeyDown(e) {	
    if($.mobile.activePage.is('#intro') || $.mobile.activePage.is('#main')){
    	
        e.preventDefault();
        navigator.app.exitApp();

    }else{
    	navigator.app.backHistory();
    }
}

/**
 * gps 값을 정상적으로 읽어왔을때 callback 함수
 * 
 * @returns
 * @type
 */
function fn_egov_success(position) {    
    console.log('DeviceAPIGuide fn_egov_success Success');
    lat = position.coords.latitude;
    lon = position.coords.longitude;
    var html = "";
    html = '위도 : ' + position.coords.latitude + '<br/>';
    html += '경도 : ' + position.coords.longitude + '';
	
    $('#latlngInfo').html(html);

    // 현재 위치 좌표*
    var latlng =  new daum.maps.LatLng(position.coords.latitude, position.coords.longitude);
	
    // 지도 설정*
    var myOptions = {
        level: 4,
        center: latlng,
        mapTypeId: daum.maps.MapTypeId.ROADMAP
    };
	
    // 지도 생성*
    var map = new daum.maps.Map(document.getElementById("map"), myOptions);
    map.addControl(new daum.maps.ZoomControl());
    
    // 현재 위치 마커 표시*
    var curMarker = new daum.maps.Marker({
                                         position: latlng
                                         });
    curMarker.setMap(map);
	
    var infowindow = new daum.maps.InfoWindow({
                                              content: '<font size=2>위도:'+position.coords.latitude + '<br/>' + '경도:'+position.coords.longitude+'</font>'
                                              });
    infowindow.open(map, curMarker);
    
    $.mobile.hidePageLoadingMsg('a');
// var element = document.getElementById('geolocation');
// element.innerHTML = 'Latitude: ' + position.coords.latitude + '<br />' +
// 'Longitude: ' + position.coords.longitude + '<br />' +
// 'Altitude: ' + position.coords.altitude + '<br />' +
// 'Accuracy: ' + position.coords.accuracy + '<br />' +
// 'Altitude Accuracy: ' + position.coords.altitudeAccuracy + '<br />' +
// 'Heading: ' + position.coords.heading + '<br />' +
// 'Speed: ' + position.coords.speed + '<br />' +
// 'Timestamp: ' + position.timestamp + '<br />';
}

/**
 * gps 값을 못 읽어왔을때 callback 함수
 * 
 * @returns
 * @type
 */
function fn_egov_error(error) {
	console.log('DeviceAPIGuide fn_egov_error Fail');
    alert('위치정보가 켜져 있는지 확인해 주십시오.');
    $.mobile.hidePageLoadingMsg('a');    
}

/**
 * 서버에 저장된 gps 정보 목록 읽기
 * 
 * @returns
 * @type
 */
function fn_egov_go_gpsInfoList()
{    
    // 3G 사용시 과금이 발생 할 수 있다는 경고 메시지 표시
    if(!fn_egov_network_check(false)) {
    	return;
    }
    
    $.mobile.changePage("#gpsInfoList", "slide", false, false);
    $.mobile.showPageLoadingMsg('a');
    
    var url = "/gps/xml/gpsInfoList.do";
    var acceptType = "xml";
    var params = {uuid : device.uuid};
    // get the data from server
    window.plugins.EgovInterface.post(url, acceptType, params, function(xmldata) {
                                         console.log('DeviceAPIGuide fn_egov_go_gpsInfoList request Complete');                                   
                                         $.mobile.hidePageLoadingMsg('a');
                                         
                                         var list_html = "";
                                         
                                         if($(xmldata).find("gpsInfoList").length == 0) {
                                             alert('조회된 데이터가 없습니다');
                                         } else {                                         		
                                             $(xmldata).find("gpsInfoList").each(function(){
                                                 var uuid = $(this).find("uuid").text();
                                                 var lat = $(this).find("lat").text();
                                                 var lon = $(this).find("lon").text();      
                                                 list_html += "<li><h3>UUID : " + uuid + "</h3>";
                                                 list_html += "<p>위도 : " + lat + "</p>";
                                                 list_html += "<p>경도 : " + lon + "</p></li>";
                                                 });                
                                         }
                                         
                                         var theList = $('#theLogList');
                                         theList.html(list_html);
                                         theList.listview("refresh");	                                         
                                         myScroll.refresh();
                                     });
}

/**
 * 서버에 현재 gps 정보 추가
 * 
 * @returns
 * @type
 */
function fn_egov_go_addGpsInfo()
{   
    // 3G 사용시 과금이 발생 할 수 있다는 경고 메시지 표시
    if(!fn_egov_network_check(false)) {
        return;
    }
    
    var url = "/gps/xml/addGPSInfo.do";
    var acceptType = "xml";
    var params = {uuid : device.uuid,
                    lat: lat,
                    lon: lon,
                    useYn: 'Y'};
    
    $.mobile.showPageLoadingMsg('a');	

    window.plugins.EgovInterface.post(url, acceptType, params, function(xmldata) {
                                        console.log('DeviceAPIGuide fn_egov_go_addGpsInfo request Complete');                                         
                                        alert($(xmldata).find("resultMessage").text());                                         
                                        $.mobile.hidePageLoadingMsg('a');
                                        location.href = "GPSAPI.html";
                                     });
}

/**
 * 서버에 저장된 gps 정보들을 삭제
 * 
 * @returns
 * @type
 */
function fn_egov_go_deleteGpsInfo()
{
    // 3G 사용시 과금이 발생 할 수 있다는 경고 메시지 표시
    if(!fn_egov_network_check(false)) {
        return;
    }
    
    var url = "/gps/xml/deleteGPSInfo.do";
    var acceptType = "xml";
    var params = {uuid : device.uuid};
    // get the data from server
    jConfirm('서버에 저장된 GPS 정보 목록을 삭제 하시겠습니까?', '알림', 'c', function(r){
             if(r == true){
                 $.mobile.showPageLoadingMsg('a');
                 window.plugins.EgovInterface.post(url, acceptType, params, function(result) {
                             console.log('DeviceAPIGuide fn_egov_go_deleteGpsInfo request Complete');                                                     
                             alert($(result).find("resultMessage").text());                                                  
                             $.mobile.hidePageLoadingMsg('a');
                             location.href = "GPSAPI.html";
                             });
             }else{
                 return;
             }
             });
}
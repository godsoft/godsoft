package kr.go.egovframework.hyb.gpsapi;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

/**  
 * @Class Name : GPSAPIGuide_AndroidActivity.java
 * @Description : GPSAPIGuide_AndroidActivity Class
 * @Modification Information  
 * 
 * @  수정일                 수정자                 수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2012.08.17    나신일                  최초생성
 * 
 * @author 모바일 디바이스 API 팀
 * @since 2012. 08. 27
 * @version 1.0
 * @see
 * 
 *  Copyright (C) by MOPAS All right reserved.
 */
public class GPSAPIGuide_AndroidActivity extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Clear cache if you want
        super.clearCache();
        //super.appView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        super.loadUrl("file:///android_asset/www/intro.html");
    }
}
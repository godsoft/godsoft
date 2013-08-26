package kr.go.egovframework.hyb.vibratorapi;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

/**  
 * @Class Name : VibratorAPIGuide_AndroidActivity.java
 * @Description : VibratorAPIGuide_AndroidActivity Class
 * @Modification Information  
 * @
 * @  수정일            수정자        수정내용
 * @ ---------        ---------    -------------------------------
 * @ 2012. 8. 16.        이율경        최초생성
 * 
 * @author 디바이스 API 실행환경 팀
 * @since 2012. 8. 16.
 * @version 1.0
 * @see
 * 
 */
public class VibratorAPIGuide_AndroidActivity extends DroidGap
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
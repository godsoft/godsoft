package kr.go.egovframework.hyb.example;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

/**  
 * @Class Name : example_AndroidActivity.java
 * @Description : example_AndroidActivity Class
 * @Modification Information  
 * @
 * @  수정일       수정자                 수정내용
 * @ ---------   ---------   -------------------------------
 * @ 
 * 
 *  Copyright (C) by MOPAS All right reserved.
 */
public class Example_AndroidActivity extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);        
        // Clear cache if you want
        super.clearCache();
        //super.appView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}
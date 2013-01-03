package egovframework.codegen.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CmmUtils {

    public static String getCreateDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        return sdf.format(new Date());
    }

}

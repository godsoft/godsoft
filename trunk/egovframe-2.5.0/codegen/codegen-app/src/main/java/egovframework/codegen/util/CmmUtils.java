package egovframework.codegen.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CmmUtils {

    public static String getCreateDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        return sdf.format(new Date());
    }

    public static String getJavaType(String dataType) {
        String javaType = "String";

        if ("CHAR".equals(dataType) || "VARCHAR2".equals(dataType)) {
        } else if ("NUMBER".equals(dataType)) {
            javaType = "int";
        }

        return javaType;
    }

}

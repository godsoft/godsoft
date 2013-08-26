package egovframework.codegen.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

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

    public static void writeStringToFile(String pathname, String data)
            throws Exception {
        File file = new File(pathname);

        FileUtils.writeStringToFile(file, data, "utf-8");
    }

}

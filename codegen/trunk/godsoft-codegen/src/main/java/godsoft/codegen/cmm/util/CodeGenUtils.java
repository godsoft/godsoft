package godsoft.codegen.cmm.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CodeGenUtils {

	public static String getToday() {
		Date now = new Date();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		return format.format(now);
	}

	public static String getDataType(String dataType) {
		String s = "String";

		if ("NUMBER".equals(dataType)) {
			s = "int";
		}

		return s;
	}

}

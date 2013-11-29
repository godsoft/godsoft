package godsoft.egov.codegen.cmm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CodeGenUtils {

	public static String getToday() {
		Date date = new Date();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		return format.format(date);
	}

}

package godsoft.codegen.cmm.util;

import godsoft.codegen.cmm.model.DataModelContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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

	public static Map<String, Object> pathnameMap(DataModelContext dataModel) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();

		String format = "%s/src/main/java/%s/%s/service/%sVO.java";
		Object[] args = { dataModel.getProjectName(), dataModel.getPackageName().replaceAll("\\.", "/"), dataModel.getEntity().getLcName(), dataModel.getEntity().getPcName() };
		map.put("vo", String.format(format, args));

		return map;
	}

}

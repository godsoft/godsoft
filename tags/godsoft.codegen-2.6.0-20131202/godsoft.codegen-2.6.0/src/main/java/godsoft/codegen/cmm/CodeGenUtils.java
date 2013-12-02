package godsoft.codegen.cmm;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.functors.EqualPredicate;

public class CodeGenUtils {

	public static String getToday() {
		Date date = new Date();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		return format.format(date);
	}

	public static Object CollectionUtilsFind(@SuppressWarnings("rawtypes") Collection collection, String propertyName, String value) {
		EqualPredicate equalPredicate = new EqualPredicate(value);

		BeanPredicate beanPredicate = new BeanPredicate(propertyName, equalPredicate);

		return CollectionUtils.find(collection, beanPredicate);
	}

	public static String getJavaType(String dataType) {
		String javaType = "String";

		if ("NUMBER".equals(dataType)) {
			javaType = "int";
			//			s = "Integer";
		}

		return javaType;
	}

}

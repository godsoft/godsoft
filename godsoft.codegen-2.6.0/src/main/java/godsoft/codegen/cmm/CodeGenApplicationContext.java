package godsoft.codegen.cmm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CodeGenApplicationContext {

	private static ApplicationContext applicationContext;

	static {
		String configLocation = "classpath:godsoft/spring/egov/codegen/run-context.xml";

		applicationContext = new ClassPathXmlApplicationContext(configLocation);
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

}

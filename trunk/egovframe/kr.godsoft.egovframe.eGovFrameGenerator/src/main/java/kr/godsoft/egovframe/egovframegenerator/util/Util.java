package kr.godsoft.egovframe.egovframegenerator.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Util {

	public static ApplicationContext getApplicationContext() {
		return new ClassPathXmlApplicationContext(
				"classpath:egovframework/spring/eGovFrameGenerator.xml");
	}

}

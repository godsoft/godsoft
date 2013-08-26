package egovframework.com.utl.fcc.service;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EgovDateUtilTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws Exception {
		System.out.println(EgovDateUtil.getToday());

		System.out.println(EgovDateUtil.getCurrentDate(""));

		System.out
				.println(EgovDateUtil.formatDate(EgovDateUtil.getToday(), "."));

		System.out
				.println(EgovDateUtil.formatDate(EgovDateUtil.getToday(), "/"));

		System.out
				.println(EgovDateUtil.formatDate(EgovDateUtil.getToday(), "-"));
	}

}

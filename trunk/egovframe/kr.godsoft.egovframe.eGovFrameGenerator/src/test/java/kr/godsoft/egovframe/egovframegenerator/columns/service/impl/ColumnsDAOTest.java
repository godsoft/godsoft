package kr.godsoft.egovframe.egovframegenerator.columns.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import egovframework.rte.psl.dataaccess.util.EgovMap;

// TODO 필요할 경우, 스프링 컨텍스트/트랜잭션 등의 설정을 적용한다.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/egovframework/spring/eGovFrameGenerator.xml" })
// @TransactionConfiguration(transactionManager = "txManager", defaultRollback =
// false)
// @Transactional
public class ColumnsDAOTest {

	@Resource(name = "dataSource")
	protected DataSource dataSource;

	@Resource(name = "columnsDAO")
	ColumnsDAO columnsDAO;

	// // TODO 필요할 경우, 스프링 ApplicationContext을 선언한다.
	// @Autowired
	// ApplicationContext aplicationContext;

	// TODO VO를 사용한 경우, 관련 VO들을 선언한다.
	// NoticeVo testNoticeVo;

	// @TestDataSource
	// private DataSource dataSource;

	// TODO VO를 사용한 경우, 테스트에 사용할 VO들을 생성한다.
	@Before
	public void createTestNoticeVo() {
		// try {
		// testNoticeVo = (NoticeVo) aplicationContext.getBean("testNoticeVo");
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd",
		// java.util.Locale.getDefault());
		// testNoticeVo.setRegistrationDate(sdf.parse("2009-03-31"));
		// }
		// catch(ParseException e) {
		// fail(e.getMessage());
		// }
	}

	// @Test
	public void checkTestDataSource() throws Exception {
		// System.out.println("dataSource=" + columnsDAO.getDataSource());
		//
		// assertNotNull("dataSource를 정상적으로 get 했는지를 확인한다.",
		// columnsDAO.getDataSource());

		System.out.println("dataSource=" + dataSource.getConnection());

		assertNotNull("dataSource를 정상적으로 get 했는지를 확인한다.",
				dataSource.getConnection());
	}

	// TODO 필요할 경우, 관련 자원들을 확인하고 테스트 한다.
	// @Test
	public void check() throws Exception {
		// assertNotNull(noticeDao);
		// assertNotNull(testNoticeVo);

		EgovMap egovMap = new EgovMap();

		egovMap.put("tableSchema", "TEST");

		List<String> tableNames = new ArrayList<String>();
		tableNames.add("COMTCADMINISTCODE");
		// tableNames.add("COMTCADMINISTCODERECPTNLOG");
		// tableNames.add("COMTCCMMNCLCODE");

		egovMap.put("tableNames", tableNames);

		List<EgovMap> columns = columnsDAO.selectAllTabColumnsList(egovMap);

		for (int i = 0; i < columns.size(); i++) {
			egovMap = columns.get(i);

			// String tableName = (String) egovMap.get("tableName");
			String columnName = (String) egovMap.get("columnName");

			// System.out.println("tableName=" + tableName);
			System.out.println("columnName=" + columnName);
		}

		// List<Integer> value1 = Arrays.asList(3, 2, 1);
		// List<Integer> value2 = Arrays.asList(3, 2, 1);
		// assertEquals("두 리스트의 값과 순서가 같음", value1, value2);

		List<EgovMap> comtcadministcodes = comtcadministcodes();

		// assertEquals("두 리스트의 값과 순서가 같음", columns, comtcadministcodes);

		System.out.println("dataSource="
				+ columnsDAO.getDataSource().toString());
	}

	private List<EgovMap> comtcadministcodes() throws Exception {
		List<EgovMap> egovMaps = new ArrayList<EgovMap>();

		EgovMap egovMap = new EgovMap();
		egovMap.put("columnName", "ADMINIST_ZONE_SE");
		egovMaps.add(egovMap);

		egovMap = new EgovMap();
		egovMap.put("columnName", "ADMINIST_ZONE_CODE");
		egovMaps.add(egovMap);

		egovMap = new EgovMap();
		egovMap.put("columnName", "USE_AT");
		egovMaps.add(egovMap);

		egovMap = new EgovMap();
		egovMap.put("columnName", "ADMINIST_ZONE_NM");
		egovMaps.add(egovMap);

		egovMap = new EgovMap();
		egovMap.put("columnName", "UPPER_ADMINIST_ZONE_CODE");
		egovMaps.add(egovMap);

		egovMap = new EgovMap();
		egovMap.put("columnName", "CREAT_DE");
		egovMaps.add(egovMap);

		egovMap = new EgovMap();
		egovMap.put("columnName", "ABL_DE");
		egovMaps.add(egovMap);

		egovMap = new EgovMap();
		egovMap.put("columnName", "FRST_REGIST_PNTTM");
		egovMaps.add(egovMap);

		egovMap = new EgovMap();
		egovMap.put("columnName", "FRST_REGISTER_ID");
		egovMaps.add(egovMap);

		egovMap = new EgovMap();
		egovMap.put("columnName", "LAST_UPDT_PNTTM");
		egovMaps.add(egovMap);

		egovMap = new EgovMap();
		egovMap.put("columnName", "LAST_UPDUSR_ID");
		egovMaps.add(egovMap);

		return egovMaps;
	}

	/**
	 * TODO ColumnsDAO의 메소드를 테스트하기 위한 코드를 작성한다.
	 */
	public void testMethodA() {

	}

	/**
	 * TODO ColumnsDAO의 메소드를 테스트하기 위한 코드를 작성한다.
	 */
	public void testMethodZ() {

	}

	@Test
	public void selectAllTabColumnsList() {
		try {
			EgovMap egovMapVO = new EgovMap();

			egovMapVO.put("tableSchema", "TEST");

			List<String> tableNames = new ArrayList<String>();
			tableNames.add("COMTCADMINISTCODE");
			// tableNames.add("COMTCADMINISTCODERECPTNLOG");
			// tableNames.add("COMTCCMMNCLCODE");

			egovMapVO.put("tableNames", tableNames);

			List<EgovMap> columns = columnsDAO
					.selectAllTabColumnsList(egovMapVO);

			System.out.println(columns);
			System.out.println(columns.toString());

			assertEquals(
					"두 객체의 값이 같음",
					"[{owner=TEST, tableName=COMTCADMINISTCODE, columnName=ADMINIST_ZONE_SE, dataType=CHAR, dataLength=1, nullable=N, columnId=1, comments=행정코드}, {owner=TEST, tableName=COMTCADMINISTCODE, columnName=ADMINIST_ZONE_CODE, dataType=VARCHAR2, dataLength=10, nullable=N, columnId=2, comments=행정코드}, {owner=TEST, tableName=COMTCADMINISTCODE, columnName=USE_AT, dataType=CHAR, dataLength=1, nullable=N, columnId=3, comments=행정코드}, {owner=TEST, tableName=COMTCADMINISTCODE, columnName=ADMINIST_ZONE_NM, dataType=VARCHAR2, dataLength=60, nullable=Y, columnId=4, comments=행정코드}, {owner=TEST, tableName=COMTCADMINISTCODE, columnName=UPPER_ADMINIST_ZONE_CODE, dataType=VARCHAR2, dataLength=10, nullable=Y, columnId=5, comments=행정코드}, {owner=TEST, tableName=COMTCADMINISTCODE, columnName=CREAT_DE, dataType=CHAR, dataLength=20, nullable=Y, columnId=6, comments=행정코드}, {owner=TEST, tableName=COMTCADMINISTCODE, columnName=ABL_DE, dataType=CHAR, dataLength=20, nullable=Y, columnId=7, comments=행정코드}, {owner=TEST, tableName=COMTCADMINISTCODE, columnName=FRST_REGIST_PNTTM, dataType=DATE, dataLength=7, nullable=Y, columnId=8, comments=행정코드}, {owner=TEST, tableName=COMTCADMINISTCODE, columnName=FRST_REGISTER_ID, dataType=VARCHAR2, dataLength=20, nullable=Y, columnId=9, comments=행정코드}, {owner=TEST, tableName=COMTCADMINISTCODE, columnName=LAST_UPDT_PNTTM, dataType=DATE, dataLength=7, nullable=Y, columnId=10, comments=행정코드}, {owner=TEST, tableName=COMTCADMINISTCODE, columnName=LAST_UPDUSR_ID, dataType=VARCHAR2, dataLength=20, nullable=Y, columnId=11, comments=행정코드}]",
					columns.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

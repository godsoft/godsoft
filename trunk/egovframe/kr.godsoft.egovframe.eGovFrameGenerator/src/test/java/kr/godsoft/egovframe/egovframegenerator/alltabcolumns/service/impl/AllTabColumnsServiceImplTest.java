package kr.godsoft.egovframe.egovframegenerator.alltabcolumns.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import model.Attribute;
import model.DataModelContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import egovframework.com.utl.fcc.service.EgovDateUtil;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/egovframework/spring/eGovFrameGenerator.xml" })
public class AllTabColumnsServiceImplTest {

	@Resource(name = "allTabColumnsService")
	AllTabColumnsServiceImpl allTabColumnsServiceImpl;

	// // TODO 필요할 경우, 스프링 ApplicationContext을 선언한다.
	// @Autowired
	// ApplicationContext aplicationContext;

	// // TODO VO를 사용한 경우, 관련 VO들을 선언한다.
	// NoticeVo testNoticeVo;

	// // TODO VO를 사용한 경우, 테스트에 사용할 VO들을 생성한다.
	// @Before
	// public void createTestNoticeVo() {
	// try {
	// testNoticeVo = (NoticeVo) aplicationContext.getBean("testNoticeVo");
	// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd",
	// java.util.Locale.getDefault());
	// testNoticeVo.setRegistrationDate(sdf.parse("2009-03-31"));
	// }
	// catch(ParseException e) {
	// fail(e.getMessage());
	// }
	// }

	// // TODO 필요할 경우, 관련 자원들을 확인하고 테스트 한다.
	// @Test
	// public void check() {
	// assertNotNull(noticeService);
	// assertNotNull(testNoticeVo);
	// }

	/**
	 * TODO AllTabColumnsServiceImpl의 메소드를 테스트하기 위한 코드를 작성한다.
	 */
	public void testMethodA() {

	}

	/**
	 * TODO AllTabColumnsServiceImpl의 메소드를 테스트하기 위한 코드를 작성한다.
	 */
	public void testMethodZ() {

	}

	// @Test
	public void selectAllTabColumnsList() {
		try {
			EgovMap egovMapVO = new EgovMap();

			egovMapVO.put("owner", "TEST");

			List<String> tableNames = new ArrayList<String>();
			tableNames.add("COMTCADMINISTCODE");
			// tableNames.add("COMTCADMINISTCODERECPTNLOG");
			// tableNames.add("COMTCCMMNCLCODE");

			egovMapVO.put("tableNames", tableNames);

			List<EgovMap> columns = allTabColumnsServiceImpl
					.selectAllTabColumnsList(egovMapVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void getDataModelContexts() {
		try {
			EgovMap egovMapVO = new EgovMap();

			egovMapVO.put("owner", "TEST");

			List<String> tableNames = new ArrayList<String>();
			tableNames.add("COMTCADMINISTCODE");
			// tableNames.add("COMTCADMINISTCODERECPTNLOG");
			// tableNames.add("COMTCCMMNCLCODE");

			egovMapVO.put("tableNames", tableNames);

			// dataModelContext
			DataModelContext dataModelContext = new DataModelContext();
			dataModelContext.setAuthor("이백행");
			dataModelContext.setTeam("갓소프트");
			dataModelContext.setCreateDate(EgovDateUtil.formatDate(
					EgovDateUtil.getToday(), "-"));
			dataModelContext
					.setPackageName("kr.godsoft.egovframe.generatorwebapp");

			dataModelContext.setVender("MySql");

			List<DataModelContext> dataModelContexts = allTabColumnsServiceImpl
					.getDataModelContexts(egovMapVO, dataModelContext);

			for (int i = 0; i < dataModelContexts.size(); i++) {
				dataModelContext = dataModelContexts.get(i);

				// System.out.println("dataModelContexts[" + i + "]="
				// + dataModelContext);

				System.out.println(dataModelContext.getEntity()
						.getTableComment());

				// dataModelContext.getAttributes().get(index)

				getAttributes(dataModelContext);

				getPrimaryKeys(dataModelContext);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void getAttributes(DataModelContext dataModelContext)
			throws Exception {
		List<Attribute> attributes = dataModelContext.getAttributes();

		for (int i = 0; i < attributes.size(); i++) {
			Attribute attribute = attributes.get(i);

			System.out.println(attribute.getLcName());
			System.out.println(attribute.getColumnComment());
		}
	}

	private void getPrimaryKeys(DataModelContext dataModelContext)
			throws Exception {
		List<Attribute> attributes = dataModelContext.getPrimaryKeys();

		for (int i = 0; i < attributes.size(); i++) {
			Attribute attribute = attributes.get(i);

			System.out.println(attribute.getLcName());
			System.out.println(attribute.getColumnComment());
		}
	}

}

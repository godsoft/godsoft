package kr.godsoft.egovframe.egovframegenerator.alltabcolumns.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

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
public class AllTabColumnsServiceTest {

	@Resource(name = "allTabColumnsService")
	AllTabColumnsService allTabColumnsService;

	// /**
	// * TODO AllTabColumnsService에 정의된 메소드 만큼의 추상 메소드를 선언한다.
	// */
	// public void testMethodA();
	//
	// /**
	// * TODO AllTabColumnsService에 정의된 메소드 만큼의 추상 메소드를 선언한다.
	// */
	// public void testMethodZ();

	@Test
	public void selectAllTabColumnsList() {
		try {
			EgovMap egovMapVO = new EgovMap();

			egovMapVO.put("owner", "TEST");

			List<String> tableNames = new ArrayList<String>();
			tableNames.add("COMTCADMINISTCODE");
			// tableNames.add("COMTCADMINISTCODERECPTNLOG");
			// tableNames.add("COMTCCMMNCLCODE");

			egovMapVO.put("tableNames", tableNames);

			List<EgovMap> columns = allTabColumnsService
					.selectAllTabColumnsList(egovMapVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

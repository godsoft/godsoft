package godsoft.codegen.alltabcols.service.impl;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.alltabcols.service.AllTabColsVO;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:context.xml" })
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
@Transactional
public class AllTabColsDAOTest {

	@Resource(name = "allTabColsDAO")
	private AllTabColsDAO allTabColsDAO;

	@Test
	public void selectAllTabColsList() throws Exception {
		AllTabColsVO allTabColsVO = new AllTabColsVO();
		allTabColsVO.setOwner("RTE");
		//		allTabColsVO.setTableName("SAMPLE");

		List<String> tableNames = new ArrayList<String>();
		tableNames.add("IDS");
		tableNames.add("SAMPLE");
		allTabColsVO.setTableNames(tableNames);

		List<EgovMap> results = allTabColsDAO.selectAllTabColsList(allTabColsVO);

		System.out.println(results);
	}
}

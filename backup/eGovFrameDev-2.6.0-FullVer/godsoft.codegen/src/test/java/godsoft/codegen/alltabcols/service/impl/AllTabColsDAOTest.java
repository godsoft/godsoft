package godsoft.codegen.alltabcols.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.cmm.OracleVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:godsoft/spring/codegen-context.xml" })
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
@Transactional
public class AllTabColsDAOTest {

	@Resource(name = "allTabColsDAO")
	private AllTabColsDAO allTabColsDAO;

	@Test
	public void selectAllTabColsList() throws Exception {
		OracleVO oracleVO = new OracleVO();
		oracleVO.setOwner("RTE");

		List<String> tableNames = new ArrayList<String>();

		//		tableNames.add("IDS");
		tableNames.add("SAMPLE");

		oracleVO.setTableNames(tableNames);

		List<EgovMap> results = allTabColsDAO.selectAllTabColsList(oracleVO);

		System.out.println(results);
	}
}

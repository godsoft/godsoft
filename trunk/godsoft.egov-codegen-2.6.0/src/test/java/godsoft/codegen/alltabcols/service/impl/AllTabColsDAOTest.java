package godsoft.codegen.alltabcols.service.impl;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.egov.codegen.alltabcols.service.impl.AllTabColsDAO;
import godsoft.egov.codegen.cmm.OracleVO;

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
@ContextConfiguration(locations = { "classpath:godsoft/spring/codegen/test-context.xml" })
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = true)
@Transactional
public class AllTabColsDAOTest {

	@Resource(name = "godsoft.codegen.alltabcols.allTabColsDAO")
	private AllTabColsDAO allTabColsDAO;

	@Test
	public void selectAllTabColsList() throws Exception {
		OracleVO oracleVO = new OracleVO();

		//		oracleVO.setOwner("RTE");
		oracleVO.setOwner("EGOV");

		List<String> tableNames = new ArrayList<String>();

		tableNames.add("IDS");
		tableNames.add("SAMPLE");

		oracleVO.setTableNames(tableNames);

		List<EgovMap> items = allTabColsDAO.selectAllTabColsList(oracleVO);

		System.out.println("items=" + items);
		System.out.println("items.size()=" + items.size());

		for (EgovMap item : items) {
			System.out.println("item=" + item);
		}
	}
}

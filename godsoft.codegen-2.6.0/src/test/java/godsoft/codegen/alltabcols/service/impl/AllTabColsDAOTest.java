package godsoft.codegen.alltabcols.service.impl;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.cmm.Entity;
import godsoft.codegen.cmm.OracleVO;
import godsoft.codegen.user.alltabcols.service.impl.AllTabColsDAO;

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

	@Test
	public void selectAllTabColsList2() throws Exception {
		OracleVO oracleVO = new OracleVO();

		//		oracleVO.setOwner("RTE");
		oracleVO.setOwner("EGOV");

		List<Entity> entitys = new ArrayList<Entity>();

		Entity entity = new Entity("TEST_IDS");
		entity.setTableName("IDS");
		entitys.add(entity);

		entity = new Entity("TEST_SAMPLE");
		entity.setTableName("SAMPLE");
		entitys.add(entity);

		oracleVO.setEntitys(entitys);

		List<EgovMap> items = allTabColsDAO.selectAllTabColsList(oracleVO);

		System.out.println("items=" + items);
		System.out.println("items.size()=" + items.size());

		for (EgovMap item : items) {
			System.out.println("item=" + item);
		}
	}

}

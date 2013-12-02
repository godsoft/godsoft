package godsoft.codegen.alltabcomments.service.impl;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.cmm.CodeGenUtils;
import godsoft.codegen.cmm.Entity;
import godsoft.codegen.cmm.OracleVO;
import godsoft.codegen.user.alltabcomments.service.impl.AllTabCommentsDAO;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.functors.EqualPredicate;
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
public class AllTabCommentsDAOTest {

	@Resource(name = "godsoft.codegen.alltabcomments.allTabCommentsDAO")
	private AllTabCommentsDAO allTabCommentsDAO;

	@Test
	public void selectAllTabCommentsList() throws Exception {
		OracleVO oracleVO = new OracleVO();

		//		oracleVO.setOwner("RTE");
		oracleVO.setOwner("EGOV");

		List<String> tableNames = new ArrayList<String>();

		tableNames.add("IDS");
		tableNames.add("SAMPLE");

		oracleVO.setTableNames(tableNames);

		List<EgovMap> items = allTabCommentsDAO.selectAllTabCommentsList(oracleVO);

		System.out.println("items=" + items);
		System.out.println("items.size()=" + items.size());

		int i = 0;

		for (EgovMap item : items) {
			System.out.println("item[" + i + "]=" + item);

			i++;
		}
	}

	@Test
	public void selectAllTabCommentsList2() throws Exception {
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

		List<EgovMap> items = allTabCommentsDAO.selectAllTabCommentsList(oracleVO);

		System.out.println("items=" + items);
		System.out.println("items.size()=" + items.size());

		int i = 0;

		for (EgovMap item : items) {
			System.out.println("item[" + i + "]=" + item);

			i++;
		}

		//		System.out.println(oracleVO.getEntitys().contains(new Entity("TEST_IDS")));
		//		System.out.println(oracleVO.getEntitys().contains("TEST_IDS"));

		//		CollectionUtils.

		String propertyName = "tableName";
		String value = "IDS";

		EqualPredicate equalPredicate = new EqualPredicate(value);
		BeanPredicate beanPredicate = new BeanPredicate(propertyName, equalPredicate);
		System.out.println("Below are person object whose " + propertyName + " is " + value);
		System.out.println(CollectionUtils.find(oracleVO.getEntitys(), beanPredicate));

		Entity entity2 = (Entity) CollectionUtils.find(oracleVO.getEntitys(), beanPredicate);
		System.out.println(entity2.getTableName());

		System.out.println(CodeGenUtils.CollectionUtilsFind(oracleVO.getEntitys(), "tableName", "sample"));
		System.out.println(CodeGenUtils.CollectionUtilsFind(oracleVO.getEntitys(), "tableName", "SAMPLE"));
	}
}

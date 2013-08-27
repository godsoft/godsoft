package godsoft.codegen.oracle.alltabcomments.service.impl;

import godsoft.codegen.cmm.OracleVO;
import godsoft.codegen.cmm.model.Entity;
import godsoft.codegen.oracle.alltabcomments.service.AllTabCommentsService;

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
@ContextConfiguration(locations = { "classpath:egovframework/spring/core-context.xml" })
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
@Transactional
public class AllTabCommentsServiceImplTest {

	@Resource(name = "allTabCommentsService")
	private AllTabCommentsService allTabCommentsService;

	@Test
	public void selectAllTabCommentsList004() throws Exception {
		OracleVO oracleVO = new OracleVO();
		oracleVO.setOwner("RTE");

		List<Entity> tableNames = new ArrayList<Entity>();

		Entity entity = new Entity("IDS001");
		entity.setTableName("IDS");
		tableNames.add(entity);

		entity = new Entity("SAMPLE001");
		entity.setTableName("SAMPLE");
		tableNames.add(entity);

		oracleVO.setTableNames(tableNames);

		allTabCommentsService.selectAllTabCommentsList(oracleVO);
	}

}

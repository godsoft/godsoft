package godsoft.codegen.alltabcomments.service.impl;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.alltabcomments.service.AllTabCommentsVO;

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
@ContextConfiguration(locations = { "classpath:godsoft/spring/codegen-context.xml" })
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
@Transactional
public class AllTabCommentsDAOTest {

	@Resource(name = "allTabCommentsDAO")
	private AllTabCommentsDAO allTabCommentsDAO;

	@Test
	public void selectAllTabCommentsList() throws Exception {
		AllTabCommentsVO allTabCommentsVO = new AllTabCommentsVO();
		allTabCommentsVO.setOwner("RTE");

		List<String> tableNames = new ArrayList<String>();

		tableNames.add("IDS");
		tableNames.add("SAMPLE");

		allTabCommentsVO.setTableNames(tableNames);

		List<EgovMap> results = allTabCommentsDAO.selectAllTabCommentsList(allTabCommentsVO);

		System.out.println(results);
	}
}

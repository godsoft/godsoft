package godsoft.codegen.oracle.alltabcomments.service.impl;

import godsoft.codegen.cmm.OracleVO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class AllTabCommentsDAOTest {

	@Resource(name = "allTabCommentsDAO")
	private AllTabCommentsDAO allTabCommentsDAO;

	@Test
	public void selectAllTabCommentsList() throws Exception {
		OracleVO oracleVO = new OracleVO();
		oracleVO.setOwner("RTE");

		List<String> tableNames = new ArrayList<String>();

		tableNames.add("IDS");
		tableNames.add("SAMPLE");

		oracleVO.setTableNames(tableNames);

		allTabCommentsDAO.selectAllTabCommentsList(oracleVO);
	}

	@Test
	public void selectAllTabCommentsList002() throws Exception {
		Map<String, Object> parameterObject = new HashMap<String, Object>();
		parameterObject.put("owner", "RTE");

		List<String> tableNames = new ArrayList<String>();

		tableNames.add("IDS");
		tableNames.add("SAMPLE");

		parameterObject.put("tableNames", tableNames);

		allTabCommentsDAO.selectAllTabCommentsList002(parameterObject);
	}

	@Test
	public void selectAllTabCommentsList003() throws Exception {
		Map<String, Object> parameterObject = new HashMap<String, Object>();
		parameterObject.put("owner", "RTE");

		List<Map<String, Object>> tableNames = new ArrayList<Map<String, Object>>();

		Map<String, Object> e = new HashMap<String, Object>();
		e.put("tableName", "IDS");
		e.put("entityName", "IDS001");
		tableNames.add((HashMap<String, Object>) e);

		e = new HashMap<String, Object>();
		e.put("tableName", "SAMPLE");
		e.put("entityName", "SAMPLE001");
		tableNames.add((HashMap<String, Object>) e);

		parameterObject.put("tableNames", tableNames);

		allTabCommentsDAO.selectAllTabCommentsList003(parameterObject);
	}

}

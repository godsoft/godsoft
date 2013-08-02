package godsoft.codegen.alltabcols.service;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.alltabcols.service.impl.AllTabColsDAO;

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
	public void test() throws Exception {
		AllTabColsVO allTabColsVO = new AllTabColsVO();
		allTabColsVO.setOwner("");
		allTabColsVO.setOwner("");

		List<EgovMap> resultVO = allTabColsDAO.selectAllTabColsList(allTabColsVO)

		System.out.println(resultVO);
	}
}

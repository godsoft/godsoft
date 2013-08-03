package godsoft.codegen.alltabcols.service.impl;

import godsoft.codegen.alltabcols.service.AllTabColsVO;
import godsoft.codegen.alltabcols.service.impl.AllTabColsDAO;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import antlr.collections.List;

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

		List<EgovMap> resultVO = allTabColsDAO
				.selectAllTabColsList(allTabColsVO);

		System.out.println(resultVO);
	}
}

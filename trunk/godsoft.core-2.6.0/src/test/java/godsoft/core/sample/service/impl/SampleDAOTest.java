package godsoft.core.sample.service.impl;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.core.sample.service.SampleDefaultVO;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Class Name : SampleDAOTest.java
 * @Description : Sample DAOTest Class
 * @Modification Information
 *
 * @author 갓소프트 이백행
 * @since 2013-11-20
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:godsoft/spring/egov/core/test-context.xml" })
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = true)
@Transactional
public class SampleDAOTest {

	@Resource(name = "godsoft.egov.core.sample.service.impl.sampleDAO")
	private SampleDAO sampleDAO;

	@Test
	public void test() throws Exception {
		SampleDefaultVO searchVO = new SampleDefaultVO();
		searchVO.setRecordCountPerPage(10);
		searchVO.setFirstIndex(0);

		List<EgovMap> samples = sampleDAO.selectSampleList(searchVO);

		System.out.println("samples=" + samples);
		System.out.println("samples.size()=" + samples.size());

		for (EgovMap sample : samples) {
			System.out.println("sample=" + sample);
		}
	}

}

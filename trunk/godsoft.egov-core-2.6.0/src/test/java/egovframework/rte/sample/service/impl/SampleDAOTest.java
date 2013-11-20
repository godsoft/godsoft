package egovframework.rte.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.sample.service.SampleDefaultVO;

/**
 * @Class Name : UserDAOTest.java
 * @Description : User DAOTest Class
 * @Modification Information
 *
 * @author (주)메타지아이에스컨설팅 이백행
 * @since 2013-11-14
 * @version 1.0
 * @see
 *
 *  Copyright (C)  All right reserved.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:godsoft/spring/test-context.xml" })
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = true)
@Transactional
public class SampleDAOTest {

	@Resource(name = "sampleDAO")
	private SampleDAO sampleDAO;

	@Test
	public void test() throws Exception {
		SampleDefaultVO searchVO = new SampleDefaultVO();
		searchVO.setRecordCountPerPage(10);
		searchVO.setFirstIndex(0);

		@SuppressWarnings("unchecked")
		List<EgovMap> samples = sampleDAO.selectSampleList(searchVO);

		System.out.println("samples=" + samples);

		for (EgovMap sample : samples) {
			System.out.println("sample=" + sample);
		}
	}

}

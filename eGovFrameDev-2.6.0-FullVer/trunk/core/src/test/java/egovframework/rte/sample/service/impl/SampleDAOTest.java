package egovframework.rte.sample.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import egovframework.rte.sample.service.SampleDefaultVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:egovframework/spring/core-context.xml" })
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
@Transactional
public class SampleDAOTest {

	@Resource(name = "sampleDAO")
	private SampleDAO sampleDAO;

	@Test
	public void selectSampleList() throws Exception {
		SampleDefaultVO searchVO = new SampleDefaultVO();
		searchVO.setRecordCountPerPage(10);
		searchVO.setFirstIndex(0);

		System.out.println(sampleDAO.selectSampleList(searchVO));
	}
}

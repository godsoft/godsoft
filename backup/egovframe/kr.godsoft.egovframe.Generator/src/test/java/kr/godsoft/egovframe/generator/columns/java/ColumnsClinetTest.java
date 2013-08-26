package kr.godsoft.egovframe.generator.columns.java;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import kr.godsoft.egovframe.generator.columns.service.ColumnsDefaultVO;
import model.DataModelContext;
import model.Entity;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public class ColumnsClinetTest {

	private static Log log = LogFactory.getLog(ColumnsClinetTest.class);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSelectColumnsList() {
		ColumnsClinet columnsClinet = new ColumnsClinet();

		try {
			ColumnsDefaultVO searchVO = new ColumnsDefaultVO();

			searchVO.setFirstIndex(0);
			searchVO.setRecordCountPerPage(1000);

			List<EgovMap> columns = columnsClinet.selectColumnsList(searchVO);

			if (columns != null) {
				for (int i = 0; i < columns.size(); i++) {
					EgovMap egovMap = columns.get(i);

					String tableName = (String) egovMap.get("tableName");
					String tableComment = (String) egovMap.get("tableComment");

					if (log.isDebugEnabled()) {
						log.debug("egovMap=" + egovMap);

						log.debug("tableName=" + tableName);
						log.debug("tableComment=" + tableComment);
					}
				}
			}

			List<Integer> value1 = Arrays.asList(3, 2, 1);
			List<Integer> value2 = Arrays.asList(3, 2, 1);

			assertEquals("두 리스트의 값과 순서가 같음", value1, value2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDataModelContext() {
		List<DataModelContext> dataModelContexts = new ArrayList<DataModelContext>();

		DataModelContext dataModelContext = new DataModelContext();
		dataModelContext.setAuthor("이백행");
		dataModelContext.setEntity(new Entity("comtcadministcode"));
		dataModelContexts.add(dataModelContext);

		dataModelContext = new DataModelContext();
		dataModelContext.setAuthor("이백행");
		dataModelContext.setEntity(new Entity("comtcadministcoderecptnlog"));
		dataModelContexts.add(dataModelContext);

		dataModelContext = new DataModelContext();
		dataModelContext.setAuthor("이백행");
		dataModelContext.setEntity(new Entity("comtccmmnclcode"));
		dataModelContexts.add(dataModelContext);

		assertEquals("이백행", dataModelContexts.get(0).getAuthor());
		assertEquals("이백행", dataModelContexts.get(1).getAuthor());
		assertEquals("이백행", dataModelContexts.get(2).getAuthor());

		assertEquals("comtcadministcode", dataModelContexts.get(0).getEntity()
				.getName());
		assertEquals("comtcadministcoderecptnlog", dataModelContexts.get(1)
				.getEntity().getName());
		assertEquals("comtccmmnclcode", dataModelContexts.get(2).getEntity()
				.getName());
	}

	@Test
	public void testDataModelContext2() throws Exception {
		List<DataModelContext> dataModelContexts = new ArrayList<DataModelContext>();

		DataModelContext dataModelContextVO = new DataModelContext();
		dataModelContextVO.setAuthor("이백행");

		DataModelContext dataModelContext = (DataModelContext) BeanUtils
				.cloneBean(dataModelContextVO);
		dataModelContext.setEntity(new Entity("comtcadministcode"));
		dataModelContexts.add(dataModelContext);

		dataModelContext = (DataModelContext) BeanUtils
				.cloneBean(dataModelContextVO);
		dataModelContext.setEntity(new Entity("comtcadministcoderecptnlog"));
		dataModelContexts.add(dataModelContext);

		dataModelContext = (DataModelContext) BeanUtils
				.cloneBean(dataModelContextVO);
		dataModelContext.setEntity(new Entity("comtccmmnclcode"));
		dataModelContexts.add(dataModelContext);

		assertEquals("이백행", dataModelContexts.get(0).getAuthor());
		assertEquals("이백행", dataModelContexts.get(1).getAuthor());
		assertEquals("이백행", dataModelContexts.get(2).getAuthor());

		assertEquals("comtcadministcode", dataModelContexts.get(0).getEntity()
				.getName());
		assertEquals("comtcadministcoderecptnlog", dataModelContexts.get(1)
				.getEntity().getName());
		assertEquals("comtccmmnclcode", dataModelContexts.get(2).getEntity()
				.getName());
	}

	@Test
	public void testHashSet() throws Exception {
		List<DataModelContext> dataModelContexts = new ArrayList<DataModelContext>();

		DataModelContext dataModelContextVO = new DataModelContext();
		dataModelContextVO.setAuthor("이백행");

		DataModelContext dataModelContext = (DataModelContext) BeanUtils
				.cloneBean(dataModelContextVO);
		dataModelContext.setEntity(new Entity("comtcadministcode"));
		dataModelContexts.add(dataModelContext);

		dataModelContext = (DataModelContext) BeanUtils
				.cloneBean(dataModelContextVO);
		dataModelContext.setEntity(new Entity("comtcadministcoderecptnlog"));
		dataModelContexts.add(dataModelContext);

		dataModelContext = (DataModelContext) BeanUtils
				.cloneBean(dataModelContextVO);
		dataModelContext.setEntity(new Entity("comtccmmnclcode"));
		dataModelContexts.add(dataModelContext);

		Set<DataModelContext> set = new HashSet<DataModelContext>(
				dataModelContexts);

		System.out.println(set);

		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {
			dataModelContext = (DataModelContext) iterator.next();

			System.out.println(dataModelContext.getAuthor());
			System.out.println(dataModelContext.getEntity().getName());
		}

	}

}
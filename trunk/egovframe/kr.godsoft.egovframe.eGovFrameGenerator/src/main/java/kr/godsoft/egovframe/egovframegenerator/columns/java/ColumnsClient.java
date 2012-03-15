package kr.godsoft.egovframe.egovframegenerator.columns.java;

import java.util.List;

import kr.godsoft.egovframe.egovframegenerator.columns.service.ColumnsDefaultVO;
import kr.godsoft.egovframe.egovframegenerator.columns.service.ColumnsService;
import kr.godsoft.egovframe.egovframegenerator.columns.service.ColumnsVO;
import kr.godsoft.egovframe.egovframegenerator.util.Util;
import model.Attribute;
import model.DataModelContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;

import egovframework.com.utl.fcc.service.EgovDateUtil;
import egovframework.rte.psl.dataaccess.util.EgovMap;

public class ColumnsClient {

	private static final Log log = LogFactory.getLog(ColumnsClient.class);

	private ApplicationContext applicationContext;

	private ColumnsService columnsService;

	public ColumnsClient() {
		applicationContext = Util.getApplicationContext();

		columnsService = (ColumnsService) applicationContext
				.getBean("columnsService");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ColumnsClient columnsClient = new ColumnsClient();

		try {
			// columnsClient.selectColumnsList();

			// columnsClient.selectColumnsListColumnsVO();

			// ColumnsVO columnsVO = new ColumnsVO();
			// columnsVO.setTableSchema("rte");
			//
			// columnsClient.getDataModelContext(columnsVO);

			columnsClient.getDataModelContexts();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Deprecated
	public void selectColumnsList() throws Exception {
		ColumnsDefaultVO searchVO = new ColumnsDefaultVO();
		searchVO.setRecordCountPerPage(10);
		searchVO.setFirstIndex(0);

		@SuppressWarnings("unchecked")
		List<EgovMap> colnums = columnsService.selectColumnsList(searchVO);

		if (colnums != null) {
			System.out.println(colnums);

			for (int i = 0; i < colnums.size(); i++) {
				EgovMap egovMap = colnums.get(i);

				System.out.println(egovMap);
			}
		}

	}

	@Deprecated
	public void selectColumnsListColumnsVO() throws Exception {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		ColumnsVO columnsVO = new ColumnsVO();

		columnsVO.setTableSchema("rte");

		List<EgovMap> colnums = columnsService.selectColumnsList(columnsVO);

		if (log.isDebugEnabled()) {
			log.debug("colnums=" + colnums);
		}

		if (colnums != null) {
			for (int i = 0; i < colnums.size(); i++) {
				EgovMap egovMap = colnums.get(i);

				if (log.isDebugEnabled()) {
					log.debug("egovMap=" + egovMap);
				}
			}
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}

	public List<EgovMap> selectColumnsList(ColumnsVO columnsVO)
			throws Exception {
		return columnsService.selectColumnsList(columnsVO);
	}

	public List<DataModelContext> getDataModelContexts(ColumnsVO columnsVO,
			DataModelContext dataModelContext) throws Exception {
		return columnsService.getDataModelContexts(columnsVO, dataModelContext);
	}

	@Deprecated
	public void getDataModelContexts() throws Exception {
		ColumnsVO columnsVO = new ColumnsVO();
		columnsVO.setTableSchema("rte");

		DataModelContext dataModelContext = new DataModelContext();
		dataModelContext.setAuthor("이백행");
		dataModelContext.setTeam("갓소프트");
		dataModelContext.setCreateDate(EgovDateUtil.formatDate(
				EgovDateUtil.getToday(), "-"));
		dataModelContext.setPackageName("kr.godsoft.egovframe.generatorwebapp");

		List<DataModelContext> dataModelContexts = getDataModelContexts(
				columnsVO, dataModelContext);

		for (int i = 0; i < dataModelContexts.size(); i++) {
			dataModelContext = dataModelContexts.get(i);

			if (log.isDebugEnabled()) {
				log.debug("dataModelContexts[" + i + "]=" + dataModelContext);
			}

			sql(dataModelContext);
		}
	}

	@Deprecated
	private void sql(DataModelContext dataModelContext) throws Exception {
		StringBuilder sql = new StringBuilder();

		// sql.append("SELECT * FROM ");
		// sql.append(dataModelContext.getEntity().getLcName());
		// sql.append(";");
		// sql.append("\n");

		sql.append("SELECT\n");

		List<Attribute> attributes = dataModelContext.getAttributes();

		for (int i = 0; i < attributes.size(); i++) {
			Attribute attribute = attributes.get(i);

			if (i == 0) {
				sql.append("    ");
			} else {
				sql.append("    , ");
			}

			sql.append(attribute.getLcName());
			sql.append("\n");
		}

		sql.append("FROM ");
		sql.append(dataModelContext.getEntity().getLcName());
		sql.append(";");
		sql.append("\n");

		if (log.isDebugEnabled()) {
			log.debug(sql);
		}
	}

}

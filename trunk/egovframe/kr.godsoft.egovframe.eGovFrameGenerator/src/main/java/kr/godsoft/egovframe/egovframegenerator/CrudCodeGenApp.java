package kr.godsoft.egovframe.egovframegenerator;

import java.util.ArrayList;
import java.util.List;

import kr.godsoft.egovframe.egovframegenerator.alltabcolumns.java.AllTabColumnsClient;
import kr.godsoft.egovframe.egovframegenerator.columns.java.ColumnsClient;
import kr.godsoft.egovframe.egovframegenerator.columns.service.ColumnsVO;
import model.DataModelContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import egovframework.com.utl.fcc.service.EgovDateUtil;
import egovframework.rte.psl.dataaccess.util.EgovMap;

public class CrudCodeGenApp {

	private static final Log log = LogFactory.getLog(CrudCodeGenApp.class);

	private ColumnsClient columnsClient;

	private AllTabColumnsClient allTabColumnsClient;

	private CrudCodeGenServiceImpl crudCodeGenServiceImpl;

	public CrudCodeGenApp() {
		columnsClient = new ColumnsClient();

		allTabColumnsClient = new AllTabColumnsClient();

		crudCodeGenServiceImpl = new CrudCodeGenServiceImpl();

		CrudCodeGenPath crudCodeGenPath = new CrudCodeGenPath();
		crudCodeGenPath
				.setProjectPath("../kr.godsoft.egovframe.GeneratorWebApp/");
		crudCodeGenPath.setJspPath("WEB-INF/jsp/egovframework/rte/");
		crudCodeGenPath
				.setSqlMapConfigPath("egovframework/sqlmap/rte/sql-map-config.xml");

		crudCodeGenServiceImpl.setCrudCodeGenPath(crudCodeGenPath);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CrudCodeGenApp crudCodeGenApp = new CrudCodeGenApp();

		try {
			// crudCodeGenApp.mysql();

			crudCodeGenApp.oracle();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void mysql() throws Exception {
		ColumnsVO columnsVO = new ColumnsVO();
		columnsVO.setTableSchema("rte");

		// List<String> tableNames = new ArrayList<String>();
		// tableNames.add("comtcadministcode");
		// // tableNames.add("comtcadministcoderecptnlog");
		// // tableNames.add("comtccmmnclcode");
		// columnsVO.setTableNames(tableNames);

		DataModelContext dataModelContext = new DataModelContext();
		dataModelContext.setAuthor("이백행");
		dataModelContext.setTeam("갓소프트");
		dataModelContext.setCreateDate(EgovDateUtil.formatDate(
				EgovDateUtil.getToday(), "-"));
		dataModelContext.setPackageName("kr.godsoft.egovframe.generatorwebapp");

		dataModelContext.setVender("MySql");

		List<DataModelContext> dataModelContexts = columnsClient
				.getDataModelContexts(columnsVO, dataModelContext);

		for (int i = 0; i < dataModelContexts.size(); i++) {
			dataModelContext = dataModelContexts.get(i);

			if (log.isDebugEnabled()) {
				log.debug("dataModelContexts[" + i + "]=" + dataModelContext);
			}

			crudCodeGenServiceImpl.genDefaultVO(dataModelContext);
			crudCodeGenServiceImpl.genVO(dataModelContext);
			crudCodeGenServiceImpl.genSQLMap(dataModelContext);
			crudCodeGenServiceImpl.genDao(dataModelContext);
			crudCodeGenServiceImpl.genService(dataModelContext);
			crudCodeGenServiceImpl.genServiceImpl(dataModelContext);
			crudCodeGenServiceImpl.genController(dataModelContext);
			crudCodeGenServiceImpl.genList(dataModelContext);
			crudCodeGenServiceImpl.genRegister(dataModelContext);

			crudCodeGenServiceImpl.setSqlMap(dataModelContext);
		}

		crudCodeGenServiceImpl.genSqlMapConfig(crudCodeGenServiceImpl
				.getSqlMap());
	}

	public void oracle() throws Exception {
		EgovMap egovMapVO = getEgovMap();
		DataModelContext dataModelContext = getDataModelContextOracle();

		List<DataModelContext> dataModelContexts = allTabColumnsClient
				.getDataModelContexts(egovMapVO, dataModelContext);

		for (int i = 0; i < dataModelContexts.size(); i++) {
			dataModelContext = dataModelContexts.get(i);

			if (log.isDebugEnabled()) {
				log.debug("dataModelContexts[" + i + "]=" + dataModelContext);
			}

			crudCodeGenServiceImpl.genDefaultVO(dataModelContext);
			crudCodeGenServiceImpl.genVO(dataModelContext);
			crudCodeGenServiceImpl.genSQLMap(dataModelContext);
			crudCodeGenServiceImpl.genDao(dataModelContext);
			crudCodeGenServiceImpl.genService(dataModelContext);
			crudCodeGenServiceImpl.genServiceImpl(dataModelContext);
			crudCodeGenServiceImpl.genController(dataModelContext);
			crudCodeGenServiceImpl.genList(dataModelContext);
			crudCodeGenServiceImpl.genRegister(dataModelContext);

			crudCodeGenServiceImpl.setSqlMap(dataModelContext);
		}

		crudCodeGenServiceImpl.genSqlMapConfig(crudCodeGenServiceImpl
				.getSqlMap());
	}

	private EgovMap getEgovMap() {
		EgovMap egovMapVO = new EgovMap();

		egovMapVO.put("owner", "TEST");

		List<String> tableNames = new ArrayList<String>();
		// tableNames.add("COMTCADMINISTCODE");
		// tableNames.add("COMTCADMINISTCODERECPTNLOG");
		// tableNames.add("COMTCCMMNCLCODE");
		// tableNames.add("MD_REPOVERSIONS");

		egovMapVO.put("tableNames", tableNames);

		return egovMapVO;
	}

	private DataModelContext getDataModelContextOracle() {
		// dataModelContext
		DataModelContext dataModelContext = new DataModelContext();
		dataModelContext.setAuthor("이백행");
		dataModelContext.setTeam("갓소프트");
		dataModelContext.setCreateDate(EgovDateUtil.formatDate(
				EgovDateUtil.getToday(), "-"));
		dataModelContext.setPackageName("kr.godsoft.egovframe.generatorwebapp");

		dataModelContext.setVender("Oracle");

		return dataModelContext;
	}

}

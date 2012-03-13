package kr.godsoft.egovframe.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import kr.godsoft.egovframe.generator.columns.java.ColumnsClinet;
import model.DataModelContext;
import operation.CrudCodeGen;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import egovframework.com.utl.fcc.service.EgovDateUtil;
import egovframework.rte.psl.dataaccess.util.EgovMap;

public class CrudGeneratorMySQL {

	private static Log log = LogFactory.getLog(CrudGeneratorMySQL.class);

	ColumnsClinet columnsClinet = new ColumnsClinet();

	/**
	 * 코드생성 인스턴스
	 */
	private CrudCodeGen crudCodeGen = new CrudCodeGen();;
	/**
	 * 데이타모델
	 */
	private DataModelContext dataModel;

	private List<DataModelContext> dataModelContexts = new ArrayList<DataModelContext>();

	List<EgovMap> columns;

	/**
	 * 패키지명
	 */
	private String packageName;

	private boolean isWriteStringToFile;

	private String projectPath;

	public CrudGeneratorMySQL() {
		packageName = "kr.godsoft.crud";

		// isWriteStringToFile = true;

		try {
			DataModelContext dataModelContextVO = new DataModelContext();

			dataModelContextVO.setAuthor("이백행");
			dataModelContextVO.setCreateDate(EgovDateUtil.formatDate(
					EgovDateUtil.getToday(), "."));
			dataModelContextVO.setTeam("갓소프트");

			dataModelContextVO
					.setPackageName("kr.godsoft.egovframe.generatorwebapp");

			dataModelContextVO.setVender("MySql");

			dataModelContexts = columnsClinet
					.getDataModelContexts(dataModelContextVO);
		} catch (Exception e) {
			e.printStackTrace();
		}

		projectPath = "../kr.godsoft.egovframe.GeneratorWebApp/";
	}

	public CrudGeneratorMySQL(DataModelContext dataModelContext)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("isWriteStringToFile="
					+ dataModelContext.getIsWriteStringToFile());
		}

		dataModelContexts = columnsClinet
				.getDataModelContexts(dataModelContext);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			DataModelContext dataModelContext = new DataModelContext();

			dataModelContext.setAuthor("이백행");
			dataModelContext.setCreateDate(EgovDateUtil.formatDate(
					EgovDateUtil.getToday(), "."));
			dataModelContext.setTeam("갓소프트");

			dataModelContext
					.setPackageName("kr.godsoft.egovframe.generatorwebapp");

			dataModelContext.setVender("MySql");

			dataModelContext
					.setProjectPath("../kr.godsoft.egovframe.GeneratorWebApp/");

			if (log.isDebugEnabled()) {
				log.debug("isWriteStringToFile="
						+ dataModelContext.getIsWriteStringToFile());
			}

			dataModelContext.setIsWriteStringToFile(true);

			if (log.isDebugEnabled()) {
				log.debug("isWriteStringToFile="
						+ dataModelContext.getIsWriteStringToFile());
			}

			CrudGeneratorMySQL crudGeneratorMySQL = new CrudGeneratorMySQL(
					dataModelContext);

			// crudGeneratorMySQL.deleteDirectory(dataModelContext);

			// crudGeneratorMySQL.generatorSQLMap();
			// crudGeneratorMySQL.generatorService();
			// crudGeneratorMySQL.generatorDefaultVO();
			// crudGeneratorMySQL.generatorVO();
			// crudGeneratorMySQL.generatorServiceImpl();
			// crudGeneratorMySQL.generatorDAO();
			// crudGeneratorMySQL.generatorController();
			// crudGeneratorMySQL.generatorListView();
			// crudGeneratorMySQL.generatorRegisterView();
			//
			// crudGeneratorMySQL.sqlMapConfigGenerator();

			crudGeneratorMySQL.indexJspGenerator();
		} catch (Exception e) {
		}
	}

	private void deleteDirectory(DataModelContext dataModelContext)
			throws Exception {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		if (log.isDebugEnabled()) {
			log.debug("projectSrcMainJavaPath="
					+ dataModelContext.getProjectSrcMainJavaPath());
			log.debug("projectSrcMainResourcesPath="
					+ dataModelContext.getProjectSrcMainResourcesPath());
			log.debug("projectJspPath=" + dataModelContext.getProjectJspPath());
		}

		FileUtils.deleteDirectory(new File(dataModelContext
				.getProjectSrcMainJavaPath()));
		FileUtils.deleteDirectory(new File(dataModelContext
				.getProjectSrcMainResourcesPath()));
		FileUtils
				.deleteDirectory(new File(dataModelContext.getProjectJspPath()));

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}

	public void generatorSQLMap() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		try {
			String templateFile = "eGovFrameTemplates/crud/resource/pkg/EgovSample_Sample2_SQL.vm";

			if (dataModelContexts != null) {
				for (int i = 0; i < dataModelContexts.size(); i++) {
					DataModelContext dataModelContext = dataModelContexts
							.get(i);

					if (log.isDebugEnabled()) {
						log.debug("dataModelContexts[" + i + "]="
								+ dataModelContext);
					}

					dataModelContext.setVoPackage(dataModelContext.getEntity());

					dataModelContext.setPathnameSqlMap(dataModelContext);

					String data = crudCodeGen.generate(dataModelContext,
							templateFile);

					writeStringToFile(
							dataModelContext.getIsWriteStringToFile(),
							dataModelContext.getPathnameSqlMap(), data);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}

	public void generatorService() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		try {
			String templateFile = "eGovFrameTemplates/crud/java/pkg/service/EgovSample2Service.vm";

			if (dataModelContexts != null) {
				for (int i = 0; i < dataModelContexts.size(); i++) {
					DataModelContext dataModelContext = dataModelContexts
							.get(i);

					if (log.isDebugEnabled()) {
						log.debug("dataModelContexts[" + i + "]="
								+ dataModelContext);
					}

					dataModelContext.setVoPackage(dataModelContext.getEntity());

					dataModelContext.setPathnameService(dataModelContext);

					String data = crudCodeGen.generate(dataModelContext,
							templateFile);

					writeStringToFile(
							dataModelContext.getIsWriteStringToFile(),
							dataModelContext.getPathnameService(), data);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}

	public void generatorDefaultVO() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		try {
			String templateFile = "eGovFrameTemplates/crud/java/pkg/service/Sample2DefaultVO.vm";

			if (dataModelContexts != null) {
				for (int i = 0; i < dataModelContexts.size(); i++) {
					DataModelContext dataModelContext = dataModelContexts
							.get(i);

					if (log.isDebugEnabled()) {
						log.debug("dataModelContexts[" + i + "]="
								+ dataModelContext);
					}

					dataModelContext.setVoPackage(dataModelContext.getEntity());

					dataModelContext.setPathnameDefaultVO(dataModelContext);

					String data = crudCodeGen.generate(dataModelContext,
							templateFile);

					writeStringToFile(
							dataModelContext.getIsWriteStringToFile(),
							dataModelContext.getPathnameDefaultVO(), data);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}

	public void generatorVO() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		try {
			String templateFile = "eGovFrameTemplates/crud/java/pkg/service/Sample2VO.vm";

			if (dataModelContexts != null) {
				for (int i = 0; i < dataModelContexts.size(); i++) {
					DataModelContext dataModelContext = dataModelContexts
							.get(i);

					if (log.isDebugEnabled()) {
						log.debug("dataModelContexts[" + i + "]="
								+ dataModelContext);
					}

					dataModelContext.setVoPackage(dataModelContext.getEntity());

					dataModelContext.setPathnameVO(dataModelContext);

					String data = crudCodeGen.generate(dataModelContext,
							templateFile);

					writeStringToFile(
							dataModelContext.getIsWriteStringToFile(),
							dataModelContext.getPathnameVO(), data);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}

	public void generatorServiceImpl() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		try {
			String templateFile = "eGovFrameTemplates/crud/java/pkg/service/impl/EgovSample2ServiceImpl.vm";

			if (dataModelContexts != null) {
				for (int i = 0; i < dataModelContexts.size(); i++) {
					DataModelContext dataModelContext = dataModelContexts
							.get(i);

					if (log.isDebugEnabled()) {
						log.debug("dataModelContexts[" + i + "]="
								+ dataModelContext);
					}

					dataModelContext.setVoPackage(dataModelContext.getEntity());
					dataModelContext
							.setDaoPackage(dataModelContext.getEntity());

					dataModelContext.setPathnameServiceImpl(dataModelContext);

					String data = crudCodeGen.generate(dataModelContext,
							templateFile);

					writeStringToFile(
							dataModelContext.getIsWriteStringToFile(),
							dataModelContext.getPathnameServiceImpl(), data);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}

	public void generatorDAO() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		try {
			String templateFile = "eGovFrameTemplates/crud/java/pkg/service/impl/Sample2DAO.vm";

			if (dataModelContexts != null) {
				for (int i = 0; i < dataModelContexts.size(); i++) {
					DataModelContext dataModelContext = dataModelContexts
							.get(i);

					if (log.isDebugEnabled()) {
						log.debug("dataModelContexts[" + i + "]="
								+ dataModelContext);
					}

					dataModelContext.setVoPackage(dataModelContext.getEntity());
					dataModelContext
							.setDaoPackage(dataModelContext.getEntity());

					dataModelContext.setPathnameDAO(dataModelContext);

					String data = crudCodeGen.generate(dataModelContext,
							templateFile);

					writeStringToFile(
							dataModelContext.getIsWriteStringToFile(),
							dataModelContext.getPathnameDAO(), data);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}

	public void generatorController() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		try {
			String templateFile = "eGovFrameTemplates/crud/java/pkg/web/EgovSample2Controller.vm";

			if (dataModelContexts != null) {
				for (int i = 0; i < dataModelContexts.size(); i++) {
					DataModelContext dataModelContext = dataModelContexts
							.get(i);

					if (log.isDebugEnabled()) {
						log.debug("dataModelContexts[" + i + "]="
								+ dataModelContext);
					}

					dataModelContext.setVoPackage(dataModelContext.getEntity());
					dataModelContext
							.setDaoPackage(dataModelContext.getEntity());
					dataModelContext.setControllerPackage(dataModelContext
							.getEntity());

					dataModelContext.setPathnameController(dataModelContext);

					String data = crudCodeGen.generate(dataModelContext,
							templateFile);

					writeStringToFile(
							dataModelContext.getIsWriteStringToFile(),
							dataModelContext.getPathnameController(), data);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}

	public void generatorListView() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		try {
			String templateFile = "eGovFrameTemplates/crud/jsp/pkg/egovSample2List.vm";

			if (dataModelContexts != null) {
				for (int i = 0; i < dataModelContexts.size(); i++) {
					DataModelContext dataModelContext = dataModelContexts
							.get(i);

					if (log.isDebugEnabled()) {
						log.debug("dataModelContexts[" + i + "]="
								+ dataModelContext);
					}

					dataModelContext.setVoPackage(dataModelContext.getEntity());
					dataModelContext
							.setDaoPackage(dataModelContext.getEntity());
					dataModelContext.setControllerPackage(dataModelContext
							.getEntity());

					dataModelContext.setPathnameListView(dataModelContext);

					String data = crudCodeGen.generate(dataModelContext,
							templateFile);

					writeStringToFile(
							dataModelContext.getIsWriteStringToFile(),
							dataModelContext.getPathnameListView(), data);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}

	public void generatorRegisterView() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		try {
			String templateFile = "eGovFrameTemplates/crud/jsp/pkg/egovSample2Register.vm";

			if (dataModelContexts != null) {
				for (int i = 0; i < dataModelContexts.size(); i++) {
					DataModelContext dataModelContext = dataModelContexts
							.get(i);

					if (log.isDebugEnabled()) {
						log.debug("dataModelContexts[" + i + "]="
								+ dataModelContext);
					}

					dataModelContext.setVoPackage(dataModelContext.getEntity());
					dataModelContext
							.setDaoPackage(dataModelContext.getEntity());
					dataModelContext.setControllerPackage(dataModelContext
							.getEntity());

					dataModelContext.setPathnameRegisterView(dataModelContext);

					String data = crudCodeGen.generate(dataModelContext,
							templateFile);

					writeStringToFile(
							dataModelContext.getIsWriteStringToFile(),
							dataModelContext.getPathnameRegisterView(), data);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}

	public void sqlMapConfigGenerator() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		try {
			String templateFile = "eGovFrameTemplates/crud/resource/pkg/sqlMapConfig.vm";

			if (dataModelContexts != null) {
				StringBuilder sqlMapStringBuilder = new StringBuilder();

				String sqlMapConfigPathname = "";

				DataModelContext dataModelContext2 = new DataModelContext();

				for (int i = 0; i < dataModelContexts.size(); i++) {
					DataModelContext dataModelContext = dataModelContexts
							.get(i);

					if (log.isDebugEnabled()) {
						log.debug("dataModelContexts[" + i + "]="
								+ dataModelContext);
					}

					dataModelContext.setSqlMapResource(dataModelContext);

					if (i == 0) {
						dataModelContext2 = (DataModelContext) BeanUtils
								.cloneBean(dataModelContext);

						dataModelContext2
								.setSqlMapConfigPathname(dataModelContext2);
					}

					sqlMapStringBuilder.append(dataModelContext
							.getSqlMapResource());
					sqlMapStringBuilder.append("\n");
				}

				if (log.isDebugEnabled()) {
					log.debug("sqlMap=" + sqlMapStringBuilder);

					log.debug("sqlMapConfigPathname=" + sqlMapConfigPathname);
				}

				dataModelContext2.setSqlMap(sqlMapStringBuilder.toString());

				String data = crudCodeGen.generate(dataModelContext2,
						templateFile);

				writeStringToFile(dataModelContext2.getIsWriteStringToFile(),
						dataModelContext2.getSqlMapConfigPathname(), data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}

	public void indexJspGenerator() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		try {
			String templateFile = "eGovFrameTemplates/crud/jsp/pkg/index.jsp.vm";

			if (dataModelContexts != null) {
				StringBuilder tempStringBuilder = new StringBuilder();

				DataModelContext dataModelContext2 = new DataModelContext();

				for (int i = 0; i < dataModelContexts.size(); i++) {
					DataModelContext dataModelContext = dataModelContexts
							.get(i);

					if (log.isDebugEnabled()) {
						log.debug("dataModelContexts[" + i + "]="
								+ dataModelContext);
					}

					if (i == 0) {
						dataModelContext2 = (DataModelContext) BeanUtils
								.cloneBean(dataModelContext);

						dataModelContext2.setIndexJsp(dataModelContext2);
					}

					tempStringBuilder.append("<a href=\"");
					tempStringBuilder.append(dataModelContext.getEntity()
							.getCcName());
					tempStringBuilder.append("/");
					tempStringBuilder.append(dataModelContext.getEntity()
							.getPcName());
					tempStringBuilder.append("List.do\">");
					tempStringBuilder.append(dataModelContext.getEntity()
							.getPcName());
					tempStringBuilder.append("</a>");
					tempStringBuilder.append("<br/>\n");
				}

				if (log.isDebugEnabled()) {
					log.debug("indexJspPathname="
							+ dataModelContext2.getIndexJspPathname());

					// log.debug("tempStringBuilder=" + tempStringBuilder);
				}

				dataModelContext2.setTemp(tempStringBuilder.toString());

				String data = crudCodeGen.generate(dataModelContext2,
						templateFile);

				writeStringToFile(dataModelContext2.getIsWriteStringToFile(),
						dataModelContext2.getIndexJspPathname(), data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}

	private void writeStringToFile(boolean isWriteStringToFile,
			String pathname, String data) throws Exception {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		if (log.isDebugEnabled()) {
			log.debug("pathname=" + pathname);
		}

		if (isWriteStringToFile) {
			File file = new File(pathname);

			FileUtils.writeStringToFile(file, data, "UTF-8");
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}

}

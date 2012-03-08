package kr.godsoft.egovframe.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import kr.godsoft.egovframe.generator.columns.java.ColumnsClinet;
import model.DataModelContext;
import operation.CrudCodeGen;

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

			crudGeneratorMySQL.generatorSQLMap();
			crudGeneratorMySQL.generatorService();
			crudGeneratorMySQL.generatorDefaultVO();
			crudGeneratorMySQL.generatorVO();
			crudGeneratorMySQL.generatorServiceImpl();
			crudGeneratorMySQL.generatorDAO();

			// crudGeneratorMySQL.generatorController();
			// crudGeneratorMySQL.generatorListView();
			// crudGeneratorMySQL.generatorRegisterView();
		} catch (Exception e) {
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

		dataModel.setPackageName(packageName + "."
				+ dataModel.getEntity().getName() + ".web");

		dataModel.setVoPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		dataModel.setServicePackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		dataModel.setImplPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service.impl");

		dataModel.setDaoPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service.impl");

		dataModel.setControllerPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".web");

		try {
			String templateFile = "eGovFrameTemplates/crud/java/pkg/web/EgovSample2Controller.vm";

			String data = crudCodeGen.generate(dataModel, templateFile);

			// src/main/resources/kr/godsoft/egovframe/crud/sqlmap

			// 문자열을 해당 파일에 카피
			// File file = new File(dir, "file1.txt");

			// String pathname = "src/main/resources/"
			// + packageName.replaceAll(".", "/") + "/sqlmap/"
			// + dataModel.getEntity().getName() + "/"
			// + dataModel.getEntity().getCcName() + "Columns_SQL.xml";

			String pathname = "src/main/java/"
					+ packageName.replaceAll("\\.", "/") + "/"
					+ dataModel.getEntity().getName() + "/web/"
					+ dataModel.getEntity().getPcName() + "Controller.java";

			if (log.isDebugEnabled()) {
				log.debug("pathname=" + pathname);
			}

			File file = new File(pathname);
			// String data = file.getAbsolutePath();
			// File file, String data, String encoding

			if (isWriteStringToFile) {
				FileUtils.writeStringToFile(file, data, "UTF-8");
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

		dataModel.setPackageName(packageName + "."
				+ dataModel.getEntity().getName() + ".web");

		dataModel.setVoPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		dataModel.setServicePackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		dataModel.setImplPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service.impl");

		dataModel.setDaoPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service.impl");

		dataModel.setControllerPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".web");

		try {
			String templateFile = "eGovFrameTemplates/crud/jsp/pkg/egovSample2List.vm";

			String data = crudCodeGen.generate(dataModel, templateFile);

			// src/main/resources/kr/godsoft/egovframe/crud/sqlmap

			// 문자열을 해당 파일에 카피
			// File file = new File(dir, "file1.txt");

			// String pathname = "src/main/resources/"
			// + packageName.replaceAll(".", "/") + "/sqlmap/"
			// + dataModel.getEntity().getName() + "/"
			// + dataModel.getEntity().getCcName() + "Columns_SQL.xml";

			String pathname = "src/main/webapp/WEB-INF/jsp/"
					+ packageName.replaceAll("\\.", "/") + "/"
					+ dataModel.getEntity().getName() + "/web/"
					+ dataModel.getEntity().getPcName() + "List.jsp";

			if (log.isDebugEnabled()) {
				log.debug("pathname=" + pathname);
			}

			File file = new File(pathname);
			// String data = file.getAbsolutePath();
			// File file, String data, String encoding

			if (isWriteStringToFile) {
				FileUtils.writeStringToFile(file, data, "UTF-8");
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

		dataModel.setPackageName(packageName + "."
				+ dataModel.getEntity().getName() + ".web");

		dataModel.setVoPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		dataModel.setServicePackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		dataModel.setImplPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service.impl");

		dataModel.setDaoPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service.impl");

		dataModel.setControllerPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".web");

		try {
			String templateFile = "eGovFrameTemplates/crud/jsp/pkg/egovSample2Register.vm";

			String data = crudCodeGen.generate(dataModel, templateFile);

			// src/main/resources/kr/godsoft/egovframe/crud/sqlmap

			// 문자열을 해당 파일에 카피
			// File file = new File(dir, "file1.txt");

			// String pathname = "src/main/resources/"
			// + packageName.replaceAll(".", "/") + "/sqlmap/"
			// + dataModel.getEntity().getName() + "/"
			// + dataModel.getEntity().getCcName() + "Columns_SQL.xml";

			String pathname = "src/main/webapp/WEB-INF/jsp/"
					+ packageName.replaceAll("\\.", "/") + "/"
					+ dataModel.getEntity().getName() + "/web/"
					+ dataModel.getEntity().getPcName() + "Register.jsp";

			if (log.isDebugEnabled()) {
				log.debug("pathname=" + pathname);
			}

			File file = new File(pathname);
			// String data = file.getAbsolutePath();
			// File file, String data, String encoding

			if (isWriteStringToFile) {
				FileUtils.writeStringToFile(file, data, "UTF-8");
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

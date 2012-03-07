package kr.godsoft.egovframe.generator;

import java.io.File;
import java.util.List;

import kr.godsoft.egovframe.generator.columns.java.ColumnsClinet;
import model.DataModelContext;
import operation.CrudCodeGen;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public class CrudGeneratorMySQL {

	private static Log log = LogFactory.getLog(CrudGeneratorMySQL.class);

	ColumnsClinet columnsClinet = new ColumnsClinet();

	/**
	 * 코드생성 인스턴스
	 */
	private CrudCodeGen crudCodeGen;
	/**
	 * 데이타모델
	 */
	private DataModelContext dataModel;

	List<EgovMap> columns;

	/**
	 * 패키지명
	 */
	private String packageName;

	private boolean isWriteStringToFile;

	public CrudGeneratorMySQL() {
		try {
			DataModelContext dataModelContextVO = new DataModelContext();

			dataModelContextVO.setAuthor("이백행");

			columnsClinet.getDataModelContexts(dataModelContextVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CrudGeneratorMySQL crudGenerator = new CrudGeneratorMySQL();

		// crudGenerator.generatorSQLMap();
		// crudGenerator.generatorService();
		// crudGenerator.generatorDefaultVO();
		// crudGenerator.generatorVO();
		// crudGenerator.generatorServiceImpl();
		// crudGenerator.generatorDAO();
		// crudGenerator.generatorController();
		// crudGenerator.generatorListView();
		// crudGenerator.generatorRegisterView();
	}

	public void generatorSQLMap() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		dataModel.setPackageName(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		dataModel.setVoPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		try {
			String templateFile = "eGovFrameTemplates/crud/resource/pkg/EgovSample_Sample2_SQL.vm";

			String data = crudCodeGen.generate(dataModel, templateFile);

			String pathname = "src/main/resources/"
					+ packageName.replaceAll("\\.", "/") + "/sqlmap/"
					+ dataModel.getEntity().getName() + "/"
					+ dataModel.getEntity().getPcName() + "_SQL.xml";

			if (log.isDebugEnabled()) {
				log.debug("pathname=" + pathname);
			}

			File file = new File(pathname);

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

	public void generatorService() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		dataModel.setPackageName(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		dataModel.setVoPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		dataModel.setServicePackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		try {
			String templateFile = "eGovFrameTemplates/crud/java/pkg/service/EgovSample2Service.vm";

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
					+ dataModel.getEntity().getName() + "/service/"
					+ dataModel.getEntity().getPcName() + ".java";

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

	public void generatorDefaultVO() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		dataModel.setPackageName(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		dataModel.setVoPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		dataModel.setServicePackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		try {
			String templateFile = "eGovFrameTemplates/crud/java/pkg/service/Sample2DefaultVO.vm";

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
					+ dataModel.getEntity().getName() + "/"
					+ dataModel.getEntity().getPcName() + "DefaultVO.java";

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

	public void generatorVO() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		dataModel.setPackageName(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		dataModel.setVoPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		dataModel.setServicePackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		try {
			String templateFile = "eGovFrameTemplates/crud/java/pkg/service/Sample2VO.vm";

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
					+ dataModel.getEntity().getName() + "/"
					+ dataModel.getEntity().getPcName() + "VO.java";

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

	public void generatorServiceImpl() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		dataModel.setPackageName(packageName + "."
				+ dataModel.getEntity().getName() + ".service.impl");

		dataModel.setVoPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		dataModel.setServicePackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		dataModel.setImplPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service.impl");

		dataModel.setDaoPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service.impl");

		try {
			String templateFile = "eGovFrameTemplates/crud/java/pkg/service/impl/EgovSample2ServiceImpl.vm";

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
					+ dataModel.getEntity().getName() + "/service/impl/"
					+ dataModel.getEntity().getPcName() + "ServiceImpl.java";

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

	public void generatorDAO() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		dataModel.setPackageName(packageName + "."
				+ dataModel.getEntity().getName() + ".service.impl");

		dataModel.setVoPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		dataModel.setServicePackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service");

		dataModel.setImplPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service.impl");

		dataModel.setDaoPackage(packageName + "."
				+ dataModel.getEntity().getName() + ".service.impl");

		try {
			String templateFile = "eGovFrameTemplates/crud/java/pkg/service/impl/Sample2DAO.vm";

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
					+ dataModel.getEntity().getName() + "/service/impl/"
					+ dataModel.getEntity().getPcName() + "DAO.java";

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

}

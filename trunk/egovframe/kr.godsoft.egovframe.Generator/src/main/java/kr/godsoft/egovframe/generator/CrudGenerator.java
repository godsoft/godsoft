package kr.godsoft.egovframe.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import kr.godsoft.egovframe.generator.columns.java.ColumnsClinet;
import kr.godsoft.egovframe.generator.columns.service.ColumnsDefaultVO;
import model.Attribute;
import model.DataModelContext;
import model.Entity;
import operation.CrudCodeGen;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import egovframework.com.utl.fcc.service.EgovDateUtil;
import egovframework.rte.psl.dataaccess.util.EgovMap;

public class CrudGenerator {

	private static Log log = LogFactory.getLog(CrudGenerator.class);

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

	public CrudGenerator() {
		packageName = "kr.godsoft.crud";

		isWriteStringToFile = false;

		try {
			ColumnsDefaultVO searchVO = new ColumnsDefaultVO();

			searchVO.setFirstIndex(0);
			searchVO.setRecordCountPerPage(1000);

			columns = columnsClinet.selectColumnsList(searchVO);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String name = "";

		if (columns != null) {
			for (int i = 0, size = columns.size(); i < size; i++) {
				EgovMap egovMap = columns.get(i);

				if (log.isDebugEnabled()) {
					log.debug("tableName[" + i + "]="
							+ egovMap.get("tableName"));
				}

				name = (String) egovMap.get("tableName");

				if (i == 0) {
					break;
				}
			}
		}

		crudCodeGen = new CrudCodeGen();

		dataModel = new DataModelContext();

		dataModel.setPackageName("pkg");
		dataModel.setAuthor("이백행");
		dataModel.setTeam("갓소프트");
		dataModel.setVender("MySql");

		if (log.isDebugEnabled()) {
			log.debug(EgovDateUtil.getToday());
			log.debug(EgovDateUtil.getCurrentDate(""));
			// log.debug(EgovDateUtil.getCurrentDate("yyyy-mm-dd"));
			log.debug(EgovDateUtil.formatDate(EgovDateUtil.getToday(), "."));
		}

		dataModel.setCreateDate(EgovDateUtil.formatDate(
				EgovDateUtil.getToday(), "."));

		Entity entity = new Entity(name);

		dataModel.setEntity(entity);

		List<Attribute> attributes = new ArrayList<Attribute>();
		List<Attribute> primaryKeys = new ArrayList<Attribute>();

		// Attribute attr = new Attribute("ID");
		// attr.setJavaType("String");
		// attributes.add(attr);
		// primaryKeys.add(attr);
		//
		// attr = new Attribute("NAME");
		// attr.setJavaType("String");
		// attributes.add(attr);
		// // primaryKeys.add(attr);
		//
		// attr = new Attribute("DESCRIPTION");
		// attr.setJavaType("String");
		// attributes.add(attr);
		//
		// attr = new Attribute("USE_YN");
		// attr.setJavaType("String");
		// attributes.add(attr);
		//
		// attr = new Attribute("REG_USER");
		// attr.setJavaType("String");
		// attributes.add(attr);

		if (columns != null) {
			for (int i = 0, size = columns.size(); i < size; i++) {
				EgovMap egovMap = columns.get(i);

				if (log.isDebugEnabled()) {
					log.debug("tableName=" + egovMap.get("tableName"));
					log.debug("columnName=" + egovMap.get("columnName"));
					log.debug("columnDefault=" + egovMap.get("columnDefault"));
					log.debug("dataType=" + egovMap.get("dataType"));
					log.debug("characterMaximumLength="
							+ egovMap.get("characterMaximumLength"));
					log.debug("columnKey=" + egovMap.get("columnKey"));
					log.debug("columnComment=" + egovMap.get("columnComment"));
				}

				String columnName = (String) egovMap.get("columnName");
				String dataType = (String) egovMap.get("dataType");
				String columnKey = (String) egovMap.get("columnKey");
				String columnComment = (String) egovMap.get("columnComment");

				Attribute attr = new Attribute(columnName);

				if ("char".equals(dataType) || "varchar".equals(dataType)) {
					attr.setJavaType("String");
				}

				attr.setColumnComment(columnComment);

				attributes.add(attr);

				if ("PRI".equals(columnKey)) {
					primaryKeys.add(attr);
				}
			}
		}

		dataModel.setAttributes(attributes);
		dataModel.setPrimaryKeys(primaryKeys);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CrudGenerator crudGenerator = new CrudGenerator();

		// crudGenerator.generatorSQLMap();
		// crudGenerator.generatorService();
		// crudGenerator.generatorDefaultVO();
		// crudGenerator.generatorVO();
		// crudGenerator.generatorServiceImpl();
		// crudGenerator.generatorDAO();
		// crudGenerator.generatorController();
		// crudGenerator.generatorListView();
		// crudGenerator.generatorRegisterView();

		crudGenerator.excel();
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

	public void excel() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		try {
			// InputStream inp = new FileInputStream(
			// "D:/eGovFrameDev-2.0.0-FullVer/workspace/kr.godsoft.egovframe.Generator/doc/COM_테이블정의서_1단계.xls");
			// InputStream inp = new FileInputStream("D:/temp/행정표준용어.xls");
			// InputStream inp = new
			// FileInputStream("D:/temp/COM_테이블정의서_1단계.xls");
			// InputStream inp = new FileInputStream(
			// "D:/temp/사본 - COM_테이블정의서_1단계.xls");
			// InputStream inp = new FileInputStream(
			// "D:/temp/사본 - COM_테이블정의서_1단계.xlsx");

			// InputStream inp = new FileInputStream("D:/temp/test.xlsx");

			InputStream inp = new FileInputStream("D:/temp/Book1.xls");

			// InputStream inp = new FileInputStream("workbook.xlsx");

			HSSFWorkbook wb = new HSSFWorkbook();

			POIFSFileSystem fs = new POIFSFileSystem(inp);
			wb = new HSSFWorkbook(fs);

			int numberOfSheets = wb.getNumberOfSheets();

			if (log.isDebugEnabled()) {
				log.debug("numberOfSheets=" + numberOfSheets);
			}

			// Workbook wb = WorkbookFactory.create(inp);
			HSSFSheet sheet = wb.getSheetAt(0);

			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows(); // 행개수

			if (log.isDebugEnabled()) {
				log.debug("physicalNumberOfRows=" + physicalNumberOfRows);
			}

			HSSFRow row = sheet.getRow(1);

			int physicalNumberOfCells = row.getPhysicalNumberOfCells(); // 셀 개수
																		// 가져오기

			if (log.isDebugEnabled()) {
				log.debug("physicalNumberOfCells=" + physicalNumberOfCells);
			}

			HSSFCell cell = row.getCell(0);

			// if (cell == null) {
			if (log.isDebugEnabled()) {
				log.debug("cell=" + cell);
				log.debug("cell=" + cell.getStringCellValue());
			}
			// }

		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}

}

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
import org.apache.commons.io.LineIterator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;

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

		crudGenerator.generatorSQLMap();
		// crudGenerator.generatorService();
		// crudGenerator.generatorDefaultVO();
		// crudGenerator.generatorVO();
		// crudGenerator.generatorServiceImpl();
		// crudGenerator.generatorDAO();
		// crudGenerator.generatorController();
		// crudGenerator.generatorListView();
		// crudGenerator.generatorRegisterView();

		// crudGenerator.excel();

		// crudGenerator.readingWorkbooks2();

		// crudGenerator.gettingTheCellContents();

		// crudGenerator.test();

		// crudGenerator.setTableComment();
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

	@Deprecated
	public void excel() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		try {
			InputStream inp = new FileInputStream("doc/COM_테이블정의서_1단계.xls");

			// InputStream inp = new FileInputStream("workbook.xlsx");

			HSSFWorkbook wb = new HSSFWorkbook();

			POIFSFileSystem fs = new POIFSFileSystem(inp);
			wb = new HSSFWorkbook(fs);

			int numberOfSheets = wb.getNumberOfSheets();

			if (log.isDebugEnabled()) {
				log.debug("numberOfSheets=" + numberOfSheets);
			}

			// Workbook wb = WorkbookFactory.create(inp);
			HSSFSheet sheet = wb.getSheetAt(3);

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

	@Deprecated
	public void readingWorkbooks() {
		try {
			InputStream inp = new FileInputStream("doc/COM_테이블정의서_1단계.xls");
			// InputStream inp = new FileInputStream("workbook.xlsx");

			Workbook wb = new HSSFWorkbook(inp);

			int numberOfSheets = wb.getNumberOfSheets();

			if (log.isDebugEnabled()) {
				log.debug("numberOfSheets=" + numberOfSheets);
			}

			Sheet sheet = wb.getSheetAt(2);

			StringBuffer stringBuffer = new StringBuffer();

			// 테이블ID, 테이블명
			Row row = sheet.getRow(2);
			Cell cell = row.getCell(2);

			if (log.isDebugEnabled()) {
				// log.debug("cell=" + cell);
				log.debug("테이블ID=" + cell.getRichStringCellValue().getString());
			}

			stringBuffer.append("ALTER TABLE ");
			stringBuffer.append(cell.getRichStringCellValue().getString()
					.toLowerCase());

			cell = row.getCell(5);

			if (log.isDebugEnabled()) {
				// log.debug("cell=" + cell);
				log.debug("테이블명=" + cell.getRichStringCellValue().getString());
			}

			stringBuffer.append(" COMMENT='");
			stringBuffer.append(cell.getRichStringCellValue().getString()
					.toLowerCase());
			stringBuffer.append("';\n");

			// 테이블설명
			row = sheet.getRow(3);
			cell = row.getCell(2);

			if (log.isDebugEnabled()) {
				// log.debug("cell=" + cell);
				log.debug("테이블설명=" + cell.getRichStringCellValue().getString());
			}

			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();

			if (log.isDebugEnabled()) {
				log.debug("physicalNumberOfRows=" + physicalNumberOfRows);
			}

			for (int i = 5; i < physicalNumberOfRows; i++) {
				row = sheet.getRow(i);

				// 컬럼ID
				Cell cell2 = row.getCell(1);

				// 컬럼명
				Cell cell3 = row.getCell(2);

				// 타입
				Cell cell4 = row.getCell(3);

				// // 길이
				// Cell cell5 = row.getCell(4);
				//
				// // NULL
				// Cell cell6 = row.getCell(5);
				//
				// // DEFAULT
				// Cell cell8 = row.getCell(7);

				stringBuffer.append("ALTER TABLE ");
				stringBuffer.append(cell2.getRichStringCellValue().getString()
						.toLowerCase());
				stringBuffer.append(" CHANGE ");
				stringBuffer.append(cell2.getRichStringCellValue().getString()
						.toLowerCase());
				stringBuffer.append(" ");
				stringBuffer.append(cell2.getRichStringCellValue().getString()
						.toLowerCase());

				stringBuffer.append(" CHAR(3) NOT NULL COMMENT '분류코드'");

				stringBuffer.append("\n");

				if ("".equals(cell2.getRichStringCellValue().getString())) {
					break;
				}

				if (log.isDebugEnabled()) {
					log.debug("컬럼ID="
							+ cell2.getRichStringCellValue().getString());
					log.debug("컬럼명="
							+ cell3.getRichStringCellValue().getString());
					log.debug("타입="
							+ cell4.getRichStringCellValue().getString());
					// log.debug("길이="
					// + cell5.getRichStringCellValue().getString());
					// log.debug("NULL="
					// + cell6.getRichStringCellValue().getString());
					// log.debug("DEFAULT="
					// + cell8.getRichStringCellValue().getString());
				}
			}

			if (log.isDebugEnabled()) {
				log.debug(stringBuffer.toString());
			}
		} catch (Exception e) {
		}
	}

	@Deprecated
	public void readingWorkbooks2() {
		try {
			InputStream inp = new FileInputStream("doc/COM_테이블정의서_1단계.xls");
			// InputStream inp = new FileInputStream("workbook.xlsx");

			Workbook wb = new HSSFWorkbook(inp);

			int numberOfSheets = wb.getNumberOfSheets();

			if (log.isDebugEnabled()) {
				log.debug("numberOfSheets=" + numberOfSheets);
			}

			Sheet sheet = wb.getSheetAt(2);

			StringBuffer stringBuffer = new StringBuffer();

			// 테이블ID, 테이블명
			Row row = sheet.getRow(2);
			Cell cell = row.getCell(2);

			String tableName = cell.getRichStringCellValue().getString();

			if (log.isDebugEnabled()) {
				// log.debug("cell=" + cell);
				log.debug("테이블ID=" + cell.getRichStringCellValue().getString());
			}

			stringBuffer.append("ALTER TABLE ");
			stringBuffer.append(cell.getRichStringCellValue().getString()
					.toLowerCase());

			cell = row.getCell(5);

			String tableComment = cell.getRichStringCellValue().getString();

			if (log.isDebugEnabled()) {
				// log.debug("cell=" + cell);
				log.debug("테이블명=" + cell.getRichStringCellValue().getString());
			}

			stringBuffer.append(" COMMENT='");
			stringBuffer.append(cell.getRichStringCellValue().getString()
					.toLowerCase());
			stringBuffer.append("';\n");

			// 테이블설명
			row = sheet.getRow(3);
			cell = row.getCell(2);

			if (log.isDebugEnabled()) {
				// log.debug("cell=" + cell);
				log.debug("테이블설명=" + cell.getRichStringCellValue().getString());
			}

			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();

			if (log.isDebugEnabled()) {
				log.debug("physicalNumberOfRows=" + physicalNumberOfRows);
			}

			for (int i = 5; i < physicalNumberOfRows; i++) {
				row = sheet.getRow(i);

				// 컬럼ID
				Cell cell2 = row.getCell(1);

				// 컬럼명
				Cell cell3 = row.getCell(2);

				// 타입
				Cell cell4 = row.getCell(3);

				// // 길이
				// Cell cell5 = row.getCell(4);
				//
				// // NULL
				// Cell cell6 = row.getCell(5);
				//
				// // DEFAULT
				// Cell cell8 = row.getCell(7);

				stringBuffer.append("ALTER TABLE ");
				stringBuffer.append(cell2.getRichStringCellValue().getString()
						.toLowerCase());
				stringBuffer.append(" CHANGE ");
				stringBuffer.append(cell2.getRichStringCellValue().getString()
						.toLowerCase());
				stringBuffer.append(" ");
				stringBuffer.append(cell2.getRichStringCellValue().getString()
						.toLowerCase());

				stringBuffer.append(" CHAR(3) NOT NULL COMMENT '분류코드'");

				stringBuffer.append("\n");

				if ("".equals(cell2.getRichStringCellValue().getString())) {
					break;
				}

				if (log.isDebugEnabled()) {
					log.debug("컬럼ID="
							+ cell2.getRichStringCellValue().getString());
					log.debug("컬럼명="
							+ cell3.getRichStringCellValue().getString());
					log.debug("타입="
							+ cell4.getRichStringCellValue().getString());
					// log.debug("길이="
					// + cell5.getRichStringCellValue().getString());
					// log.debug("NULL="
					// + cell6.getRichStringCellValue().getString());
					// log.debug("DEFAULT="
					// + cell8.getRichStringCellValue().getString());
				}
			}

			if (log.isDebugEnabled()) {
				// log.debug(stringBuffer.toString());
			}

			// Line iterator
			File file = new File(
					"doc/전체_테이블_생성_스크립트-2.0.0/mysql/ddl/com4_DDL_Mysql.sql");

			LineIterator it = FileUtils.lineIterator(file, "UTF-8");
			// LineIterator it = FileUtils.lineIterator(file);
			try {
				while (it.hasNext()) {
					String line = it.nextLine();
					// / do something with line

					if (log.isDebugEnabled()) {
						if (("CREATE TABLE " + tableName).equals(line)) {
							log.debug("line=" + line);
						}
					}
				}
			} finally {
				LineIterator.closeQuietly(it);
			}
		} catch (Exception e) {
		}
	}

	@Deprecated
	public void gettingTheCellContents() {
		try {
			InputStream inp = new FileInputStream("doc/COM_테이블정의서_1단계.xls");
			// InputStream inp = new FileInputStream("workbook.xlsx");

			Workbook wb = new HSSFWorkbook(inp);

			int numberOfSheets = wb.getNumberOfSheets();

			if (log.isDebugEnabled()) {
				log.debug("numberOfSheets=" + numberOfSheets);
			}

			Sheet sheet1 = wb.getSheetAt(2);
			for (Row row : sheet1) {
				for (Cell cell : row) {
					CellReference cellRef = new CellReference(row.getRowNum(),
							cell.getColumnIndex());
					System.out.print(cellRef.formatAsString());
					System.out.print(" - ");

					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						System.out.println(cell.getRichStringCellValue()
								.getString());
						break;
					case Cell.CELL_TYPE_NUMERIC:
						if (DateUtil.isCellDateFormatted(cell)) {
							System.out.println(cell.getDateCellValue());
						} else {
							System.out.println(cell.getNumericCellValue());
						}
						break;
					case Cell.CELL_TYPE_BOOLEAN:
						System.out.println(cell.getBooleanCellValue());
						break;
					case Cell.CELL_TYPE_FORMULA:
						System.out.println(cell.getCellFormula());
						break;
					default:
						System.out.println();
					}
				}
			}
		} catch (Exception e) {
		}
	}

	@Deprecated
	public void test() {
		try {
			File file = new File(
					"doc/전체_테이블_생성_스크립트-2.0.0/mysql/ddl/com4_DDL_Mysql.sql");
			List lines = FileUtils.readLines(file, "UTF-8");

			if (log.isDebugEnabled()) {
				log.debug("lines=" + lines);

				log.debug(lines.indexOf("CREATE TABLE COMTCCMMNCLCODE"));
			}

			int i = 0;

			// for (int i = 0, size = lines.size(); i < size; i++) {
			for (int index = lines.indexOf("CREATE TABLE COMTCCMMNCLCODE") + 2, size = index + 1000; index < size; index++) {
				String line = (String) lines.get(index);

				if (log.isDebugEnabled()) {
					log.debug("line=" + line);
				}

				// if (";".equals(line)) {
				if (line.indexOf("PRIMARY KEY") > -1) {
					break;
				}

				i++;
			}
		} catch (Exception e) {
		}
	}

	@Deprecated
	public void setTableComment() {
		try {
			// String pathname = "";

			InputStream inp = new FileInputStream("doc/COM_테이블정의서_1단계.xls");
			// InputStream inp = new FileInputStream("workbook.xlsx");

			Workbook wb = new HSSFWorkbook(inp);

			int numberOfSheets = wb.getNumberOfSheets();

			if (log.isDebugEnabled()) {
				log.debug("numberOfSheets=" + numberOfSheets);
			}

			Sheet sheet = wb.getSheetAt(2);

			StringBuffer stringBuffer = new StringBuffer();

			// 테이블ID, 테이블명
			Row row = sheet.getRow(2);
			Cell cell = row.getCell(2);

			if (log.isDebugEnabled()) {
				// log.debug("cell=" + cell);
				log.debug("테이블ID=" + cell.getRichStringCellValue().getString());
			}

			stringBuffer.append("ALTER TABLE ");
			stringBuffer.append(cell.getRichStringCellValue().getString()
					.toLowerCase());

			cell = row.getCell(5);

			if (log.isDebugEnabled()) {
				// log.debug("cell=" + cell);
				log.debug("테이블명=" + cell.getRichStringCellValue().getString());
			}

			stringBuffer.append(" COMMENT='");
			stringBuffer.append(cell.getRichStringCellValue().getString()
					.toLowerCase());
			stringBuffer.append("';\n");

			// 테이블설명
			row = sheet.getRow(3);
			cell = row.getCell(2);

			if (log.isDebugEnabled()) {
				// log.debug("cell=" + cell);
				log.debug("테이블설명=" + cell.getRichStringCellValue().getString());
			}

			if (log.isDebugEnabled()) {
				log.debug(stringBuffer.toString());
			}
		} catch (Exception e) {
		}
	}

}

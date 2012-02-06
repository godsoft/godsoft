package kr.godsoft.egovframe.generator;

import java.util.ArrayList;
import java.util.List;

import kr.godsoft.egovframe.generator.columns.service.ColumnsDefaultVO;
import kr.godsoft.egovframe.generator.columns.service.ColumnsService;
import model.Attribute;
import model.DataModelContext;
import model.Entity;
import operation.CrudCodeGen;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import egovframework.com.utl.fcc.service.EgovDateUtil;
import egovframework.rte.psl.dataaccess.util.EgovMap;

public class CrudGenerator {

	private static Log log = LogFactory.getLog(CrudGenerator.class);

	/**
	 * 코드생성 인스턴스
	 */
	private CrudCodeGen crudCodeGen;
	/**
	 * 데이타모델
	 */
	private DataModelContext dataModel;

	List<EgovMap> columns;

	public CrudGenerator() {
		String[] configLocations = { "egovframework/spring/context-aspect.xml",
				"egovframework/spring/context-common.xml",
				"egovframework/spring/context-datasource.xml",
				"egovframework/spring/context-idgen.xml",
				"egovframework/spring/context-properties.xml",
				"egovframework/spring/context-sqlMap.xml",
				"egovframework/spring/context-transaction.xml",
				"kr/godsoft/egovframe/generator/spring/columns-beans.xml" };

		ApplicationContext context = new ClassPathXmlApplicationContext(
				configLocations);

		ColumnsService columnsService = (ColumnsService) context
				.getBean("columnsService");

		try {
			ColumnsDefaultVO searchVO = new ColumnsDefaultVO();

			searchVO.setFirstIndex(0);
			searchVO.setRecordCountPerPage(1000);

			columns = columnsService.selectColumnsList(searchVO);
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
		CrudGenerator columnsClinet = new CrudGenerator();

		columnsClinet.generatorSQLMap();
	}

	public void generatorSQLMap() {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		dataModel.setPackageName("kr.godsoft.egovframe.crud."
				+ dataModel.getEntity().getName());

		try {
			String templateFile = "templates/crud/src/main/resources/pkg/EgovSample_Sample2_SQL.vm";

			String data = crudCodeGen.generate(dataModel, templateFile);

			// // src/main/resources/kr/godsoft/egovframe/crud/sqlmap
			//
			// // 문자열을 해당 파일에 카피
			// // File file = new File(dir, "file1.txt");
			// File file = new File(
			// "target/classes/resources/kr/godsoft/egovframe/crud/sqlmap/"
			// + dataModel.getEntity().getName() + "/"
			// + dataModel.getEntity().getName() + ".xml");
			// // String data = file.getAbsolutePath();
			// // File file, String data, String encoding
			// FileUtils.writeStringToFile(file, data, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}
}

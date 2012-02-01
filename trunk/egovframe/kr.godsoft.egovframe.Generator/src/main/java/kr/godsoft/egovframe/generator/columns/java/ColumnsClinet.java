package kr.godsoft.egovframe.generator.columns.java;

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

import egovframework.rte.psl.dataaccess.util.EgovMap;

public class ColumnsClinet {

	private static Log log = LogFactory.getLog(ColumnsClinet.class);

	/**
	 * 코드생성 인스턴스
	 */
	private static CrudCodeGen crudCodeGen;
	/**
	 * 데이타모델
	 */
	private static DataModelContext dataModel;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

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

			List<EgovMap> columns = columnsService.selectColumnsList(searchVO);

			crudCodeGen = new CrudCodeGen();

			dataModel = new DataModelContext();

			dataModel.setPackageName("kr.godsoft.egovframe.generator");
			dataModel.setAuthor("이백행");
			dataModel.setTeam("갓소프트");
			dataModel.setCreateDate("2009.02.01");

			Entity entity = new Entity("SAMPLE2");

			dataModel.setEntity(entity);

			List<Attribute> attributes = new ArrayList<Attribute>();
			List<Attribute> primaryKeys = new ArrayList<Attribute>();

			Attribute attr = new Attribute("ID");
			attr.setJavaType("String");
			attributes.add(attr);
			primaryKeys.add(attr);

			attr = new Attribute("NAME");
			attr.setJavaType("String");
			attributes.add(attr);
			// primaryKeys.add(attr);

			attr = new Attribute("DESCRIPTION");
			attr.setJavaType("String");
			attributes.add(attr);

			attr = new Attribute("USE_YN");
			attr.setJavaType("String");
			attributes.add(attr);

			attr = new Attribute("REG_USER");
			attr.setJavaType("String");
			attributes.add(attr);

			dataModel.setAttributes(attributes);
			dataModel.setPrimaryKeys(primaryKeys);

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
			}

			String templateFile = "templates/crud/src/main/resources/pkg/EgovSample_Sample2_SQL.vm";

			String result = crudCodeGen.generate(dataModel, templateFile);

			if (log.isDebugEnabled()) {
				log.debug(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}
	}

}

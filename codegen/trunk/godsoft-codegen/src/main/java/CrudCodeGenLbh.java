import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.cmm.OracleVO;
import godsoft.codegen.cmm.model.Entity;
import godsoft.codegen.oracle.alltabcomments.service.AllTabCommentsService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CrudCodeGenLbh {

	private String configLocation = "classpath:egovframework/spring/core-context.xml";
	private ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

	private AllTabCommentsService allTabCommentsService = (AllTabCommentsService) context.getBean("godsoft.codegen.oracle.alltabcomments.service.allTabCommentsService");

	//			AllTabColsDAO allTabColsDAO = (AllTabColsDAO) context.getBean("allTabColsDAO");
	//	private AllTabCommentsDAO allTabCommentsDAO = (AllTabCommentsDAO) context.getBean("godsoft.codegen.oracle.alltabcomments.service.impl.allTabCommentsDAO");

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		CrudCodeGenLbh crudCodeGenLbh = new CrudCodeGenLbh();

		crudCodeGenLbh.crudCodeGen();

		//		String configLocation = "classpath:egovframework/spring/core-context.xml";
		//		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		//
		//		// Bean
		//		AllTabColsDAO allTabColsDAO = (AllTabColsDAO) context.getBean("allTabColsDAO");
		//		AllTabCommentsDAO allTabCommentsDAO = (AllTabCommentsDAO) context.getBean("allTabCommentsDAO");
		//
		//		// VO
		//		OracleVO oracleVO = new OracleVO();
		//
		//		oracleVO.setOwner("IRAIS");
		//
		//		List<String> tableNames = new ArrayList<String>();
		//		//		tableNames.add("IDS");
		//		//		tableNames.add("SAMPLE");
		//		//		tableNames.add("CMMFRUSER");
		//		//		tableNames.add("CMMTNCODBL");
		//		//		tableNames.add("CMMTNDCODE");
		//		//		//		tableNames.add("FRSASOCGGDE30");
		//		//		//		tableNames.add("FRSASOCGGDE31");
		//		//		//		tableNames.add("FRSASOCGGDE32");
		//		//		//		tableNames.add("FRSASOCGGDE33");
		//		//		//		tableNames.add("FRSASOCGGDE34");
		//		tableNames.add("FRSTN2A002");
		//		//		tableNames.add("FRSTN2B005");
		//		//		tableNames.add("FRSTN2X004");
		//		//		tableNames.add("FRSTN2X005");
		//		//		tableNames.add("FRSTN2X006");
		//		//		tableNames.add("FRSTN2X007");
		//		//		tableNames.add("FRSTN2X013");
		//		//		tableNames.add("FRSTN3A010");
		//		//		tableNames.add("FRSTN3A011");
		//		//		tableNames.add("FRSTN3A012");
		//		//		tableNames.add("FRSTN3A013");
		//
		//		oracleVO.setTableNames(tableNames);
		//
		//		List<EgovMap> allTabComments = allTabCommentsDAO.selectAllTabCommentsList(oracleVO);
		//		List<EgovMap> allTabCols = allTabColsDAO.selectAllTabColsList(oracleVO);
		//
		//		//		List<DataModelContext> dataModels = new ArrayList<DataModelContext>();
		//
		//		DataModelContext dataModel2 = new DataModelContext();
		//		dataModel2.setProjectName("pms-webapp");
		//		dataModel2.setVender("Oracle");
		//		dataModel2.setPackageName("forest.pms");
		//		List<String> sqlMaps = new ArrayList<String>();
		//
		//		CrudCodeGen crudCodeGen = new CrudCodeGen();
		//
		//		Map<String, String> entityTableName = new HashMap<String, String>();
		//		//		entityTableName.put("SAMPLE", "PMSSAMPLE");
		//		//		entityTableName.put("CMMFRUSER", "TESTUSER");
		//		//		entityTableName.put("CMMTNCODBL", "TESTCODBL");
		//		//		entityTableName.put("CMMTNDCODE", "TESTDCODE");
		//		//		//		entityTableName.put("FRSASOCGGDE30", "FRSASOCGGDE30");
		//		//		//		entityTableName.put("FRSASOCGGDE31", "FRSASOCGGDE31");
		//		//		//		entityTableName.put("FRSASOCGGDE32", "FRSASOCGGDE32");
		//		//		//		entityTableName.put("FRSASOCGGDE33", "FRSASOCGGDE33");
		//		//		//		entityTableName.put("FRSASOCGGDE34", "FRSASOCGGDE34");
		//		entityTableName.put("FRSTN2A002", "TEST2A002");
		//		//		entityTableName.put("FRSTN2B005", "TEST2B005");
		//		//		entityTableName.put("FRSTN2X004", "TEST2X004");
		//		//		entityTableName.put("FRSTN2X005", "TEST2X005");
		//		//		entityTableName.put("FRSTN2X006", "TEST2X006");
		//		//		entityTableName.put("FRSTN2X007", "TEST2X007");
		//		//		entityTableName.put("FRSTN2X013", "TEST2X013");
		//		//		entityTableName.put("FRSTN3A010", "TEST3A010");
		//		//		entityTableName.put("FRSTN3A011", "TEST3A011");
		//		//		entityTableName.put("FRSTN3A012", "TEST3A012");
		//		//		entityTableName.put("FRSTN3A013", "TEST3A013");
		//
		//		for (EgovMap allTabComment : allTabComments) {
		//			String allTabCommentTableName = (String) allTabComment.get("tableName");
		//			String allTabCommentComments = (String) allTabComment.get("comments");
		//
		//			System.out.println(allTabCommentTableName);
		//
		//			DataModelContext dataModel = new DataModelContext();
		//
		//			dataModel.setProjectName(dataModel2.getProjectName());
		//
		//			dataModel.setVender(dataModel2.getVender());
		//			dataModel.setAuthor("(주)메타지아이에스컨설팅 이백행");
		//			dataModel.setCreateDate(GodsoftUtils.getToday());
		//			dataModel.setPackageName(dataModel2.getPackageName());
		//
		//			Entity entity = new Entity(entityTableName.get(allTabCommentTableName));
		//			entity.setTableName(allTabCommentTableName.toLowerCase());
		//			entity.setTableComments(allTabCommentComments);
		//
		//			dataModel.setEntity(entity);
		//
		//			List<Attribute> attributes = new ArrayList<Attribute>();
		//			List<Attribute> primaryKeys = new ArrayList<Attribute>();
		//
		//			for (EgovMap allTabCol : allTabCols) {
		//				String allTabColTableName = (String) allTabCol.get("tableName");
		//				String columnName = (String) allTabCol.get("columnName");
		//				String dataType = (String) allTabCol.get("dataType");
		//				int dataLength = MapUtils.getIntValue(allTabCol, "dataLength", 0);
		//				String columnComments = (String) allTabCol.get("columnComments");
		//				int position = MapUtils.getIntValue(allTabCol, "position", 0);
		//
		//				if (allTabColTableName.equals(allTabCommentTableName)) {
		//					System.out.println(columnName);
		//
		//					Attribute attribute = new Attribute(columnName);
		//					attribute.setJavaType(GodsoftUtils.getDataType(dataType));
		//					attribute.setPrimaryKey((position > 0) ? true : false);
		//					attribute.setDataLength(dataLength);
		//					attribute.setColumnComments(columnComments);
		//					attributes.add(attribute);
		//
		//					if (position > 0) {
		//						primaryKeys.add(attribute);
		//					}
		//				}
		//			}
		//
		//			dataModel.setAttributes(attributes);
		//			dataModel.setPrimaryKeys(primaryKeys);
		//
		//			//			dataModels.add(dataModel);
		//
		//			String templateFile = "";
		//			String data = "";
		//
		//			//			templateFile = "eGovFrameTemplates/crud/java/pkg/service/Sample2DefaultVO.vm";
		//			//			data = crudCodeGen.generate(dataModel, templateFile);
		//			//			FileUtils.writeStringToFile(GodsoftUtils.getFileDefaultVO(dataModel), data);
		//
		//			templateFile = "eGovFrameTemplates/crud/java/pkg/service/Sample2VO.vm";
		//			data = crudCodeGen.generate(dataModel, templateFile);
		//			FileUtils.writeStringToFile(GodsoftUtils.getFileVO(dataModel), data);
		//
		//			templateFile = "eGovFrameTemplates/crud/resource/pkg/EgovSample_Sample2_SQL.vm";
		//			data = crudCodeGen.generate(dataModel, templateFile);
		//			FileUtils.writeStringToFile(GodsoftUtils.getFileSqlMap(dataModel), data);
		//
		//			templateFile = "eGovFrameTemplates/crud/resource/pkg/sql.vm";
		//			data = crudCodeGen.generate(dataModel, templateFile);
		//			FileUtils.writeStringToFile(GodsoftUtils.getFileSql(dataModel), data);
		//
		//			sqlMaps.add(GodsoftUtils.getSqlMap(dataModel));
		//
		//			templateFile = "eGovFrameTemplates/crud/java/pkg/service/impl/Sample2DAO.vm";
		//			data = crudCodeGen.generate(dataModel, templateFile);
		//			FileUtils.writeStringToFile(GodsoftUtils.getFileDAO(dataModel), data);
		//
		//			templateFile = "eGovFrameTemplates/crud/java/pkg/service/impl/DAOTest.vm";
		//			data = crudCodeGen.generate(dataModel, templateFile);
		//			FileUtils.writeStringToFile(GodsoftUtils.getFileDAOTest(dataModel), data);
		//
		//			templateFile = "eGovFrameTemplates/crud/java/pkg/service/EgovSample2Service.vm";
		//			data = crudCodeGen.generate(dataModel, templateFile);
		//			FileUtils.writeStringToFile(GodsoftUtils.getFileService(dataModel), data);
		//
		//			templateFile = "eGovFrameTemplates/crud/java/pkg/service/impl/EgovSample2ServiceImpl.vm";
		//			data = crudCodeGen.generate(dataModel, templateFile);
		//			FileUtils.writeStringToFile(GodsoftUtils.getFileServiceImpl(dataModel), data);
		//
		//			templateFile = "eGovFrameTemplates/crud/java/pkg/service/impl/ServiceImplTest.vm";
		//			data = crudCodeGen.generate(dataModel, templateFile);
		//			FileUtils.writeStringToFile(GodsoftUtils.getFileServiceImplTest(dataModel), data);
		//
		//			templateFile = "eGovFrameTemplates/crud/java/pkg/web/EgovSample2Controller.vm";
		//			data = crudCodeGen.generate(dataModel, templateFile);
		//			FileUtils.writeStringToFile(GodsoftUtils.getFileController(dataModel), data);
		//
		//			templateFile = "eGovFrameTemplates/crud/jsp/pkg/egovSample2List.vm";
		//			data = crudCodeGen.generate(dataModel, templateFile);
		//			FileUtils.writeStringToFile(GodsoftUtils.getFileList(dataModel), data);
		//
		//			templateFile = "eGovFrameTemplates/crud/jsp/pkg/egovSample2Register.vm";
		//			data = crudCodeGen.generate(dataModel, templateFile);
		//			FileUtils.writeStringToFile(GodsoftUtils.getFileRegister(dataModel), data);
		//		}
		//
		//		dataModel2.setSqlMaps(sqlMaps);
		//
		//		String templateFileSqlMapConfig = "eGovFrameTemplates/crud/resource/pkg/sqlMapConfig.vm";
		//		String dataSqlMapConfig = crudCodeGen.generate(dataModel2, templateFileSqlMapConfig);
		//		FileUtils.writeStringToFile(GodsoftUtils.getFileSqlMapConfig(dataModel2), dataSqlMapConfig);
	}

	private OracleVO oracleVO() throws Exception {
		OracleVO oracleVO = new OracleVO();

		oracleVO.setOwner("RTE");

		// tableNames
		List<Entity> tableNames = new ArrayList<Entity>();

		Entity entity = new Entity("IDS001");
		entity.setTableName("IDS");
		tableNames.add(entity);

		entity = new Entity("SAMPLE001");
		entity.setTableName("SAMPLE");
		tableNames.add(entity);

		oracleVO.setTableNames(tableNames);

		return oracleVO;
	}

	private void crudCodeGen() throws Exception {
		OracleVO oracleVO = oracleVO();

		List<EgovMap> allTabComments = allTabCommentsService.selectAllTabCommentsList(oracleVO);

		for (Entity entity : oracleVO.getTableNames()) {
			String tableComments = allTabCommentsService.getTableComments(allTabComments, entity.getTableName());
		}
	}

}

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.cmm.OracleVO;
import godsoft.codegen.cmm.PathnameCom;
import godsoft.codegen.cmm.model.Attribute;
import godsoft.codegen.cmm.model.DataModelContext;
import godsoft.codegen.cmm.model.Entity;
import godsoft.codegen.cmm.operation.CrudCodeGen;
import godsoft.codegen.cmm.util.CodeGenUtils;
import godsoft.codegen.oracle.alltabcols.service.AllTabColsService;
import godsoft.codegen.oracle.alltabcomments.service.AllTabCommentsService;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.io.FileUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CrudCodeGenLbh {

	private String configLocation = "classpath:egovframework/spring/core-context.xml";
	private ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

	private AllTabCommentsService allTabCommentsService = (AllTabCommentsService) context.getBean("allTabCommentsService");
	private AllTabColsService allTabColsService = (AllTabColsService) context.getBean("allTabColsService");

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		CrudCodeGenLbh crudCodeGenLbh = new CrudCodeGenLbh();

		crudCodeGenLbh.crudCodeGen();
	}

	private OracleVO oracleVO() throws Exception {
		OracleVO oracleVO = new OracleVO();

		oracleVO.setOwner("TEST");

		// tableNames
		List<Entity> tableNames = new ArrayList<Entity>();

		Entity entity = null;

		//		entity = new Entity("IDS001");
		//		entity.setTableName("IDS");
		//		tableNames.add(entity);

		entity = new Entity("TEST_SAMPLE");
		entity.setTableName("SAMPLE");
		tableNames.add(entity);

		oracleVO.setTableNames(tableNames);

		return oracleVO;
	}

	private DataModelContext dataModel() throws Exception {
		DataModelContext dataModel = new DataModelContext();

		dataModel.setVender("Oracle");

		dataModel.setPackageName("godsoft.samples");
		//		dataModel.setPackageName("godsoft.sample.jqgrid");
		//		dataModel.setPackageName("godsoft.sample.extjs");

		dataModel.setAuthor("(주)메타지아이에스컨설팅 이백행");
		dataModel.setCreateDate(CodeGenUtils.getToday());

		dataModel.setProjectName("../godsoft-webapp");

		return dataModel;
	}

	private void crudCodeGen() throws Exception {
		OracleVO oracleVO = oracleVO();

		List<EgovMap> allTabComments = allTabCommentsService.selectAllTabCommentsList(oracleVO);
		List<EgovMap> allTabCols = allTabColsService.selectAllTabColsList(oracleVO);

		List<DataModelContext> dataModels = new ArrayList<DataModelContext>();

		for (Entity entity : oracleVO.getTableNames()) {
			DataModelContext dataModel = dataModel();

			entity.setTableName(entity.getTableName().toLowerCase());
			entity.setTableComments(allTabCommentsService.getTableComments(allTabComments, entity.getTableName().toUpperCase()));

			dataModel.setEntity(entity);

			List<Attribute> attributes = new ArrayList<Attribute>();
			List<Attribute> primaryKeys = new ArrayList<Attribute>();

			for (EgovMap allTabCol : allTabCols) {
				if (entity.getTableName().equalsIgnoreCase((String) allTabCol.get("tableName"))) {
					//					String columnName = (String) allTabCol.get("columnName");
					String dataType = (String) allTabCol.get("dataType");
					int dataLength = MapUtils.getIntValue(allTabCol, "dataLength", 0);
					String columnComments = (String) allTabCol.get("columnComments");
					int position = MapUtils.getIntValue(allTabCol, "position", 0);

					Attribute attribute = new Attribute((String) allTabCol.get("columnName"));
					attribute.setJavaType(CodeGenUtils.getDataType(dataType));
					attribute.setPrimaryKey((position > 0) ? true : false);
					attribute.setDataLength(dataLength);
					attribute.setColumnComments(columnComments);
					attributes.add(attribute);

					if (position > 0) {
						primaryKeys.add(attribute);
					}
				}
			}

			dataModel.setAttributes(attributes);
			dataModel.setPrimaryKeys(primaryKeys);

			generateCom(dataModel);

			// dataModels
			dataModel.setSqlMapResource(PathnameCom.getSqlMap(dataModel));

			dataModels.add(dataModel);
		}

		generateCom(dataModels);
	}

	private void generateCom(DataModelContext dataModel) throws Exception {
		PathnameCom pathnameCom = new PathnameCom(dataModel);
		CrudCodeGen crudCodeGen = new CrudCodeGen();

		FileUtils.writeStringToFile(pathnameCom.getDefaultVO(), crudCodeGen.generate(dataModel, "eGovFrameTemplates/crud-com/java/pkg/service/Sample2DefaultVO.vm"));

		FileUtils.writeStringToFile(pathnameCom.getVo(), crudCodeGen.generate(dataModel, "eGovFrameTemplates/crud-com/java/pkg/service/Sample2VO.vm"));

		FileUtils.writeStringToFile(pathnameCom.getSqlMap(), crudCodeGen.generate(dataModel, "eGovFrameTemplates/crud-com/resource/pkg/EgovSample_Sample2_SQL.vm"));

		FileUtils.writeStringToFile(pathnameCom.getDao(), crudCodeGen.generate(dataModel, "eGovFrameTemplates/crud-com/java/pkg/service/impl/Sample2DAO.vm"));

		FileUtils.writeStringToFile(pathnameCom.getDaoTest(), crudCodeGen.generate(dataModel, "eGovFrameTemplates/crud-com/java/pkg/service/impl/DAOTest.vm"));

		FileUtils.writeStringToFile(pathnameCom.getService(), crudCodeGen.generate(dataModel, "eGovFrameTemplates/crud-com/java/pkg/service/EgovSample2Service.vm"));

		FileUtils.writeStringToFile(pathnameCom.getServiceImpl(), crudCodeGen.generate(dataModel, "eGovFrameTemplates/crud-com/java/pkg/service/impl/EgovSample2ServiceImpl.vm"));

		FileUtils.writeStringToFile(pathnameCom.getServiceImplTest(), crudCodeGen.generate(dataModel, "eGovFrameTemplates/crud-com/java/pkg/service/impl/ServiceImplTest.vm"));

		FileUtils.writeStringToFile(pathnameCom.getController(), crudCodeGen.generate(dataModel, "eGovFrameTemplates/crud-com/java/pkg/web/EgovSample2Controller.vm"));
	}

	private void generateCom(List<DataModelContext> dataModels) throws Exception {
		DataModelContext dataModel = dataModel();
		dataModel.setDataModels(dataModels);

		PathnameCom pathnameCom = new PathnameCom(dataModel);
		CrudCodeGen crudCodeGen = new CrudCodeGen();

		FileUtils.writeStringToFile(pathnameCom.getSqlMapConfig(), crudCodeGen.generate(dataModel, "eGovFrameTemplates/crud-com/resource/pkg/sqlMapConfig.vm"));
	}

}

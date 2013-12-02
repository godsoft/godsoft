package godsoft.codegen.cmm;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.alltabcols.service.impl.AllTabColsDAO;
import godsoft.codegen.alltabcomments.service.impl.AllTabCommentsDAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.MapUtils;

public class CodeGenDataModelContext {

	private List<DataModelContext> dataModelContexts;

	//	public void setDataModelContexts(OracleVO oracleVO, Map<String, Object> entityName, DataModelContext dataModel) throws Exception {
	public CodeGenDataModelContext(OracleVO oracleVO, DataModelContext parameterDataModel) throws Exception {
		AllTabColsDAO allTabColsDAO = (AllTabColsDAO) CodeGenApplicationContext.getApplicationContext().getBean("godsoft.codegen.alltabcols.allTabColsDAO");
		AllTabCommentsDAO allTabCommentsDAO = (AllTabCommentsDAO) CodeGenApplicationContext.getApplicationContext().getBean("godsoft.codegen.alltabcomments.allTabCommentsDAO");

		//		OracleVO oracleVO = gisOracleVO();

		List<EgovMap> allTabComments = allTabCommentsDAO.selectAllTabCommentsList(oracleVO);
		List<EgovMap> allTabCols = allTabColsDAO.selectAllTabColsList(oracleVO);

		//		List<DataModelContext> dataModels = new ArrayList<DataModelContext>();

		//		DataModelContext dataModel2 = new DataModelContext();
		//		dataModel2.setProjectName("pms-webapp");
		//		dataModel2.setVender("Oracle");
		//		//		dataModel2.setPackageName("forest.pms.gis");
		//		dataModel2.setPackageName("forest.pms.gis");
		//		List<String> sqlMaps = new ArrayList<String>();
		//		//		List<String> jqGridMenus = new ArrayList<String>();
		List<DataModelContext> dataModelContexts = new ArrayList<DataModelContext>();

		for (EgovMap allTabComment : allTabComments) {
			String allTabCommentTableName = (String) allTabComment.get("tableName");
			String allTabCommentComments = (String) allTabComment.get("comments");

			//			DataModelContext dataModel = new DataModelContext();
			//
			//			dataModel.setProjectName(dataModel2.getProjectName());
			//
			//			dataModel.setVender(dataModel2.getVender());
			//			dataModel.setAuthor("(주)메타지아이에스컨설팅 이백행");
			//			dataModel.setCreateDate(GodsoftUtils.getToday());
			//			dataModel.setPackageName(dataModel2.getPackageName());

			//			Entity entity = new Entity((String) entityName.get(allTabCommentTableName));
			Entity entity = new Entity(((Entity) CodeGenUtils.CollectionUtilsFind(oracleVO.getEntitys(), "tableName", allTabCommentTableName)).getName());
			entity.setTableName(allTabCommentTableName.toLowerCase());
			entity.setTableComments(allTabCommentComments);

			DataModelContext dataModel = this.getDataModel(parameterDataModel);

			dataModel.setEntity(entity);

			List<Attribute> attributes = new ArrayList<Attribute>();
			List<Attribute> primaryKeys = new ArrayList<Attribute>();

			for (EgovMap allTabCol : allTabCols) {
				String allTabColTableName = MapUtils.getString(allTabCol, "tableName");
				String columnName = MapUtils.getString(allTabCol, "columnName");
				String dataType = MapUtils.getString(allTabCol, "dataType");
				int dataLength = MapUtils.getIntValue(allTabCol, "dataLength");
				String columnComments = MapUtils.getString(allTabCol, "columnComments");
				int position = MapUtils.getIntValue(allTabCol, "position");

				if (allTabColTableName.equals(allTabCommentTableName)) {
					Attribute attribute = new Attribute(columnName);
					attribute.setJavaType(CodeGenUtils.getJavaType(dataType));
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

			dataModel.setCodeGenPackage(dataModel);
			dataModel.setCodeGenPathname(dataModel);

			dataModelContexts.add(dataModel);
		}

		this.dataModelContexts = dataModelContexts;
	}

	private DataModelContext getDataModel(DataModelContext parameterDataModel) {
		DataModelContext dataModel = new DataModelContext();

		dataModel.setVender(parameterDataModel.getVender());

		dataModel.setAuthor(parameterDataModel.getAuthor());
		dataModel.setCreateDate(parameterDataModel.getCreateDate());
		dataModel.setTopLevelPackage(parameterDataModel.getTopLevelPackage());
		dataModel.setMiddleLevelPackage(parameterDataModel.getMiddleLevelPackage());

		dataModel.setProjectLocation(parameterDataModel.getProjectLocation());

		return dataModel;
	}

	public List<DataModelContext> getDataModelContexts() {
		return dataModelContexts;
	}

}

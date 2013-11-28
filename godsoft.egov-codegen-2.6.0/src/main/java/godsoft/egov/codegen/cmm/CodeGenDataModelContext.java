package godsoft.egov.codegen.cmm;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.alltabcols.service.impl.AllTabColsDAO;
import godsoft.codegen.alltabcomments.service.impl.AllTabCommentsDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;

public class CodeGenDataModelContext {

	//	public void setDataModelContexts(OracleVO oracleVO, Map<String, Object> entityName, DataModelContext dataModel) throws Exception {
	public CodeGenDataModelContext(OracleVO oracleVO, Map<String, Object> entityName, DataModelContext parameterDataModel) throws Exception {
		AllTabColsDAO allTabColsDAO = (AllTabColsDAO) CodeGenApplicationContext.getApplicationContext().getBean("allTabColsDAO");
		AllTabCommentsDAO allTabCommentsDAO = (AllTabCommentsDAO) CodeGenApplicationContext.getApplicationContext().getBean("allTabCommentsDAO");

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

			Entity entity = new Entity((String) entityName.get(allTabCommentTableName));
			//			entity.setTableName(allTabCommentTableName.toLowerCase());
			//			entity.setTableComments(allTabCommentComments);

			DataModelContext dataModel = getDataModel(parameterDataModel);

			dataModel.setEntity(entity);

			List<Attribute> attributes = new ArrayList<Attribute>();
			List<Attribute> primaryKeys = new ArrayList<Attribute>();

			for (EgovMap allTabCol : allTabCols) {
				String allTabColTableName = (String) allTabCol.get("tableName");
				String columnName = (String) allTabCol.get("columnName");
				String dataType = (String) allTabCol.get("dataType");
				int dataLength = MapUtils.getIntValue(allTabCol, "dataLength", 0);
				String columnComments = (String) allTabCol.get("columnComments");
				int position = MapUtils.getIntValue(allTabCol, "position", 0);

				if (allTabColTableName.equals(allTabCommentTableName)) {
					Attribute attribute = new Attribute(columnName);
					//					attribute.setJavaType(GodsoftUtils.getDataType(dataType));
					attribute.setPrimaryKey((position > 0) ? true : false);
					//					attribute.setDataLength(dataLength);
					//					attribute.setColumnComments(columnComments);
					attributes.add(attribute);

					if (position > 0) {
						primaryKeys.add(attribute);
					}
				}
			}

			dataModel.setAttributes(attributes);
			dataModel.setPrimaryKeys(primaryKeys);

			dataModelContexts.add(dataModel);
		}

		this.dataModelContexts = dataModelContexts;
	}

	private List<DataModelContext> dataModelContexts;

	public List<DataModelContext> getDataModelContexts() {
		return dataModelContexts;
	}

	private DataModelContext getDataModel(DataModelContext parameterDataModel) {
		DataModelContext dataModel = new DataModelContext();

		dataModel.setVender(parameterDataModel.getVender());

		//		dataModel.setAuthor(parameterDataModel.getAuthor());
		//		dataModel.setCreateDate(GodsoftUtils.getToday());
		//		dataModel.setPackageName(parameterDataModel.getPackageName());

		//		dataModel.setProjectName(parameterDataModel.getProjectName());

		return dataModel;
	}

}

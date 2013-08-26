package kr.godsoft.egovframe.egovframegenerator.alltabcolumns.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import kr.godsoft.egovframe.egovframegenerator.alltabcolumns.service.AllTabColumnsService;
import model.Attribute;
import model.DataModelContext;
import model.Entity;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ColumnsServiceImpl.java
 * @Description : Columns Business Implement class
 * @Modification Information
 * 
 * @author 이백행
 * @since 2012-03-14
 * @version 1.0
 * @see Copyright (C) All right reserved.
 */

@Service("allTabColumnsService")
public class AllTabColumnsServiceImpl extends AbstractServiceImpl implements
		AllTabColumnsService {

	@Resource(name = "allTabColumnsDAO")
	private AllTabColumnsDAO allTabColumnsDAO;

	public List<DataModelContext> getDataModelContexts(EgovMap egovMapVO,
			DataModelContext dataModelContext) throws Exception {
		List<DataModelContext> dataModelContexts = new ArrayList<DataModelContext>();

		List<EgovMap> columns = selectAllTabColumnsList(egovMapVO);

		Set<String> tableNames = new HashSet<String>();

		Map<String, Object> tableComments = new HashMap<String, Object>();

		for (int i = 0; i < columns.size(); i++) {
			EgovMap egovMap = columns.get(i);

			String tableName = (String) egovMap.get("tableName");
			String tableComment = (String) egovMap.get("tableComment");

			tableNames.add(tableName);

			tableComments.put(tableName, tableComment);
		}

		// if (log.isDebugEnabled()) {
		// log.debug("tables=" + tableNames);
		//
		// log.debug("size=" + tableNames.size());
		// }

		Iterator<String> iterator = tableNames.iterator();

		while (iterator.hasNext()) {
			String tableName = iterator.next();

			// if (log.isDebugEnabled()) {
			// log.debug("tableName=" + tableName);
			// }

			dataModelContext = (DataModelContext) BeanUtils
					.cloneBean(dataModelContext);

			Entity entity = new Entity(tableName);
			entity.setTableComment((String) tableComments.get(tableName));
			dataModelContext.setEntity(entity);

			dataModelContext.setAttributes(getAttributes(columns, tableName));

			dataModelContext.setPrimaryKeys(getPrimaryKeys(columns, tableName));

			dataModelContexts.add(dataModelContext);
		}

		return dataModelContexts;
	}

	private List<Attribute> getAttributes(List<EgovMap> columns,
			String tableNameVO) {
		List<Attribute> attributes = new ArrayList<Attribute>();

		for (int i = 0; i < columns.size(); i++) {
			EgovMap egovMap = columns.get(i);

			String tableName = (String) egovMap.get("tableName");

			if (tableName.equals(tableNameVO)) {
				String columnName = (String) egovMap.get("columnName");

				// Attribute attribute = new Attribute(columnName);
				// attribute.setJavaType("String");

				attributes.add(getAttribute(egovMap));

				if (log.isDebugEnabled()) {
					log.debug("tableName=" + tableName);
					log.debug("columnName=" + columnName);
				}
			}
		}

		return attributes;
	}

	private List<Attribute> getPrimaryKeys(List<EgovMap> columns,
			String tableNameVO) {
		List<Attribute> attributes = new ArrayList<Attribute>();

		for (int i = 0; i < columns.size(); i++) {
			EgovMap egovMap = columns.get(i);

			String tableName = (String) egovMap.get("tableName");

			if (tableName.equals(tableNameVO)) {
				// String columnName = (String) egovMap.get("columnName");
				String columnKey = (String) egovMap.get("columnKey");

				if ("PRI".equals(columnKey)) {
					// Attribute attribute = new Attribute(columnName);
					// attribute.setJavaType("String");

					attributes.add(getAttribute(egovMap));
				}
			}
		}

		return attributes;
	}

	private Attribute getAttribute(EgovMap egovMap) {
		String columnName = (String) egovMap.get("columnName");
		String dataType = (String) egovMap.get("dataType");
		String columnKey = (String) egovMap.get("columnKey");
		String columnComment = (String) egovMap.get("columnComment");

		Attribute attribute = new Attribute(columnName);
		attribute.setType(dataType);
		attribute.setJavaType(getJavaType(dataType));
		attribute.setPrimaryKey(getPrimaryKey(columnKey));
		attribute.setColumnComment(columnComment);
		attribute.setExpression(getExpression(egovMap, attribute));

		if ("use_at".equals(attribute.getLcName())) {
			attribute.setValue("Y");
		}

		return attribute;
	}

	private boolean getPrimaryKey(String columnKey) {
		if ("PRI".equals(columnKey)) {
			return true;
		} else {
			return false;
		}
	}

	private String getJavaType(String dataType) {
		String javaType = "";

		if ("decimal".equals(dataType)) {
			javaType = "int";
		} else {
			javaType = "String";
		}
		return javaType;
	}

	private String getExpression(EgovMap egovMap, Attribute attribute) {
		StringBuilder sb = new StringBuilder();

		String dataType = (String) egovMap.get("dataType");

		if ("datetime".equals(dataType)) {
			sb.append("SYSDATE");
		} else {
			sb.append("#");
			sb.append(attribute.getCcName());
			sb.append("#");
		}
		return sb.toString();
	}

	/**
	 * all_tab_columns 목록을 조회한다.
	 * 
	 * @param egovMap
	 *            - 조회할 정보가 담긴 VO
	 * @return all_tab_columns 목록
	 * @exception Exception
	 */
	public List<EgovMap> selectAllTabColumnsList(EgovMap egovMapVO)
			throws Exception {
		return allTabColumnsDAO.selectAllTabColumnsList(egovMapVO);
	}

}

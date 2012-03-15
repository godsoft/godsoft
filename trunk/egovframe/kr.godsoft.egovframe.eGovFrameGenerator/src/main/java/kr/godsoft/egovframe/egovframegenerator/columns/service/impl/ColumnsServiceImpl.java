package kr.godsoft.egovframe.egovframegenerator.columns.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import kr.godsoft.egovframe.egovframegenerator.columns.service.ColumnsDefaultVO;
import kr.godsoft.egovframe.egovframegenerator.columns.service.ColumnsService;
import kr.godsoft.egovframe.egovframegenerator.columns.service.ColumnsVO;
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

@Service("columnsService")
public class ColumnsServiceImpl extends AbstractServiceImpl implements
		ColumnsService {

	@Resource(name = "columnsDAO")
	private ColumnsDAO columnsDAO;

	/** ID Generation */
	// @Resource(name="{egovColumnsIdGnrService}")
	// private EgovIdGnrService egovIdGnrService;

	/**
	 * COLUMNS을 등록한다.
	 * 
	 * @param vo
	 *            - 등록할 정보가 담긴 ColumnsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
	public String insertColumns(ColumnsVO vo) throws Exception {
		log.debug(vo.toString());

		/** ID Generation Service */
		// TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
		// String id = egovIdGnrService.getNextStringId();
		// vo.setId(id);
		log.debug(vo.toString());

		columnsDAO.insertColumns(vo);
		// TODO 해당 테이블 정보에 맞게 수정
		return null;
	}

	/**
	 * COLUMNS을 수정한다.
	 * 
	 * @param vo
	 *            - 수정할 정보가 담긴 ColumnsVO
	 * @return void형
	 * @exception Exception
	 */
	public void updateColumns(ColumnsVO vo) throws Exception {
		columnsDAO.updateColumns(vo);
	}

	/**
	 * COLUMNS을 삭제한다.
	 * 
	 * @param vo
	 *            - 삭제할 정보가 담긴 ColumnsVO
	 * @return void형
	 * @exception Exception
	 */
	public void deleteColumns(ColumnsVO vo) throws Exception {
		columnsDAO.deleteColumns(vo);
	}

	/**
	 * COLUMNS을 조회한다.
	 * 
	 * @param vo
	 *            - 조회할 정보가 담긴 ColumnsVO
	 * @return 조회한 COLUMNS
	 * @exception Exception
	 */
	public ColumnsVO selectColumns(ColumnsVO vo) throws Exception {
		ColumnsVO resultVO = columnsDAO.selectColumns(vo);
		if (resultVO == null)
			throw processException("info.nodata.msg");
		return resultVO;
	}

	/**
	 * COLUMNS 목록을 조회한다.
	 * 
	 * @param searchVO
	 *            - 조회할 정보가 담긴 VO
	 * @return COLUMNS 목록
	 * @exception Exception
	 */
	public List selectColumnsList(ColumnsDefaultVO searchVO) throws Exception {
		return columnsDAO.selectColumnsList(searchVO);
	}

	/**
	 * COLUMNS 목록을 조회한다.
	 * 
	 * @param columnsVO
	 *            - 조회할 정보가 담긴 VO
	 * @return COLUMNS 목록
	 * @exception Exception
	 */
	public List<EgovMap> selectColumnsList(ColumnsVO columnsVO)
			throws Exception {
		return columnsDAO.selectColumnsList(columnsVO);
	}

	/**
	 * COLUMNS 총 갯수를 조회한다.
	 * 
	 * @param searchVO
	 *            - 조회할 정보가 담긴 VO
	 * @return COLUMNS 총 갯수
	 * @exception
	 */
	public int selectColumnsListTotCnt(ColumnsDefaultVO searchVO) {
		return columnsDAO.selectColumnsListTotCnt(searchVO);
	}

	public List<DataModelContext> getDataModelContexts(ColumnsVO columnsVO,
			DataModelContext dataModelContext) throws Exception {
		List<DataModelContext> dataModelContexts = new ArrayList<DataModelContext>();

		List<EgovMap> columns = selectColumnsList(columnsVO);

		Set<String> tableNames = new HashSet<String>();

		for (int i = 0; i < columns.size(); i++) {
			EgovMap egovMap = columns.get(i);

			String tableName = (String) egovMap.get("tableName");

			tableNames.add(tableName);
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

			dataModelContext.setEntity(new Entity(tableName));

			dataModelContext.setAttributes(setAttributes(columns, tableName));

			dataModelContext.setPrimaryKeys(setPrimaryKeys(columns, tableName));

			dataModelContexts.add(dataModelContext);
		}

		return dataModelContexts;
	}

	private List<Attribute> setAttributes(List<EgovMap> columns,
			String tableNameVO) {
		List<Attribute> attributes = new ArrayList<Attribute>();

		for (int i = 0; i < columns.size(); i++) {
			EgovMap egovMap = columns.get(i);

			String tableName = (String) egovMap.get("tableName");

			if (tableName.equals(tableNameVO)) {
				String columnName = (String) egovMap.get("columnName");

				Attribute attribute = new Attribute(columnName);
				attribute.setJavaType("String");
				// attributes.add(attr);
				// primaryKeys.add(attr);

				attributes.add(attribute);

				if (log.isDebugEnabled()) {
					log.debug("tableName=" + tableName);
					log.debug("columnName=" + columnName);
				}
			}
		}

		return attributes;
	}

	private List<Attribute> setPrimaryKeys(List<EgovMap> columns,
			String tableNameVO) {
		List<Attribute> attributes = new ArrayList<Attribute>();

		for (int i = 0; i < columns.size(); i++) {
			EgovMap egovMap = columns.get(i);

			String tableName = (String) egovMap.get("tableName");

			if (tableName.equals(tableNameVO)) {
				String columnName = (String) egovMap.get("columnName");
				String columnKey = (String) egovMap.get("columnKey");

				if (columnKey.equals("PRI")) {
					Attribute attribute = new Attribute(columnName);
					attribute.setJavaType("String");
					// attributes.add(attr);
					// primaryKeys.add(attr);

					attributes.add(attribute);
				}
			}
		}

		return attributes;
	}

}

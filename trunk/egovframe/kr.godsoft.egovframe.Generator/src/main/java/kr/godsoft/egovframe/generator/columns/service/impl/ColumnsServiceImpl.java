package kr.godsoft.egovframe.generator.columns.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generator.columns.service.ColumnsDefaultVO;
import kr.godsoft.egovframe.generator.columns.service.ColumnsService;
import kr.godsoft.egovframe.generator.columns.service.ColumnsVO;
import model.Attribute;
import model.DataModelContext;
import model.Entity;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : ColumnsServiceImpl.java
 * @Description : Columns Business Implement class
 * @Modification Information
 * 
 * @author 이백행
 * @since 2012-02-01
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

	private static Log log = LogFactory.getLog(ColumnsServiceImpl.class);

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

	public List<DataModelContext> getDataModelContexts(
			DataModelContext dataModelContextVO) throws Exception {
		if (log.isInfoEnabled()) {
			log.info("시작");
		}

		List<DataModelContext> dataModelContexts = new ArrayList<DataModelContext>();

		ColumnsDefaultVO searchVO = new ColumnsDefaultVO();

		List<EgovMap> egovMaps = columnsDAO.selectColumnsList(searchVO);

		if (egovMaps != null) {
			String tableNameTemp = "";

			List<Attribute> attributes = null;
			List<Attribute> primaryKeys = null;

			// List<DataModelContext> dataModelContexts = new
			// ArrayList<DataModelContext>();

			for (int i = 0; i < egovMaps.size(); i++) {
				EgovMap egovMap = egovMaps.get(i);

				String tableName = (String) egovMap.get("tableName");
				// String columnName = (String) egovMap.get("columnName");
				// String dataType = (String) egovMap.get("dataType");
				String columnKey = (String) egovMap.get("columnKey");
				// String columnComment = (String) egovMap.get("columnComment");

				if (log.isDebugEnabled()) {
					// log.debug("tableName=" + egovMap.get("tableName"));
					// log.debug("columnName=" + egovMap.get("columnName"));

					// if (tableName.equals(tableNameTemp) == false) {
					// log.debug("i=" + i + ", tableName=" + tableName
					// + ", tableNameTemp=" + tableNameTemp);
					// }
					//
					// tableNameTemp = tableName;
				}

				if (tableName.equals(tableNameTemp) == false) {
					if (i > 0) {
						if (log.isDebugEnabled()) {
							log.debug("isWriteStringToFile="
									+ dataModelContextVO
											.getIsWriteStringToFile());
						}

						DataModelContext dataModelContext = (DataModelContext) BeanUtils
								.cloneBean(dataModelContextVO);

						if (log.isDebugEnabled()) {
							log.debug("isWriteStringToFile="
									+ dataModelContextVO
											.getIsWriteStringToFile());
						}

						dataModelContext.setEntity(new Entity(tableNameTemp));

						if (log.isDebugEnabled()) {
							log.debug(dataModelContext.getEntity().getName());
						}

						dataModelContext.setAttributes(attributes);
						dataModelContext.setPrimaryKeys(primaryKeys);
						dataModelContexts.add(dataModelContext);
					}

					attributes = new ArrayList<Attribute>();
					primaryKeys = new ArrayList<Attribute>();
				}

				Attribute attribute = getAttribute(egovMap);

				attributes.add(attribute);

				if (columnKey.equals("PRI")) {
					primaryKeys.add(attribute);
				}

				tableNameTemp = tableName;
			}

			if (log.isDebugEnabled()) {
				log.debug("isWriteStringToFile="
						+ dataModelContextVO.getIsWriteStringToFile());
			}

			DataModelContext dataModelContext = (DataModelContext) BeanUtils
					.cloneBean(dataModelContextVO);

			if (log.isDebugEnabled()) {
				log.debug("isWriteStringToFile="
						+ dataModelContextVO.getIsWriteStringToFile());
			}

			dataModelContext.setEntity(new Entity(tableNameTemp));

			if (log.isDebugEnabled()) {
				log.debug(dataModelContext.getEntity().getName());
			}

			dataModelContext.setAttributes(attributes);
			dataModelContext.setPrimaryKeys(primaryKeys);
			dataModelContexts.add(dataModelContext);

			// dataModelContextsPrint(dataModelContexts);
		}

		if (log.isInfoEnabled()) {
			log.info("끝");
		}

		return dataModelContexts;
	}

	private Attribute getAttribute(EgovMap egovMap) {
		// String tableName = (String) egovMap.get("tableName");
		String columnName = (String) egovMap.get("columnName");
		String dataType = (String) egovMap.get("dataType");
		// String columnKey = (String) egovMap.get("columnKey");
		String columnComment = (String) egovMap.get("columnComment");

		Attribute attribute = new Attribute(columnName);

		if ("char".equals(dataType) || "varchar".equals(dataType)
				|| "datetime".equals(dataType)) {
			attribute.setJavaType("String");
		}

		attribute.setColumnComment(columnComment);

		return attribute;
	}

	private void dataModelContextsPrint(List<DataModelContext> dataModelContexts) {
		if (dataModelContexts != null) {
			for (int i = 0; i < dataModelContexts.size(); i++) {
				DataModelContext dataModelContext = dataModelContexts.get(i);

				if (log.isDebugEnabled()) {
					log.debug("dataModelContexts[" + i + "]="
							+ dataModelContext.getAuthor());

					log.debug("dataModelContexts[" + i + "]="
							+ dataModelContext.getEntity().getName());

					List<Attribute> attributes = dataModelContext
							.getAttributes();

					for (int j = 0; j < attributes.size(); j++) {
						Attribute attribute = attributes.get(j);

						log.debug("attributes[" + j + "]="
								+ attribute.getName());

						if (j == 0) {
							break;
						}
					}
				}
			}
		}
	}

	private boolean isFirst() {
		return true;
	}

	private boolean isLast() {
		return true;
	}

}

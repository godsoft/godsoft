package kr.godsoft.egovframe.egovframegenerator.alltabcolumns.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : AllTabColumnsDAO.java
 * @Description : AllTabColumns DAO Class
 * @Modification Information
 * 
 * @author 이백행
 * @since 2012-03-14
 * @version 1.0
 * @see Copyright (C) All right reserved.
 */

@Repository("allTabColumnsDAO")
public class AllTabColumnsDAO extends EgovAbstractDAO {

	/**
	 * all_tab_columns 목록을 조회한다.
	 * 
	 * @param egovMapVO
	 *            - 조회할 정보가 담긴 Map
	 * @return all_tab_columns 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
	public List<EgovMap> selectAllTabColumnsList(EgovMap egovMapVO)
			throws Exception {
		return list("allTabColumnsDAO.selectAllTabColumnsList", egovMapVO);
	}

}

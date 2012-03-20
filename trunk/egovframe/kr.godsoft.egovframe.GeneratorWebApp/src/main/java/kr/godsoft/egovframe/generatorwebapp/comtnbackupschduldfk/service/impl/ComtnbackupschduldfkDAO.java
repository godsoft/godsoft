package kr.godsoft.egovframe.generatorwebapp.comtnbackupschduldfk.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnbackupschduldfk.service.ComtnbackupschduldfkVO;

/**
 * @Class Name : ComtnbackupschduldfkDAO.java
 * @Description : Comtnbackupschduldfk DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnbackupschduldfkDAO")
public class ComtnbackupschduldfkDAO extends EgovAbstractDAO {

	/**
	 * comtnbackupschduldfk을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbackupschduldfkVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbackupschduldfk(ComtnbackupschduldfkVO vo) throws Exception {
        return (String)insert("comtnbackupschduldfkDAO.insertComtnbackupschduldfk_S", vo);
    }

    /**
	 * comtnbackupschduldfk을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbackupschduldfkVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbackupschduldfk(ComtnbackupschduldfkVO vo) throws Exception {
        update("comtnbackupschduldfkDAO.updateComtnbackupschduldfk_S", vo);
    }

    /**
	 * comtnbackupschduldfk을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbackupschduldfkVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbackupschduldfk(ComtnbackupschduldfkVO vo) throws Exception {
        delete("comtnbackupschduldfkDAO.deleteComtnbackupschduldfk_S", vo);
    }

    /**
	 * comtnbackupschduldfk을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbackupschduldfkVO
	 * @return 조회한 comtnbackupschduldfk
	 * @exception Exception
	 */
    public ComtnbackupschduldfkVO selectComtnbackupschduldfk(ComtnbackupschduldfkVO vo) throws Exception {
        return (ComtnbackupschduldfkVO) selectByPk("comtnbackupschduldfkDAO.selectComtnbackupschduldfk_S", vo);
    }

    /**
	 * comtnbackupschduldfk 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbackupschduldfk 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnbackupschduldfkList(ComtnbackupschduldfkVO vo) throws Exception {
        return list("comtnbackupschduldfkDAO.selectComtnbackupschduldfkList_D", vo);
    }

    /**
	 * comtnbackupschduldfk 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbackupschduldfk 총 갯수
	 * @exception
	 */
    public int selectComtnbackupschduldfkListTotCnt(ComtnbackupschduldfkVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnbackupschduldfkDAO.selectComtnbackupschduldfkListTotCnt_S", vo);
    }

}

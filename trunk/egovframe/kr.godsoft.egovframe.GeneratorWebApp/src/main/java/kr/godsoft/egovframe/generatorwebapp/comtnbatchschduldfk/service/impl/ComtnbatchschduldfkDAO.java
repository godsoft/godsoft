package kr.godsoft.egovframe.generatorwebapp.comtnbatchschduldfk.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschduldfk.service.ComtnbatchschduldfkVO;

/**
 * @Class Name : ComtnbatchschduldfkDAO.java
 * @Description : Comtnbatchschduldfk DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnbatchschduldfkDAO")
public class ComtnbatchschduldfkDAO extends EgovAbstractDAO {

	/**
	 * comtnbatchschduldfk을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbatchschduldfkVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbatchschduldfk(ComtnbatchschduldfkVO vo) throws Exception {
        return (String)insert("comtnbatchschduldfkDAO.insertComtnbatchschduldfk_S", vo);
    }

    /**
	 * comtnbatchschduldfk을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbatchschduldfkVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbatchschduldfk(ComtnbatchschduldfkVO vo) throws Exception {
        update("comtnbatchschduldfkDAO.updateComtnbatchschduldfk_S", vo);
    }

    /**
	 * comtnbatchschduldfk을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbatchschduldfkVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbatchschduldfk(ComtnbatchschduldfkVO vo) throws Exception {
        delete("comtnbatchschduldfkDAO.deleteComtnbatchschduldfk_S", vo);
    }

    /**
	 * comtnbatchschduldfk을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbatchschduldfkVO
	 * @return 조회한 comtnbatchschduldfk
	 * @exception Exception
	 */
    public ComtnbatchschduldfkVO selectComtnbatchschduldfk(ComtnbatchschduldfkVO vo) throws Exception {
        return (ComtnbatchschduldfkVO) selectByPk("comtnbatchschduldfkDAO.selectComtnbatchschduldfk_S", vo);
    }

    /**
	 * comtnbatchschduldfk 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbatchschduldfk 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnbatchschduldfkList(ComtnbatchschduldfkVO vo) throws Exception {
        return list("comtnbatchschduldfkDAO.selectComtnbatchschduldfkList_D", vo);
    }

    /**
	 * comtnbatchschduldfk 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbatchschduldfk 총 갯수
	 * @exception
	 */
    public int selectComtnbatchschduldfkListTotCnt(ComtnbatchschduldfkVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnbatchschduldfkDAO.selectComtnbatchschduldfkListTotCnt_S", vo);
    }

}

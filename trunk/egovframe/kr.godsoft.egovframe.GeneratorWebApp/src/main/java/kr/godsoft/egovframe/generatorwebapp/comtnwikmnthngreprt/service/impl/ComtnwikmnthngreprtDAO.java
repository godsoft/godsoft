package kr.godsoft.egovframe.generatorwebapp.comtnwikmnthngreprt.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnwikmnthngreprt.service.ComtnwikmnthngreprtVO;
import kr.godsoft.egovframe.generatorwebapp.comtnwikmnthngreprt.service.ComtnwikmnthngreprtDefaultVO;

/**
 * @Class Name : ComtnwikmnthngreprtDAO.java
 * @Description : Comtnwikmnthngreprt DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnwikmnthngreprtDAO")
public class ComtnwikmnthngreprtDAO extends EgovAbstractDAO {

	/**
	 * comtnwikmnthngreprt을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnwikmnthngreprtVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnwikmnthngreprt(ComtnwikmnthngreprtVO vo) throws Exception {
        return (String)insert("comtnwikmnthngreprtDAO.insertComtnwikmnthngreprt_S", vo);
    }

    /**
	 * comtnwikmnthngreprt을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnwikmnthngreprtVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnwikmnthngreprt(ComtnwikmnthngreprtVO vo) throws Exception {
        update("comtnwikmnthngreprtDAO.updateComtnwikmnthngreprt_S", vo);
    }

    /**
	 * comtnwikmnthngreprt을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnwikmnthngreprtVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnwikmnthngreprt(ComtnwikmnthngreprtVO vo) throws Exception {
        delete("comtnwikmnthngreprtDAO.deleteComtnwikmnthngreprt_S", vo);
    }

    /**
	 * comtnwikmnthngreprt을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnwikmnthngreprtVO
	 * @return 조회한 comtnwikmnthngreprt
	 * @exception Exception
	 */
    public ComtnwikmnthngreprtVO selectComtnwikmnthngreprt(ComtnwikmnthngreprtVO vo) throws Exception {
        return (ComtnwikmnthngreprtVO) selectByPk("comtnwikmnthngreprtDAO.selectComtnwikmnthngreprt_S", vo);
    }

    /**
	 * comtnwikmnthngreprt 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnwikmnthngreprt 목록
	 * @exception Exception
	 */
    public List selectComtnwikmnthngreprtList(ComtnwikmnthngreprtDefaultVO searchVO) throws Exception {
        return list("comtnwikmnthngreprtDAO.selectComtnwikmnthngreprtList_D", searchVO);
    }

    /**
	 * comtnwikmnthngreprt 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnwikmnthngreprt 총 갯수
	 * @exception
	 */
    public int selectComtnwikmnthngreprtListTotCnt(ComtnwikmnthngreprtDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnwikmnthngreprtDAO.selectComtnwikmnthngreprtListTotCnt_S", searchVO);
    }

}

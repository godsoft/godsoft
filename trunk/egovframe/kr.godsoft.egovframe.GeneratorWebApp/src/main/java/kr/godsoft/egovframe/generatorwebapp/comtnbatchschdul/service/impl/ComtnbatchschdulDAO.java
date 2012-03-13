package kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.service.ComtnbatchschdulVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschdul.service.ComtnbatchschdulDefaultVO;

/**
 * @Class Name : ComtnbatchschdulDAO.java
 * @Description : Comtnbatchschdul DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnbatchschdulDAO")
public class ComtnbatchschdulDAO extends EgovAbstractDAO {

	/**
	 * comtnbatchschdul을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbatchschdulVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbatchschdul(ComtnbatchschdulVO vo) throws Exception {
        return (String)insert("comtnbatchschdulDAO.insertComtnbatchschdul_S", vo);
    }

    /**
	 * comtnbatchschdul을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbatchschdulVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbatchschdul(ComtnbatchschdulVO vo) throws Exception {
        update("comtnbatchschdulDAO.updateComtnbatchschdul_S", vo);
    }

    /**
	 * comtnbatchschdul을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbatchschdulVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbatchschdul(ComtnbatchschdulVO vo) throws Exception {
        delete("comtnbatchschdulDAO.deleteComtnbatchschdul_S", vo);
    }

    /**
	 * comtnbatchschdul을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbatchschdulVO
	 * @return 조회한 comtnbatchschdul
	 * @exception Exception
	 */
    public ComtnbatchschdulVO selectComtnbatchschdul(ComtnbatchschdulVO vo) throws Exception {
        return (ComtnbatchschdulVO) selectByPk("comtnbatchschdulDAO.selectComtnbatchschdul_S", vo);
    }

    /**
	 * comtnbatchschdul 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbatchschdul 목록
	 * @exception Exception
	 */
    public List selectComtnbatchschdulList(ComtnbatchschdulDefaultVO searchVO) throws Exception {
        return list("comtnbatchschdulDAO.selectComtnbatchschdulList_D", searchVO);
    }

    /**
	 * comtnbatchschdul 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnbatchschdul 총 갯수
	 * @exception
	 */
    public int selectComtnbatchschdulListTotCnt(ComtnbatchschdulDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnbatchschdulDAO.selectComtnbatchschdulListTotCnt_S", searchVO);
    }

}

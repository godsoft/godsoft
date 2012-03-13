package kr.godsoft.egovframe.generatorwebapp.comtnleaderschdul.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnleaderschdul.service.ComtnleaderschdulVO;
import kr.godsoft.egovframe.generatorwebapp.comtnleaderschdul.service.ComtnleaderschdulDefaultVO;

/**
 * @Class Name : ComtnleaderschdulDAO.java
 * @Description : Comtnleaderschdul DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnleaderschdulDAO")
public class ComtnleaderschdulDAO extends EgovAbstractDAO {

	/**
	 * comtnleaderschdul을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnleaderschdulVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnleaderschdul(ComtnleaderschdulVO vo) throws Exception {
        return (String)insert("comtnleaderschdulDAO.insertComtnleaderschdul_S", vo);
    }

    /**
	 * comtnleaderschdul을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnleaderschdulVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnleaderschdul(ComtnleaderschdulVO vo) throws Exception {
        update("comtnleaderschdulDAO.updateComtnleaderschdul_S", vo);
    }

    /**
	 * comtnleaderschdul을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnleaderschdulVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnleaderschdul(ComtnleaderschdulVO vo) throws Exception {
        delete("comtnleaderschdulDAO.deleteComtnleaderschdul_S", vo);
    }

    /**
	 * comtnleaderschdul을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnleaderschdulVO
	 * @return 조회한 comtnleaderschdul
	 * @exception Exception
	 */
    public ComtnleaderschdulVO selectComtnleaderschdul(ComtnleaderschdulVO vo) throws Exception {
        return (ComtnleaderschdulVO) selectByPk("comtnleaderschdulDAO.selectComtnleaderschdul_S", vo);
    }

    /**
	 * comtnleaderschdul 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnleaderschdul 목록
	 * @exception Exception
	 */
    public List selectComtnleaderschdulList(ComtnleaderschdulDefaultVO searchVO) throws Exception {
        return list("comtnleaderschdulDAO.selectComtnleaderschdulList_D", searchVO);
    }

    /**
	 * comtnleaderschdul 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnleaderschdul 총 갯수
	 * @exception
	 */
    public int selectComtnleaderschdulListTotCnt(ComtnleaderschdulDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnleaderschdulDAO.selectComtnleaderschdulListTotCnt_S", searchVO);
    }

}

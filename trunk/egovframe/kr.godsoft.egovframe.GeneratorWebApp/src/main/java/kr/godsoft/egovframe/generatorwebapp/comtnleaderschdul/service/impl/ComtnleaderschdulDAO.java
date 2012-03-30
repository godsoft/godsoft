package kr.godsoft.egovframe.generatorwebapp.comtnleaderschdul.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnleaderschdul.service.ComtnleaderschdulVO;

/**
 * @Class Name : ComtnleaderschdulDAO.java
 * @Description : Comtnleaderschdul DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnleaderschdulDAO")
public class ComtnleaderschdulDAO extends EgovAbstractDAO {

	/**
	 * COMTNLEADERSCHDUL을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnleaderschdulVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnleaderschdul(ComtnleaderschdulVO vo) throws Exception {
        return (String)insert("comtnleaderschdulDAO.insertComtnleaderschdul_S", vo);
    }

    /**
	 * COMTNLEADERSCHDUL을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnleaderschdulVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnleaderschdul(ComtnleaderschdulVO vo) throws Exception {
        update("comtnleaderschdulDAO.updateComtnleaderschdul_S", vo);
    }

    /**
	 * COMTNLEADERSCHDUL을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnleaderschdulVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnleaderschdul(ComtnleaderschdulVO vo) throws Exception {
        delete("comtnleaderschdulDAO.deleteComtnleaderschdul_S", vo);
    }

    /**
	 * COMTNLEADERSCHDUL을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnleaderschdulVO
	 * @return 조회한 COMTNLEADERSCHDUL
	 * @exception Exception
	 */
    public ComtnleaderschdulVO selectComtnleaderschdul(ComtnleaderschdulVO vo) throws Exception {
        return (ComtnleaderschdulVO) selectByPk("comtnleaderschdulDAO.selectComtnleaderschdul_S", vo);
    }

    /**
	 * COMTNLEADERSCHDUL 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNLEADERSCHDUL 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnleaderschdulList(ComtnleaderschdulVO vo) throws Exception {
        return list("comtnleaderschdulDAO.selectComtnleaderschdulList_D", vo);
    }

    /**
	 * COMTNLEADERSCHDUL 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNLEADERSCHDUL 총 갯수
	 * @exception
	 */
    public int selectComtnleaderschdulListTotCnt(ComtnleaderschdulVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnleaderschdulDAO.selectComtnleaderschdulListTotCnt_S", vo);
    }

}

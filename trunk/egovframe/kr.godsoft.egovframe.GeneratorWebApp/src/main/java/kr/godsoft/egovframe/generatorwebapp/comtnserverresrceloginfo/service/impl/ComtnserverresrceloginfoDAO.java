package kr.godsoft.egovframe.generatorwebapp.comtnserverresrceloginfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtnserverresrceloginfo.service.ComtnserverresrceloginfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnserverresrceloginfo.service.ComtnserverresrceloginfoDefaultVO;

/**
 * @Class Name : ComtnserverresrceloginfoDAO.java
 * @Description : Comtnserverresrceloginfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnserverresrceloginfoDAO")
public class ComtnserverresrceloginfoDAO extends EgovAbstractDAO {

	/**
	 * comtnserverresrceloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnserverresrceloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnserverresrceloginfo(ComtnserverresrceloginfoVO vo) throws Exception {
        return (String)insert("comtnserverresrceloginfoDAO.insertComtnserverresrceloginfo_S", vo);
    }

    /**
	 * comtnserverresrceloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnserverresrceloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnserverresrceloginfo(ComtnserverresrceloginfoVO vo) throws Exception {
        update("comtnserverresrceloginfoDAO.updateComtnserverresrceloginfo_S", vo);
    }

    /**
	 * comtnserverresrceloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnserverresrceloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnserverresrceloginfo(ComtnserverresrceloginfoVO vo) throws Exception {
        delete("comtnserverresrceloginfoDAO.deleteComtnserverresrceloginfo_S", vo);
    }

    /**
	 * comtnserverresrceloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnserverresrceloginfoVO
	 * @return 조회한 comtnserverresrceloginfo
	 * @exception Exception
	 */
    public ComtnserverresrceloginfoVO selectComtnserverresrceloginfo(ComtnserverresrceloginfoVO vo) throws Exception {
        return (ComtnserverresrceloginfoVO) selectByPk("comtnserverresrceloginfoDAO.selectComtnserverresrceloginfo_S", vo);
    }

    /**
	 * comtnserverresrceloginfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnserverresrceloginfo 목록
	 * @exception Exception
	 */
    public List selectComtnserverresrceloginfoList(ComtnserverresrceloginfoDefaultVO searchVO) throws Exception {
        return list("comtnserverresrceloginfoDAO.selectComtnserverresrceloginfoList_D", searchVO);
    }

    /**
	 * comtnserverresrceloginfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnserverresrceloginfo 총 갯수
	 * @exception
	 */
    public int selectComtnserverresrceloginfoListTotCnt(ComtnserverresrceloginfoDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnserverresrceloginfoDAO.selectComtnserverresrceloginfoListTotCnt_S", searchVO);
    }

}

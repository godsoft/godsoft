package kr.godsoft.egovframe.generatorwebapp.comtnrecomendsiteinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnrecomendsiteinfo.service.ComtnrecomendsiteinfoVO;

/**
 * @Class Name : ComtnrecomendsiteinfoDAO.java
 * @Description : Comtnrecomendsiteinfo DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnrecomendsiteinfoDAO")
public class ComtnrecomendsiteinfoDAO extends EgovAbstractDAO {

	/**
	 * comtnrecomendsiteinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrecomendsiteinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnrecomendsiteinfo(ComtnrecomendsiteinfoVO vo) throws Exception {
        return (String)insert("comtnrecomendsiteinfoDAO.insertComtnrecomendsiteinfo_S", vo);
    }

    /**
	 * comtnrecomendsiteinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrecomendsiteinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnrecomendsiteinfo(ComtnrecomendsiteinfoVO vo) throws Exception {
        update("comtnrecomendsiteinfoDAO.updateComtnrecomendsiteinfo_S", vo);
    }

    /**
	 * comtnrecomendsiteinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrecomendsiteinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnrecomendsiteinfo(ComtnrecomendsiteinfoVO vo) throws Exception {
        delete("comtnrecomendsiteinfoDAO.deleteComtnrecomendsiteinfo_S", vo);
    }

    /**
	 * comtnrecomendsiteinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrecomendsiteinfoVO
	 * @return 조회한 comtnrecomendsiteinfo
	 * @exception Exception
	 */
    public ComtnrecomendsiteinfoVO selectComtnrecomendsiteinfo(ComtnrecomendsiteinfoVO vo) throws Exception {
        return (ComtnrecomendsiteinfoVO) selectByPk("comtnrecomendsiteinfoDAO.selectComtnrecomendsiteinfo_S", vo);
    }

    /**
	 * comtnrecomendsiteinfo 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnrecomendsiteinfo 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnrecomendsiteinfoList(ComtnrecomendsiteinfoVO vo) throws Exception {
        return list("comtnrecomendsiteinfoDAO.selectComtnrecomendsiteinfoList_D", vo);
    }

    /**
	 * comtnrecomendsiteinfo 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnrecomendsiteinfo 총 갯수
	 * @exception
	 */
    public int selectComtnrecomendsiteinfoListTotCnt(ComtnrecomendsiteinfoVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnrecomendsiteinfoDAO.selectComtnrecomendsiteinfoListTotCnt_S", vo);
    }

}

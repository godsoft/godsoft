package kr.godsoft.egovframe.generatorwebapp.comtnbbsuse.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnbbsuse.service.ComtnbbsuseVO;

/**
 * @Class Name : ComtnbbsuseDAO.java
 * @Description : Comtnbbsuse DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnbbsuseDAO")
public class ComtnbbsuseDAO extends EgovAbstractDAO {

	/**
	 * COMTNBBSUSE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbbsuseVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbbsuse(ComtnbbsuseVO vo) throws Exception {
        return (String)insert("comtnbbsuseDAO.insertComtnbbsuse_S", vo);
    }

    /**
	 * COMTNBBSUSE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbbsuseVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbbsuse(ComtnbbsuseVO vo) throws Exception {
        update("comtnbbsuseDAO.updateComtnbbsuse_S", vo);
    }

    /**
	 * COMTNBBSUSE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbbsuseVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbbsuse(ComtnbbsuseVO vo) throws Exception {
        delete("comtnbbsuseDAO.deleteComtnbbsuse_S", vo);
    }

    /**
	 * COMTNBBSUSE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbbsuseVO
	 * @return 조회한 COMTNBBSUSE
	 * @exception Exception
	 */
    public ComtnbbsuseVO selectComtnbbsuse(ComtnbbsuseVO vo) throws Exception {
        return (ComtnbbsuseVO) selectByPk("comtnbbsuseDAO.selectComtnbbsuse_S", vo);
    }

    /**
	 * COMTNBBSUSE 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNBBSUSE 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnbbsuseList(ComtnbbsuseVO vo) throws Exception {
        return list("comtnbbsuseDAO.selectComtnbbsuseList_D", vo);
    }

    /**
	 * COMTNBBSUSE 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNBBSUSE 총 갯수
	 * @exception
	 */
    public int selectComtnbbsuseListTotCnt(ComtnbbsuseVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnbbsuseDAO.selectComtnbbsuseListTotCnt_S", vo);
    }

}

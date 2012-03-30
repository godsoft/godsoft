package kr.godsoft.egovframe.generatorwebapp.comtnfiledetail.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnfiledetail.service.ComtnfiledetailVO;

/**
 * @Class Name : ComtnfiledetailDAO.java
 * @Description : Comtnfiledetail DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnfiledetailDAO")
public class ComtnfiledetailDAO extends EgovAbstractDAO {

	/**
	 * COMTNFILEDETAIL을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnfiledetailVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnfiledetail(ComtnfiledetailVO vo) throws Exception {
        return (String)insert("comtnfiledetailDAO.insertComtnfiledetail_S", vo);
    }

    /**
	 * COMTNFILEDETAIL을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnfiledetailVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnfiledetail(ComtnfiledetailVO vo) throws Exception {
        update("comtnfiledetailDAO.updateComtnfiledetail_S", vo);
    }

    /**
	 * COMTNFILEDETAIL을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnfiledetailVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnfiledetail(ComtnfiledetailVO vo) throws Exception {
        delete("comtnfiledetailDAO.deleteComtnfiledetail_S", vo);
    }

    /**
	 * COMTNFILEDETAIL을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnfiledetailVO
	 * @return 조회한 COMTNFILEDETAIL
	 * @exception Exception
	 */
    public ComtnfiledetailVO selectComtnfiledetail(ComtnfiledetailVO vo) throws Exception {
        return (ComtnfiledetailVO) selectByPk("comtnfiledetailDAO.selectComtnfiledetail_S", vo);
    }

    /**
	 * COMTNFILEDETAIL 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNFILEDETAIL 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnfiledetailList(ComtnfiledetailVO vo) throws Exception {
        return list("comtnfiledetailDAO.selectComtnfiledetailList_D", vo);
    }

    /**
	 * COMTNFILEDETAIL 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNFILEDETAIL 총 갯수
	 * @exception
	 */
    public int selectComtnfiledetailListTotCnt(ComtnfiledetailVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnfiledetailDAO.selectComtnfiledetailListTotCnt_S", vo);
    }

}

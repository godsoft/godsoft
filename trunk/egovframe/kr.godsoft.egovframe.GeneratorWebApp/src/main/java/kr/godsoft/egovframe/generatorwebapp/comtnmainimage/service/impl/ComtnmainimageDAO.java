package kr.godsoft.egovframe.generatorwebapp.comtnmainimage.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnmainimage.service.ComtnmainimageVO;

/**
 * @Class Name : ComtnmainimageDAO.java
 * @Description : Comtnmainimage DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnmainimageDAO")
public class ComtnmainimageDAO extends EgovAbstractDAO {

	/**
	 * comtnmainimage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmainimageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnmainimage(ComtnmainimageVO vo) throws Exception {
        return (String)insert("comtnmainimageDAO.insertComtnmainimage_S", vo);
    }

    /**
	 * comtnmainimage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmainimageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnmainimage(ComtnmainimageVO vo) throws Exception {
        update("comtnmainimageDAO.updateComtnmainimage_S", vo);
    }

    /**
	 * comtnmainimage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmainimageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnmainimage(ComtnmainimageVO vo) throws Exception {
        delete("comtnmainimageDAO.deleteComtnmainimage_S", vo);
    }

    /**
	 * comtnmainimage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmainimageVO
	 * @return 조회한 comtnmainimage
	 * @exception Exception
	 */
    public ComtnmainimageVO selectComtnmainimage(ComtnmainimageVO vo) throws Exception {
        return (ComtnmainimageVO) selectByPk("comtnmainimageDAO.selectComtnmainimage_S", vo);
    }

    /**
	 * comtnmainimage 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnmainimage 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnmainimageList(ComtnmainimageVO vo) throws Exception {
        return list("comtnmainimageDAO.selectComtnmainimageList_D", vo);
    }

    /**
	 * comtnmainimage 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnmainimage 총 갯수
	 * @exception
	 */
    public int selectComtnmainimageListTotCnt(ComtnmainimageVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnmainimageDAO.selectComtnmainimageListTotCnt_S", vo);
    }

}

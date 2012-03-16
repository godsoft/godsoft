package kr.godsoft.egovframe.generatorwebapp.comtnloginscrinimage.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtnloginscrinimage.service.ComtnloginscrinimageVO;

/**
 * @Class Name : ComtnloginscrinimageDAO.java
 * @Description : Comtnloginscrinimage DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnloginscrinimageDAO")
public class ComtnloginscrinimageDAO extends EgovAbstractDAO {

	/**
	 * comtnloginscrinimage을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnloginscrinimageVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnloginscrinimage(ComtnloginscrinimageVO vo) throws Exception {
        return (String)insert("comtnloginscrinimageDAO.insertComtnloginscrinimage_S", vo);
    }

    /**
	 * comtnloginscrinimage을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnloginscrinimageVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnloginscrinimage(ComtnloginscrinimageVO vo) throws Exception {
        update("comtnloginscrinimageDAO.updateComtnloginscrinimage_S", vo);
    }

    /**
	 * comtnloginscrinimage을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnloginscrinimageVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnloginscrinimage(ComtnloginscrinimageVO vo) throws Exception {
        delete("comtnloginscrinimageDAO.deleteComtnloginscrinimage_S", vo);
    }

    /**
	 * comtnloginscrinimage을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnloginscrinimageVO
	 * @return 조회한 comtnloginscrinimage
	 * @exception Exception
	 */
    public ComtnloginscrinimageVO selectComtnloginscrinimage(ComtnloginscrinimageVO vo) throws Exception {
        return (ComtnloginscrinimageVO) selectByPk("comtnloginscrinimageDAO.selectComtnloginscrinimage_S", vo);
    }

    /**
	 * comtnloginscrinimage 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnloginscrinimage 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtnloginscrinimageList(ComtnloginscrinimageVO vo) throws Exception {
        return list("comtnloginscrinimageDAO.selectComtnloginscrinimageList_D", vo);
    }

    /**
	 * comtnloginscrinimage 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtnloginscrinimage 총 갯수
	 * @exception
	 */
    public int selectComtnloginscrinimageListTotCnt(ComtnloginscrinimageVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtnloginscrinimageDAO.selectComtnloginscrinimageListTotCnt_S", vo);
    }

}

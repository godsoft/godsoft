package kr.godsoft.egovframe.generatorwebapp.comtecopseq.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comtecopseq.service.ComtecopseqVO;
import kr.godsoft.egovframe.generatorwebapp.comtecopseq.service.ComtecopseqDefaultVO;

/**
 * @Class Name : ComtecopseqDAO.java
 * @Description : Comtecopseq DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtecopseqDAO")
public class ComtecopseqDAO extends EgovAbstractDAO {

	/**
	 * comtecopseq을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtecopseqVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtecopseq(ComtecopseqVO vo) throws Exception {
        return (String)insert("comtecopseqDAO.insertComtecopseq_S", vo);
    }

    /**
	 * comtecopseq을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtecopseqVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtecopseq(ComtecopseqVO vo) throws Exception {
        update("comtecopseqDAO.updateComtecopseq_S", vo);
    }

    /**
	 * comtecopseq을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtecopseqVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtecopseq(ComtecopseqVO vo) throws Exception {
        delete("comtecopseqDAO.deleteComtecopseq_S", vo);
    }

    /**
	 * comtecopseq을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtecopseqVO
	 * @return 조회한 comtecopseq
	 * @exception Exception
	 */
    public ComtecopseqVO selectComtecopseq(ComtecopseqVO vo) throws Exception {
        return (ComtecopseqVO) selectByPk("comtecopseqDAO.selectComtecopseq_S", vo);
    }

    /**
	 * comtecopseq 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtecopseq 목록
	 * @exception Exception
	 */
    public List selectComtecopseqList(ComtecopseqDefaultVO searchVO) throws Exception {
        return list("comtecopseqDAO.selectComtecopseqList_D", searchVO);
    }

    /**
	 * comtecopseq 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comtecopseq 총 갯수
	 * @exception
	 */
    public int selectComtecopseqListTotCnt(ComtecopseqDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtecopseqDAO.selectComtecopseqListTotCnt_S", searchVO);
    }

}

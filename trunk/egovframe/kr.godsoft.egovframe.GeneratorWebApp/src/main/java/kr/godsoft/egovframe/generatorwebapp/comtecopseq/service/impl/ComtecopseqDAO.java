package kr.godsoft.egovframe.generatorwebapp.comtecopseq.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.comtecopseq.service.ComtecopseqVO;

/**
 * @Class Name : ComtecopseqDAO.java
 * @Description : Comtecopseq DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtecopseqDAO")
public class ComtecopseqDAO extends EgovAbstractDAO {

	/**
	 * COMTECOPSEQ을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtecopseqVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtecopseq(ComtecopseqVO vo) throws Exception {
        return (String)insert("comtecopseqDAO.insertComtecopseq_S", vo);
    }

    /**
	 * COMTECOPSEQ을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtecopseqVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtecopseq(ComtecopseqVO vo) throws Exception {
        update("comtecopseqDAO.updateComtecopseq_S", vo);
    }

    /**
	 * COMTECOPSEQ을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtecopseqVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtecopseq(ComtecopseqVO vo) throws Exception {
        delete("comtecopseqDAO.deleteComtecopseq_S", vo);
    }

    /**
	 * COMTECOPSEQ을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtecopseqVO
	 * @return 조회한 COMTECOPSEQ
	 * @exception Exception
	 */
    public ComtecopseqVO selectComtecopseq(ComtecopseqVO vo) throws Exception {
        return (ComtecopseqVO) selectByPk("comtecopseqDAO.selectComtecopseq_S", vo);
    }

    /**
	 * COMTECOPSEQ 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTECOPSEQ 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectComtecopseqList(ComtecopseqVO vo) throws Exception {
        return list("comtecopseqDAO.selectComtecopseqList_D", vo);
    }

    /**
	 * COMTECOPSEQ 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTECOPSEQ 총 갯수
	 * @exception
	 */
    public int selectComtecopseqListTotCnt(ComtecopseqVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comtecopseqDAO.selectComtecopseqListTotCnt_S", vo);
    }

}

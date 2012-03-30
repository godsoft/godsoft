package kr.godsoft.egovframe.generatorwebapp.md_sequences.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_sequences.service.MdSequencesVO;

/**
 * @Class Name : MdSequencesDAO.java
 * @Description : MdSequences DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdSequencesDAO")
public class MdSequencesDAO extends EgovAbstractDAO {

	/**
	 * MD_SEQUENCES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdSequencesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdSequences(MdSequencesVO vo) throws Exception {
        return (String)insert("mdSequencesDAO.insertMdSequences_S", vo);
    }

    /**
	 * MD_SEQUENCES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdSequencesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdSequences(MdSequencesVO vo) throws Exception {
        update("mdSequencesDAO.updateMdSequences_S", vo);
    }

    /**
	 * MD_SEQUENCES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdSequencesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdSequences(MdSequencesVO vo) throws Exception {
        delete("mdSequencesDAO.deleteMdSequences_S", vo);
    }

    /**
	 * MD_SEQUENCES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdSequencesVO
	 * @return 조회한 MD_SEQUENCES
	 * @exception Exception
	 */
    public MdSequencesVO selectMdSequences(MdSequencesVO vo) throws Exception {
        return (MdSequencesVO) selectByPk("mdSequencesDAO.selectMdSequences_S", vo);
    }

    /**
	 * MD_SEQUENCES 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_SEQUENCES 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdSequencesList(MdSequencesVO vo) throws Exception {
        return list("mdSequencesDAO.selectMdSequencesList_D", vo);
    }

    /**
	 * MD_SEQUENCES 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_SEQUENCES 총 갯수
	 * @exception
	 */
    public int selectMdSequencesListTotCnt(MdSequencesVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdSequencesDAO.selectMdSequencesListTotCnt_S", vo);
    }

}

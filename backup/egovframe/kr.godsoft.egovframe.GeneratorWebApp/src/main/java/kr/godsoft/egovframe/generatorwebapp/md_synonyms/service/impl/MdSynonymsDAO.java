package kr.godsoft.egovframe.generatorwebapp.md_synonyms.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_synonyms.service.MdSynonymsVO;

/**
 * @Class Name : MdSynonymsDAO.java
 * @Description : MdSynonyms DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdSynonymsDAO")
public class MdSynonymsDAO extends EgovAbstractDAO {

	/**
	 * MD_SYNONYMS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdSynonymsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdSynonyms(MdSynonymsVO vo) throws Exception {
        return (String)insert("mdSynonymsDAO.insertMdSynonyms_S", vo);
    }

    /**
	 * MD_SYNONYMS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdSynonymsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdSynonyms(MdSynonymsVO vo) throws Exception {
        update("mdSynonymsDAO.updateMdSynonyms_S", vo);
    }

    /**
	 * MD_SYNONYMS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdSynonymsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdSynonyms(MdSynonymsVO vo) throws Exception {
        delete("mdSynonymsDAO.deleteMdSynonyms_S", vo);
    }

    /**
	 * MD_SYNONYMS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdSynonymsVO
	 * @return 조회한 MD_SYNONYMS
	 * @exception Exception
	 */
    public MdSynonymsVO selectMdSynonyms(MdSynonymsVO vo) throws Exception {
        return (MdSynonymsVO) selectByPk("mdSynonymsDAO.selectMdSynonyms_S", vo);
    }

    /**
	 * MD_SYNONYMS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_SYNONYMS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdSynonymsList(MdSynonymsVO vo) throws Exception {
        return list("mdSynonymsDAO.selectMdSynonymsList_D", vo);
    }

    /**
	 * MD_SYNONYMS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_SYNONYMS 총 갯수
	 * @exception
	 */
    public int selectMdSynonymsListTotCnt(MdSynonymsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdSynonymsDAO.selectMdSynonymsListTotCnt_S", vo);
    }

}

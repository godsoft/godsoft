package kr.godsoft.egovframe.generatorwebapp.md_indexes.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_indexes.service.MdIndexesVO;

/**
 * @Class Name : MdIndexesDAO.java
 * @Description : MdIndexes DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdIndexesDAO")
public class MdIndexesDAO extends EgovAbstractDAO {

	/**
	 * MD_INDEXES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdIndexesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdIndexes(MdIndexesVO vo) throws Exception {
        return (String)insert("mdIndexesDAO.insertMdIndexes_S", vo);
    }

    /**
	 * MD_INDEXES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdIndexesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdIndexes(MdIndexesVO vo) throws Exception {
        update("mdIndexesDAO.updateMdIndexes_S", vo);
    }

    /**
	 * MD_INDEXES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdIndexesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdIndexes(MdIndexesVO vo) throws Exception {
        delete("mdIndexesDAO.deleteMdIndexes_S", vo);
    }

    /**
	 * MD_INDEXES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdIndexesVO
	 * @return 조회한 MD_INDEXES
	 * @exception Exception
	 */
    public MdIndexesVO selectMdIndexes(MdIndexesVO vo) throws Exception {
        return (MdIndexesVO) selectByPk("mdIndexesDAO.selectMdIndexes_S", vo);
    }

    /**
	 * MD_INDEXES 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_INDEXES 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdIndexesList(MdIndexesVO vo) throws Exception {
        return list("mdIndexesDAO.selectMdIndexesList_D", vo);
    }

    /**
	 * MD_INDEXES 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_INDEXES 총 갯수
	 * @exception
	 */
    public int selectMdIndexesListTotCnt(MdIndexesVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdIndexesDAO.selectMdIndexesListTotCnt_S", vo);
    }

}

package kr.godsoft.egovframe.generatorwebapp.md_index_details.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_index_details.service.MdIndexDetailsVO;

/**
 * @Class Name : MdIndexDetailsDAO.java
 * @Description : MdIndexDetails DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdIndexDetailsDAO")
public class MdIndexDetailsDAO extends EgovAbstractDAO {

	/**
	 * MD_INDEX_DETAILS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdIndexDetailsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdIndexDetails(MdIndexDetailsVO vo) throws Exception {
        return (String)insert("mdIndexDetailsDAO.insertMdIndexDetails_S", vo);
    }

    /**
	 * MD_INDEX_DETAILS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdIndexDetailsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdIndexDetails(MdIndexDetailsVO vo) throws Exception {
        update("mdIndexDetailsDAO.updateMdIndexDetails_S", vo);
    }

    /**
	 * MD_INDEX_DETAILS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdIndexDetailsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdIndexDetails(MdIndexDetailsVO vo) throws Exception {
        delete("mdIndexDetailsDAO.deleteMdIndexDetails_S", vo);
    }

    /**
	 * MD_INDEX_DETAILS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdIndexDetailsVO
	 * @return 조회한 MD_INDEX_DETAILS
	 * @exception Exception
	 */
    public MdIndexDetailsVO selectMdIndexDetails(MdIndexDetailsVO vo) throws Exception {
        return (MdIndexDetailsVO) selectByPk("mdIndexDetailsDAO.selectMdIndexDetails_S", vo);
    }

    /**
	 * MD_INDEX_DETAILS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_INDEX_DETAILS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdIndexDetailsList(MdIndexDetailsVO vo) throws Exception {
        return list("mdIndexDetailsDAO.selectMdIndexDetailsList_D", vo);
    }

    /**
	 * MD_INDEX_DETAILS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_INDEX_DETAILS 총 갯수
	 * @exception
	 */
    public int selectMdIndexDetailsListTotCnt(MdIndexDetailsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdIndexDetailsDAO.selectMdIndexDetailsListTotCnt_S", vo);
    }

}

package kr.godsoft.egovframe.generatorwebapp.md_triggers.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_triggers.service.MdTriggersVO;

/**
 * @Class Name : MdTriggersDAO.java
 * @Description : MdTriggers DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdTriggersDAO")
public class MdTriggersDAO extends EgovAbstractDAO {

	/**
	 * MD_TRIGGERS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdTriggersVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdTriggers(MdTriggersVO vo) throws Exception {
        return (String)insert("mdTriggersDAO.insertMdTriggers_S", vo);
    }

    /**
	 * MD_TRIGGERS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdTriggersVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdTriggers(MdTriggersVO vo) throws Exception {
        update("mdTriggersDAO.updateMdTriggers_S", vo);
    }

    /**
	 * MD_TRIGGERS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdTriggersVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdTriggers(MdTriggersVO vo) throws Exception {
        delete("mdTriggersDAO.deleteMdTriggers_S", vo);
    }

    /**
	 * MD_TRIGGERS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdTriggersVO
	 * @return 조회한 MD_TRIGGERS
	 * @exception Exception
	 */
    public MdTriggersVO selectMdTriggers(MdTriggersVO vo) throws Exception {
        return (MdTriggersVO) selectByPk("mdTriggersDAO.selectMdTriggers_S", vo);
    }

    /**
	 * MD_TRIGGERS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_TRIGGERS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdTriggersList(MdTriggersVO vo) throws Exception {
        return list("mdTriggersDAO.selectMdTriggersList_D", vo);
    }

    /**
	 * MD_TRIGGERS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_TRIGGERS 총 갯수
	 * @exception
	 */
    public int selectMdTriggersListTotCnt(MdTriggersVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdTriggersDAO.selectMdTriggersListTotCnt_S", vo);
    }

}
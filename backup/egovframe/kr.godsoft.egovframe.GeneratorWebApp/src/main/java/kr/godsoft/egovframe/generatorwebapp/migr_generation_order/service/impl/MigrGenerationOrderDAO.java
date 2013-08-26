package kr.godsoft.egovframe.generatorwebapp.migr_generation_order.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.migr_generation_order.service.MigrGenerationOrderVO;

/**
 * @Class Name : MigrGenerationOrderDAO.java
 * @Description : MigrGenerationOrder DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("migrGenerationOrderDAO")
public class MigrGenerationOrderDAO extends EgovAbstractDAO {

	/**
	 * MIGR_GENERATION_ORDER을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MigrGenerationOrderVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMigrGenerationOrder(MigrGenerationOrderVO vo) throws Exception {
        return (String)insert("migrGenerationOrderDAO.insertMigrGenerationOrder_S", vo);
    }

    /**
	 * MIGR_GENERATION_ORDER을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MigrGenerationOrderVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMigrGenerationOrder(MigrGenerationOrderVO vo) throws Exception {
        update("migrGenerationOrderDAO.updateMigrGenerationOrder_S", vo);
    }

    /**
	 * MIGR_GENERATION_ORDER을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MigrGenerationOrderVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMigrGenerationOrder(MigrGenerationOrderVO vo) throws Exception {
        delete("migrGenerationOrderDAO.deleteMigrGenerationOrder_S", vo);
    }

    /**
	 * MIGR_GENERATION_ORDER을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MigrGenerationOrderVO
	 * @return 조회한 MIGR_GENERATION_ORDER
	 * @exception Exception
	 */
    public MigrGenerationOrderVO selectMigrGenerationOrder(MigrGenerationOrderVO vo) throws Exception {
        return (MigrGenerationOrderVO) selectByPk("migrGenerationOrderDAO.selectMigrGenerationOrder_S", vo);
    }

    /**
	 * MIGR_GENERATION_ORDER 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MIGR_GENERATION_ORDER 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMigrGenerationOrderList(MigrGenerationOrderVO vo) throws Exception {
        return list("migrGenerationOrderDAO.selectMigrGenerationOrderList_D", vo);
    }

    /**
	 * MIGR_GENERATION_ORDER 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MIGR_GENERATION_ORDER 총 갯수
	 * @exception
	 */
    public int selectMigrGenerationOrderListTotCnt(MigrGenerationOrderVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("migrGenerationOrderDAO.selectMigrGenerationOrderListTotCnt_S", vo);
    }

}

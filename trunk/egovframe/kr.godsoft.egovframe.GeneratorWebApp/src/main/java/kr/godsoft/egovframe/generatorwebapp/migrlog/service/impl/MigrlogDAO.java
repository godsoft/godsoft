package kr.godsoft.egovframe.generatorwebapp.migrlog.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.migrlog.service.MigrlogVO;

/**
 * @Class Name : MigrlogDAO.java
 * @Description : Migrlog DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("migrlogDAO")
public class MigrlogDAO extends EgovAbstractDAO {

	/**
	 * MIGRLOG을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MigrlogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMigrlog(MigrlogVO vo) throws Exception {
        return (String)insert("migrlogDAO.insertMigrlog_S", vo);
    }

    /**
	 * MIGRLOG을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MigrlogVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMigrlog(MigrlogVO vo) throws Exception {
        update("migrlogDAO.updateMigrlog_S", vo);
    }

    /**
	 * MIGRLOG을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MigrlogVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMigrlog(MigrlogVO vo) throws Exception {
        delete("migrlogDAO.deleteMigrlog_S", vo);
    }

    /**
	 * MIGRLOG을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MigrlogVO
	 * @return 조회한 MIGRLOG
	 * @exception Exception
	 */
    public MigrlogVO selectMigrlog(MigrlogVO vo) throws Exception {
        return (MigrlogVO) selectByPk("migrlogDAO.selectMigrlog_S", vo);
    }

    /**
	 * MIGRLOG 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MIGRLOG 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMigrlogList(MigrlogVO vo) throws Exception {
        return list("migrlogDAO.selectMigrlogList_D", vo);
    }

    /**
	 * MIGRLOG 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MIGRLOG 총 갯수
	 * @exception
	 */
    public int selectMigrlogListTotCnt(MigrlogVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("migrlogDAO.selectMigrlogListTotCnt_S", vo);
    }

}

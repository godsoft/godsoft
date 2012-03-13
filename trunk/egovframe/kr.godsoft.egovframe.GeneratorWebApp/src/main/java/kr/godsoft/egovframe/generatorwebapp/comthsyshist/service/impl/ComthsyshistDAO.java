package kr.godsoft.egovframe.generatorwebapp.comthsyshist.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kr.godsoft.egovframe.generatorwebapp.comthsyshist.service.ComthsyshistVO;
import kr.godsoft.egovframe.generatorwebapp.comthsyshist.service.ComthsyshistDefaultVO;

/**
 * @Class Name : ComthsyshistDAO.java
 * @Description : Comthsyshist DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comthsyshistDAO")
public class ComthsyshistDAO extends EgovAbstractDAO {

	/**
	 * comthsyshist을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthsyshistVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComthsyshist(ComthsyshistVO vo) throws Exception {
        return (String)insert("comthsyshistDAO.insertComthsyshist_S", vo);
    }

    /**
	 * comthsyshist을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthsyshistVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComthsyshist(ComthsyshistVO vo) throws Exception {
        update("comthsyshistDAO.updateComthsyshist_S", vo);
    }

    /**
	 * comthsyshist을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthsyshistVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComthsyshist(ComthsyshistVO vo) throws Exception {
        delete("comthsyshistDAO.deleteComthsyshist_S", vo);
    }

    /**
	 * comthsyshist을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthsyshistVO
	 * @return 조회한 comthsyshist
	 * @exception Exception
	 */
    public ComthsyshistVO selectComthsyshist(ComthsyshistVO vo) throws Exception {
        return (ComthsyshistVO) selectByPk("comthsyshistDAO.selectComthsyshist_S", vo);
    }

    /**
	 * comthsyshist 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comthsyshist 목록
	 * @exception Exception
	 */
    public List selectComthsyshistList(ComthsyshistDefaultVO searchVO) throws Exception {
        return list("comthsyshistDAO.selectComthsyshistList_D", searchVO);
    }

    /**
	 * comthsyshist 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return comthsyshist 총 갯수
	 * @exception
	 */
    public int selectComthsyshistListTotCnt(ComthsyshistDefaultVO searchVO) {
        return (Integer)getSqlMapClientTemplate().queryForObject("comthsyshistDAO.selectComthsyshistListTotCnt_S", searchVO);
    }

}

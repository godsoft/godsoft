package kr.godsoft.egovframe.generatorwebapp.md_connections.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_connections.service.MdConnectionsVO;

/**
 * @Class Name : MdConnectionsDAO.java
 * @Description : MdConnections DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdConnectionsDAO")
public class MdConnectionsDAO extends EgovAbstractDAO {

	/**
	 * MD_CONNECTIONS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdConnectionsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdConnections(MdConnectionsVO vo) throws Exception {
        return (String)insert("mdConnectionsDAO.insertMdConnections_S", vo);
    }

    /**
	 * MD_CONNECTIONS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdConnectionsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdConnections(MdConnectionsVO vo) throws Exception {
        update("mdConnectionsDAO.updateMdConnections_S", vo);
    }

    /**
	 * MD_CONNECTIONS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdConnectionsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdConnections(MdConnectionsVO vo) throws Exception {
        delete("mdConnectionsDAO.deleteMdConnections_S", vo);
    }

    /**
	 * MD_CONNECTIONS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdConnectionsVO
	 * @return 조회한 MD_CONNECTIONS
	 * @exception Exception
	 */
    public MdConnectionsVO selectMdConnections(MdConnectionsVO vo) throws Exception {
        return (MdConnectionsVO) selectByPk("mdConnectionsDAO.selectMdConnections_S", vo);
    }

    /**
	 * MD_CONNECTIONS 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_CONNECTIONS 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdConnectionsList(MdConnectionsVO vo) throws Exception {
        return list("mdConnectionsDAO.selectMdConnectionsList_D", vo);
    }

    /**
	 * MD_CONNECTIONS 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_CONNECTIONS 총 갯수
	 * @exception
	 */
    public int selectMdConnectionsListTotCnt(MdConnectionsVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdConnectionsDAO.selectMdConnectionsListTotCnt_S", vo);
    }

}

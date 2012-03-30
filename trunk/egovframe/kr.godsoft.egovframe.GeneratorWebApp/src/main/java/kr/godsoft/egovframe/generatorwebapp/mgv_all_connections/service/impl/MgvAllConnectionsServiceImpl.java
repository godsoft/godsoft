package kr.godsoft.egovframe.generatorwebapp.mgv_all_connections.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.mgv_all_connections.service.MgvAllConnectionsService;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_connections.service.MgvAllConnectionsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MgvAllConnectionsServiceImpl.java
 * @Description : MgvAllConnections Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mgvAllConnectionsService")
public class MgvAllConnectionsServiceImpl extends AbstractServiceImpl implements
        MgvAllConnectionsService {

    @Resource(name="mgvAllConnectionsDAO")
    private MgvAllConnectionsDAO mgvAllConnectionsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMgvAllConnectionsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MGV_ALL_CONNECTIONS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllConnectionsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMgvAllConnections(MgvAllConnectionsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mgvAllConnectionsDAO.insertMgvAllConnections(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MGV_ALL_CONNECTIONS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllConnectionsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMgvAllConnections(MgvAllConnectionsVO vo) throws Exception {
        mgvAllConnectionsDAO.updateMgvAllConnections(vo);
    }

    /**
	 * MGV_ALL_CONNECTIONS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllConnectionsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMgvAllConnections(MgvAllConnectionsVO vo) throws Exception {
        mgvAllConnectionsDAO.deleteMgvAllConnections(vo);
    }

    /**
	 * MGV_ALL_CONNECTIONS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllConnectionsVO
	 * @return 조회한 MGV_ALL_CONNECTIONS
	 * @exception Exception
	 */
    public MgvAllConnectionsVO selectMgvAllConnections(MgvAllConnectionsVO vo) throws Exception {
        MgvAllConnectionsVO resultVO = mgvAllConnectionsDAO.selectMgvAllConnections(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MGV_ALL_CONNECTIONS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_CONNECTIONS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMgvAllConnectionsList(MgvAllConnectionsVO vo) throws Exception {
        return mgvAllConnectionsDAO.selectMgvAllConnectionsList(vo);
    }

    /**
	 * MGV_ALL_CONNECTIONS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_CONNECTIONS 총 갯수
	 * @exception
	 */
    public int selectMgvAllConnectionsListTotCnt(MgvAllConnectionsVO vo) {
		return mgvAllConnectionsDAO.selectMgvAllConnectionsListTotCnt(vo);
	}
    
}

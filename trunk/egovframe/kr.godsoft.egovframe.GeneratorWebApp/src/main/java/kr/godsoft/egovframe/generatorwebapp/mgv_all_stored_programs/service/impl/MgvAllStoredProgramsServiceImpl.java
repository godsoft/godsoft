package kr.godsoft.egovframe.generatorwebapp.mgv_all_stored_programs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.mgv_all_stored_programs.service.MgvAllStoredProgramsService;
import kr.godsoft.egovframe.generatorwebapp.mgv_all_stored_programs.service.MgvAllStoredProgramsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MgvAllStoredProgramsServiceImpl.java
 * @Description : MgvAllStoredPrograms Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mgvAllStoredProgramsService")
public class MgvAllStoredProgramsServiceImpl extends AbstractServiceImpl implements
        MgvAllStoredProgramsService {

    @Resource(name="mgvAllStoredProgramsDAO")
    private MgvAllStoredProgramsDAO mgvAllStoredProgramsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMgvAllStoredProgramsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MGV_ALL_STORED_PROGRAMS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MgvAllStoredProgramsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMgvAllStoredPrograms(MgvAllStoredProgramsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mgvAllStoredProgramsDAO.insertMgvAllStoredPrograms(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MGV_ALL_STORED_PROGRAMS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MgvAllStoredProgramsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMgvAllStoredPrograms(MgvAllStoredProgramsVO vo) throws Exception {
        mgvAllStoredProgramsDAO.updateMgvAllStoredPrograms(vo);
    }

    /**
	 * MGV_ALL_STORED_PROGRAMS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MgvAllStoredProgramsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMgvAllStoredPrograms(MgvAllStoredProgramsVO vo) throws Exception {
        mgvAllStoredProgramsDAO.deleteMgvAllStoredPrograms(vo);
    }

    /**
	 * MGV_ALL_STORED_PROGRAMS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MgvAllStoredProgramsVO
	 * @return 조회한 MGV_ALL_STORED_PROGRAMS
	 * @exception Exception
	 */
    public MgvAllStoredProgramsVO selectMgvAllStoredPrograms(MgvAllStoredProgramsVO vo) throws Exception {
        MgvAllStoredProgramsVO resultVO = mgvAllStoredProgramsDAO.selectMgvAllStoredPrograms(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MGV_ALL_STORED_PROGRAMS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_STORED_PROGRAMS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMgvAllStoredProgramsList(MgvAllStoredProgramsVO vo) throws Exception {
        return mgvAllStoredProgramsDAO.selectMgvAllStoredProgramsList(vo);
    }

    /**
	 * MGV_ALL_STORED_PROGRAMS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MGV_ALL_STORED_PROGRAMS 총 갯수
	 * @exception
	 */
    public int selectMgvAllStoredProgramsListTotCnt(MgvAllStoredProgramsVO vo) {
		return mgvAllStoredProgramsDAO.selectMgvAllStoredProgramsListTotCnt(vo);
	}
    
}

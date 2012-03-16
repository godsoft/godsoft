package kr.godsoft.egovframe.generatorwebapp.comtndammapteam.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtndammapteam.service.ComtndammapteamService;
import kr.godsoft.egovframe.generatorwebapp.comtndammapteam.service.ComtndammapteamVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtndammapteamServiceImpl.java
 * @Description : Comtndammapteam Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtndammapteamService")
public class ComtndammapteamServiceImpl extends AbstractServiceImpl implements
        ComtndammapteamService {

    @Resource(name="comtndammapteamDAO")
    private ComtndammapteamDAO comtndammapteamDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtndammapteamIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtndammapteam을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndammapteamVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndammapteam(ComtndammapteamVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtndammapteamDAO.insertComtndammapteam(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtndammapteam을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndammapteamVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndammapteam(ComtndammapteamVO vo) throws Exception {
        comtndammapteamDAO.updateComtndammapteam(vo);
    }

    /**
	 * comtndammapteam을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndammapteamVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndammapteam(ComtndammapteamVO vo) throws Exception {
        comtndammapteamDAO.deleteComtndammapteam(vo);
    }

    /**
	 * comtndammapteam을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndammapteamVO
	 * @return 조회한 comtndammapteam
	 * @exception Exception
	 */
    public ComtndammapteamVO selectComtndammapteam(ComtndammapteamVO vo) throws Exception {
        ComtndammapteamVO resultVO = comtndammapteamDAO.selectComtndammapteam(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtndammapteam 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndammapteam 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtndammapteamList(ComtndammapteamVO vo) throws Exception {
        return comtndammapteamDAO.selectComtndammapteamList(vo);
    }

    /**
	 * comtndammapteam 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndammapteam 총 갯수
	 * @exception
	 */
    public int selectComtndammapteamListTotCnt(ComtndammapteamVO vo) {
		return comtndammapteamDAO.selectComtndammapteamListTotCnt(vo);
	}
    
}

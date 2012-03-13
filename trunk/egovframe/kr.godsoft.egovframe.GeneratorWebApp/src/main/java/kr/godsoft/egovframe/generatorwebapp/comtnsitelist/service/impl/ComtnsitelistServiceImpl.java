package kr.godsoft.egovframe.generatorwebapp.comtnsitelist.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnsitelist.service.ComtnsitelistService;
import kr.godsoft.egovframe.generatorwebapp.comtnsitelist.service.ComtnsitelistDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsitelist.service.ComtnsitelistVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsitelist.service.impl.ComtnsitelistDAO;

/**
 * @Class Name : ComtnsitelistServiceImpl.java
 * @Description : Comtnsitelist Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnsitelistService")
public class ComtnsitelistServiceImpl extends AbstractServiceImpl implements
        ComtnsitelistService {

    @Resource(name="comtnsitelistDAO")
    private ComtnsitelistDAO comtnsitelistDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnsitelistIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnsitelist을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsitelistVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnsitelist(ComtnsitelistVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnsitelistDAO.insertComtnsitelist(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnsitelist을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsitelistVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnsitelist(ComtnsitelistVO vo) throws Exception {
        comtnsitelistDAO.updateComtnsitelist(vo);
    }

    /**
	 * comtnsitelist을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsitelistVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnsitelist(ComtnsitelistVO vo) throws Exception {
        comtnsitelistDAO.deleteComtnsitelist(vo);
    }

    /**
	 * comtnsitelist을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsitelistVO
	 * @return 조회한 comtnsitelist
	 * @exception Exception
	 */
    public ComtnsitelistVO selectComtnsitelist(ComtnsitelistVO vo) throws Exception {
        ComtnsitelistVO resultVO = comtnsitelistDAO.selectComtnsitelist(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnsitelist 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsitelist 목록
	 * @exception Exception
	 */
    public List selectComtnsitelistList(ComtnsitelistDefaultVO searchVO) throws Exception {
        return comtnsitelistDAO.selectComtnsitelistList(searchVO);
    }

    /**
	 * comtnsitelist 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsitelist 총 갯수
	 * @exception
	 */
    public int selectComtnsitelistListTotCnt(ComtnsitelistDefaultVO searchVO) {
		return comtnsitelistDAO.selectComtnsitelistListTotCnt(searchVO);
	}
    
}

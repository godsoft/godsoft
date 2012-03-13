package kr.godsoft.egovframe.generatorwebapp.comtncpyrhtinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtncpyrhtinfo.service.ComtncpyrhtinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtncpyrhtinfo.service.ComtncpyrhtinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtncpyrhtinfo.service.ComtncpyrhtinfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtncpyrhtinfo.service.impl.ComtncpyrhtinfoDAO;

/**
 * @Class Name : ComtncpyrhtinfoServiceImpl.java
 * @Description : Comtncpyrhtinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtncpyrhtinfoService")
public class ComtncpyrhtinfoServiceImpl extends AbstractServiceImpl implements
        ComtncpyrhtinfoService {

    @Resource(name="comtncpyrhtinfoDAO")
    private ComtncpyrhtinfoDAO comtncpyrhtinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtncpyrhtinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtncpyrhtinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncpyrhtinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncpyrhtinfo(ComtncpyrhtinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtncpyrhtinfoDAO.insertComtncpyrhtinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtncpyrhtinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncpyrhtinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncpyrhtinfo(ComtncpyrhtinfoVO vo) throws Exception {
        comtncpyrhtinfoDAO.updateComtncpyrhtinfo(vo);
    }

    /**
	 * comtncpyrhtinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncpyrhtinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncpyrhtinfo(ComtncpyrhtinfoVO vo) throws Exception {
        comtncpyrhtinfoDAO.deleteComtncpyrhtinfo(vo);
    }

    /**
	 * comtncpyrhtinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncpyrhtinfoVO
	 * @return 조회한 comtncpyrhtinfo
	 * @exception Exception
	 */
    public ComtncpyrhtinfoVO selectComtncpyrhtinfo(ComtncpyrhtinfoVO vo) throws Exception {
        ComtncpyrhtinfoVO resultVO = comtncpyrhtinfoDAO.selectComtncpyrhtinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtncpyrhtinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncpyrhtinfo 목록
	 * @exception Exception
	 */
    public List selectComtncpyrhtinfoList(ComtncpyrhtinfoDefaultVO searchVO) throws Exception {
        return comtncpyrhtinfoDAO.selectComtncpyrhtinfoList(searchVO);
    }

    /**
	 * comtncpyrhtinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncpyrhtinfo 총 갯수
	 * @exception
	 */
    public int selectComtncpyrhtinfoListTotCnt(ComtncpyrhtinfoDefaultVO searchVO) {
		return comtncpyrhtinfoDAO.selectComtncpyrhtinfoListTotCnt(searchVO);
	}
    
}
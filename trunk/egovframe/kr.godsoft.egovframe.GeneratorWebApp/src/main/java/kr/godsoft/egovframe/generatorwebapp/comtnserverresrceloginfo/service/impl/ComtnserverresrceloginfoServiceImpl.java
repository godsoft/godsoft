package kr.godsoft.egovframe.generatorwebapp.comtnserverresrceloginfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnserverresrceloginfo.service.ComtnserverresrceloginfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnserverresrceloginfo.service.ComtnserverresrceloginfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnserverresrceloginfo.service.ComtnserverresrceloginfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnserverresrceloginfo.service.impl.ComtnserverresrceloginfoDAO;

/**
 * @Class Name : ComtnserverresrceloginfoServiceImpl.java
 * @Description : Comtnserverresrceloginfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnserverresrceloginfoService")
public class ComtnserverresrceloginfoServiceImpl extends AbstractServiceImpl implements
        ComtnserverresrceloginfoService {

    @Resource(name="comtnserverresrceloginfoDAO")
    private ComtnserverresrceloginfoDAO comtnserverresrceloginfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnserverresrceloginfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnserverresrceloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnserverresrceloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnserverresrceloginfo(ComtnserverresrceloginfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnserverresrceloginfoDAO.insertComtnserverresrceloginfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnserverresrceloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnserverresrceloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnserverresrceloginfo(ComtnserverresrceloginfoVO vo) throws Exception {
        comtnserverresrceloginfoDAO.updateComtnserverresrceloginfo(vo);
    }

    /**
	 * comtnserverresrceloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnserverresrceloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnserverresrceloginfo(ComtnserverresrceloginfoVO vo) throws Exception {
        comtnserverresrceloginfoDAO.deleteComtnserverresrceloginfo(vo);
    }

    /**
	 * comtnserverresrceloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnserverresrceloginfoVO
	 * @return 조회한 comtnserverresrceloginfo
	 * @exception Exception
	 */
    public ComtnserverresrceloginfoVO selectComtnserverresrceloginfo(ComtnserverresrceloginfoVO vo) throws Exception {
        ComtnserverresrceloginfoVO resultVO = comtnserverresrceloginfoDAO.selectComtnserverresrceloginfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnserverresrceloginfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnserverresrceloginfo 목록
	 * @exception Exception
	 */
    public List selectComtnserverresrceloginfoList(ComtnserverresrceloginfoDefaultVO searchVO) throws Exception {
        return comtnserverresrceloginfoDAO.selectComtnserverresrceloginfoList(searchVO);
    }

    /**
	 * comtnserverresrceloginfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnserverresrceloginfo 총 갯수
	 * @exception
	 */
    public int selectComtnserverresrceloginfoListTotCnt(ComtnserverresrceloginfoDefaultVO searchVO) {
		return comtnserverresrceloginfoDAO.selectComtnserverresrceloginfoListTotCnt(searchVO);
	}
    
}

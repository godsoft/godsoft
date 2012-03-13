package kr.godsoft.egovframe.generatorwebapp.comtnprocessmonloginfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnprocessmonloginfo.service.ComtnprocessmonloginfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnprocessmonloginfo.service.ComtnprocessmonloginfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnprocessmonloginfo.service.ComtnprocessmonloginfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnprocessmonloginfo.service.impl.ComtnprocessmonloginfoDAO;

/**
 * @Class Name : ComtnprocessmonloginfoServiceImpl.java
 * @Description : Comtnprocessmonloginfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnprocessmonloginfoService")
public class ComtnprocessmonloginfoServiceImpl extends AbstractServiceImpl implements
        ComtnprocessmonloginfoService {

    @Resource(name="comtnprocessmonloginfoDAO")
    private ComtnprocessmonloginfoDAO comtnprocessmonloginfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnprocessmonloginfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnprocessmonloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnprocessmonloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnprocessmonloginfo(ComtnprocessmonloginfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnprocessmonloginfoDAO.insertComtnprocessmonloginfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnprocessmonloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnprocessmonloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnprocessmonloginfo(ComtnprocessmonloginfoVO vo) throws Exception {
        comtnprocessmonloginfoDAO.updateComtnprocessmonloginfo(vo);
    }

    /**
	 * comtnprocessmonloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnprocessmonloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnprocessmonloginfo(ComtnprocessmonloginfoVO vo) throws Exception {
        comtnprocessmonloginfoDAO.deleteComtnprocessmonloginfo(vo);
    }

    /**
	 * comtnprocessmonloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnprocessmonloginfoVO
	 * @return 조회한 comtnprocessmonloginfo
	 * @exception Exception
	 */
    public ComtnprocessmonloginfoVO selectComtnprocessmonloginfo(ComtnprocessmonloginfoVO vo) throws Exception {
        ComtnprocessmonloginfoVO resultVO = comtnprocessmonloginfoDAO.selectComtnprocessmonloginfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnprocessmonloginfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnprocessmonloginfo 목록
	 * @exception Exception
	 */
    public List selectComtnprocessmonloginfoList(ComtnprocessmonloginfoDefaultVO searchVO) throws Exception {
        return comtnprocessmonloginfoDAO.selectComtnprocessmonloginfoList(searchVO);
    }

    /**
	 * comtnprocessmonloginfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnprocessmonloginfo 총 갯수
	 * @exception
	 */
    public int selectComtnprocessmonloginfoListTotCnt(ComtnprocessmonloginfoDefaultVO searchVO) {
		return comtnprocessmonloginfoDAO.selectComtnprocessmonloginfoListTotCnt(searchVO);
	}
    
}

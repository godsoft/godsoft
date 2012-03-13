package kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrngloginfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrngloginfo.service.ComtnfilesysmntrngloginfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrngloginfo.service.ComtnfilesysmntrngloginfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrngloginfo.service.ComtnfilesysmntrngloginfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnfilesysmntrngloginfo.service.impl.ComtnfilesysmntrngloginfoDAO;

/**
 * @Class Name : ComtnfilesysmntrngloginfoServiceImpl.java
 * @Description : Comtnfilesysmntrngloginfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnfilesysmntrngloginfoService")
public class ComtnfilesysmntrngloginfoServiceImpl extends AbstractServiceImpl implements
        ComtnfilesysmntrngloginfoService {

    @Resource(name="comtnfilesysmntrngloginfoDAO")
    private ComtnfilesysmntrngloginfoDAO comtnfilesysmntrngloginfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnfilesysmntrngloginfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnfilesysmntrngloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnfilesysmntrngloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnfilesysmntrngloginfo(ComtnfilesysmntrngloginfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnfilesysmntrngloginfoDAO.insertComtnfilesysmntrngloginfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnfilesysmntrngloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnfilesysmntrngloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnfilesysmntrngloginfo(ComtnfilesysmntrngloginfoVO vo) throws Exception {
        comtnfilesysmntrngloginfoDAO.updateComtnfilesysmntrngloginfo(vo);
    }

    /**
	 * comtnfilesysmntrngloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnfilesysmntrngloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnfilesysmntrngloginfo(ComtnfilesysmntrngloginfoVO vo) throws Exception {
        comtnfilesysmntrngloginfoDAO.deleteComtnfilesysmntrngloginfo(vo);
    }

    /**
	 * comtnfilesysmntrngloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnfilesysmntrngloginfoVO
	 * @return 조회한 comtnfilesysmntrngloginfo
	 * @exception Exception
	 */
    public ComtnfilesysmntrngloginfoVO selectComtnfilesysmntrngloginfo(ComtnfilesysmntrngloginfoVO vo) throws Exception {
        ComtnfilesysmntrngloginfoVO resultVO = comtnfilesysmntrngloginfoDAO.selectComtnfilesysmntrngloginfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnfilesysmntrngloginfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnfilesysmntrngloginfo 목록
	 * @exception Exception
	 */
    public List selectComtnfilesysmntrngloginfoList(ComtnfilesysmntrngloginfoDefaultVO searchVO) throws Exception {
        return comtnfilesysmntrngloginfoDAO.selectComtnfilesysmntrngloginfoList(searchVO);
    }

    /**
	 * comtnfilesysmntrngloginfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnfilesysmntrngloginfo 총 갯수
	 * @exception
	 */
    public int selectComtnfilesysmntrngloginfoListTotCnt(ComtnfilesysmntrngloginfoDefaultVO searchVO) {
		return comtnfilesysmntrngloginfoDAO.selectComtnfilesysmntrngloginfoListTotCnt(searchVO);
	}
    
}

package kr.godsoft.egovframe.generatorwebapp.comthdbmntrngloginfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comthdbmntrngloginfo.service.ComthdbmntrngloginfoService;
import kr.godsoft.egovframe.generatorwebapp.comthdbmntrngloginfo.service.ComthdbmntrngloginfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comthdbmntrngloginfo.service.ComthdbmntrngloginfoVO;
import kr.godsoft.egovframe.generatorwebapp.comthdbmntrngloginfo.service.impl.ComthdbmntrngloginfoDAO;

/**
 * @Class Name : ComthdbmntrngloginfoServiceImpl.java
 * @Description : Comthdbmntrngloginfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comthdbmntrngloginfoService")
public class ComthdbmntrngloginfoServiceImpl extends AbstractServiceImpl implements
        ComthdbmntrngloginfoService {

    @Resource(name="comthdbmntrngloginfoDAO")
    private ComthdbmntrngloginfoDAO comthdbmntrngloginfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComthdbmntrngloginfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comthdbmntrngloginfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthdbmntrngloginfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComthdbmntrngloginfo(ComthdbmntrngloginfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comthdbmntrngloginfoDAO.insertComthdbmntrngloginfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comthdbmntrngloginfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthdbmntrngloginfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComthdbmntrngloginfo(ComthdbmntrngloginfoVO vo) throws Exception {
        comthdbmntrngloginfoDAO.updateComthdbmntrngloginfo(vo);
    }

    /**
	 * comthdbmntrngloginfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthdbmntrngloginfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComthdbmntrngloginfo(ComthdbmntrngloginfoVO vo) throws Exception {
        comthdbmntrngloginfoDAO.deleteComthdbmntrngloginfo(vo);
    }

    /**
	 * comthdbmntrngloginfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthdbmntrngloginfoVO
	 * @return 조회한 comthdbmntrngloginfo
	 * @exception Exception
	 */
    public ComthdbmntrngloginfoVO selectComthdbmntrngloginfo(ComthdbmntrngloginfoVO vo) throws Exception {
        ComthdbmntrngloginfoVO resultVO = comthdbmntrngloginfoDAO.selectComthdbmntrngloginfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comthdbmntrngloginfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthdbmntrngloginfo 목록
	 * @exception Exception
	 */
    public List selectComthdbmntrngloginfoList(ComthdbmntrngloginfoDefaultVO searchVO) throws Exception {
        return comthdbmntrngloginfoDAO.selectComthdbmntrngloginfoList(searchVO);
    }

    /**
	 * comthdbmntrngloginfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthdbmntrngloginfo 총 갯수
	 * @exception
	 */
    public int selectComthdbmntrngloginfoListTotCnt(ComthdbmntrngloginfoDefaultVO searchVO) {
		return comthdbmntrngloginfoDAO.selectComthdbmntrngloginfoListTotCnt(searchVO);
	}
    
}

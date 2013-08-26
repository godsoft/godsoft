package kr.godsoft.egovframe.generatorwebapp.comtnstsfdg.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnstsfdg.service.ComtnstsfdgService;
import kr.godsoft.egovframe.generatorwebapp.comtnstsfdg.service.ComtnstsfdgVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnstsfdgServiceImpl.java
 * @Description : Comtnstsfdg Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnstsfdgService")
public class ComtnstsfdgServiceImpl extends AbstractServiceImpl implements
        ComtnstsfdgService {

    @Resource(name="comtnstsfdgDAO")
    private ComtnstsfdgDAO comtnstsfdgDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnstsfdgIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNSTSFDG을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnstsfdgVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnstsfdg(ComtnstsfdgVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnstsfdgDAO.insertComtnstsfdg(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNSTSFDG을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnstsfdgVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnstsfdg(ComtnstsfdgVO vo) throws Exception {
        comtnstsfdgDAO.updateComtnstsfdg(vo);
    }

    /**
	 * COMTNSTSFDG을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnstsfdgVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnstsfdg(ComtnstsfdgVO vo) throws Exception {
        comtnstsfdgDAO.deleteComtnstsfdg(vo);
    }

    /**
	 * COMTNSTSFDG을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnstsfdgVO
	 * @return 조회한 COMTNSTSFDG
	 * @exception Exception
	 */
    public ComtnstsfdgVO selectComtnstsfdg(ComtnstsfdgVO vo) throws Exception {
        ComtnstsfdgVO resultVO = comtnstsfdgDAO.selectComtnstsfdg(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNSTSFDG 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSTSFDG 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnstsfdgList(ComtnstsfdgVO vo) throws Exception {
        return comtnstsfdgDAO.selectComtnstsfdgList(vo);
    }

    /**
	 * COMTNSTSFDG 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSTSFDG 총 갯수
	 * @exception
	 */
    public int selectComtnstsfdgListTotCnt(ComtnstsfdgVO vo) {
		return comtnstsfdgDAO.selectComtnstsfdgListTotCnt(vo);
	}
    
}
package kr.godsoft.egovframe.generatorwebapp.comtnbbsmaster.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbbsmaster.service.ComtnbbsmasterService;
import kr.godsoft.egovframe.generatorwebapp.comtnbbsmaster.service.ComtnbbsmasterVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnbbsmasterServiceImpl.java
 * @Description : Comtnbbsmaster Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnbbsmasterService")
public class ComtnbbsmasterServiceImpl extends AbstractServiceImpl implements
        ComtnbbsmasterService {

    @Resource(name="comtnbbsmasterDAO")
    private ComtnbbsmasterDAO comtnbbsmasterDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnbbsmasterIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnbbsmaster을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbbsmasterVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbbsmaster(ComtnbbsmasterVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnbbsmasterDAO.insertComtnbbsmaster(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnbbsmaster을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbbsmasterVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbbsmaster(ComtnbbsmasterVO vo) throws Exception {
        comtnbbsmasterDAO.updateComtnbbsmaster(vo);
    }

    /**
	 * comtnbbsmaster을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbbsmasterVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbbsmaster(ComtnbbsmasterVO vo) throws Exception {
        comtnbbsmasterDAO.deleteComtnbbsmaster(vo);
    }

    /**
	 * comtnbbsmaster을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbbsmasterVO
	 * @return 조회한 comtnbbsmaster
	 * @exception Exception
	 */
    public ComtnbbsmasterVO selectComtnbbsmaster(ComtnbbsmasterVO vo) throws Exception {
        ComtnbbsmasterVO resultVO = comtnbbsmasterDAO.selectComtnbbsmaster(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnbbsmaster 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbbsmaster 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnbbsmasterList(ComtnbbsmasterVO vo) throws Exception {
        return comtnbbsmasterDAO.selectComtnbbsmasterList(vo);
    }

    /**
	 * comtnbbsmaster 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbbsmaster 총 갯수
	 * @exception
	 */
    public int selectComtnbbsmasterListTotCnt(ComtnbbsmasterVO vo) {
		return comtnbbsmasterDAO.selectComtnbbsmasterListTotCnt(vo);
	}
    
}

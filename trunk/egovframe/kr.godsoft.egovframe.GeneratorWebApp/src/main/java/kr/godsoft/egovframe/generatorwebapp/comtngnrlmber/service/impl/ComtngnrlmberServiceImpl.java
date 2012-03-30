package kr.godsoft.egovframe.generatorwebapp.comtngnrlmber.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtngnrlmber.service.ComtngnrlmberService;
import kr.godsoft.egovframe.generatorwebapp.comtngnrlmber.service.ComtngnrlmberVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtngnrlmberServiceImpl.java
 * @Description : Comtngnrlmber Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtngnrlmberService")
public class ComtngnrlmberServiceImpl extends AbstractServiceImpl implements
        ComtngnrlmberService {

    @Resource(name="comtngnrlmberDAO")
    private ComtngnrlmberDAO comtngnrlmberDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtngnrlmberIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNGNRLMBER을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtngnrlmberVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtngnrlmber(ComtngnrlmberVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtngnrlmberDAO.insertComtngnrlmber(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNGNRLMBER을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtngnrlmberVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtngnrlmber(ComtngnrlmberVO vo) throws Exception {
        comtngnrlmberDAO.updateComtngnrlmber(vo);
    }

    /**
	 * COMTNGNRLMBER을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtngnrlmberVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtngnrlmber(ComtngnrlmberVO vo) throws Exception {
        comtngnrlmberDAO.deleteComtngnrlmber(vo);
    }

    /**
	 * COMTNGNRLMBER을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtngnrlmberVO
	 * @return 조회한 COMTNGNRLMBER
	 * @exception Exception
	 */
    public ComtngnrlmberVO selectComtngnrlmber(ComtngnrlmberVO vo) throws Exception {
        ComtngnrlmberVO resultVO = comtngnrlmberDAO.selectComtngnrlmber(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNGNRLMBER 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNGNRLMBER 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtngnrlmberList(ComtngnrlmberVO vo) throws Exception {
        return comtngnrlmberDAO.selectComtngnrlmberList(vo);
    }

    /**
	 * COMTNGNRLMBER 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNGNRLMBER 총 갯수
	 * @exception
	 */
    public int selectComtngnrlmberListTotCnt(ComtngnrlmberVO vo) {
		return comtngnrlmberDAO.selectComtngnrlmberListTotCnt(vo);
	}
    
}

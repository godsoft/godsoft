package kr.godsoft.egovframe.generatorwebapp.comtnrss.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnrss.service.ComtnrssService;
import kr.godsoft.egovframe.generatorwebapp.comtnrss.service.ComtnrssVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnrssServiceImpl.java
 * @Description : Comtnrss Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnrssService")
public class ComtnrssServiceImpl extends AbstractServiceImpl implements
        ComtnrssService {

    @Resource(name="comtnrssDAO")
    private ComtnrssDAO comtnrssDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnrssIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnrss을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrssVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnrss(ComtnrssVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnrssDAO.insertComtnrss(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnrss을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrssVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnrss(ComtnrssVO vo) throws Exception {
        comtnrssDAO.updateComtnrss(vo);
    }

    /**
	 * comtnrss을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrssVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnrss(ComtnrssVO vo) throws Exception {
        comtnrssDAO.deleteComtnrss(vo);
    }

    /**
	 * comtnrss을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrssVO
	 * @return 조회한 comtnrss
	 * @exception Exception
	 */
    public ComtnrssVO selectComtnrss(ComtnrssVO vo) throws Exception {
        ComtnrssVO resultVO = comtnrssDAO.selectComtnrss(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnrss 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnrss 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnrssList(ComtnrssVO vo) throws Exception {
        return comtnrssDAO.selectComtnrssList(vo);
    }

    /**
	 * comtnrss 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnrss 총 갯수
	 * @exception
	 */
    public int selectComtnrssListTotCnt(ComtnrssVO vo) {
		return comtnrssDAO.selectComtnrssListTotCnt(vo);
	}
    
}

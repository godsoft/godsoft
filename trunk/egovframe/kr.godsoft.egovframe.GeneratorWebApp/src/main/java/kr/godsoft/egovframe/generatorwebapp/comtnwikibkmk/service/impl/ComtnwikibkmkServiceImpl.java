package kr.godsoft.egovframe.generatorwebapp.comtnwikibkmk.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnwikibkmk.service.ComtnwikibkmkService;
import kr.godsoft.egovframe.generatorwebapp.comtnwikibkmk.service.ComtnwikibkmkVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnwikibkmkServiceImpl.java
 * @Description : Comtnwikibkmk Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnwikibkmkService")
public class ComtnwikibkmkServiceImpl extends AbstractServiceImpl implements
        ComtnwikibkmkService {

    @Resource(name="comtnwikibkmkDAO")
    private ComtnwikibkmkDAO comtnwikibkmkDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnwikibkmkIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnwikibkmk을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnwikibkmkVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnwikibkmk(ComtnwikibkmkVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnwikibkmkDAO.insertComtnwikibkmk(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnwikibkmk을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnwikibkmkVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnwikibkmk(ComtnwikibkmkVO vo) throws Exception {
        comtnwikibkmkDAO.updateComtnwikibkmk(vo);
    }

    /**
	 * comtnwikibkmk을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnwikibkmkVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnwikibkmk(ComtnwikibkmkVO vo) throws Exception {
        comtnwikibkmkDAO.deleteComtnwikibkmk(vo);
    }

    /**
	 * comtnwikibkmk을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnwikibkmkVO
	 * @return 조회한 comtnwikibkmk
	 * @exception Exception
	 */
    public ComtnwikibkmkVO selectComtnwikibkmk(ComtnwikibkmkVO vo) throws Exception {
        ComtnwikibkmkVO resultVO = comtnwikibkmkDAO.selectComtnwikibkmk(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnwikibkmk 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnwikibkmk 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnwikibkmkList(ComtnwikibkmkVO vo) throws Exception {
        return comtnwikibkmkDAO.selectComtnwikibkmkList(vo);
    }

    /**
	 * comtnwikibkmk 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnwikibkmk 총 갯수
	 * @exception
	 */
    public int selectComtnwikibkmkListTotCnt(ComtnwikibkmkVO vo) {
		return comtnwikibkmkDAO.selectComtnwikibkmkListTotCnt(vo);
	}
    
}

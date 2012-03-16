package kr.godsoft.egovframe.generatorwebapp.comtncntcmessageitem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtncntcmessageitem.service.ComtncntcmessageitemService;
import kr.godsoft.egovframe.generatorwebapp.comtncntcmessageitem.service.ComtncntcmessageitemVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtncntcmessageitemServiceImpl.java
 * @Description : Comtncntcmessageitem Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtncntcmessageitemService")
public class ComtncntcmessageitemServiceImpl extends AbstractServiceImpl implements
        ComtncntcmessageitemService {

    @Resource(name="comtncntcmessageitemDAO")
    private ComtncntcmessageitemDAO comtncntcmessageitemDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtncntcmessageitemIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtncntcmessageitem을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncntcmessageitemVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtncntcmessageitem(ComtncntcmessageitemVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtncntcmessageitemDAO.insertComtncntcmessageitem(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtncntcmessageitem을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncntcmessageitemVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtncntcmessageitem(ComtncntcmessageitemVO vo) throws Exception {
        comtncntcmessageitemDAO.updateComtncntcmessageitem(vo);
    }

    /**
	 * comtncntcmessageitem을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncntcmessageitemVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtncntcmessageitem(ComtncntcmessageitemVO vo) throws Exception {
        comtncntcmessageitemDAO.deleteComtncntcmessageitem(vo);
    }

    /**
	 * comtncntcmessageitem을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncntcmessageitemVO
	 * @return 조회한 comtncntcmessageitem
	 * @exception Exception
	 */
    public ComtncntcmessageitemVO selectComtncntcmessageitem(ComtncntcmessageitemVO vo) throws Exception {
        ComtncntcmessageitemVO resultVO = comtncntcmessageitemDAO.selectComtncntcmessageitem(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtncntcmessageitem 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncntcmessageitem 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtncntcmessageitemList(ComtncntcmessageitemVO vo) throws Exception {
        return comtncntcmessageitemDAO.selectComtncntcmessageitemList(vo);
    }

    /**
	 * comtncntcmessageitem 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncntcmessageitem 총 갯수
	 * @exception
	 */
    public int selectComtncntcmessageitemListTotCnt(ComtncntcmessageitemVO vo) {
		return comtncntcmessageitemDAO.selectComtncntcmessageitemListTotCnt(vo);
	}
    
}

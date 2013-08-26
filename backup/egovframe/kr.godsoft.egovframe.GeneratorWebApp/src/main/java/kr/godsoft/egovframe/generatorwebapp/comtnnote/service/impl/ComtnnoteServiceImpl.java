package kr.godsoft.egovframe.generatorwebapp.comtnnote.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnnote.service.ComtnnoteService;
import kr.godsoft.egovframe.generatorwebapp.comtnnote.service.ComtnnoteVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnnoteServiceImpl.java
 * @Description : Comtnnote Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnnoteService")
public class ComtnnoteServiceImpl extends AbstractServiceImpl implements
        ComtnnoteService {

    @Resource(name="comtnnoteDAO")
    private ComtnnoteDAO comtnnoteDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnnoteIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNNOTE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnnoteVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnnote(ComtnnoteVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnnoteDAO.insertComtnnote(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNNOTE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnnoteVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnnote(ComtnnoteVO vo) throws Exception {
        comtnnoteDAO.updateComtnnote(vo);
    }

    /**
	 * COMTNNOTE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnnoteVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnnote(ComtnnoteVO vo) throws Exception {
        comtnnoteDAO.deleteComtnnote(vo);
    }

    /**
	 * COMTNNOTE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnnoteVO
	 * @return 조회한 COMTNNOTE
	 * @exception Exception
	 */
    public ComtnnoteVO selectComtnnote(ComtnnoteVO vo) throws Exception {
        ComtnnoteVO resultVO = comtnnoteDAO.selectComtnnote(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNNOTE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNOTE 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnnoteList(ComtnnoteVO vo) throws Exception {
        return comtnnoteDAO.selectComtnnoteList(vo);
    }

    /**
	 * COMTNNOTE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNOTE 총 갯수
	 * @exception
	 */
    public int selectComtnnoteListTotCnt(ComtnnoteVO vo) {
		return comtnnoteDAO.selectComtnnoteListTotCnt(vo);
	}
    
}

package kr.godsoft.egovframe.generatorwebapp.comtnadministrationword.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnadministrationword.service.ComtnadministrationwordService;
import kr.godsoft.egovframe.generatorwebapp.comtnadministrationword.service.ComtnadministrationwordVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnadministrationwordServiceImpl.java
 * @Description : Comtnadministrationword Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnadministrationwordService")
public class ComtnadministrationwordServiceImpl extends AbstractServiceImpl implements
        ComtnadministrationwordService {

    @Resource(name="comtnadministrationwordDAO")
    private ComtnadministrationwordDAO comtnadministrationwordDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnadministrationwordIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNADMINISTRATIONWORD을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnadministrationwordVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnadministrationword(ComtnadministrationwordVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnadministrationwordDAO.insertComtnadministrationword(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNADMINISTRATIONWORD을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnadministrationwordVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnadministrationword(ComtnadministrationwordVO vo) throws Exception {
        comtnadministrationwordDAO.updateComtnadministrationword(vo);
    }

    /**
	 * COMTNADMINISTRATIONWORD을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnadministrationwordVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnadministrationword(ComtnadministrationwordVO vo) throws Exception {
        comtnadministrationwordDAO.deleteComtnadministrationword(vo);
    }

    /**
	 * COMTNADMINISTRATIONWORD을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnadministrationwordVO
	 * @return 조회한 COMTNADMINISTRATIONWORD
	 * @exception Exception
	 */
    public ComtnadministrationwordVO selectComtnadministrationword(ComtnadministrationwordVO vo) throws Exception {
        ComtnadministrationwordVO resultVO = comtnadministrationwordDAO.selectComtnadministrationword(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNADMINISTRATIONWORD 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNADMINISTRATIONWORD 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnadministrationwordList(ComtnadministrationwordVO vo) throws Exception {
        return comtnadministrationwordDAO.selectComtnadministrationwordList(vo);
    }

    /**
	 * COMTNADMINISTRATIONWORD 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNADMINISTRATIONWORD 총 갯수
	 * @exception
	 */
    public int selectComtnadministrationwordListTotCnt(ComtnadministrationwordVO vo) {
		return comtnadministrationwordDAO.selectComtnadministrationwordListTotCnt(vo);
	}
    
}

package kr.godsoft.egovframe.generatorwebapp.comtnncrduser.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnncrduser.service.ComtnncrduserService;
import kr.godsoft.egovframe.generatorwebapp.comtnncrduser.service.ComtnncrduserVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnncrduserServiceImpl.java
 * @Description : Comtnncrduser Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnncrduserService")
public class ComtnncrduserServiceImpl extends AbstractServiceImpl implements
        ComtnncrduserService {

    @Resource(name="comtnncrduserDAO")
    private ComtnncrduserDAO comtnncrduserDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnncrduserIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNNCRDUSER을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnncrduserVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnncrduser(ComtnncrduserVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnncrduserDAO.insertComtnncrduser(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNNCRDUSER을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnncrduserVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnncrduser(ComtnncrduserVO vo) throws Exception {
        comtnncrduserDAO.updateComtnncrduser(vo);
    }

    /**
	 * COMTNNCRDUSER을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnncrduserVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnncrduser(ComtnncrduserVO vo) throws Exception {
        comtnncrduserDAO.deleteComtnncrduser(vo);
    }

    /**
	 * COMTNNCRDUSER을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnncrduserVO
	 * @return 조회한 COMTNNCRDUSER
	 * @exception Exception
	 */
    public ComtnncrduserVO selectComtnncrduser(ComtnncrduserVO vo) throws Exception {
        ComtnncrduserVO resultVO = comtnncrduserDAO.selectComtnncrduser(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNNCRDUSER 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNCRDUSER 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnncrduserList(ComtnncrduserVO vo) throws Exception {
        return comtnncrduserDAO.selectComtnncrduserList(vo);
    }

    /**
	 * COMTNNCRDUSER 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNCRDUSER 총 갯수
	 * @exception
	 */
    public int selectComtnncrduserListTotCnt(ComtnncrduserVO vo) {
		return comtnncrduserDAO.selectComtnncrduserListTotCnt(vo);
	}
    
}

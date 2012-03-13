package kr.godsoft.egovframe.generatorwebapp.comtndammapkno.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtndammapkno.service.ComtndammapknoService;
import kr.godsoft.egovframe.generatorwebapp.comtndammapkno.service.ComtndammapknoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtndammapkno.service.ComtndammapknoVO;
import kr.godsoft.egovframe.generatorwebapp.comtndammapkno.service.impl.ComtndammapknoDAO;

/**
 * @Class Name : ComtndammapknoServiceImpl.java
 * @Description : Comtndammapkno Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtndammapknoService")
public class ComtndammapknoServiceImpl extends AbstractServiceImpl implements
        ComtndammapknoService {

    @Resource(name="comtndammapknoDAO")
    private ComtndammapknoDAO comtndammapknoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtndammapknoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtndammapkno을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtndammapknoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtndammapkno(ComtndammapknoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtndammapknoDAO.insertComtndammapkno(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtndammapkno을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtndammapknoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtndammapkno(ComtndammapknoVO vo) throws Exception {
        comtndammapknoDAO.updateComtndammapkno(vo);
    }

    /**
	 * comtndammapkno을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtndammapknoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtndammapkno(ComtndammapknoVO vo) throws Exception {
        comtndammapknoDAO.deleteComtndammapkno(vo);
    }

    /**
	 * comtndammapkno을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtndammapknoVO
	 * @return 조회한 comtndammapkno
	 * @exception Exception
	 */
    public ComtndammapknoVO selectComtndammapkno(ComtndammapknoVO vo) throws Exception {
        ComtndammapknoVO resultVO = comtndammapknoDAO.selectComtndammapkno(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtndammapkno 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndammapkno 목록
	 * @exception Exception
	 */
    public List selectComtndammapknoList(ComtndammapknoDefaultVO searchVO) throws Exception {
        return comtndammapknoDAO.selectComtndammapknoList(searchVO);
    }

    /**
	 * comtndammapkno 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtndammapkno 총 갯수
	 * @exception
	 */
    public int selectComtndammapknoListTotCnt(ComtndammapknoDefaultVO searchVO) {
		return comtndammapknoDAO.selectComtndammapknoListTotCnt(searchVO);
	}
    
}

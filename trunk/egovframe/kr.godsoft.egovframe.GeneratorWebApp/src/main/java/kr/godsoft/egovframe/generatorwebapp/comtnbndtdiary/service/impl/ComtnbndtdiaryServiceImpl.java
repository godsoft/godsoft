package kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service.ComtnbndtdiaryService;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service.ComtnbndtdiaryDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service.ComtnbndtdiaryVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service.impl.ComtnbndtdiaryDAO;

/**
 * @Class Name : ComtnbndtdiaryServiceImpl.java
 * @Description : Comtnbndtdiary Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnbndtdiaryService")
public class ComtnbndtdiaryServiceImpl extends AbstractServiceImpl implements
        ComtnbndtdiaryService {

    @Resource(name="comtnbndtdiaryDAO")
    private ComtnbndtdiaryDAO comtnbndtdiaryDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnbndtdiaryIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnbndtdiary을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbndtdiaryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbndtdiary(ComtnbndtdiaryVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnbndtdiaryDAO.insertComtnbndtdiary(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnbndtdiary을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbndtdiaryVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbndtdiary(ComtnbndtdiaryVO vo) throws Exception {
        comtnbndtdiaryDAO.updateComtnbndtdiary(vo);
    }

    /**
	 * comtnbndtdiary을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbndtdiaryVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbndtdiary(ComtnbndtdiaryVO vo) throws Exception {
        comtnbndtdiaryDAO.deleteComtnbndtdiary(vo);
    }

    /**
	 * comtnbndtdiary을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbndtdiaryVO
	 * @return 조회한 comtnbndtdiary
	 * @exception Exception
	 */
    public ComtnbndtdiaryVO selectComtnbndtdiary(ComtnbndtdiaryVO vo) throws Exception {
        ComtnbndtdiaryVO resultVO = comtnbndtdiaryDAO.selectComtnbndtdiary(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnbndtdiary 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbndtdiary 목록
	 * @exception Exception
	 */
    public List selectComtnbndtdiaryList(ComtnbndtdiaryDefaultVO searchVO) throws Exception {
        return comtnbndtdiaryDAO.selectComtnbndtdiaryList(searchVO);
    }

    /**
	 * comtnbndtdiary 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbndtdiary 총 갯수
	 * @exception
	 */
    public int selectComtnbndtdiaryListTotCnt(ComtnbndtdiaryDefaultVO searchVO) {
		return comtnbndtdiaryDAO.selectComtnbndtdiaryListTotCnt(searchVO);
	}
    
}

package kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service.ComtnbndtdiaryService;
import kr.godsoft.egovframe.generatorwebapp.comtnbndtdiary.service.ComtnbndtdiaryVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnbndtdiaryServiceImpl.java
 * @Description : Comtnbndtdiary Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
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
	 * COMTNBNDTDIARY을 등록한다.
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
	 * COMTNBNDTDIARY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbndtdiaryVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbndtdiary(ComtnbndtdiaryVO vo) throws Exception {
        comtnbndtdiaryDAO.updateComtnbndtdiary(vo);
    }

    /**
	 * COMTNBNDTDIARY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbndtdiaryVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbndtdiary(ComtnbndtdiaryVO vo) throws Exception {
        comtnbndtdiaryDAO.deleteComtnbndtdiary(vo);
    }

    /**
	 * COMTNBNDTDIARY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbndtdiaryVO
	 * @return 조회한 COMTNBNDTDIARY
	 * @exception Exception
	 */
    public ComtnbndtdiaryVO selectComtnbndtdiary(ComtnbndtdiaryVO vo) throws Exception {
        ComtnbndtdiaryVO resultVO = comtnbndtdiaryDAO.selectComtnbndtdiary(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNBNDTDIARY 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBNDTDIARY 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnbndtdiaryList(ComtnbndtdiaryVO vo) throws Exception {
        return comtnbndtdiaryDAO.selectComtnbndtdiaryList(vo);
    }

    /**
	 * COMTNBNDTDIARY 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBNDTDIARY 총 갯수
	 * @exception
	 */
    public int selectComtnbndtdiaryListTotCnt(ComtnbndtdiaryVO vo) {
		return comtnbndtdiaryDAO.selectComtnbndtdiaryListTotCnt(vo);
	}
    
}

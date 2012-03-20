package kr.godsoft.egovframe.generatorwebapp.comtnmemotodo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnmemotodo.service.ComtnmemotodoService;
import kr.godsoft.egovframe.generatorwebapp.comtnmemotodo.service.ComtnmemotodoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnmemotodoServiceImpl.java
 * @Description : Comtnmemotodo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnmemotodoService")
public class ComtnmemotodoServiceImpl extends AbstractServiceImpl implements
        ComtnmemotodoService {

    @Resource(name="comtnmemotodoDAO")
    private ComtnmemotodoDAO comtnmemotodoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnmemotodoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnmemotodo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmemotodoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnmemotodo(ComtnmemotodoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnmemotodoDAO.insertComtnmemotodo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnmemotodo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmemotodoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnmemotodo(ComtnmemotodoVO vo) throws Exception {
        comtnmemotodoDAO.updateComtnmemotodo(vo);
    }

    /**
	 * comtnmemotodo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmemotodoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnmemotodo(ComtnmemotodoVO vo) throws Exception {
        comtnmemotodoDAO.deleteComtnmemotodo(vo);
    }

    /**
	 * comtnmemotodo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmemotodoVO
	 * @return 조회한 comtnmemotodo
	 * @exception Exception
	 */
    public ComtnmemotodoVO selectComtnmemotodo(ComtnmemotodoVO vo) throws Exception {
        ComtnmemotodoVO resultVO = comtnmemotodoDAO.selectComtnmemotodo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnmemotodo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmemotodo 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnmemotodoList(ComtnmemotodoVO vo) throws Exception {
        return comtnmemotodoDAO.selectComtnmemotodoList(vo);
    }

    /**
	 * comtnmemotodo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmemotodo 총 갯수
	 * @exception
	 */
    public int selectComtnmemotodoListTotCnt(ComtnmemotodoVO vo) {
		return comtnmemotodoDAO.selectComtnmemotodoListTotCnt(vo);
	}
    
}

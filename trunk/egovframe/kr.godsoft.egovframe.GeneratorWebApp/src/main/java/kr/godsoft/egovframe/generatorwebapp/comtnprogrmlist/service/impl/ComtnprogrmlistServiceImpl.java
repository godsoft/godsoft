package kr.godsoft.egovframe.generatorwebapp.comtnprogrmlist.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnprogrmlist.service.ComtnprogrmlistService;
import kr.godsoft.egovframe.generatorwebapp.comtnprogrmlist.service.ComtnprogrmlistVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnprogrmlistServiceImpl.java
 * @Description : Comtnprogrmlist Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnprogrmlistService")
public class ComtnprogrmlistServiceImpl extends AbstractServiceImpl implements
        ComtnprogrmlistService {

    @Resource(name="comtnprogrmlistDAO")
    private ComtnprogrmlistDAO comtnprogrmlistDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnprogrmlistIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnprogrmlist을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnprogrmlistVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnprogrmlist(ComtnprogrmlistVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnprogrmlistDAO.insertComtnprogrmlist(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnprogrmlist을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnprogrmlistVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnprogrmlist(ComtnprogrmlistVO vo) throws Exception {
        comtnprogrmlistDAO.updateComtnprogrmlist(vo);
    }

    /**
	 * comtnprogrmlist을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnprogrmlistVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnprogrmlist(ComtnprogrmlistVO vo) throws Exception {
        comtnprogrmlistDAO.deleteComtnprogrmlist(vo);
    }

    /**
	 * comtnprogrmlist을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnprogrmlistVO
	 * @return 조회한 comtnprogrmlist
	 * @exception Exception
	 */
    public ComtnprogrmlistVO selectComtnprogrmlist(ComtnprogrmlistVO vo) throws Exception {
        ComtnprogrmlistVO resultVO = comtnprogrmlistDAO.selectComtnprogrmlist(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnprogrmlist 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnprogrmlist 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnprogrmlistList(ComtnprogrmlistVO vo) throws Exception {
        return comtnprogrmlistDAO.selectComtnprogrmlistList(vo);
    }

    /**
	 * comtnprogrmlist 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnprogrmlist 총 갯수
	 * @exception
	 */
    public int selectComtnprogrmlistListTotCnt(ComtnprogrmlistVO vo) {
		return comtnprogrmlistDAO.selectComtnprogrmlistListTotCnt(vo);
	}
    
}

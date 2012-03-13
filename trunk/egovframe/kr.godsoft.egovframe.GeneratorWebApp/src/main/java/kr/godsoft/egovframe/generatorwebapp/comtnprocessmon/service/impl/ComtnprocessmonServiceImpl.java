package kr.godsoft.egovframe.generatorwebapp.comtnprocessmon.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnprocessmon.service.ComtnprocessmonService;
import kr.godsoft.egovframe.generatorwebapp.comtnprocessmon.service.ComtnprocessmonDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnprocessmon.service.ComtnprocessmonVO;
import kr.godsoft.egovframe.generatorwebapp.comtnprocessmon.service.impl.ComtnprocessmonDAO;

/**
 * @Class Name : ComtnprocessmonServiceImpl.java
 * @Description : Comtnprocessmon Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnprocessmonService")
public class ComtnprocessmonServiceImpl extends AbstractServiceImpl implements
        ComtnprocessmonService {

    @Resource(name="comtnprocessmonDAO")
    private ComtnprocessmonDAO comtnprocessmonDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnprocessmonIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnprocessmon을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnprocessmonVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnprocessmon(ComtnprocessmonVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnprocessmonDAO.insertComtnprocessmon(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnprocessmon을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnprocessmonVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnprocessmon(ComtnprocessmonVO vo) throws Exception {
        comtnprocessmonDAO.updateComtnprocessmon(vo);
    }

    /**
	 * comtnprocessmon을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnprocessmonVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnprocessmon(ComtnprocessmonVO vo) throws Exception {
        comtnprocessmonDAO.deleteComtnprocessmon(vo);
    }

    /**
	 * comtnprocessmon을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnprocessmonVO
	 * @return 조회한 comtnprocessmon
	 * @exception Exception
	 */
    public ComtnprocessmonVO selectComtnprocessmon(ComtnprocessmonVO vo) throws Exception {
        ComtnprocessmonVO resultVO = comtnprocessmonDAO.selectComtnprocessmon(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnprocessmon 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnprocessmon 목록
	 * @exception Exception
	 */
    public List selectComtnprocessmonList(ComtnprocessmonDefaultVO searchVO) throws Exception {
        return comtnprocessmonDAO.selectComtnprocessmonList(searchVO);
    }

    /**
	 * comtnprocessmon 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnprocessmon 총 갯수
	 * @exception
	 */
    public int selectComtnprocessmonListTotCnt(ComtnprocessmonDefaultVO searchVO) {
		return comtnprocessmonDAO.selectComtnprocessmonListTotCnt(searchVO);
	}
    
}

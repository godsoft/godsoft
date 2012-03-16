package kr.godsoft.egovframe.generatorwebapp.comtnroleinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnroleinfo.service.ComtnroleinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnroleinfo.service.ComtnroleinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnroleinfoServiceImpl.java
 * @Description : Comtnroleinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnroleinfoService")
public class ComtnroleinfoServiceImpl extends AbstractServiceImpl implements
        ComtnroleinfoService {

    @Resource(name="comtnroleinfoDAO")
    private ComtnroleinfoDAO comtnroleinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnroleinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnroleinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnroleinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnroleinfo(ComtnroleinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnroleinfoDAO.insertComtnroleinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnroleinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnroleinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnroleinfo(ComtnroleinfoVO vo) throws Exception {
        comtnroleinfoDAO.updateComtnroleinfo(vo);
    }

    /**
	 * comtnroleinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnroleinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnroleinfo(ComtnroleinfoVO vo) throws Exception {
        comtnroleinfoDAO.deleteComtnroleinfo(vo);
    }

    /**
	 * comtnroleinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnroleinfoVO
	 * @return 조회한 comtnroleinfo
	 * @exception Exception
	 */
    public ComtnroleinfoVO selectComtnroleinfo(ComtnroleinfoVO vo) throws Exception {
        ComtnroleinfoVO resultVO = comtnroleinfoDAO.selectComtnroleinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnroleinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnroleinfo 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnroleinfoList(ComtnroleinfoVO vo) throws Exception {
        return comtnroleinfoDAO.selectComtnroleinfoList(vo);
    }

    /**
	 * comtnroleinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnroleinfo 총 갯수
	 * @exception
	 */
    public int selectComtnroleinfoListTotCnt(ComtnroleinfoVO vo) {
		return comtnroleinfoDAO.selectComtnroleinfoListTotCnt(vo);
	}
    
}

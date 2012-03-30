package kr.godsoft.egovframe.generatorwebapp.comtnmenuinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnmenuinfo.service.ComtnmenuinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnmenuinfo.service.ComtnmenuinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnmenuinfoServiceImpl.java
 * @Description : Comtnmenuinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnmenuinfoService")
public class ComtnmenuinfoServiceImpl extends AbstractServiceImpl implements
        ComtnmenuinfoService {

    @Resource(name="comtnmenuinfoDAO")
    private ComtnmenuinfoDAO comtnmenuinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnmenuinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNMENUINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmenuinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnmenuinfo(ComtnmenuinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnmenuinfoDAO.insertComtnmenuinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNMENUINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmenuinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnmenuinfo(ComtnmenuinfoVO vo) throws Exception {
        comtnmenuinfoDAO.updateComtnmenuinfo(vo);
    }

    /**
	 * COMTNMENUINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmenuinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnmenuinfo(ComtnmenuinfoVO vo) throws Exception {
        comtnmenuinfoDAO.deleteComtnmenuinfo(vo);
    }

    /**
	 * COMTNMENUINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmenuinfoVO
	 * @return 조회한 COMTNMENUINFO
	 * @exception Exception
	 */
    public ComtnmenuinfoVO selectComtnmenuinfo(ComtnmenuinfoVO vo) throws Exception {
        ComtnmenuinfoVO resultVO = comtnmenuinfoDAO.selectComtnmenuinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNMENUINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNMENUINFO 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnmenuinfoList(ComtnmenuinfoVO vo) throws Exception {
        return comtnmenuinfoDAO.selectComtnmenuinfoList(vo);
    }

    /**
	 * COMTNMENUINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNMENUINFO 총 갯수
	 * @exception
	 */
    public int selectComtnmenuinfoListTotCnt(ComtnmenuinfoVO vo) {
		return comtnmenuinfoDAO.selectComtnmenuinfoListTotCnt(vo);
	}
    
}

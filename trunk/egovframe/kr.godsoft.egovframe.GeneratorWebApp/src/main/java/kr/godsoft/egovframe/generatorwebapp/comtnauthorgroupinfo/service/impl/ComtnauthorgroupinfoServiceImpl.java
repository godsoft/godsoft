package kr.godsoft.egovframe.generatorwebapp.comtnauthorgroupinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnauthorgroupinfo.service.ComtnauthorgroupinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnauthorgroupinfo.service.ComtnauthorgroupinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnauthorgroupinfoServiceImpl.java
 * @Description : Comtnauthorgroupinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnauthorgroupinfoService")
public class ComtnauthorgroupinfoServiceImpl extends AbstractServiceImpl implements
        ComtnauthorgroupinfoService {

    @Resource(name="comtnauthorgroupinfoDAO")
    private ComtnauthorgroupinfoDAO comtnauthorgroupinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnauthorgroupinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnauthorgroupinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnauthorgroupinfoDAO.insertComtnauthorgroupinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnauthorgroupinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception {
        comtnauthorgroupinfoDAO.updateComtnauthorgroupinfo(vo);
    }

    /**
	 * comtnauthorgroupinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception {
        comtnauthorgroupinfoDAO.deleteComtnauthorgroupinfo(vo);
    }

    /**
	 * comtnauthorgroupinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return 조회한 comtnauthorgroupinfo
	 * @exception Exception
	 */
    public ComtnauthorgroupinfoVO selectComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception {
        ComtnauthorgroupinfoVO resultVO = comtnauthorgroupinfoDAO.selectComtnauthorgroupinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnauthorgroupinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnauthorgroupinfo 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnauthorgroupinfoList(ComtnauthorgroupinfoVO vo) throws Exception {
        return comtnauthorgroupinfoDAO.selectComtnauthorgroupinfoList(vo);
    }

    /**
	 * comtnauthorgroupinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnauthorgroupinfo 총 갯수
	 * @exception
	 */
    public int selectComtnauthorgroupinfoListTotCnt(ComtnauthorgroupinfoVO vo) {
		return comtnauthorgroupinfoDAO.selectComtnauthorgroupinfoListTotCnt(vo);
	}
    
}

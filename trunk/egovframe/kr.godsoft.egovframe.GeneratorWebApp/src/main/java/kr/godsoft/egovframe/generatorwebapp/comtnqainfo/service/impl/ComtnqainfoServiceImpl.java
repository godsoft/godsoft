package kr.godsoft.egovframe.generatorwebapp.comtnqainfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnqainfo.service.ComtnqainfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnqainfo.service.ComtnqainfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqainfo.service.ComtnqainfoVO;
import kr.godsoft.egovframe.generatorwebapp.comtnqainfo.service.impl.ComtnqainfoDAO;

/**
 * @Class Name : ComtnqainfoServiceImpl.java
 * @Description : Comtnqainfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnqainfoService")
public class ComtnqainfoServiceImpl extends AbstractServiceImpl implements
        ComtnqainfoService {

    @Resource(name="comtnqainfoDAO")
    private ComtnqainfoDAO comtnqainfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnqainfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnqainfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnqainfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnqainfo(ComtnqainfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnqainfoDAO.insertComtnqainfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnqainfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnqainfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnqainfo(ComtnqainfoVO vo) throws Exception {
        comtnqainfoDAO.updateComtnqainfo(vo);
    }

    /**
	 * comtnqainfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnqainfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnqainfo(ComtnqainfoVO vo) throws Exception {
        comtnqainfoDAO.deleteComtnqainfo(vo);
    }

    /**
	 * comtnqainfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnqainfoVO
	 * @return 조회한 comtnqainfo
	 * @exception Exception
	 */
    public ComtnqainfoVO selectComtnqainfo(ComtnqainfoVO vo) throws Exception {
        ComtnqainfoVO resultVO = comtnqainfoDAO.selectComtnqainfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnqainfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqainfo 목록
	 * @exception Exception
	 */
    public List selectComtnqainfoList(ComtnqainfoDefaultVO searchVO) throws Exception {
        return comtnqainfoDAO.selectComtnqainfoList(searchVO);
    }

    /**
	 * comtnqainfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnqainfo 총 갯수
	 * @exception
	 */
    public int selectComtnqainfoListTotCnt(ComtnqainfoDefaultVO searchVO) {
		return comtnqainfoDAO.selectComtnqainfoListTotCnt(searchVO);
	}
    
}

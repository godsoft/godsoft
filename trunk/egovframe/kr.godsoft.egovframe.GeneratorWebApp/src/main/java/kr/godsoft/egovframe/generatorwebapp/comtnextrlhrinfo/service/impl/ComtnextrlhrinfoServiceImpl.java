package kr.godsoft.egovframe.generatorwebapp.comtnextrlhrinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnextrlhrinfo.service.ComtnextrlhrinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnextrlhrinfo.service.ComtnextrlhrinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnextrlhrinfoServiceImpl.java
 * @Description : Comtnextrlhrinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnextrlhrinfoService")
public class ComtnextrlhrinfoServiceImpl extends AbstractServiceImpl implements
        ComtnextrlhrinfoService {

    @Resource(name="comtnextrlhrinfoDAO")
    private ComtnextrlhrinfoDAO comtnextrlhrinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnextrlhrinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnextrlhrinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnextrlhrinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnextrlhrinfo(ComtnextrlhrinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnextrlhrinfoDAO.insertComtnextrlhrinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnextrlhrinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnextrlhrinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnextrlhrinfo(ComtnextrlhrinfoVO vo) throws Exception {
        comtnextrlhrinfoDAO.updateComtnextrlhrinfo(vo);
    }

    /**
	 * comtnextrlhrinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnextrlhrinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnextrlhrinfo(ComtnextrlhrinfoVO vo) throws Exception {
        comtnextrlhrinfoDAO.deleteComtnextrlhrinfo(vo);
    }

    /**
	 * comtnextrlhrinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnextrlhrinfoVO
	 * @return 조회한 comtnextrlhrinfo
	 * @exception Exception
	 */
    public ComtnextrlhrinfoVO selectComtnextrlhrinfo(ComtnextrlhrinfoVO vo) throws Exception {
        ComtnextrlhrinfoVO resultVO = comtnextrlhrinfoDAO.selectComtnextrlhrinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnextrlhrinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnextrlhrinfo 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnextrlhrinfoList(ComtnextrlhrinfoVO vo) throws Exception {
        return comtnextrlhrinfoDAO.selectComtnextrlhrinfoList(vo);
    }

    /**
	 * comtnextrlhrinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnextrlhrinfo 총 갯수
	 * @exception
	 */
    public int selectComtnextrlhrinfoListTotCnt(ComtnextrlhrinfoVO vo) {
		return comtnextrlhrinfoDAO.selectComtnextrlhrinfoListTotCnt(vo);
	}
    
}

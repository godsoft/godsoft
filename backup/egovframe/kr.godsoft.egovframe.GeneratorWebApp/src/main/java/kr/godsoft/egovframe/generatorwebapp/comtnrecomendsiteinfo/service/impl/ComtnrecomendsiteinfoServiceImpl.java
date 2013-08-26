package kr.godsoft.egovframe.generatorwebapp.comtnrecomendsiteinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnrecomendsiteinfo.service.ComtnrecomendsiteinfoService;
import kr.godsoft.egovframe.generatorwebapp.comtnrecomendsiteinfo.service.ComtnrecomendsiteinfoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnrecomendsiteinfoServiceImpl.java
 * @Description : Comtnrecomendsiteinfo Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnrecomendsiteinfoService")
public class ComtnrecomendsiteinfoServiceImpl extends AbstractServiceImpl implements
        ComtnrecomendsiteinfoService {

    @Resource(name="comtnrecomendsiteinfoDAO")
    private ComtnrecomendsiteinfoDAO comtnrecomendsiteinfoDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnrecomendsiteinfoIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNRECOMENDSITEINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrecomendsiteinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnrecomendsiteinfo(ComtnrecomendsiteinfoVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnrecomendsiteinfoDAO.insertComtnrecomendsiteinfo(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNRECOMENDSITEINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrecomendsiteinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnrecomendsiteinfo(ComtnrecomendsiteinfoVO vo) throws Exception {
        comtnrecomendsiteinfoDAO.updateComtnrecomendsiteinfo(vo);
    }

    /**
	 * COMTNRECOMENDSITEINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrecomendsiteinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnrecomendsiteinfo(ComtnrecomendsiteinfoVO vo) throws Exception {
        comtnrecomendsiteinfoDAO.deleteComtnrecomendsiteinfo(vo);
    }

    /**
	 * COMTNRECOMENDSITEINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrecomendsiteinfoVO
	 * @return 조회한 COMTNRECOMENDSITEINFO
	 * @exception Exception
	 */
    public ComtnrecomendsiteinfoVO selectComtnrecomendsiteinfo(ComtnrecomendsiteinfoVO vo) throws Exception {
        ComtnrecomendsiteinfoVO resultVO = comtnrecomendsiteinfoDAO.selectComtnrecomendsiteinfo(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNRECOMENDSITEINFO 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNRECOMENDSITEINFO 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnrecomendsiteinfoList(ComtnrecomendsiteinfoVO vo) throws Exception {
        return comtnrecomendsiteinfoDAO.selectComtnrecomendsiteinfoList(vo);
    }

    /**
	 * COMTNRECOMENDSITEINFO 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNRECOMENDSITEINFO 총 갯수
	 * @exception
	 */
    public int selectComtnrecomendsiteinfoListTotCnt(ComtnrecomendsiteinfoVO vo) {
		return comtnrecomendsiteinfoDAO.selectComtnrecomendsiteinfoListTotCnt(vo);
	}
    
}

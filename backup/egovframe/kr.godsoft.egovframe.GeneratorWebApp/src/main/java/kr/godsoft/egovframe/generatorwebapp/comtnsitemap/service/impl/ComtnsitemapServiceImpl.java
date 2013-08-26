package kr.godsoft.egovframe.generatorwebapp.comtnsitemap.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnsitemap.service.ComtnsitemapService;
import kr.godsoft.egovframe.generatorwebapp.comtnsitemap.service.ComtnsitemapVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnsitemapServiceImpl.java
 * @Description : Comtnsitemap Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnsitemapService")
public class ComtnsitemapServiceImpl extends AbstractServiceImpl implements
        ComtnsitemapService {

    @Resource(name="comtnsitemapDAO")
    private ComtnsitemapDAO comtnsitemapDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnsitemapIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNSITEMAP을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsitemapVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnsitemap(ComtnsitemapVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnsitemapDAO.insertComtnsitemap(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNSITEMAP을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsitemapVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnsitemap(ComtnsitemapVO vo) throws Exception {
        comtnsitemapDAO.updateComtnsitemap(vo);
    }

    /**
	 * COMTNSITEMAP을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsitemapVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnsitemap(ComtnsitemapVO vo) throws Exception {
        comtnsitemapDAO.deleteComtnsitemap(vo);
    }

    /**
	 * COMTNSITEMAP을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsitemapVO
	 * @return 조회한 COMTNSITEMAP
	 * @exception Exception
	 */
    public ComtnsitemapVO selectComtnsitemap(ComtnsitemapVO vo) throws Exception {
        ComtnsitemapVO resultVO = comtnsitemapDAO.selectComtnsitemap(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNSITEMAP 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSITEMAP 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnsitemapList(ComtnsitemapVO vo) throws Exception {
        return comtnsitemapDAO.selectComtnsitemapList(vo);
    }

    /**
	 * COMTNSITEMAP 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNSITEMAP 총 갯수
	 * @exception
	 */
    public int selectComtnsitemapListTotCnt(ComtnsitemapVO vo) {
		return comtnsitemapDAO.selectComtnsitemapListTotCnt(vo);
	}
    
}

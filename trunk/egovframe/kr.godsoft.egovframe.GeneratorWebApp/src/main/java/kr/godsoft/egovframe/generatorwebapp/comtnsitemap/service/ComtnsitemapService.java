package kr.godsoft.egovframe.generatorwebapp.comtnsitemap.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnsitemap.service.ComtnsitemapDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsitemap.service.ComtnsitemapVO;

/**
 * @Class Name : ComtnsitemapService.java
 * @Description : Comtnsitemap Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnsitemapService {
	
	/**
	 * comtnsitemap을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsitemapVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnsitemap(ComtnsitemapVO vo) throws Exception;
    
    /**
	 * comtnsitemap을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsitemapVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnsitemap(ComtnsitemapVO vo) throws Exception;
    
    /**
	 * comtnsitemap을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsitemapVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnsitemap(ComtnsitemapVO vo) throws Exception;
    
    /**
	 * comtnsitemap을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsitemapVO
	 * @return 조회한 comtnsitemap
	 * @exception Exception
	 */
    ComtnsitemapVO selectComtnsitemap(ComtnsitemapVO vo) throws Exception;
    
    /**
	 * comtnsitemap 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsitemap 목록
	 * @exception Exception
	 */
    List selectComtnsitemapList(ComtnsitemapDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnsitemap 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsitemap 총 갯수
	 * @exception
	 */
    int selectComtnsitemapListTotCnt(ComtnsitemapDefaultVO searchVO);
    
}

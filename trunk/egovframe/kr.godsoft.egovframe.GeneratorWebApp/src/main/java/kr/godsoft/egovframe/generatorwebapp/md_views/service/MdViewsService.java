package kr.godsoft.egovframe.generatorwebapp.md_views.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdViewsService.java
 * @Description : MdViews Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdViewsService {
	
	/**
	 * MD_VIEWS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdViewsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdViews(MdViewsVO vo) throws Exception;
    
    /**
	 * MD_VIEWS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdViewsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdViews(MdViewsVO vo) throws Exception;
    
    /**
	 * MD_VIEWS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdViewsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdViews(MdViewsVO vo) throws Exception;
    
    /**
	 * MD_VIEWS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdViewsVO
	 * @return 조회한 MD_VIEWS
	 * @exception Exception
	 */
    MdViewsVO selectMdViews(MdViewsVO vo) throws Exception;
    
    /**
	 * MD_VIEWS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_VIEWS 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdViewsList(MdViewsVO vo) throws Exception;
    
    /**
	 * MD_VIEWS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_VIEWS 총 갯수
	 * @exception
	 */
    int selectMdViewsListTotCnt(MdViewsVO vo);
    
}

package kr.godsoft.egovframe.generatorwebapp.comtnmenuinfo.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnmenuinfo.service.ComtnmenuinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnmenuinfo.service.ComtnmenuinfoVO;

/**
 * @Class Name : ComtnmenuinfoService.java
 * @Description : Comtnmenuinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnmenuinfoService {
	
	/**
	 * comtnmenuinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnmenuinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnmenuinfo(ComtnmenuinfoVO vo) throws Exception;
    
    /**
	 * comtnmenuinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnmenuinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnmenuinfo(ComtnmenuinfoVO vo) throws Exception;
    
    /**
	 * comtnmenuinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnmenuinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnmenuinfo(ComtnmenuinfoVO vo) throws Exception;
    
    /**
	 * comtnmenuinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnmenuinfoVO
	 * @return 조회한 comtnmenuinfo
	 * @exception Exception
	 */
    ComtnmenuinfoVO selectComtnmenuinfo(ComtnmenuinfoVO vo) throws Exception;
    
    /**
	 * comtnmenuinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmenuinfo 목록
	 * @exception Exception
	 */
    List selectComtnmenuinfoList(ComtnmenuinfoDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnmenuinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnmenuinfo 총 갯수
	 * @exception
	 */
    int selectComtnmenuinfoListTotCnt(ComtnmenuinfoDefaultVO searchVO);
    
}

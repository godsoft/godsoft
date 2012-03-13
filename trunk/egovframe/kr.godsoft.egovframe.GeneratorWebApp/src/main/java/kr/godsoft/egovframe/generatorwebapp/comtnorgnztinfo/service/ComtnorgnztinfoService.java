package kr.godsoft.egovframe.generatorwebapp.comtnorgnztinfo.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnorgnztinfo.service.ComtnorgnztinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnorgnztinfo.service.ComtnorgnztinfoVO;

/**
 * @Class Name : ComtnorgnztinfoService.java
 * @Description : Comtnorgnztinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnorgnztinfoService {
	
	/**
	 * comtnorgnztinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnorgnztinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnorgnztinfo(ComtnorgnztinfoVO vo) throws Exception;
    
    /**
	 * comtnorgnztinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnorgnztinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnorgnztinfo(ComtnorgnztinfoVO vo) throws Exception;
    
    /**
	 * comtnorgnztinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnorgnztinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnorgnztinfo(ComtnorgnztinfoVO vo) throws Exception;
    
    /**
	 * comtnorgnztinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnorgnztinfoVO
	 * @return 조회한 comtnorgnztinfo
	 * @exception Exception
	 */
    ComtnorgnztinfoVO selectComtnorgnztinfo(ComtnorgnztinfoVO vo) throws Exception;
    
    /**
	 * comtnorgnztinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnorgnztinfo 목록
	 * @exception Exception
	 */
    List selectComtnorgnztinfoList(ComtnorgnztinfoDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnorgnztinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnorgnztinfo 총 갯수
	 * @exception
	 */
    int selectComtnorgnztinfoListTotCnt(ComtnorgnztinfoDefaultVO searchVO);
    
}

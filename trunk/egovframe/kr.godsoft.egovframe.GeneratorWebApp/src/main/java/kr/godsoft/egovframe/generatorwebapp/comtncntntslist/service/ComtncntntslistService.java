package kr.godsoft.egovframe.generatorwebapp.comtncntntslist.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtncntntslist.service.ComtncntntslistDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtncntntslist.service.ComtncntntslistVO;

/**
 * @Class Name : ComtncntntslistService.java
 * @Description : Comtncntntslist Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtncntntslistService {
	
	/**
	 * comtncntntslist을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtncntntslistVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtncntntslist(ComtncntntslistVO vo) throws Exception;
    
    /**
	 * comtncntntslist을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtncntntslistVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtncntntslist(ComtncntntslistVO vo) throws Exception;
    
    /**
	 * comtncntntslist을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtncntntslistVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtncntntslist(ComtncntntslistVO vo) throws Exception;
    
    /**
	 * comtncntntslist을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtncntntslistVO
	 * @return 조회한 comtncntntslist
	 * @exception Exception
	 */
    ComtncntntslistVO selectComtncntntslist(ComtncntntslistVO vo) throws Exception;
    
    /**
	 * comtncntntslist 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncntntslist 목록
	 * @exception Exception
	 */
    List selectComtncntntslistList(ComtncntntslistDefaultVO searchVO) throws Exception;
    
    /**
	 * comtncntntslist 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtncntntslist 총 갯수
	 * @exception
	 */
    int selectComtncntntslistListTotCnt(ComtncntntslistDefaultVO searchVO);
    
}

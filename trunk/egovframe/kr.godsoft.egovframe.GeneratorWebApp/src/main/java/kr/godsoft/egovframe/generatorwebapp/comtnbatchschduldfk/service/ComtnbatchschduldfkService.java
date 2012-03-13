package kr.godsoft.egovframe.generatorwebapp.comtnbatchschduldfk.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschduldfk.service.ComtnbatchschduldfkDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschduldfk.service.ComtnbatchschduldfkVO;

/**
 * @Class Name : ComtnbatchschduldfkService.java
 * @Description : Comtnbatchschduldfk Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnbatchschduldfkService {
	
	/**
	 * comtnbatchschduldfk을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbatchschduldfkVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnbatchschduldfk(ComtnbatchschduldfkVO vo) throws Exception;
    
    /**
	 * comtnbatchschduldfk을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbatchschduldfkVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnbatchschduldfk(ComtnbatchschduldfkVO vo) throws Exception;
    
    /**
	 * comtnbatchschduldfk을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbatchschduldfkVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnbatchschduldfk(ComtnbatchschduldfkVO vo) throws Exception;
    
    /**
	 * comtnbatchschduldfk을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbatchschduldfkVO
	 * @return 조회한 comtnbatchschduldfk
	 * @exception Exception
	 */
    ComtnbatchschduldfkVO selectComtnbatchschduldfk(ComtnbatchschduldfkVO vo) throws Exception;
    
    /**
	 * comtnbatchschduldfk 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbatchschduldfk 목록
	 * @exception Exception
	 */
    List selectComtnbatchschduldfkList(ComtnbatchschduldfkDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnbatchschduldfk 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbatchschduldfk 총 갯수
	 * @exception
	 */
    int selectComtnbatchschduldfkListTotCnt(ComtnbatchschduldfkDefaultVO searchVO);
    
}

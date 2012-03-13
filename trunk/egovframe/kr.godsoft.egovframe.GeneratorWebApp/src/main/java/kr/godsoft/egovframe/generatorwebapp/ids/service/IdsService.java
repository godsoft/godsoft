package kr.godsoft.egovframe.generatorwebapp.ids.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.ids.service.IdsDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.ids.service.IdsVO;

/**
 * @Class Name : IdsService.java
 * @Description : Ids Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface IdsService {
	
	/**
	 * ids을 등록한다.
	 * @param vo - 등록할 정보가 담긴 IdsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertIds(IdsVO vo) throws Exception;
    
    /**
	 * ids을 수정한다.
	 * @param vo - 수정할 정보가 담긴 IdsVO
	 * @return void형
	 * @exception Exception
	 */
    void updateIds(IdsVO vo) throws Exception;
    
    /**
	 * ids을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 IdsVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteIds(IdsVO vo) throws Exception;
    
    /**
	 * ids을 조회한다.
	 * @param vo - 조회할 정보가 담긴 IdsVO
	 * @return 조회한 ids
	 * @exception Exception
	 */
    IdsVO selectIds(IdsVO vo) throws Exception;
    
    /**
	 * ids 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return ids 목록
	 * @exception Exception
	 */
    List selectIdsList(IdsDefaultVO searchVO) throws Exception;
    
    /**
	 * ids 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return ids 총 갯수
	 * @exception
	 */
    int selectIdsListTotCnt(IdsDefaultVO searchVO);
    
}

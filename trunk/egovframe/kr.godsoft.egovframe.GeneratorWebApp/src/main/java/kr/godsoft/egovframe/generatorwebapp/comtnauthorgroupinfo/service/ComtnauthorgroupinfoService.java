package kr.godsoft.egovframe.generatorwebapp.comtnauthorgroupinfo.service;

import java.util.List;
import kr.godsoft.egovframe.generatorwebapp.comtnauthorgroupinfo.service.ComtnauthorgroupinfoDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnauthorgroupinfo.service.ComtnauthorgroupinfoVO;

/**
 * @Class Name : ComtnauthorgroupinfoService.java
 * @Description : Comtnauthorgroupinfo Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtnauthorgroupinfoService {
	
	/**
	 * comtnauthorgroupinfo을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception;
    
    /**
	 * comtnauthorgroupinfo을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception;
    
    /**
	 * comtnauthorgroupinfo을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception;
    
    /**
	 * comtnauthorgroupinfo을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnauthorgroupinfoVO
	 * @return 조회한 comtnauthorgroupinfo
	 * @exception Exception
	 */
    ComtnauthorgroupinfoVO selectComtnauthorgroupinfo(ComtnauthorgroupinfoVO vo) throws Exception;
    
    /**
	 * comtnauthorgroupinfo 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnauthorgroupinfo 목록
	 * @exception Exception
	 */
    List selectComtnauthorgroupinfoList(ComtnauthorgroupinfoDefaultVO searchVO) throws Exception;
    
    /**
	 * comtnauthorgroupinfo 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnauthorgroupinfo 총 갯수
	 * @exception
	 */
    int selectComtnauthorgroupinfoListTotCnt(ComtnauthorgroupinfoDefaultVO searchVO);
    
}

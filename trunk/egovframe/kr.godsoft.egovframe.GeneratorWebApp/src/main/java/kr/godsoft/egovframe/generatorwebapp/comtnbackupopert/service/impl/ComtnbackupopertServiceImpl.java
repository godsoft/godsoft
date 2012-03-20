package kr.godsoft.egovframe.generatorwebapp.comtnbackupopert.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbackupopert.service.ComtnbackupopertService;
import kr.godsoft.egovframe.generatorwebapp.comtnbackupopert.service.ComtnbackupopertVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnbackupopertServiceImpl.java
 * @Description : Comtnbackupopert Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnbackupopertService")
public class ComtnbackupopertServiceImpl extends AbstractServiceImpl implements
        ComtnbackupopertService {

    @Resource(name="comtnbackupopertDAO")
    private ComtnbackupopertDAO comtnbackupopertDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnbackupopertIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnbackupopert을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbackupopertVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbackupopert(ComtnbackupopertVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnbackupopertDAO.insertComtnbackupopert(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnbackupopert을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbackupopertVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbackupopert(ComtnbackupopertVO vo) throws Exception {
        comtnbackupopertDAO.updateComtnbackupopert(vo);
    }

    /**
	 * comtnbackupopert을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbackupopertVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbackupopert(ComtnbackupopertVO vo) throws Exception {
        comtnbackupopertDAO.deleteComtnbackupopert(vo);
    }

    /**
	 * comtnbackupopert을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbackupopertVO
	 * @return 조회한 comtnbackupopert
	 * @exception Exception
	 */
    public ComtnbackupopertVO selectComtnbackupopert(ComtnbackupopertVO vo) throws Exception {
        ComtnbackupopertVO resultVO = comtnbackupopertDAO.selectComtnbackupopert(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnbackupopert 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbackupopert 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnbackupopertList(ComtnbackupopertVO vo) throws Exception {
        return comtnbackupopertDAO.selectComtnbackupopertList(vo);
    }

    /**
	 * comtnbackupopert 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbackupopert 총 갯수
	 * @exception
	 */
    public int selectComtnbackupopertListTotCnt(ComtnbackupopertVO vo) {
		return comtnbackupopertDAO.selectComtnbackupopertListTotCnt(vo);
	}
    
}

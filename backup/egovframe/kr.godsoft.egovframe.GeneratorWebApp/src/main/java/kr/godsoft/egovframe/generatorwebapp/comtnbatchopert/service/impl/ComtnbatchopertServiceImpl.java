package kr.godsoft.egovframe.generatorwebapp.comtnbatchopert.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnbatchopert.service.ComtnbatchopertService;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchopert.service.ComtnbatchopertVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnbatchopertServiceImpl.java
 * @Description : Comtnbatchopert Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnbatchopertService")
public class ComtnbatchopertServiceImpl extends AbstractServiceImpl implements
        ComtnbatchopertService {

    @Resource(name="comtnbatchopertDAO")
    private ComtnbatchopertDAO comtnbatchopertDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnbatchopertIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNBATCHOPERT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbatchopertVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbatchopert(ComtnbatchopertVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnbatchopertDAO.insertComtnbatchopert(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNBATCHOPERT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbatchopertVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbatchopert(ComtnbatchopertVO vo) throws Exception {
        comtnbatchopertDAO.updateComtnbatchopert(vo);
    }

    /**
	 * COMTNBATCHOPERT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbatchopertVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbatchopert(ComtnbatchopertVO vo) throws Exception {
        comtnbatchopertDAO.deleteComtnbatchopert(vo);
    }

    /**
	 * COMTNBATCHOPERT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbatchopertVO
	 * @return 조회한 COMTNBATCHOPERT
	 * @exception Exception
	 */
    public ComtnbatchopertVO selectComtnbatchopert(ComtnbatchopertVO vo) throws Exception {
        ComtnbatchopertVO resultVO = comtnbatchopertDAO.selectComtnbatchopert(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNBATCHOPERT 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBATCHOPERT 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnbatchopertList(ComtnbatchopertVO vo) throws Exception {
        return comtnbatchopertDAO.selectComtnbatchopertList(vo);
    }

    /**
	 * COMTNBATCHOPERT 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNBATCHOPERT 총 갯수
	 * @exception
	 */
    public int selectComtnbatchopertListTotCnt(ComtnbatchopertVO vo) {
		return comtnbatchopertDAO.selectComtnbatchopertListTotCnt(vo);
	}
    
}
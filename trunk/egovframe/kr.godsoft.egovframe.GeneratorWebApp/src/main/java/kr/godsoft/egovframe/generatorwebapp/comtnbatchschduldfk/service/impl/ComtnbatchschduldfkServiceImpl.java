package kr.godsoft.egovframe.generatorwebapp.comtnbatchschduldfk.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschduldfk.service.ComtnbatchschduldfkService;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschduldfk.service.ComtnbatchschduldfkDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschduldfk.service.ComtnbatchschduldfkVO;
import kr.godsoft.egovframe.generatorwebapp.comtnbatchschduldfk.service.impl.ComtnbatchschduldfkDAO;

/**
 * @Class Name : ComtnbatchschduldfkServiceImpl.java
 * @Description : Comtnbatchschduldfk Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnbatchschduldfkService")
public class ComtnbatchschduldfkServiceImpl extends AbstractServiceImpl implements
        ComtnbatchschduldfkService {

    @Resource(name="comtnbatchschduldfkDAO")
    private ComtnbatchschduldfkDAO comtnbatchschduldfkDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnbatchschduldfkIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnbatchschduldfk을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnbatchschduldfkVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnbatchschduldfk(ComtnbatchschduldfkVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnbatchschduldfkDAO.insertComtnbatchschduldfk(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnbatchschduldfk을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnbatchschduldfkVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnbatchschduldfk(ComtnbatchschduldfkVO vo) throws Exception {
        comtnbatchschduldfkDAO.updateComtnbatchschduldfk(vo);
    }

    /**
	 * comtnbatchschduldfk을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnbatchschduldfkVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnbatchschduldfk(ComtnbatchschduldfkVO vo) throws Exception {
        comtnbatchschduldfkDAO.deleteComtnbatchschduldfk(vo);
    }

    /**
	 * comtnbatchschduldfk을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnbatchschduldfkVO
	 * @return 조회한 comtnbatchschduldfk
	 * @exception Exception
	 */
    public ComtnbatchschduldfkVO selectComtnbatchschduldfk(ComtnbatchschduldfkVO vo) throws Exception {
        ComtnbatchschduldfkVO resultVO = comtnbatchschduldfkDAO.selectComtnbatchschduldfk(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnbatchschduldfk 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbatchschduldfk 목록
	 * @exception Exception
	 */
    public List selectComtnbatchschduldfkList(ComtnbatchschduldfkDefaultVO searchVO) throws Exception {
        return comtnbatchschduldfkDAO.selectComtnbatchschduldfkList(searchVO);
    }

    /**
	 * comtnbatchschduldfk 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnbatchschduldfk 총 갯수
	 * @exception
	 */
    public int selectComtnbatchschduldfkListTotCnt(ComtnbatchschduldfkDefaultVO searchVO) {
		return comtnbatchschduldfkDAO.selectComtnbatchschduldfkListTotCnt(searchVO);
	}
    
}

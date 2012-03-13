package kr.godsoft.egovframe.generatorwebapp.comtnrestde.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnrestde.service.ComtnrestdeService;
import kr.godsoft.egovframe.generatorwebapp.comtnrestde.service.ComtnrestdeDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnrestde.service.ComtnrestdeVO;
import kr.godsoft.egovframe.generatorwebapp.comtnrestde.service.impl.ComtnrestdeDAO;

/**
 * @Class Name : ComtnrestdeServiceImpl.java
 * @Description : Comtnrestde Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnrestdeService")
public class ComtnrestdeServiceImpl extends AbstractServiceImpl implements
        ComtnrestdeService {

    @Resource(name="comtnrestdeDAO")
    private ComtnrestdeDAO comtnrestdeDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnrestdeIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnrestde을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnrestdeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnrestde(ComtnrestdeVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnrestdeDAO.insertComtnrestde(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnrestde을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrestdeVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnrestde(ComtnrestdeVO vo) throws Exception {
        comtnrestdeDAO.updateComtnrestde(vo);
    }

    /**
	 * comtnrestde을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrestdeVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnrestde(ComtnrestdeVO vo) throws Exception {
        comtnrestdeDAO.deleteComtnrestde(vo);
    }

    /**
	 * comtnrestde을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrestdeVO
	 * @return 조회한 comtnrestde
	 * @exception Exception
	 */
    public ComtnrestdeVO selectComtnrestde(ComtnrestdeVO vo) throws Exception {
        ComtnrestdeVO resultVO = comtnrestdeDAO.selectComtnrestde(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnrestde 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnrestde 목록
	 * @exception Exception
	 */
    public List selectComtnrestdeList(ComtnrestdeDefaultVO searchVO) throws Exception {
        return comtnrestdeDAO.selectComtnrestdeList(searchVO);
    }

    /**
	 * comtnrestde 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnrestde 총 갯수
	 * @exception
	 */
    public int selectComtnrestdeListTotCnt(ComtnrestdeDefaultVO searchVO) {
		return comtnrestdeDAO.selectComtnrestdeListTotCnt(searchVO);
	}
    
}

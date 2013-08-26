package kr.godsoft.egovframe.generatorwebapp.comtnrestde.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnrestde.service.ComtnrestdeService;
import kr.godsoft.egovframe.generatorwebapp.comtnrestde.service.ComtnrestdeVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnrestdeServiceImpl.java
 * @Description : Comtnrestde Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
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
	 * COMTNRESTDE을 등록한다.
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
	 * COMTNRESTDE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnrestdeVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnrestde(ComtnrestdeVO vo) throws Exception {
        comtnrestdeDAO.updateComtnrestde(vo);
    }

    /**
	 * COMTNRESTDE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnrestdeVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnrestde(ComtnrestdeVO vo) throws Exception {
        comtnrestdeDAO.deleteComtnrestde(vo);
    }

    /**
	 * COMTNRESTDE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnrestdeVO
	 * @return 조회한 COMTNRESTDE
	 * @exception Exception
	 */
    public ComtnrestdeVO selectComtnrestde(ComtnrestdeVO vo) throws Exception {
        ComtnrestdeVO resultVO = comtnrestdeDAO.selectComtnrestde(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNRESTDE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNRESTDE 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnrestdeList(ComtnrestdeVO vo) throws Exception {
        return comtnrestdeDAO.selectComtnrestdeList(vo);
    }

    /**
	 * COMTNRESTDE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNRESTDE 총 갯수
	 * @exception
	 */
    public int selectComtnrestdeListTotCnt(ComtnrestdeVO vo) {
		return comtnrestdeDAO.selectComtnrestdeListTotCnt(vo);
	}
    
}

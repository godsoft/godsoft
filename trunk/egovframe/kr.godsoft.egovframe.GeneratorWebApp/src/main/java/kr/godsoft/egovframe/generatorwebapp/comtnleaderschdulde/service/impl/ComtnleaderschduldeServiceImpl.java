package kr.godsoft.egovframe.generatorwebapp.comtnleaderschdulde.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnleaderschdulde.service.ComtnleaderschduldeService;
import kr.godsoft.egovframe.generatorwebapp.comtnleaderschdulde.service.ComtnleaderschduldeVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnleaderschduldeServiceImpl.java
 * @Description : Comtnleaderschdulde Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnleaderschduldeService")
public class ComtnleaderschduldeServiceImpl extends AbstractServiceImpl implements
        ComtnleaderschduldeService {

    @Resource(name="comtnleaderschduldeDAO")
    private ComtnleaderschduldeDAO comtnleaderschduldeDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnleaderschduldeIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnleaderschdulde을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnleaderschduldeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnleaderschdulde(ComtnleaderschduldeVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnleaderschduldeDAO.insertComtnleaderschdulde(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnleaderschdulde을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnleaderschduldeVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnleaderschdulde(ComtnleaderschduldeVO vo) throws Exception {
        comtnleaderschduldeDAO.updateComtnleaderschdulde(vo);
    }

    /**
	 * comtnleaderschdulde을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnleaderschduldeVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnleaderschdulde(ComtnleaderschduldeVO vo) throws Exception {
        comtnleaderschduldeDAO.deleteComtnleaderschdulde(vo);
    }

    /**
	 * comtnleaderschdulde을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnleaderschduldeVO
	 * @return 조회한 comtnleaderschdulde
	 * @exception Exception
	 */
    public ComtnleaderschduldeVO selectComtnleaderschdulde(ComtnleaderschduldeVO vo) throws Exception {
        ComtnleaderschduldeVO resultVO = comtnleaderschduldeDAO.selectComtnleaderschdulde(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnleaderschdulde 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnleaderschdulde 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnleaderschduldeList(ComtnleaderschduldeVO vo) throws Exception {
        return comtnleaderschduldeDAO.selectComtnleaderschduldeList(vo);
    }

    /**
	 * comtnleaderschdulde 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnleaderschdulde 총 갯수
	 * @exception
	 */
    public int selectComtnleaderschduldeListTotCnt(ComtnleaderschduldeVO vo) {
		return comtnleaderschduldeDAO.selectComtnleaderschduldeListTotCnt(vo);
	}
    
}

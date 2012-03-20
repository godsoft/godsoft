package kr.godsoft.egovframe.generatorwebapp.comtnleaderschdul.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnleaderschdul.service.ComtnleaderschdulService;
import kr.godsoft.egovframe.generatorwebapp.comtnleaderschdul.service.ComtnleaderschdulVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnleaderschdulServiceImpl.java
 * @Description : Comtnleaderschdul Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnleaderschdulService")
public class ComtnleaderschdulServiceImpl extends AbstractServiceImpl implements
        ComtnleaderschdulService {

    @Resource(name="comtnleaderschdulDAO")
    private ComtnleaderschdulDAO comtnleaderschdulDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnleaderschdulIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnleaderschdul을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnleaderschdulVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnleaderschdul(ComtnleaderschdulVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnleaderschdulDAO.insertComtnleaderschdul(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnleaderschdul을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnleaderschdulVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnleaderschdul(ComtnleaderschdulVO vo) throws Exception {
        comtnleaderschdulDAO.updateComtnleaderschdul(vo);
    }

    /**
	 * comtnleaderschdul을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnleaderschdulVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnleaderschdul(ComtnleaderschdulVO vo) throws Exception {
        comtnleaderschdulDAO.deleteComtnleaderschdul(vo);
    }

    /**
	 * comtnleaderschdul을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnleaderschdulVO
	 * @return 조회한 comtnleaderschdul
	 * @exception Exception
	 */
    public ComtnleaderschdulVO selectComtnleaderschdul(ComtnleaderschdulVO vo) throws Exception {
        ComtnleaderschdulVO resultVO = comtnleaderschdulDAO.selectComtnleaderschdul(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnleaderschdul 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnleaderschdul 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnleaderschdulList(ComtnleaderschdulVO vo) throws Exception {
        return comtnleaderschdulDAO.selectComtnleaderschdulList(vo);
    }

    /**
	 * comtnleaderschdul 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnleaderschdul 총 갯수
	 * @exception
	 */
    public int selectComtnleaderschdulListTotCnt(ComtnleaderschdulVO vo) {
		return comtnleaderschdulDAO.selectComtnleaderschdulListTotCnt(vo);
	}
    
}

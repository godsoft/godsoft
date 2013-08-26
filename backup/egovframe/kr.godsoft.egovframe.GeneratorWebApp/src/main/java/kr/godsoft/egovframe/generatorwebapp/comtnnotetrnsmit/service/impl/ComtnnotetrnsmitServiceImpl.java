package kr.godsoft.egovframe.generatorwebapp.comtnnotetrnsmit.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnnotetrnsmit.service.ComtnnotetrnsmitService;
import kr.godsoft.egovframe.generatorwebapp.comtnnotetrnsmit.service.ComtnnotetrnsmitVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnnotetrnsmitServiceImpl.java
 * @Description : Comtnnotetrnsmit Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnnotetrnsmitService")
public class ComtnnotetrnsmitServiceImpl extends AbstractServiceImpl implements
        ComtnnotetrnsmitService {

    @Resource(name="comtnnotetrnsmitDAO")
    private ComtnnotetrnsmitDAO comtnnotetrnsmitDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnnotetrnsmitIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNNOTETRNSMIT을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnnotetrnsmitVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnnotetrnsmit(ComtnnotetrnsmitVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnnotetrnsmitDAO.insertComtnnotetrnsmit(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNNOTETRNSMIT을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnnotetrnsmitVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnnotetrnsmit(ComtnnotetrnsmitVO vo) throws Exception {
        comtnnotetrnsmitDAO.updateComtnnotetrnsmit(vo);
    }

    /**
	 * COMTNNOTETRNSMIT을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnnotetrnsmitVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnnotetrnsmit(ComtnnotetrnsmitVO vo) throws Exception {
        comtnnotetrnsmitDAO.deleteComtnnotetrnsmit(vo);
    }

    /**
	 * COMTNNOTETRNSMIT을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnnotetrnsmitVO
	 * @return 조회한 COMTNNOTETRNSMIT
	 * @exception Exception
	 */
    public ComtnnotetrnsmitVO selectComtnnotetrnsmit(ComtnnotetrnsmitVO vo) throws Exception {
        ComtnnotetrnsmitVO resultVO = comtnnotetrnsmitDAO.selectComtnnotetrnsmit(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNNOTETRNSMIT 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNOTETRNSMIT 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnnotetrnsmitList(ComtnnotetrnsmitVO vo) throws Exception {
        return comtnnotetrnsmitDAO.selectComtnnotetrnsmitList(vo);
    }

    /**
	 * COMTNNOTETRNSMIT 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNNOTETRNSMIT 총 갯수
	 * @exception
	 */
    public int selectComtnnotetrnsmitListTotCnt(ComtnnotetrnsmitVO vo) {
		return comtnnotetrnsmitDAO.selectComtnnotetrnsmitListTotCnt(vo);
	}
    
}
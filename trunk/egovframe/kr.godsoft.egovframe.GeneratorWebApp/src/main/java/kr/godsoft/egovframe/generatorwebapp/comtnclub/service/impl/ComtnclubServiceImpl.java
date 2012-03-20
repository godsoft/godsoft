package kr.godsoft.egovframe.generatorwebapp.comtnclub.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnclub.service.ComtnclubService;
import kr.godsoft.egovframe.generatorwebapp.comtnclub.service.ComtnclubVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnclubServiceImpl.java
 * @Description : Comtnclub Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnclubService")
public class ComtnclubServiceImpl extends AbstractServiceImpl implements
        ComtnclubService {

    @Resource(name="comtnclubDAO")
    private ComtnclubDAO comtnclubDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnclubIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnclub을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnclubVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnclub(ComtnclubVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnclubDAO.insertComtnclub(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnclub을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnclubVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnclub(ComtnclubVO vo) throws Exception {
        comtnclubDAO.updateComtnclub(vo);
    }

    /**
	 * comtnclub을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnclubVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnclub(ComtnclubVO vo) throws Exception {
        comtnclubDAO.deleteComtnclub(vo);
    }

    /**
	 * comtnclub을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnclubVO
	 * @return 조회한 comtnclub
	 * @exception Exception
	 */
    public ComtnclubVO selectComtnclub(ComtnclubVO vo) throws Exception {
        ComtnclubVO resultVO = comtnclubDAO.selectComtnclub(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnclub 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnclub 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnclubList(ComtnclubVO vo) throws Exception {
        return comtnclubDAO.selectComtnclubList(vo);
    }

    /**
	 * comtnclub 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnclub 총 갯수
	 * @exception
	 */
    public int selectComtnclubListTotCnt(ComtnclubVO vo) {
		return comtnclubDAO.selectComtnclubListTotCnt(vo);
	}
    
}

package kr.godsoft.egovframe.generatorwebapp.comtninsttcode.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtninsttcode.service.ComtninsttcodeService;
import kr.godsoft.egovframe.generatorwebapp.comtninsttcode.service.ComtninsttcodeVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtninsttcodeServiceImpl.java
 * @Description : Comtninsttcode Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtninsttcodeService")
public class ComtninsttcodeServiceImpl extends AbstractServiceImpl implements
        ComtninsttcodeService {

    @Resource(name="comtninsttcodeDAO")
    private ComtninsttcodeDAO comtninsttcodeDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtninsttcodeIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNINSTTCODE을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtninsttcodeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtninsttcode(ComtninsttcodeVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtninsttcodeDAO.insertComtninsttcode(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNINSTTCODE을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtninsttcodeVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtninsttcode(ComtninsttcodeVO vo) throws Exception {
        comtninsttcodeDAO.updateComtninsttcode(vo);
    }

    /**
	 * COMTNINSTTCODE을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtninsttcodeVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtninsttcode(ComtninsttcodeVO vo) throws Exception {
        comtninsttcodeDAO.deleteComtninsttcode(vo);
    }

    /**
	 * COMTNINSTTCODE을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtninsttcodeVO
	 * @return 조회한 COMTNINSTTCODE
	 * @exception Exception
	 */
    public ComtninsttcodeVO selectComtninsttcode(ComtninsttcodeVO vo) throws Exception {
        ComtninsttcodeVO resultVO = comtninsttcodeDAO.selectComtninsttcode(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNINSTTCODE 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNINSTTCODE 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtninsttcodeList(ComtninsttcodeVO vo) throws Exception {
        return comtninsttcodeDAO.selectComtninsttcodeList(vo);
    }

    /**
	 * COMTNINSTTCODE 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNINSTTCODE 총 갯수
	 * @exception
	 */
    public int selectComtninsttcodeListTotCnt(ComtninsttcodeVO vo) {
		return comtninsttcodeDAO.selectComtninsttcodeListTotCnt(vo);
	}
    
}

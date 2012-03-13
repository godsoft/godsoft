package kr.godsoft.egovframe.generatorwebapp.comtninsttcoderecptnlog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtninsttcoderecptnlog.service.ComtninsttcoderecptnlogService;
import kr.godsoft.egovframe.generatorwebapp.comtninsttcoderecptnlog.service.ComtninsttcoderecptnlogDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtninsttcoderecptnlog.service.ComtninsttcoderecptnlogVO;
import kr.godsoft.egovframe.generatorwebapp.comtninsttcoderecptnlog.service.impl.ComtninsttcoderecptnlogDAO;

/**
 * @Class Name : ComtninsttcoderecptnlogServiceImpl.java
 * @Description : Comtninsttcoderecptnlog Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtninsttcoderecptnlogService")
public class ComtninsttcoderecptnlogServiceImpl extends AbstractServiceImpl implements
        ComtninsttcoderecptnlogService {

    @Resource(name="comtninsttcoderecptnlogDAO")
    private ComtninsttcoderecptnlogDAO comtninsttcoderecptnlogDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtninsttcoderecptnlogIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtninsttcoderecptnlog을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtninsttcoderecptnlogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtninsttcoderecptnlog(ComtninsttcoderecptnlogVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtninsttcoderecptnlogDAO.insertComtninsttcoderecptnlog(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtninsttcoderecptnlog을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtninsttcoderecptnlogVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtninsttcoderecptnlog(ComtninsttcoderecptnlogVO vo) throws Exception {
        comtninsttcoderecptnlogDAO.updateComtninsttcoderecptnlog(vo);
    }

    /**
	 * comtninsttcoderecptnlog을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtninsttcoderecptnlogVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtninsttcoderecptnlog(ComtninsttcoderecptnlogVO vo) throws Exception {
        comtninsttcoderecptnlogDAO.deleteComtninsttcoderecptnlog(vo);
    }

    /**
	 * comtninsttcoderecptnlog을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtninsttcoderecptnlogVO
	 * @return 조회한 comtninsttcoderecptnlog
	 * @exception Exception
	 */
    public ComtninsttcoderecptnlogVO selectComtninsttcoderecptnlog(ComtninsttcoderecptnlogVO vo) throws Exception {
        ComtninsttcoderecptnlogVO resultVO = comtninsttcoderecptnlogDAO.selectComtninsttcoderecptnlog(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtninsttcoderecptnlog 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtninsttcoderecptnlog 목록
	 * @exception Exception
	 */
    public List selectComtninsttcoderecptnlogList(ComtninsttcoderecptnlogDefaultVO searchVO) throws Exception {
        return comtninsttcoderecptnlogDAO.selectComtninsttcoderecptnlogList(searchVO);
    }

    /**
	 * comtninsttcoderecptnlog 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtninsttcoderecptnlog 총 갯수
	 * @exception
	 */
    public int selectComtninsttcoderecptnlogListTotCnt(ComtninsttcoderecptnlogDefaultVO searchVO) {
		return comtninsttcoderecptnlogDAO.selectComtninsttcoderecptnlogListTotCnt(searchVO);
	}
    
}

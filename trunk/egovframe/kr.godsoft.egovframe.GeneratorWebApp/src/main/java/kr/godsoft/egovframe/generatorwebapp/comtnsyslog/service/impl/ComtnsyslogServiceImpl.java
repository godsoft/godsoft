package kr.godsoft.egovframe.generatorwebapp.comtnsyslog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kr.godsoft.egovframe.generatorwebapp.comtnsyslog.service.ComtnsyslogService;
import kr.godsoft.egovframe.generatorwebapp.comtnsyslog.service.ComtnsyslogDefaultVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsyslog.service.ComtnsyslogVO;
import kr.godsoft.egovframe.generatorwebapp.comtnsyslog.service.impl.ComtnsyslogDAO;

/**
 * @Class Name : ComtnsyslogServiceImpl.java
 * @Description : Comtnsyslog Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012.03.13
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnsyslogService")
public class ComtnsyslogServiceImpl extends AbstractServiceImpl implements
        ComtnsyslogService {

    @Resource(name="comtnsyslogDAO")
    private ComtnsyslogDAO comtnsyslogDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnsyslogIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnsyslog을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnsyslogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnsyslog(ComtnsyslogVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnsyslogDAO.insertComtnsyslog(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnsyslog을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnsyslogVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnsyslog(ComtnsyslogVO vo) throws Exception {
        comtnsyslogDAO.updateComtnsyslog(vo);
    }

    /**
	 * comtnsyslog을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnsyslogVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnsyslog(ComtnsyslogVO vo) throws Exception {
        comtnsyslogDAO.deleteComtnsyslog(vo);
    }

    /**
	 * comtnsyslog을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnsyslogVO
	 * @return 조회한 comtnsyslog
	 * @exception Exception
	 */
    public ComtnsyslogVO selectComtnsyslog(ComtnsyslogVO vo) throws Exception {
        ComtnsyslogVO resultVO = comtnsyslogDAO.selectComtnsyslog(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnsyslog 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsyslog 목록
	 * @exception Exception
	 */
    public List selectComtnsyslogList(ComtnsyslogDefaultVO searchVO) throws Exception {
        return comtnsyslogDAO.selectComtnsyslogList(searchVO);
    }

    /**
	 * comtnsyslog 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnsyslog 총 갯수
	 * @exception
	 */
    public int selectComtnsyslogListTotCnt(ComtnsyslogDefaultVO searchVO) {
		return comtnsyslogDAO.selectComtnsyslogListTotCnt(searchVO);
	}
    
}

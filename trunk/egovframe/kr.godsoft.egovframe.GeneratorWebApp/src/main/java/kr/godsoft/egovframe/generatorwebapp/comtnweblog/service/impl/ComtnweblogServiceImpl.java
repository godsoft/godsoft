package kr.godsoft.egovframe.generatorwebapp.comtnweblog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnweblog.service.ComtnweblogService;
import kr.godsoft.egovframe.generatorwebapp.comtnweblog.service.ComtnweblogVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnweblogServiceImpl.java
 * @Description : Comtnweblog Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnweblogService")
public class ComtnweblogServiceImpl extends AbstractServiceImpl implements
        ComtnweblogService {

    @Resource(name="comtnweblogDAO")
    private ComtnweblogDAO comtnweblogDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnweblogIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnweblog을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnweblogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnweblog(ComtnweblogVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnweblogDAO.insertComtnweblog(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnweblog을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnweblogVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnweblog(ComtnweblogVO vo) throws Exception {
        comtnweblogDAO.updateComtnweblog(vo);
    }

    /**
	 * comtnweblog을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnweblogVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnweblog(ComtnweblogVO vo) throws Exception {
        comtnweblogDAO.deleteComtnweblog(vo);
    }

    /**
	 * comtnweblog을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnweblogVO
	 * @return 조회한 comtnweblog
	 * @exception Exception
	 */
    public ComtnweblogVO selectComtnweblog(ComtnweblogVO vo) throws Exception {
        ComtnweblogVO resultVO = comtnweblogDAO.selectComtnweblog(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnweblog 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnweblog 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnweblogList(ComtnweblogVO vo) throws Exception {
        return comtnweblogDAO.selectComtnweblogList(vo);
    }

    /**
	 * comtnweblog 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnweblog 총 갯수
	 * @exception
	 */
    public int selectComtnweblogListTotCnt(ComtnweblogVO vo) {
		return comtnweblogDAO.selectComtnweblogListTotCnt(vo);
	}
    
}

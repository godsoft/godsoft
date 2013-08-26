package kr.godsoft.egovframe.generatorwebapp.comtnloginlog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnloginlog.service.ComtnloginlogService;
import kr.godsoft.egovframe.generatorwebapp.comtnloginlog.service.ComtnloginlogVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnloginlogServiceImpl.java
 * @Description : Comtnloginlog Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnloginlogService")
public class ComtnloginlogServiceImpl extends AbstractServiceImpl implements
        ComtnloginlogService {

    @Resource(name="comtnloginlogDAO")
    private ComtnloginlogDAO comtnloginlogDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnloginlogIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTNLOGINLOG을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnloginlogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnloginlog(ComtnloginlogVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnloginlogDAO.insertComtnloginlog(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTNLOGINLOG을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnloginlogVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnloginlog(ComtnloginlogVO vo) throws Exception {
        comtnloginlogDAO.updateComtnloginlog(vo);
    }

    /**
	 * COMTNLOGINLOG을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnloginlogVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnloginlog(ComtnloginlogVO vo) throws Exception {
        comtnloginlogDAO.deleteComtnloginlog(vo);
    }

    /**
	 * COMTNLOGINLOG을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnloginlogVO
	 * @return 조회한 COMTNLOGINLOG
	 * @exception Exception
	 */
    public ComtnloginlogVO selectComtnloginlog(ComtnloginlogVO vo) throws Exception {
        ComtnloginlogVO resultVO = comtnloginlogDAO.selectComtnloginlog(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTNLOGINLOG 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNLOGINLOG 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnloginlogList(ComtnloginlogVO vo) throws Exception {
        return comtnloginlogDAO.selectComtnloginlogList(vo);
    }

    /**
	 * COMTNLOGINLOG 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTNLOGINLOG 총 갯수
	 * @exception
	 */
    public int selectComtnloginlogListTotCnt(ComtnloginlogVO vo) {
		return comtnloginlogDAO.selectComtnloginlogListTotCnt(vo);
	}
    
}
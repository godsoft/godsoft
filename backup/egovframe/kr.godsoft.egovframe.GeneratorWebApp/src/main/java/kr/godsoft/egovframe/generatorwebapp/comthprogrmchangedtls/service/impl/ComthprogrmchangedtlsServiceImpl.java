package kr.godsoft.egovframe.generatorwebapp.comthprogrmchangedtls.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comthprogrmchangedtls.service.ComthprogrmchangedtlsService;
import kr.godsoft.egovframe.generatorwebapp.comthprogrmchangedtls.service.ComthprogrmchangedtlsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComthprogrmchangedtlsServiceImpl.java
 * @Description : Comthprogrmchangedtls Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comthprogrmchangedtlsService")
public class ComthprogrmchangedtlsServiceImpl extends AbstractServiceImpl implements
        ComthprogrmchangedtlsService {

    @Resource(name="comthprogrmchangedtlsDAO")
    private ComthprogrmchangedtlsDAO comthprogrmchangedtlsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComthprogrmchangedtlsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTHPROGRMCHANGEDTLS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthprogrmchangedtlsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComthprogrmchangedtls(ComthprogrmchangedtlsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comthprogrmchangedtlsDAO.insertComthprogrmchangedtls(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTHPROGRMCHANGEDTLS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthprogrmchangedtlsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComthprogrmchangedtls(ComthprogrmchangedtlsVO vo) throws Exception {
        comthprogrmchangedtlsDAO.updateComthprogrmchangedtls(vo);
    }

    /**
	 * COMTHPROGRMCHANGEDTLS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthprogrmchangedtlsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComthprogrmchangedtls(ComthprogrmchangedtlsVO vo) throws Exception {
        comthprogrmchangedtlsDAO.deleteComthprogrmchangedtls(vo);
    }

    /**
	 * COMTHPROGRMCHANGEDTLS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthprogrmchangedtlsVO
	 * @return 조회한 COMTHPROGRMCHANGEDTLS
	 * @exception Exception
	 */
    public ComthprogrmchangedtlsVO selectComthprogrmchangedtls(ComthprogrmchangedtlsVO vo) throws Exception {
        ComthprogrmchangedtlsVO resultVO = comthprogrmchangedtlsDAO.selectComthprogrmchangedtls(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTHPROGRMCHANGEDTLS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTHPROGRMCHANGEDTLS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComthprogrmchangedtlsList(ComthprogrmchangedtlsVO vo) throws Exception {
        return comthprogrmchangedtlsDAO.selectComthprogrmchangedtlsList(vo);
    }

    /**
	 * COMTHPROGRMCHANGEDTLS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTHPROGRMCHANGEDTLS 총 갯수
	 * @exception
	 */
    public int selectComthprogrmchangedtlsListTotCnt(ComthprogrmchangedtlsVO vo) {
		return comthprogrmchangedtlsDAO.selectComthprogrmchangedtlsListTotCnt(vo);
	}
    
}

package kr.godsoft.egovframe.generatorwebapp.comthemplyrinfochangedtls.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comthemplyrinfochangedtls.service.ComthemplyrinfochangedtlsService;
import kr.godsoft.egovframe.generatorwebapp.comthemplyrinfochangedtls.service.ComthemplyrinfochangedtlsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComthemplyrinfochangedtlsServiceImpl.java
 * @Description : Comthemplyrinfochangedtls Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comthemplyrinfochangedtlsService")
public class ComthemplyrinfochangedtlsServiceImpl extends AbstractServiceImpl implements
        ComthemplyrinfochangedtlsService {

    @Resource(name="comthemplyrinfochangedtlsDAO")
    private ComthemplyrinfochangedtlsDAO comthemplyrinfochangedtlsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComthemplyrinfochangedtlsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * COMTHEMPLYRINFOCHANGEDTLS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthemplyrinfochangedtlsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComthemplyrinfochangedtls(ComthemplyrinfochangedtlsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comthemplyrinfochangedtlsDAO.insertComthemplyrinfochangedtls(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * COMTHEMPLYRINFOCHANGEDTLS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthemplyrinfochangedtlsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComthemplyrinfochangedtls(ComthemplyrinfochangedtlsVO vo) throws Exception {
        comthemplyrinfochangedtlsDAO.updateComthemplyrinfochangedtls(vo);
    }

    /**
	 * COMTHEMPLYRINFOCHANGEDTLS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthemplyrinfochangedtlsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComthemplyrinfochangedtls(ComthemplyrinfochangedtlsVO vo) throws Exception {
        comthemplyrinfochangedtlsDAO.deleteComthemplyrinfochangedtls(vo);
    }

    /**
	 * COMTHEMPLYRINFOCHANGEDTLS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthemplyrinfochangedtlsVO
	 * @return 조회한 COMTHEMPLYRINFOCHANGEDTLS
	 * @exception Exception
	 */
    public ComthemplyrinfochangedtlsVO selectComthemplyrinfochangedtls(ComthemplyrinfochangedtlsVO vo) throws Exception {
        ComthemplyrinfochangedtlsVO resultVO = comthemplyrinfochangedtlsDAO.selectComthemplyrinfochangedtls(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * COMTHEMPLYRINFOCHANGEDTLS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTHEMPLYRINFOCHANGEDTLS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComthemplyrinfochangedtlsList(ComthemplyrinfochangedtlsVO vo) throws Exception {
        return comthemplyrinfochangedtlsDAO.selectComthemplyrinfochangedtlsList(vo);
    }

    /**
	 * COMTHEMPLYRINFOCHANGEDTLS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return COMTHEMPLYRINFOCHANGEDTLS 총 갯수
	 * @exception
	 */
    public int selectComthemplyrinfochangedtlsListTotCnt(ComthemplyrinfochangedtlsVO vo) {
		return comthemplyrinfochangedtlsDAO.selectComthemplyrinfochangedtlsListTotCnt(vo);
	}
    
}

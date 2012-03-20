package kr.godsoft.egovframe.generatorwebapp.comtnunitylink.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comtnunitylink.service.ComtnunitylinkService;
import kr.godsoft.egovframe.generatorwebapp.comtnunitylink.service.ComtnunitylinkVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComtnunitylinkServiceImpl.java
 * @Description : Comtnunitylink Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-20
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtnunitylinkService")
public class ComtnunitylinkServiceImpl extends AbstractServiceImpl implements
        ComtnunitylinkService {

    @Resource(name="comtnunitylinkDAO")
    private ComtnunitylinkDAO comtnunitylinkDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtnunitylinkIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtnunitylink을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnunitylinkVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnunitylink(ComtnunitylinkVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comtnunitylinkDAO.insertComtnunitylink(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtnunitylink을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnunitylinkVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnunitylink(ComtnunitylinkVO vo) throws Exception {
        comtnunitylinkDAO.updateComtnunitylink(vo);
    }

    /**
	 * comtnunitylink을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnunitylinkVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnunitylink(ComtnunitylinkVO vo) throws Exception {
        comtnunitylinkDAO.deleteComtnunitylink(vo);
    }

    /**
	 * comtnunitylink을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnunitylinkVO
	 * @return 조회한 comtnunitylink
	 * @exception Exception
	 */
    public ComtnunitylinkVO selectComtnunitylink(ComtnunitylinkVO vo) throws Exception {
        ComtnunitylinkVO resultVO = comtnunitylinkDAO.selectComtnunitylink(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtnunitylink 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnunitylink 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComtnunitylinkList(ComtnunitylinkVO vo) throws Exception {
        return comtnunitylinkDAO.selectComtnunitylinkList(vo);
    }

    /**
	 * comtnunitylink 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtnunitylink 총 갯수
	 * @exception
	 */
    public int selectComtnunitylinkListTotCnt(ComtnunitylinkVO vo) {
		return comtnunitylinkDAO.selectComtnunitylinkListTotCnt(vo);
	}
    
}

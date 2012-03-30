package kr.godsoft.egovframe.generatorwebapp.md_other_objects.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_other_objects.service.MdOtherObjectsService;
import kr.godsoft.egovframe.generatorwebapp.md_other_objects.service.MdOtherObjectsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdOtherObjectsServiceImpl.java
 * @Description : MdOtherObjects Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdOtherObjectsService")
public class MdOtherObjectsServiceImpl extends AbstractServiceImpl implements
        MdOtherObjectsService {

    @Resource(name="mdOtherObjectsDAO")
    private MdOtherObjectsDAO mdOtherObjectsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdOtherObjectsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_OTHER_OBJECTS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdOtherObjectsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdOtherObjects(MdOtherObjectsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdOtherObjectsDAO.insertMdOtherObjects(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_OTHER_OBJECTS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdOtherObjectsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdOtherObjects(MdOtherObjectsVO vo) throws Exception {
        mdOtherObjectsDAO.updateMdOtherObjects(vo);
    }

    /**
	 * MD_OTHER_OBJECTS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdOtherObjectsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdOtherObjects(MdOtherObjectsVO vo) throws Exception {
        mdOtherObjectsDAO.deleteMdOtherObjects(vo);
    }

    /**
	 * MD_OTHER_OBJECTS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdOtherObjectsVO
	 * @return 조회한 MD_OTHER_OBJECTS
	 * @exception Exception
	 */
    public MdOtherObjectsVO selectMdOtherObjects(MdOtherObjectsVO vo) throws Exception {
        MdOtherObjectsVO resultVO = mdOtherObjectsDAO.selectMdOtherObjects(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_OTHER_OBJECTS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_OTHER_OBJECTS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdOtherObjectsList(MdOtherObjectsVO vo) throws Exception {
        return mdOtherObjectsDAO.selectMdOtherObjectsList(vo);
    }

    /**
	 * MD_OTHER_OBJECTS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_OTHER_OBJECTS 총 갯수
	 * @exception
	 */
    public int selectMdOtherObjectsListTotCnt(MdOtherObjectsVO vo) {
		return mdOtherObjectsDAO.selectMdOtherObjectsListTotCnt(vo);
	}
    
}

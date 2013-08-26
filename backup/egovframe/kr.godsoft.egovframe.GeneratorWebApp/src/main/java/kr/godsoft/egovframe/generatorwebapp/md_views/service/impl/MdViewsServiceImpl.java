package kr.godsoft.egovframe.generatorwebapp.md_views.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_views.service.MdViewsService;
import kr.godsoft.egovframe.generatorwebapp.md_views.service.MdViewsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdViewsServiceImpl.java
 * @Description : MdViews Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdViewsService")
public class MdViewsServiceImpl extends AbstractServiceImpl implements
        MdViewsService {

    @Resource(name="mdViewsDAO")
    private MdViewsDAO mdViewsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdViewsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_VIEWS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdViewsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdViews(MdViewsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdViewsDAO.insertMdViews(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_VIEWS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdViewsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdViews(MdViewsVO vo) throws Exception {
        mdViewsDAO.updateMdViews(vo);
    }

    /**
	 * MD_VIEWS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdViewsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdViews(MdViewsVO vo) throws Exception {
        mdViewsDAO.deleteMdViews(vo);
    }

    /**
	 * MD_VIEWS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdViewsVO
	 * @return 조회한 MD_VIEWS
	 * @exception Exception
	 */
    public MdViewsVO selectMdViews(MdViewsVO vo) throws Exception {
        MdViewsVO resultVO = mdViewsDAO.selectMdViews(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_VIEWS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_VIEWS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdViewsList(MdViewsVO vo) throws Exception {
        return mdViewsDAO.selectMdViewsList(vo);
    }

    /**
	 * MD_VIEWS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_VIEWS 총 갯수
	 * @exception
	 */
    public int selectMdViewsListTotCnt(MdViewsVO vo) {
		return mdViewsDAO.selectMdViewsListTotCnt(vo);
	}
    
}

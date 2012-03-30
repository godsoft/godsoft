package kr.godsoft.egovframe.generatorwebapp.md_catalogs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_catalogs.service.MdCatalogsService;
import kr.godsoft.egovframe.generatorwebapp.md_catalogs.service.MdCatalogsVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdCatalogsServiceImpl.java
 * @Description : MdCatalogs Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdCatalogsService")
public class MdCatalogsServiceImpl extends AbstractServiceImpl implements
        MdCatalogsService {

    @Resource(name="mdCatalogsDAO")
    private MdCatalogsDAO mdCatalogsDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdCatalogsIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_CATALOGS을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdCatalogsVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdCatalogs(MdCatalogsVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdCatalogsDAO.insertMdCatalogs(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_CATALOGS을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdCatalogsVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdCatalogs(MdCatalogsVO vo) throws Exception {
        mdCatalogsDAO.updateMdCatalogs(vo);
    }

    /**
	 * MD_CATALOGS을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdCatalogsVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdCatalogs(MdCatalogsVO vo) throws Exception {
        mdCatalogsDAO.deleteMdCatalogs(vo);
    }

    /**
	 * MD_CATALOGS을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdCatalogsVO
	 * @return 조회한 MD_CATALOGS
	 * @exception Exception
	 */
    public MdCatalogsVO selectMdCatalogs(MdCatalogsVO vo) throws Exception {
        MdCatalogsVO resultVO = mdCatalogsDAO.selectMdCatalogs(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_CATALOGS 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_CATALOGS 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdCatalogsList(MdCatalogsVO vo) throws Exception {
        return mdCatalogsDAO.selectMdCatalogsList(vo);
    }

    /**
	 * MD_CATALOGS 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_CATALOGS 총 갯수
	 * @exception
	 */
    public int selectMdCatalogsListTotCnt(MdCatalogsVO vo) {
		return mdCatalogsDAO.selectMdCatalogsListTotCnt(vo);
	}
    
}

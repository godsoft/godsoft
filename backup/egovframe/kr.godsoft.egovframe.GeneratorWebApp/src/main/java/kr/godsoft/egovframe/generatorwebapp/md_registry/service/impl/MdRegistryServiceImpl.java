package kr.godsoft.egovframe.generatorwebapp.md_registry.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.md_registry.service.MdRegistryService;
import kr.godsoft.egovframe.generatorwebapp.md_registry.service.MdRegistryVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MdRegistryServiceImpl.java
 * @Description : MdRegistry Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("mdRegistryService")
public class MdRegistryServiceImpl extends AbstractServiceImpl implements
        MdRegistryService {

    @Resource(name="mdRegistryDAO")
    private MdRegistryDAO mdRegistryDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMdRegistryIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MD_REGISTRY을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdRegistryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdRegistry(MdRegistryVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	mdRegistryDAO.insertMdRegistry(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MD_REGISTRY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdRegistryVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdRegistry(MdRegistryVO vo) throws Exception {
        mdRegistryDAO.updateMdRegistry(vo);
    }

    /**
	 * MD_REGISTRY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdRegistryVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdRegistry(MdRegistryVO vo) throws Exception {
        mdRegistryDAO.deleteMdRegistry(vo);
    }

    /**
	 * MD_REGISTRY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdRegistryVO
	 * @return 조회한 MD_REGISTRY
	 * @exception Exception
	 */
    public MdRegistryVO selectMdRegistry(MdRegistryVO vo) throws Exception {
        MdRegistryVO resultVO = mdRegistryDAO.selectMdRegistry(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MD_REGISTRY 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_REGISTRY 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMdRegistryList(MdRegistryVO vo) throws Exception {
        return mdRegistryDAO.selectMdRegistryList(vo);
    }

    /**
	 * MD_REGISTRY 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_REGISTRY 총 갯수
	 * @exception
	 */
    public int selectMdRegistryListTotCnt(MdRegistryVO vo) {
		return mdRegistryDAO.selectMdRegistryListTotCnt(vo);
	}
    
}

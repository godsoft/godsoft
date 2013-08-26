package kr.godsoft.egovframe.generatorwebapp.md_registry.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdRegistryService.java
 * @Description : MdRegistry Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdRegistryService {
	
	/**
	 * MD_REGISTRY을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdRegistryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdRegistry(MdRegistryVO vo) throws Exception;
    
    /**
	 * MD_REGISTRY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdRegistryVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdRegistry(MdRegistryVO vo) throws Exception;
    
    /**
	 * MD_REGISTRY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdRegistryVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdRegistry(MdRegistryVO vo) throws Exception;
    
    /**
	 * MD_REGISTRY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdRegistryVO
	 * @return 조회한 MD_REGISTRY
	 * @exception Exception
	 */
    MdRegistryVO selectMdRegistry(MdRegistryVO vo) throws Exception;
    
    /**
	 * MD_REGISTRY 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_REGISTRY 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdRegistryList(MdRegistryVO vo) throws Exception;
    
    /**
	 * MD_REGISTRY 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_REGISTRY 총 갯수
	 * @exception
	 */
    int selectMdRegistryListTotCnt(MdRegistryVO vo);
    
}

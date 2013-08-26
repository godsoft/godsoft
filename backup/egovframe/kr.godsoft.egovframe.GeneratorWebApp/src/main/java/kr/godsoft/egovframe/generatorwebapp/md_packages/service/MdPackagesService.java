package kr.godsoft.egovframe.generatorwebapp.md_packages.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdPackagesService.java
 * @Description : MdPackages Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdPackagesService {
	
	/**
	 * MD_PACKAGES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdPackagesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdPackages(MdPackagesVO vo) throws Exception;
    
    /**
	 * MD_PACKAGES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdPackagesVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdPackages(MdPackagesVO vo) throws Exception;
    
    /**
	 * MD_PACKAGES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdPackagesVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdPackages(MdPackagesVO vo) throws Exception;
    
    /**
	 * MD_PACKAGES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdPackagesVO
	 * @return 조회한 MD_PACKAGES
	 * @exception Exception
	 */
    MdPackagesVO selectMdPackages(MdPackagesVO vo) throws Exception;
    
    /**
	 * MD_PACKAGES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_PACKAGES 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdPackagesList(MdPackagesVO vo) throws Exception;
    
    /**
	 * MD_PACKAGES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_PACKAGES 총 갯수
	 * @exception
	 */
    int selectMdPackagesListTotCnt(MdPackagesVO vo);
    
}

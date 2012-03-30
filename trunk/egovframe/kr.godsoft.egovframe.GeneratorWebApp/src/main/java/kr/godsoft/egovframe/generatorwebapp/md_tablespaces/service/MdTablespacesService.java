package kr.godsoft.egovframe.generatorwebapp.md_tablespaces.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * @Class Name : MdTablespacesService.java
 * @Description : MdTablespaces Business class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface MdTablespacesService {
	
	/**
	 * MD_TABLESPACES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdTablespacesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertMdTablespaces(MdTablespacesVO vo) throws Exception;
    
    /**
	 * MD_TABLESPACES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdTablespacesVO
	 * @return void형
	 * @exception Exception
	 */
    void updateMdTablespaces(MdTablespacesVO vo) throws Exception;
    
    /**
	 * MD_TABLESPACES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdTablespacesVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteMdTablespaces(MdTablespacesVO vo) throws Exception;
    
    /**
	 * MD_TABLESPACES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdTablespacesVO
	 * @return 조회한 MD_TABLESPACES
	 * @exception Exception
	 */
    MdTablespacesVO selectMdTablespaces(MdTablespacesVO vo) throws Exception;
    
    /**
	 * MD_TABLESPACES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_TABLESPACES 목록
	 * @exception Exception
	 */
    List<EgovMap> selectMdTablespacesList(MdTablespacesVO vo) throws Exception;
    
    /**
	 * MD_TABLESPACES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MD_TABLESPACES 총 갯수
	 * @exception
	 */
    int selectMdTablespacesListTotCnt(MdTablespacesVO vo);
    
}

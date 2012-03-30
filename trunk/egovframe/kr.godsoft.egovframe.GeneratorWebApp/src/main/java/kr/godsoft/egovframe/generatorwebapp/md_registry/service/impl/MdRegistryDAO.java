package kr.godsoft.egovframe.generatorwebapp.md_registry.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_registry.service.MdRegistryVO;

/**
 * @Class Name : MdRegistryDAO.java
 * @Description : MdRegistry DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdRegistryDAO")
public class MdRegistryDAO extends EgovAbstractDAO {

	/**
	 * MD_REGISTRY을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdRegistryVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdRegistry(MdRegistryVO vo) throws Exception {
        return (String)insert("mdRegistryDAO.insertMdRegistry_S", vo);
    }

    /**
	 * MD_REGISTRY을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdRegistryVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdRegistry(MdRegistryVO vo) throws Exception {
        update("mdRegistryDAO.updateMdRegistry_S", vo);
    }

    /**
	 * MD_REGISTRY을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdRegistryVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdRegistry(MdRegistryVO vo) throws Exception {
        delete("mdRegistryDAO.deleteMdRegistry_S", vo);
    }

    /**
	 * MD_REGISTRY을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdRegistryVO
	 * @return 조회한 MD_REGISTRY
	 * @exception Exception
	 */
    public MdRegistryVO selectMdRegistry(MdRegistryVO vo) throws Exception {
        return (MdRegistryVO) selectByPk("mdRegistryDAO.selectMdRegistry_S", vo);
    }

    /**
	 * MD_REGISTRY 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_REGISTRY 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdRegistryList(MdRegistryVO vo) throws Exception {
        return list("mdRegistryDAO.selectMdRegistryList_D", vo);
    }

    /**
	 * MD_REGISTRY 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_REGISTRY 총 갯수
	 * @exception
	 */
    public int selectMdRegistryListTotCnt(MdRegistryVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdRegistryDAO.selectMdRegistryListTotCnt_S", vo);
    }

}

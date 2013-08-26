package kr.godsoft.egovframe.generatorwebapp.md_packages.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kr.godsoft.egovframe.generatorwebapp.md_packages.service.MdPackagesVO;

/**
 * @Class Name : MdPackagesDAO.java
 * @Description : MdPackages DAO Class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("mdPackagesDAO")
public class MdPackagesDAO extends EgovAbstractDAO {

	/**
	 * MD_PACKAGES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MdPackagesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMdPackages(MdPackagesVO vo) throws Exception {
        return (String)insert("mdPackagesDAO.insertMdPackages_S", vo);
    }

    /**
	 * MD_PACKAGES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MdPackagesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMdPackages(MdPackagesVO vo) throws Exception {
        update("mdPackagesDAO.updateMdPackages_S", vo);
    }

    /**
	 * MD_PACKAGES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MdPackagesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMdPackages(MdPackagesVO vo) throws Exception {
        delete("mdPackagesDAO.deleteMdPackages_S", vo);
    }

    /**
	 * MD_PACKAGES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MdPackagesVO
	 * @return 조회한 MD_PACKAGES
	 * @exception Exception
	 */
    public MdPackagesVO selectMdPackages(MdPackagesVO vo) throws Exception {
        return (MdPackagesVO) selectByPk("mdPackagesDAO.selectMdPackages_S", vo);
    }

    /**
	 * MD_PACKAGES 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_PACKAGES 목록
	 * @exception Exception
	 */
	@SuppressWarnings("unchecked")
    public List<EgovMap> selectMdPackagesList(MdPackagesVO vo) throws Exception {
        return list("mdPackagesDAO.selectMdPackagesList_D", vo);
    }

    /**
	 * MD_PACKAGES 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return MD_PACKAGES 총 갯수
	 * @exception
	 */
    public int selectMdPackagesListTotCnt(MdPackagesVO vo) {
        return (Integer)getSqlMapClientTemplate().queryForObject("mdPackagesDAO.selectMdPackagesListTotCnt_S", vo);
    }

}

package kr.godsoft.egovframe.generatorwebapp.comthsyshist.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.comthsyshist.service.ComthsyshistService;
import kr.godsoft.egovframe.generatorwebapp.comthsyshist.service.ComthsyshistVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : ComthsyshistServiceImpl.java
 * @Description : Comthsyshist Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-16
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comthsyshistService")
public class ComthsyshistServiceImpl extends AbstractServiceImpl implements
        ComthsyshistService {

    @Resource(name="comthsyshistDAO")
    private ComthsyshistDAO comthsyshistDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComthsyshistIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comthsyshist을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComthsyshistVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComthsyshist(ComthsyshistVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	comthsyshistDAO.insertComthsyshist(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comthsyshist을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComthsyshistVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComthsyshist(ComthsyshistVO vo) throws Exception {
        comthsyshistDAO.updateComthsyshist(vo);
    }

    /**
	 * comthsyshist을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComthsyshistVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComthsyshist(ComthsyshistVO vo) throws Exception {
        comthsyshistDAO.deleteComthsyshist(vo);
    }

    /**
	 * comthsyshist을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComthsyshistVO
	 * @return 조회한 comthsyshist
	 * @exception Exception
	 */
    public ComthsyshistVO selectComthsyshist(ComthsyshistVO vo) throws Exception {
        ComthsyshistVO resultVO = comthsyshistDAO.selectComthsyshist(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comthsyshist 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthsyshist 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectComthsyshistList(ComthsyshistVO vo) throws Exception {
        return comthsyshistDAO.selectComthsyshistList(vo);
    }

    /**
	 * comthsyshist 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comthsyshist 총 갯수
	 * @exception
	 */
    public int selectComthsyshistListTotCnt(ComthsyshistVO vo) {
		return comthsyshistDAO.selectComthsyshistListTotCnt(vo);
	}
    
}

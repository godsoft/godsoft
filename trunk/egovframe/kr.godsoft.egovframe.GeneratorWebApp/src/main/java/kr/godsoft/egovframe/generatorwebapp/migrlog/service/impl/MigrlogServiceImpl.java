package kr.godsoft.egovframe.generatorwebapp.migrlog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.godsoft.egovframe.generatorwebapp.migrlog.service.MigrlogService;
import kr.godsoft.egovframe.generatorwebapp.migrlog.service.MigrlogVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;


/**
 * @Class Name : MigrlogServiceImpl.java
 * @Description : Migrlog Business Implement class
 * @Modification Information
 *
 * @author 이백행
 * @since 2012-03-30
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("migrlogService")
public class MigrlogServiceImpl extends AbstractServiceImpl implements
        MigrlogService {

    @Resource(name="migrlogDAO")
    private MigrlogDAO migrlogDAO;
    
    /** ID Generation */
    //@Resource(name="{egovMigrlogIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * MIGRLOG을 등록한다.
	 * @param vo - 등록할 정보가 담긴 MigrlogVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertMigrlog(MigrlogVO vo) throws Exception {
    	log.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	log.debug(vo.toString());
    	
    	migrlogDAO.insertMigrlog(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * MIGRLOG을 수정한다.
	 * @param vo - 수정할 정보가 담긴 MigrlogVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateMigrlog(MigrlogVO vo) throws Exception {
        migrlogDAO.updateMigrlog(vo);
    }

    /**
	 * MIGRLOG을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 MigrlogVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteMigrlog(MigrlogVO vo) throws Exception {
        migrlogDAO.deleteMigrlog(vo);
    }

    /**
	 * MIGRLOG을 조회한다.
	 * @param vo - 조회할 정보가 담긴 MigrlogVO
	 * @return 조회한 MIGRLOG
	 * @exception Exception
	 */
    public MigrlogVO selectMigrlog(MigrlogVO vo) throws Exception {
        MigrlogVO resultVO = migrlogDAO.selectMigrlog(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * MIGRLOG 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MIGRLOG 목록
	 * @exception Exception
	 */
    public List<EgovMap> selectMigrlogList(MigrlogVO vo) throws Exception {
        return migrlogDAO.selectMigrlogList(vo);
    }

    /**
	 * MIGRLOG 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return MIGRLOG 총 갯수
	 * @exception
	 */
    public int selectMigrlogListTotCnt(MigrlogVO vo) {
		return migrlogDAO.selectMigrlogListTotCnt(vo);
	}
    
}

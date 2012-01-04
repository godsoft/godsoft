package egovframework.let.uss.sam.ipm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.com.cmm.ComDefaultVO;
import egovframework.let.uss.sam.ipm.service.EgovIndvdlInfoPolicyService;
import egovframework.let.uss.sam.ipm.service.IndvdlInfoPolicy;
import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;

/**
 * 개인정보보호정책를 처리하는 ServiceImpl Class 구현
 * @author 공통서비스 장동한
 * @since 2009.07.03
 * @version 1.0
 * @see <pre>
 * &lt;&lt; 개정이력(Modification Information) &gt;&gt;
 *   
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2009.07.03  장동한          최초 생성
 *   2011.08.31  JJY            경량환경 템플릿 커스터마이징버전 생성 
 * 
 * </pre>
 */
@Service("egovIndvdlInfoPolicyService")
public class EgovIndvdlInfoPolicyServiceImpl extends AbstractServiceImpl 
        implements EgovIndvdlInfoPolicyService {

    @Resource(name = "onlineIndvdlInfoPolicyDao")
    private IndvdlInfoPolicyDao dao;

    @Resource(name = "egovIndvdlInfoPolicyIdGnrService")
    private EgovIdGnrService idgenService;

    /**
     * 개인정보보호정책를(을) 목록을 조회 한다.
     * @param OnlinePoll 회정정보가 담김 VO
     * @return List
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List selectIndvdlInfoPolicyList(ComDefaultVO searchVO) throws Exception {
        return (List)dao.selectIndvdlInfoPolicyList(searchVO);
    }

    /**
     * 개인정보보호정책를(을) 목록 전체 건수를(을) 조회한다.
     * @param searchVO  조회할 정보가 담긴 VO
     * @return int
     * @throws Exception
     */
    public int selectIndvdlInfoPolicyListCnt(ComDefaultVO searchVO) throws Exception {
        return (Integer)dao.selectIndvdlInfoPolicyListCnt(searchVO);
    }
    
    /**
     * 개인정보보호정책를(을) 상세조회 한다.
     * @param searchVO 조회할 정보가 담긴 VO
     * @return List
     * @throws Exception
     */
    public IndvdlInfoPolicy selectIndvdlInfoPolicyDetail( IndvdlInfoPolicy indvdlInfoPolicy) throws Exception {
        return (IndvdlInfoPolicy)dao.selectIndvdlInfoPolicyDetail(indvdlInfoPolicy);
    }

    /**
     * 개인정보보호정책를(을) 등록한다.
     * @param indvdlInfoPolicy 개인정보보호정책 정보가 담긴 VO
     * @throws Exception
     */
    public void insertIndvdlInfoPolicy(IndvdlInfoPolicy indvdlInfoPolicy)throws Exception {
        String sMakeId = idgenService.getNextStringId();
        indvdlInfoPolicy.setIndvdlInfoId(sMakeId);
        dao.insertIndvdlInfoPolicy(indvdlInfoPolicy);
    }

    /**
     * 개인정보보호정책를(을) 수정한다.
     * @param indvdlInfoPolicy 개인정보보호정책 정보가 담긴 VO
     * @throws Exception
     */
    public void updateIndvdlInfoPolicy(IndvdlInfoPolicy indvdlInfoPolicy) throws Exception {
        dao.updateIndvdlInfoPolicy(indvdlInfoPolicy);
    }

    /**
     * 개인정보보호정책를(을) 삭제한다.
     * @param indvdlInfoPolicy 개인정보보호정책 정보가 담긴 VO
     * @throws Exception
     */
    public void deleteIndvdlInfoPolicy(IndvdlInfoPolicy indvdlInfoPolicy) throws Exception {
        dao.deleteIndvdlInfoPolicy(indvdlInfoPolicy);
    }
    
}

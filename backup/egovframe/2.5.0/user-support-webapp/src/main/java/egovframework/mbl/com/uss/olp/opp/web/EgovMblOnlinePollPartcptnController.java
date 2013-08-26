package egovframework.mbl.com.uss.olp.opp.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.com.cmm.ComDefaultCodeVO;
import egovframework.com.cmm.ComDefaultVO;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.LoginVO;
import egovframework.com.cmm.service.EgovCmmUseService;
import egovframework.com.cmm.util.EgovUserDetailsHelper;
import egovframework.com.uss.olp.opp.service.EgovOnlinePollPartcptnService;
import egovframework.com.uss.olp.opp.service.OnlinePollPartcptn;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

/**
 * 온라인POLL참여를 처리하는 Controller Class 구현
 * @author 공통서비스 장동한
 * @since 2009.07.03
 * @version 1.0
 * @see <pre>
 * &lt;&lt; 개정이력(Modification Information) &gt;&gt;
 *   
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2009.07.03  장동한          최초 생성
 * 
 * </pre>
 */
@Controller
public class EgovMblOnlinePollPartcptnController {
	
	 
	 

    protected Log log = LogFactory.getLog(this.getClass());

    /** EgovMessageSource */
    @Resource(name = "egovMessageSource")
    EgovMessageSource egovMessageSource;

    /** egovOnlinePollService */
    @Resource(name = "egovOnlinePollPartcptnService")
    private EgovOnlinePollPartcptnService egovOnlinePollPartcptnService;

    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;

    /** Egov Common Code Service */
    @Resource(name="EgovCmmUseService")
    private EgovCmmUseService cmmUseService;
    
    /**
     * 온라인POLL참여 목록을 조회한다.
     * @param searchVO
     * @param commandMap
     * @param onlinePollPartcptn
     * @param model
     * @return "/uss/olp/opp/EgovOnlinePollList"
     * @throws Exception
     */
    @RequestMapping(value = "/uss/olp/opp/listEgovOnlinePollPartcptnMain.mdo")
    public String EgovOnlinePollPartcptnMainList(
            @ModelAttribute("searchVO") ComDefaultVO searchVO, Map commandMap,
            OnlinePollPartcptn onlinePollPartcptn, ModelMap model)
            throws Exception {

        String sSearchMode = commandMap.get("searchMode") == null ? "" : (String) commandMap.get("searchMode");

        /** EgovPropertyService.sample */
        searchVO.setPageUnit(propertiesService.getInt("pageUnit"));
        searchVO.setPageSize(propertiesService.getInt("pageSize"));

        /** pageing */
        PaginationInfo paginationInfo = new PaginationInfo();
        paginationInfo.setCurrentPageNo(searchVO.getPageIndex());
        paginationInfo.setRecordCountPerPage(10);
        paginationInfo.setPageSize(1);

        searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
        searchVO.setLastIndex(paginationInfo.getLastRecordIndex());
        searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());

        List reusltList = egovOnlinePollPartcptnService.selectOnlinePollManageList(searchVO);
        model.addAttribute("resultList", reusltList);
        model.addAttribute("paginationInfo", paginationInfo);


        return "egovframework/mbl/com/uss/olp/opp/EgovOnlinePollPartcptnMainList";
    }

    
    /**
     * 온라인POLL참여 목록을 조회한다.
     * @param searchVO
     * @param commandMap
     * @param onlinePollPartcptn
     * @param model
     * @return "/uss/olp/opp/EgovOnlinePollList"
     * @throws Exception
     */
    @RequestMapping(value = "/uss/olp/opp/listOnlinePollPartcptn.mdo")
    public String EgovOnlinePollPartcptnList(
            @ModelAttribute("searchVO") ComDefaultVO searchVO, Map commandMap,
            OnlinePollPartcptn onlinePollPartcptn, ModelMap model)
            throws Exception {

        String sSearchMode = commandMap.get("searchMode") == null ? "" : (String) commandMap.get("searchMode");

        /** EgovPropertyService.sample */
        searchVO.setPageUnit(propertiesService.getInt("pageUnit"));
        searchVO.setPageSize(propertiesService.getInt("pageSize"));

        /** pageing */
        PaginationInfo paginationInfo = new PaginationInfo();
        paginationInfo.setCurrentPageNo(searchVO.getPageIndex());
        paginationInfo.setRecordCountPerPage(10);
        paginationInfo.setPageSize(1);

        searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
        searchVO.setLastIndex(paginationInfo.getLastRecordIndex());
        searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());

        List reusltList = egovOnlinePollPartcptnService.selectOnlinePollManageList(searchVO);
        model.addAttribute("resultList", reusltList);

        model.addAttribute("searchKeyword", commandMap.get("searchKeyword") == null ? "" : (String) commandMap.get("searchKeyword"));
        model.addAttribute("searchCondition", commandMap.get("searchCondition") == null ? "" : (String) commandMap.get("searchCondition"));

        int totCnt = (Integer) egovOnlinePollPartcptnService.selectOnlinePollManageListCnt(searchVO);
        paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);

        return "egovframework/mbl/com/uss/olp/opp/EgovOnlinePollPartcptnList";
    }

    /**
     * 온라인POLL참여를 등록한다.
     * @param searchVO
     * @param commandMap
     * @param onlinePollPartcptn
     * @param bindingResult
     * @param model
     * @return 
     *         "/uss/olp/opp/EgovOnlinePollPartcptnRegist"
     * @throws Exception
     */
    @RequestMapping(value = "/uss/olp/opp/registOnlinePollPartcptn.mdo")
    public String EgovOnlinePollPartcptnRegist(
            @ModelAttribute("searchVO") ComDefaultVO searchVO,
            Map commandMap,
            @ModelAttribute("onlinePollPartcptn") OnlinePollPartcptn onlinePollPartcptn,
            BindingResult bindingResult, ModelMap model) throws Exception {
        // 0. Spring Security 사용자권한 처리
        Boolean isAuthenticated = EgovUserDetailsHelper.isAuthenticated();
        if (!isAuthenticated) {
            model.addAttribute("message", egovMessageSource.getMessage("fail.common.login"));
            return "egovframework/mbl/com/uat/uia/EgovLoginUsr";
        }

        // 로그인 객체 선언
        LoginVO loginVO = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();

        String sLocationUrl = "egovframework/mbl/com/uss/olp/opp/EgovOnlinePollPartcptnRegist";

        String sCmd = commandMap.get("cmd") == null ? "" : (String) commandMap.get("cmd");
        log.info("cmd =>" + sCmd);

        if (sCmd.equals("save")) {
            //아이디 설정
            onlinePollPartcptn.setFrstRegisterId((String)loginVO.getUniqId());
            onlinePollPartcptn.setLastUpdusrId((String)loginVO.getUniqId());
            
            //투표여부 체크
            if(egovOnlinePollPartcptnService.selectOnlinePollResult(onlinePollPartcptn) != 0){
            	 String ReusltScript = "";
                 
                 ReusltScript += "<script type='text/javaScript' language='javascript'>";
                 ReusltScript += "alert('한 온라인POLL엔 한번만 투표 가능합니다. ');";
                 ReusltScript += "</script>";
                 
                 model.addAttribute("reusltScript", ReusltScript);            
                 return "forward:/uss/olp/opp/listOnlinePollPartcptn.mdo";
            }
            
            egovOnlinePollPartcptnService.insertOnlinePollResult(onlinePollPartcptn);
            
            String ReusltScript = "";
            
            ReusltScript += "<script type='text/javaScript' language='javascript'>";
            ReusltScript += "alert(' 온라인POLL참여에 응해주셔서 감사합니다!  ');";
            ReusltScript += "</script>";
            
            model.addAttribute("reusltScript", ReusltScript);            
            sLocationUrl = "forward:/uss/olp/opp/listOnlinePollPartcptn.mdo";
        } else {
            //POLL종류 설정
            ComDefaultCodeVO voComCode = new ComDefaultCodeVO();
            voComCode = new ComDefaultCodeVO();
            voComCode.setCodeId("COM039");
            List listComCode = cmmUseService.selectCmmCodeDetail(voComCode);
            model.addAttribute("pollKindCodeList", listComCode );
        
            //POLL페기유무 설정 /POLL자동페기유무
            List listPollDeuseYn = new ArrayList();            
            voComCode  = new ComDefaultCodeVO();
            voComCode.setCodeId("COM038");
            model.addAttribute("pollDeuseYnList", (List)cmmUseService.selectCmmCodeDetail(voComCode));
            
            //온라인POLL관리 정보 설정
            List reusltDetail = egovOnlinePollPartcptnService.selectOnlinePollManageDetail(onlinePollPartcptn);
            model.addAttribute("PollManage", reusltDetail);
            //온라인POLL항목 정보 설정            
            reusltDetail = egovOnlinePollPartcptnService.selectOnlinePollItemDetail(onlinePollPartcptn);
            model.addAttribute("PollItem", reusltDetail);
        }

        return sLocationUrl;
    }
    
    /**
     * 온라인POLL관리 통계를 조회한다.
     * @param onlinePollPartcptn
     * @param model
     * @return 
     *         "/uss/olp/opm/EgovOnlinePollManageStatistics"
     * @throws Exception
     */
    @RequestMapping(value = "/uss/olp/opp/statisticsOnlinePollPartcptn.mdo")
    public String EgovOnlinePollManageStatistics(
            Map commandMap,
            @ModelAttribute("onlinePollPartcptn") OnlinePollPartcptn onlinePollPartcptn,
            HttpServletRequest request,
            ModelMap model) throws Exception {
        
        //POLL종류 설정
        ComDefaultCodeVO voComCode = new ComDefaultCodeVO();
        voComCode = new ComDefaultCodeVO();
        voComCode.setCodeId("COM039");
        List listComCode = cmmUseService.selectCmmCodeDetail(voComCode);
        model.addAttribute("pollKindCodeList", listComCode );
    
        //POLL페기유무 설정 /POLL자동페기유무
        List listPollDeuseYn = new ArrayList();            
        voComCode  = new ComDefaultCodeVO();
        voComCode.setCodeId("COM038");
        model.addAttribute("pollDeuseYnList", (List)cmmUseService.selectCmmCodeDetail(voComCode));
        
        //온라인POLL관리 정보 설정
        List reusltDetail = egovOnlinePollPartcptnService.selectOnlinePollManageDetail(onlinePollPartcptn);
        model.addAttribute("PollManageList", reusltDetail);
        //온라인POLL항목 정보 설정            
        reusltDetail = egovOnlinePollPartcptnService.selectOnlinePollItemDetail(onlinePollPartcptn);
        model.addAttribute("PollItemList", reusltDetail);
        //온라인POLL결과 정보 설정          
        List reusltList = egovOnlinePollPartcptnService.selectOnlinePollManageStatistics(onlinePollPartcptn);
        model.addAttribute("statisticsList", reusltList);

        //이전 주소
        model.addAttribute("returnUrl", request.getHeader("REFERER"));
        
        model.addAttribute("linkType", commandMap.get("linkType") == null ? "" : (String) commandMap.get("linkType"));
        
        
        return "egovframework/mbl/com/uss/olp/opp/EgovOnlinePollPartcptnStatistics"; 
    }

}
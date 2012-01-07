package egovframework.com.uss.ion.rsm.web;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import net.sourceforge.ajaxtags.xml.AjaxXmlBuilder;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springmodules.validation.commons.DefaultBeanValidator;

import egovframework.com.cmm.ComDefaultVO;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.LoginVO;
import egovframework.com.cmm.annotation.IncludedInfo;
import egovframework.com.cmm.util.EgovUserDetailsHelper;
import egovframework.com.uss.ion.rsm.service.EgovRecentSrchwrdService;
import egovframework.com.uss.ion.rsm.service.RecentSrchwrd;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
/**
 * 최근검색어를 처리하는 Controller Class 구현
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
 * 
 * </pre>
 */

@Controller
public class EgovRecentSrchwrdController {
	
	 
	 

    protected Log log = LogFactory.getLog(this.getClass());

    @Autowired
    private DefaultBeanValidator beanValidator;

    /** EgovMessageSource */
    @Resource(name = "egovMessageSource")
    EgovMessageSource egovMessageSource;

    /** egovOnlinePollService */
    @Resource(name = "egovRecentSrchwrdService")
    private EgovRecentSrchwrdService egovRecentSrchwrdService;

    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;

    /**
     * 최근검색어관리 목록을 조회한다.
     * @param searchVO
     * @param commandMap
     * @param recentSrchwrdVO
     * @param model
     * @return "egovframework/com/uss/ion/rsm/EgovOnlinePollList"
     * @throws Exception
     */
    @IncludedInfo(name="최근검색어 조회", order = 760 ,gid = 50)
    @RequestMapping(value = "/uss/ion/rsm/listRecentSrchwrd.do")
    public String egovRecentSrchwrdList(
            @ModelAttribute("searchVO") RecentSrchwrd searchVO, Map commandMap,
            RecentSrchwrd recentSrchwrdVO, ModelMap model)
            throws Exception {

        String sSearchMode = commandMap.get("searchMode") == null ? "" : (String) commandMap.get("searchMode");

        /** EgovPropertyService.sample */
        searchVO.setPageUnit(propertiesService.getInt("pageUnit"));
        searchVO.setPageSize(propertiesService.getInt("pageSize"));

        /** pageing */
        PaginationInfo paginationInfo = new PaginationInfo();
        paginationInfo.setCurrentPageNo(searchVO.getPageIndex());
        paginationInfo.setRecordCountPerPage(searchVO.getPageUnit());
        paginationInfo.setPageSize(searchVO.getPageSize());

        searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
        searchVO.setLastIndex(paginationInfo.getLastRecordIndex());
        searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());

        List reusltList = egovRecentSrchwrdService.selectRecentSrchwrdList(searchVO);
        model.addAttribute("resultList", reusltList);

        model.addAttribute("searchKeyword", commandMap.get("searchKeyword") == null ? "" : (String) commandMap.get("searchKeyword"));
        model.addAttribute("searchCondition", commandMap.get("searchCondition") == null ? "" : (String) commandMap.get("searchCondition"));

        int totCnt = (Integer) egovRecentSrchwrdService.selectRecentSrchwrdListCnt(searchVO);
        paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);

        return "egovframework/com/uss/ion/rsm/EgovRecentSrchwrdList";
    }

    /**
     * 최근검색어관리 목록을 상세조회 조회한다.
     * @param searchVO
     * @param recentSrchwrdVO
     * @param commandMap
     * @param model
     * @return 
     *         "/uss/ion/rsm/EgovOnlinePollDetail"
     * @throws Exception
     */
    @RequestMapping(value = "/uss/ion/rsm/detailRecentSrchwrd.do")
    public String egovRecentSrchwrdDetail(
            @ModelAttribute("searchVO") ComDefaultVO searchVO,
            RecentSrchwrd recentSrchwrd, Map commandMap,
            ModelMap model) throws Exception {

        String sLocationUrl = "egovframework/com/uss/ion/rsm/EgovRecentSrchwrdDetail";

        String sCmd = commandMap.get("cmd") == null ? "" : (String) commandMap.get("cmd");

        if (sCmd.equals("del")) {
            egovRecentSrchwrdService.deleteRecentSrchwrd(recentSrchwrd);
            sLocationUrl = "redirect:/uss/ion/rsm/listRecentSrchwrd.do";
        } else {
            RecentSrchwrd recentSrchwrdVO = egovRecentSrchwrdService.selectRecentSrchwrdDetail(recentSrchwrd);
            model.addAttribute("recentSrchwrd", recentSrchwrdVO);
        }

        return sLocationUrl;
    }

    /**
     * 최근검색어관리를 수정한다.
     * @param searchVO
     * @param commandMap
     * @param recentSrchwrdVO
     * @param bindingResult
     * @param model
     * @return 
     *         "/uss/ion/rsm/EgovOnlinePollUpdt"
     * @throws Exception
     */
    @RequestMapping(value = "/uss/ion/rsm/updtRecentSrchwrd.do")
    public String egovRecentSrchwrdModify(
            Map commandMap,
            RecentSrchwrd recentSrchwrd,
            BindingResult bindingResult, ModelMap model) throws Exception {
        // 0. Spring Security 사용자권한 처리
        Boolean isAuthenticated = EgovUserDetailsHelper.isAuthenticated();
        if (!isAuthenticated) {
            model.addAttribute("message", egovMessageSource.getMessage("fail.common.login"));
            return "egovframework/com/uat/uia/EgovLoginUsr";
        }

        // 로그인 객체 선언
        LoginVO loginVO = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();

        String sLocationUrl = "egovframework/com/uss/ion/rsm/EgovRecentSrchwrdUpdt";

        String sCmd = commandMap.get("cmd") == null ? "" : (String) commandMap.get("cmd");

        if (sCmd.equals("save")) {
            //서버  validate 체크
            beanValidator.validate(recentSrchwrd, bindingResult);
            if(bindingResult.hasErrors()){
                return sLocationUrl;
            }
            //아이디 설정
            recentSrchwrd.setFrstRegisterId((String)loginVO.getUniqId());
            recentSrchwrd.setLastUpdusrId((String)loginVO.getUniqId());
            //저장
            egovRecentSrchwrdService.updateRecentSrchwrd(recentSrchwrd);
            sLocationUrl = "redirect:/uss/ion/rsm/listRecentSrchwrd.do";
        } else {
            RecentSrchwrd recentSrchwrdVO = egovRecentSrchwrdService.selectRecentSrchwrdDetail(recentSrchwrd);
            model.addAttribute("recentSrchwrd", recentSrchwrdVO);
        }

        return sLocationUrl;
    }

    /**
     * 최근검색어관리를 등록한다.
     * @param searchVO
     * @param commandMap
     * @param recentSrchwrdVO
     * @param bindingResult
     * @param model
     * @return 
     *         "/uss/ion/rsm/EgovOnlinePollRegist"
     * @throws Exception
     */
    @RequestMapping(value = "/uss/ion/rsm/registRecentSrchwrd.do")
    public String egovRecentSrchwrdRegist(
            Map commandMap,
            @ModelAttribute("recentSrchwrd") RecentSrchwrd recentSrchwrd,
            BindingResult bindingResult, ModelMap model) throws Exception {
        // 0. Spring Security 사용자권한 처리
        Boolean isAuthenticated = EgovUserDetailsHelper.isAuthenticated();
        if (!isAuthenticated) {
            model.addAttribute("message", egovMessageSource.getMessage("fail.common.login"));
            return "egovframework/com/uat/uia/EgovLoginUsr";
        }

        // 로그인 객체 선언
        LoginVO loginVO = (LoginVO) EgovUserDetailsHelper.getAuthenticatedUser();

        String sLocationUrl = "egovframework/com/uss/ion/rsm/EgovRecentSrchwrdRegist";

        String sCmd = commandMap.get("cmd") == null ? "" : (String) commandMap.get("cmd");
        log.info("cmd =>" + sCmd);

        if (sCmd.equals("save")) {
            //서버  validate 체크
            beanValidator.validate(recentSrchwrd, bindingResult);
            if(bindingResult.hasErrors()){
                return sLocationUrl;
            }
            //아이디 설정
            recentSrchwrd.setFrstRegisterId((String)loginVO.getUniqId());
            recentSrchwrd.setLastUpdusrId((String)loginVO.getUniqId());
            //저장
            egovRecentSrchwrdService.insertRecentSrchwrd(recentSrchwrd);
            sLocationUrl = "redirect:/uss/ion/rsm/listRecentSrchwrd.do";
        }

        return sLocationUrl;
    }


    /**
     * 최근검색어결과 목록을 조회한다.
     * @param searchVO
     * @param commandMap
     * @param recentSrchwrdVO
     * @param model
     * @return "egovframework/com/uss/ion/rsm/EgovOnlinePollList"
     * @throws Exception
     */
    @RequestMapping(value = "/uss/ion/rsm/listRecentSrchwrdResult.do")
    public String egovRecentSrchwrdResultList(
            @ModelAttribute("searchVO") RecentSrchwrd searchVO, 
            Map commandMap,
            ModelMap model)
            throws Exception {

        String sSearchMode = commandMap.get("searchMode") == null ? "" : (String) commandMap.get("searchMode");
        String sCmd = commandMap.get("cmd") == null ? "" : (String) commandMap.get("cmd");
        
        /** EgovPropertyService.sample */
        searchVO.setPageUnit(propertiesService.getInt("pageUnit"));
        searchVO.setPageSize(propertiesService.getInt("pageSize"));

        /** pageing */
        PaginationInfo paginationInfo = new PaginationInfo();
        paginationInfo.setCurrentPageNo(searchVO.getPageIndex());
        paginationInfo.setRecordCountPerPage(searchVO.getPageUnit());
        paginationInfo.setPageSize(searchVO.getPageSize());

        searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
        searchVO.setLastIndex(paginationInfo.getLastRecordIndex());
        searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
        
        //건별삭제
        if (sCmd.equals("del")) {
            egovRecentSrchwrdService.deleteRecentSrchwrdResult(searchVO);
        //관리별삭제
        }else if(sCmd.equals("delAll")) {
            egovRecentSrchwrdService.deleteRecentSrchwrdResultAll(searchVO);
        }
        
        List reusltList = egovRecentSrchwrdService.selectRecentSrchwrdResultList(searchVO);
        model.addAttribute("resultList", reusltList);

        model.addAttribute("searchKeyword", commandMap.get("searchKeyword") == null ? "" : (String) commandMap.get("searchKeyword"));
        model.addAttribute("searchCondition", commandMap.get("searchCondition") == null ? "" : (String) commandMap.get("searchCondition"));
        
        model.addAttribute("srchwrdManageId", commandMap.get("srchwrdManageId") == null ? "" : (String) commandMap.get("srchwrdManageId"));

        int totCnt = (Integer) egovRecentSrchwrdService.selectRecentSrchwrdResultListCnt(searchVO);
        paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);

        return "egovframework/com/uss/ion/rsm/EgovRecentSrchwrdResultList";
    }
    
    /**
     * 최근검색어 결과를 조회한다.
     * @param searchVO
     * @param model
     * @return "egovframework/com/uss/ion/rsm/EgovOnlinePollList"
     * @throws Exception
     */
    @RequestMapping(value = "/uss/ion/rsm/listRecentSrchwrdResultSerach.do")
    protected ModelAndView egovRecentSrchwrdResultSerachList( 
            @RequestParam("searchKeyword") String searchKeyword,
            RecentSrchwrd recentSrchwrd
            ) throws Exception {
        
        recentSrchwrd.setQ(searchKeyword);
        log.debug("recentSrchwrd : " + recentSrchwrd);
        
        ModelAndView model = new ModelAndView(new AjaxXmlView());
        
        List reusltList = egovRecentSrchwrdService.selectRecentSrchwrdResultInquire(recentSrchwrd);
        
        AjaxXmlBuilder ajaxXmlBuilder = new AjaxXmlBuilder();
        
        EgovMap emResult = new EgovMap();
        for(int i=0;i < reusltList.size(); i++){
            emResult = (EgovMap)reusltList.get(i);
            ajaxXmlBuilder.addItem((String)emResult.get("recentSrchwrdNm"), (String)emResult.get("recentSrchwrdNm"), false);
        }
        
        model.addObject("ajaxXml",ajaxXmlBuilder.toString());
        
        return model;
    }

    
    /**
     * 최근검색어를 등록한다.
     * @param commandMap
     * @param recentSrchwrd
     * @param model
     * @return 
     * @throws Exception
     */
    @RequestMapping(value = "/uss/ion/rsm/registRecentSrchwrdResult.do")
    public void egovRecentSrchwrdRegist(
            Map commandMap,
            HttpServletResponse response,
            RecentSrchwrd recentSrchwrd
            ) throws Exception {

       response.setHeader("Content-Type", "text/html;charset=utf-8");
       PrintWriter out = new PrintWriter(new OutputStreamWriter(response.getOutputStream(),"UTF-8"));
      
        
       log.debug("commandMap : " + commandMap);
       log.debug("recentSrchwrd : " + recentSrchwrd);
        
       // 로그인 객체 선언
       LoginVO loginVO = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
       //아이디 설정
       recentSrchwrd.setFrstRegisterId((String)loginVO.getUniqId());
       recentSrchwrd.setLastUpdusrId((String)loginVO.getUniqId());
       
       egovRecentSrchwrdService.insertRecentSrchwrdResult(recentSrchwrd);
       
       out.print("Success");
       out.flush();
      
    }


}

/*
 * Copyright 2011 MOPAS(Ministry of Public Administration and Security).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.rte.rex.gds.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import egovframework.rte.rex.com.service.SearchVO;
import egovframework.rte.rex.gds.service.EgovGoodsService;
import egovframework.rte.rex.gds.service.GoodsVO;

/**
 * 품목 정보를 관리하는 컨트롤러 클래스를 정의한다.
 * @author 실행환경 개발팀 신혜연
 * @since 2011.07.11
 * @version 1.0
 * @see 
 * <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2011.07.11  신혜연          최초 생성
 * 
 * </pre>
 */
@Controller
@SessionAttributes(types = GoodsVO.class)
public class EgovGoodsController {

	/**EgovGoodsService */
	@Resource(name = "goodsService")
	protected EgovGoodsService egovGoodsService;

	/** EgovPropertyService */
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertiesService;

	/**
	 * 품목을 조회한다.
	 * @param searchVO 조건검색
	 * @param model
	 * @return "/gds/EgovGoodsList"
	 * @throws Exception
	 */
	@RequestMapping(value = "/gds/selectListGoods.do")
	public String selectGoodsList(
			@ModelAttribute("searchVO") SearchVO searchVO, ModelMap model)
			throws Exception {

		/** EgovPropertyService.sample */
		searchVO.setPageUnit(propertiesService.getInt("pageUnit"));
		searchVO.setPageSize(propertiesService.getInt("pageSize"));

		/** pageing setting */
		PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(searchVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(searchVO.getPageUnit());
		paginationInfo.setPageSize(searchVO.getPageSize());

		searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		searchVO.setLastIndex(paginationInfo.getLastRecordIndex());
		searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());

		List goodsList = egovGoodsService.selectGoodsList(searchVO);
		model.addAttribute("resultList", goodsList);

		int totCnt = egovGoodsService.selectGoodsListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
		model.addAttribute("paginationInfo", paginationInfo);

		return "/gds/EgovGoodsList";
	}
	
	/**
	 * 품목리스트를 엑셀파일로 출력한다.
	 * @param searchVO 검색조건
	 * @return 엑셀파일
	 * @throws Exception
	 */
	@RequestMapping("/gds/excelDownload.do")
	public ModelAndView excelDownload(@ModelAttribute("searchVO") SearchVO searchVO) throws Exception{
		
		List<GoodsVO> goodsList = egovGoodsService.selectGoodsXml(searchVO);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("goodsList", goodsList);
		
		return new ModelAndView("goodsExcelView", map);
	}
}

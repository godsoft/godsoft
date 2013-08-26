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
package egovframework.rte.rex.gds.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.rex.com.service.SearchVO;
import egovframework.rte.rex.gds.service.EgovGoodsService;
import egovframework.rte.rex.gds.service.GoodsVO;

/**
 * 품목정보에 관한 비지니스 클래스를 정의한다.
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
@Service("goodsService")
public class EgovGoodsServiceImpl extends AbstractServiceImpl implements EgovGoodsService{
	
	/** GoodsDAO */
	@Resource(name="goodsDAO")
	private GoodsDAO goodsDAO; // GoodsDAO
	
	
	/**
	 * 품목정보를 조회한다.
	 * @param searchVO
	 * @return List<GoodsVO> 품목리스트
	 * @throws Exception
	 */
	public List<GoodsVO> selectGoodsList(SearchVO searchVO) throws Exception
	{
		return goodsDAO.selectGoodsList(searchVO);
	}

	/**
	 * 품목리스트의 갯수를 조회한다.
	 * @param searchVO 검색조건
	 * @return int 상품 갯수
	 */
	public int selectGoodsListTotCnt(SearchVO searchVO) {
			
		return goodsDAO.selectGoodsListTotCnt(searchVO);
	}

	/**
	 * 품목 정보를 조회한다.(xml, excel)
	 * @param searchVO 조건검색
	 * @return List<GoodsVO> 상품정보
	 * @throws Exception
	 */
	public List<GoodsVO> selectGoodsXml(SearchVO searchVO) throws Exception
	{
		return goodsDAO.selectGoodsXml(searchVO);
	}
}

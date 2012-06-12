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

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.rex.com.service.SearchVO;
import egovframework.rte.rex.gds.service.GoodsVO;

/**
 * 품목 정보에 관한 데이터 접근 클래스를 정의한다.
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
@Repository("goodsDAO")
public class GoodsDAO extends EgovAbstractDAO{
	
	/**
	 * 데이터 베이스에서 품목 목록을 가져온다.
	 * @param searchVO
	 * @return List<GoodsVO> 품목정보 리스트
	 * @throws Exception
	 */
	public List<GoodsVO> selectGoodsList(SearchVO searchVO) throws Exception
	{
		return list("goodsDAO.selectGoodsList", searchVO);
	}

	/**
	 * 데이터 베이스에서 품목의 총 갯수를 조회한다.
	 * @param searchVO 검색조건
	 * @return int 상품 갯수
	 */
	public int selectGoodsListTotCnt(SearchVO searchVO) {
	        return (Integer)getSqlMapClientTemplate().queryForObject("goodsDAO.selectGoodsListTotCnt", searchVO);
	    }
	
	/** 
	 * 데이터 베이스에서 품목정보를 조회한다.(xml, Excel용)
	 * @return List<GoodsVO> 상품정보
	 */
	public List<GoodsVO> selectGoodsXml(SearchVO searchVO) throws Exception
	{
		return list("goodsDAO.selectGoodsXml", searchVO);
	}
}

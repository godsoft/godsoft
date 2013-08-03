package godsoft.codegen.alltabcols.service.impl;

import godsoft.codegen.alltabcols.service.AllTabColsVO;

import org.springframework.stereotype.Repository;

import antlr.collections.List;

@Repository("allTabColsDAO")
public class AllTabColsDAO extends EgovAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectAllTabColsList(AllTabColsVO allTabColsVO)
			throws Exception {
		return list("allTabColsDAO.selectAllTabColsList", allTabColsVO);
	}

}

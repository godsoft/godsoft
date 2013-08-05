package godsoft.codegen.alltabcols.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.alltabcols.service.AllTabColsVO;

@Repository("allTabColsDAO")
public class AllTabColsDAO extends EgovAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectAllTabColsList(AllTabColsVO allTabColsVO) throws Exception {
		return list("allTabColsDAO.selectAllTabColsList", allTabColsVO);
	}

}

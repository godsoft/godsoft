package godsoft.egov.codegen.alltabcols.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.egov.codegen.cmm.OracleVO;

@Repository("godsoft.codegen.alltabcols.allTabColsDAO")
public class AllTabColsDAO extends EgovAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectAllTabColsList(OracleVO oracleVO) throws Exception {
		return list("godsoft.codegen.alltabcols.allTabColsDAO.selectAllTabColsList", oracleVO);
	}

}

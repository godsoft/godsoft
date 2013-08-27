package godsoft.codegen.oracle.alltabcols.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.cmm.OracleVO;

@Repository("allTabColsDAO")
public class AllTabColsDAO extends EgovAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectAllTabColsList(OracleVO oracleVO) throws Exception {
		return list("allTabColsDAO.selectAllTabColsList", oracleVO);
	}

}

package godsoft.codegen.oracle.alltabcols.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.cmm.OracleVO;
import godsoft.codegen.oracle.alltabcols.service.AllTabColsService;

@Service("allTabColsService")
public class AllTabColsServiceImpl extends AbstractServiceImpl implements AllTabColsService {

	@Resource(name = "allTabColsDAO")
	private AllTabColsDAO allTabColsDAO;

	public List<EgovMap> selectAllTabColsList(OracleVO oracleVO) throws Exception {
		return allTabColsDAO.selectAllTabColsList(oracleVO);
	}

}

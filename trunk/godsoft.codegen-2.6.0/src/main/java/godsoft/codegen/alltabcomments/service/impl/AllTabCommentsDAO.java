package godsoft.codegen.alltabcomments.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.cmm.OracleVO;

@Repository("godsoft.codegen.alltabcomments.allTabCommentsDAO")
public class AllTabCommentsDAO extends EgovAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectAllTabCommentsList(OracleVO oracleVO) throws Exception {
		return list("godsoft.codegen.alltabcomments.allTabCommentsDAO.selectAllTabCommentsList", oracleVO);
	}

}

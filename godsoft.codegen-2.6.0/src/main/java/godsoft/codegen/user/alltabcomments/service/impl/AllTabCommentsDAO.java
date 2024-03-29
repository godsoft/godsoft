package godsoft.codegen.user.alltabcomments.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.cmm.OracleVO;

@Repository("godsoft.codegen.user.alltabcomments.allTabCommentsDAO")
public class AllTabCommentsDAO extends EgovAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectAllTabCommentsList(OracleVO oracleVO) throws Exception {
		return list("godsoft.codegen.user.alltabcomments.allTabCommentsDAO.selectAllTabCommentsList", oracleVO);
	}

}

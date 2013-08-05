package godsoft.codegen.alltabcomments.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import godsoft.codegen.alltabcomments.service.AllTabCommentsVO;

@Repository("allTabCommentsDAO")
public class AllTabCommentsDAO extends EgovAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectAllTabCommentsList(AllTabCommentsVO allTabCommentsVO) throws Exception {
		return list("allTabCommentsDAO.selectAllTabCommentsList", allTabCommentsVO);
	}

}

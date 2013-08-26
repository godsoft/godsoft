package model;

/**
 * 
 * 엔티티 정보 클래스
 * <p>
 * <b>NOTE:</b> 어트리뷰트(데이터베이스 테이블) 정보를 담기위한 모델 클래스
 * 
 * @author 개발환경 개발팀 이흥주
 * @since 2009.08.03
 * @version 1.0
 * @see
 * 
 *      <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2009.08.03  이흥주          최초 생성
 * 
 * </pre>
 */
public class Entity extends NameCasing {

	private String tableComment;

	public String getTableComment() {
		return tableComment;
	}

	public void setTableComment(String tableComment) {
		this.tableComment = tableComment;
	}

	/**
	 * 생성자
	 * 
	 * @param name
	 */
	public Entity(String name) {
		super(name);
	}

}

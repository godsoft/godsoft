package model;

/**
 * 
 * 어트리뷰트 정보 클래스
 * <p>
 * <b>NOTE:</b> 어트리뷰트(데이터베이스 특정 테이블의 컬럼) 정보를 담기위한 모델 클래스
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
public class Attribute extends NameCasing {

	/**
	 * 생성자
	 * 
	 * @param name
	 */
	public Attribute(String name) {
		super(name);
	}

	/**
	 * 타입
	 */
	private String type;
	/**
	 * 자바 타입
	 */
	private String javaType;

	private String columnComment;

	private boolean primaryKey;

	/**
	 * 자바 타입 정보 가져오기
	 * 
	 * @return
	 */
	public String getJavaType() {
		return javaType;
	}

	/**
	 * 자바 타입 정보 세팅하기
	 * 
	 * @param javaType
	 */
	public void setJavaType(String javaType) {
		this.javaType = javaType;
	}

	/**
	 * 타입 정보 가져오기
	 * 
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * 타입 정보 세팅하기
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	public String getColumnComment() {
		return columnComment;
	}

	public void setColumnComment(String columnComment) {
		this.columnComment = columnComment;
	}

	public boolean getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(boolean primaryKey) {
		this.primaryKey = primaryKey;
	}

	@Override
	public String toString() {
		return "Attribute [type=" + type + ", javaType=" + javaType
				+ ", columnComment=" + columnComment + ", primaryKey="
				+ primaryKey + "]";
	}
}

package model;

import java.util.List;

/**
 * 
 * 데이터베이스 Context 클래스
 * <p>
 * <b>NOTE:</b> 데이터베이스 정보 및 테이블, 컬럼 정보를 담기위한 클래스
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
public class DataModelContext {
	/**
	 * 만든이
	 */
	private String author;
	/**
	 * 생성일
	 */
	private String createDate;
	/**
	 * 팀 정보
	 */
	private String team;

	/**
	 * 저자 정보 가져오기
	 * 
	 * @return
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * 팀정보 가져오기
	 * 
	 * 
	 * @return
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * 팀 세팅하기
	 * 
	 * @param team
	 */
	public void setTeam(String team) {
		this.team = team;
	}

	/**
	 * 저자 세팅하기
	 * 
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * 생성일 가져오기
	 * 
	 * @return
	 */
	public String getCreateDate() {
		return createDate;
	}

	/**
	 * 생성일 세팅하기
	 * 
	 * @param createDate
	 */
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	/**
	 * 패키지명
	 */
	private String packageName;

	/**
	 * 패키지명 가져오기
	 * 
	 * @return
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * 패키지명 세팅하기
	 * 
	 * @param packageName
	 */
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	/**
	 * 모델 객체
	 */
	private Entity entity;

	/**
	 * 속성 목록
	 */
	private List<Attribute> attributes;
	/**
	 * 기본키 속성 목록
	 */
	private List<Attribute> primaryKeys;

	/**
	 * 기본키 목록 가져오기
	 * 
	 * @return
	 */
	public List<Attribute> getPrimaryKeys() {
		return primaryKeys;
	}

	/**
	 * 기본키 목록 세팅하기
	 * 
	 * @param primaryKeys
	 */
	public void setPrimaryKeys(List<Attribute> primaryKeys) {
		this.primaryKeys = primaryKeys;
	}

	/**
	 * 모델 객체 가져오기
	 * 
	 * @return
	 */
	public Entity getEntity() {
		return entity;
	}

	/**
	 * 모델 객체 세팅하기
	 * 
	 * @param entity
	 */
	public void setEntity(Entity entity) {
		this.entity = entity;
	}

	/**
	 * 속성 목록 가져오기
	 * 
	 * @return
	 */
	public List<Attribute> getAttributes() {
		return attributes;
	}

	/**
	 * 속성 목록 세팅하기
	 * 
	 * @param attributes
	 */
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	private String vender;

	public String getVender() {
		return vender;
	}

	public void setVender(String vender) {
		this.vender = vender;
	}
}

/*
 * Copyright 2008-2009 MOPAS(Ministry of Public Administration and Security).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package godsoft.codegen.cmm;

import java.util.List;

/**
 * 
 * 데이터베이스 Context 클래스
 * <p><b>NOTE:</b> 데이터베이스 정보 및 테이블, 컬럼 정보를 담기위한 클래스
 * 
 * @author 개발환경 개발팀 이흥주
 * @since 2009.08.03
 * @version 1.0
 * @see
 *
 * <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2009.08.03  이흥주          최초 생성
 *
 * </pre>
 */
public class DataModelContext {

	/** 데이터베이스 벤더 */
	private String vender;
	/** 데이터베이스 제품 명 */
	private String databaseProductName;
	/** 엔티티(테이블) 정보 */
	private Entity entity;
	/** 어트리뷰트(컬럼) 정보 */
	private List<Attribute> attributes;
	/** 기본키 컬럼 정보 */
	private List<Attribute> primaryKeys;

	// 추가
	private String author;
	private String createDate;
	private String topLevelPackage;
	private String middleLevelPackage;
	//	private String voPackage;

	private String projectLocation;

	private List<String> sqlMaps;
	private List<String> jqGridMenus;
	private List<DataModelContext> dataModelContexts;

	private CodeGenPackage codeGenPackage;
	private CodeGenPathname codeGenPathname;

	/**
	 * 데이타베이스 제품명
	 * @return
	 */
	public String getDatabaseProductName() {
		return databaseProductName;
	}

	/**
	 * 데이타베이스 제품명 세팅하기
	 * @param databaseProductName
	 */
	public void setDatabaseProductName(String databaseProductName) {
		this.databaseProductName = databaseProductName;
	}

	/**
	 * 벤더 정보 가져오기
	 * @return
	 */
	public String getVender() {
		return vender;
	}

	/**
	 * 벤더 정보 세팅하기
	 * @param vender
	 */
	public void setVender(String vender) {
		this.vender = vender;
	}

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
	 * @param primaryKeys
	 */
	public void setPrimaryKeys(List<Attribute> primaryKeys) {
		this.primaryKeys = primaryKeys;
	}

	/**
	 * 엔티티 가져오기
	 * @return
	 */
	public Entity getEntity() {
		return entity;
	}

	/**
	 * 엔티티 세팅하기
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getTopLevelPackage() {
		return topLevelPackage;
	}

	public void setTopLevelPackage(String topLevelPackage) {
		this.topLevelPackage = topLevelPackage;
	}

	//	public String getVoPackage() {
	//		return voPackage;
	//	}
	//
	//	public void setVoPackage(String voPackage) {
	//		this.voPackage = voPackage;
	//	}

	public String getMiddleLevelPackage() {
		return middleLevelPackage;
	}

	public void setMiddleLevelPackage(String middleLevelPackage) {
		this.middleLevelPackage = middleLevelPackage;
	}

	public String getProjectLocation() {
		return projectLocation;
	}

	public void setProjectLocation(String projectLocation) {
		this.projectLocation = projectLocation;
	}

	public List<String> getSqlMaps() {
		return sqlMaps;
	}

	public void setSqlMaps(List<String> sqlMaps) {
		this.sqlMaps = sqlMaps;
	}

	public List<String> getJqGridMenus() {
		return jqGridMenus;
	}

	public void setJqGridMenus(List<String> jqGridMenus) {
		this.jqGridMenus = jqGridMenus;
	}

	public List<DataModelContext> getDataModelContexts() {
		return dataModelContexts;
	}

	public void setDataModelContexts(List<DataModelContext> dataModelContexts) {
		this.dataModelContexts = dataModelContexts;
	}

	public CodeGenPackage getCodeGenPackage() {
		return codeGenPackage;
	}

	public void setCodeGenPackage(DataModelContext dataModelContext) {
		this.codeGenPackage = new CodeGenPackage(dataModelContext);
	}

	public CodeGenPathname getCodeGenPathname() {
		return codeGenPathname;
	}

	public void setCodeGenPathname(DataModelContext dataModelContext) {
		this.codeGenPathname = new CodeGenPathname(dataModelContext);
	}

}

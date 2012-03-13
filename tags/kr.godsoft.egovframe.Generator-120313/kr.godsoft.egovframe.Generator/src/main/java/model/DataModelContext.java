package model;

import java.util.List;

import utils.NamingUtils;

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

	public String getPackageNamePath() {
		return packageName.replaceAll("\\.", "/");
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

	private String voPackage;

	private String servicePackage;

	private String implPackage;

	private String daoPackage;

	private String controllerPackage;

	public String getVoPackage() {
		return voPackage;
	}

	public void setVoPackage(String voPackage) {
		this.voPackage = voPackage;
	}

	public void setVoPackage(Entity entity) {
		StringBuffer stringBuffer = new StringBuffer();

		stringBuffer.append(packageName);
		stringBuffer.append(".");
		stringBuffer.append(entity.getLcName());
		stringBuffer.append(".service");

		this.voPackage = stringBuffer.toString();

		this.servicePackage = this.voPackage;
	}

	public String getServicePackage() {
		return servicePackage;
	}

	public void setServicePackage(String servicePackage) {
		this.servicePackage = servicePackage;
	}

	public String getImplPackage() {
		return implPackage;
	}

	public void setImplPackage(String implPackage) {
		this.implPackage = implPackage;
	}

	public String getDaoPackage() {
		return daoPackage;
	}

	public void setDaoPackage(String daoPackage) {
		this.daoPackage = daoPackage;
	}

	public void setDaoPackage(Entity entity) {
		StringBuffer stringBuffer = new StringBuffer();

		stringBuffer.append(packageName);
		stringBuffer.append(".");
		stringBuffer.append(entity.getLcName());
		stringBuffer.append(".service.impl");

		this.daoPackage = stringBuffer.toString();

		this.implPackage = this.daoPackage;
	}

	public String getControllerPackage() {
		return controllerPackage;
	}

	public void setControllerPackage(String controllerPackage) {
		this.controllerPackage = controllerPackage;
	}

	public void setControllerPackage(Entity entity) {
		StringBuffer stringBuffer = new StringBuffer();

		stringBuffer.append(packageName);
		stringBuffer.append(".");
		stringBuffer.append(entity.getLcName());
		stringBuffer.append(".web");

		this.controllerPackage = stringBuffer.toString();
	}

	private String projectPath;

	public String getProjectPath() {
		return projectPath;
	}

	public void setProjectPath(String projectPath) {
		this.projectPath = projectPath;
	}

	private boolean isWriteStringToFile;

	public boolean getIsWriteStringToFile() {
		return isWriteStringToFile;
	}

	public void setIsWriteStringToFile(boolean isWriteStringToFile) {
		this.isWriteStringToFile = isWriteStringToFile;
	}

	private String pathnameSqlMap;

	public String getPathnameSqlMap() {
		return pathnameSqlMap;
	}

	/**
	 * SqlMap 경로
	 * 
	 * @param dataModelContext
	 * @return String pathnameSqlMap
	 */
	public void setPathnameSqlMap(DataModelContext dataModelContext) {
		StringBuffer pathname = new StringBuffer();

		pathname.append(dataModelContext.getProjectPath());
		pathname.append("src/main/resources/");
		pathname.append(dataModelContext.getPackageName()
				.replaceAll("\\.", "/"));
		pathname.append("/sqlmap/");
		pathname.append(dataModelContext.getEntity().getLcName());
		pathname.append("/");
		pathname.append(dataModelContext.getEntity().getPcName());
		pathname.append("_SQL_");
		pathname.append(NamingUtils
				.convertUppercaseFirstLetter(dataModelContext.getVender()));
		pathname.append(".xml");

		this.pathnameSqlMap = pathname.toString();
	}

	private String pathnameService;

	public String getPathnameService() {
		return pathnameService;
	}

	/**
	 * Service 경로
	 * 
	 * @param dataModelContext
	 * @return String pathnameService
	 */
	public void setPathnameService(DataModelContext dataModelContext) {
		StringBuffer pathname = new StringBuffer();

		pathname.append(dataModelContext.getProjectPath());
		pathname.append("src/main/java/");
		pathname.append(dataModelContext.getPackageName()
				.replaceAll("\\.", "/"));
		pathname.append("/");
		pathname.append(dataModelContext.getEntity().getLcName());
		pathname.append("/service/");
		pathname.append(dataModelContext.getEntity().getPcName());
		pathname.append("Service.java");

		this.pathnameService = pathname.toString();
	}

	private String pathnameDefaultVO;

	public String getPathnameDefaultVO() {
		return pathnameDefaultVO;
	}

	/**
	 * DefaultVO 경로
	 * 
	 * @param dataModelContext
	 * @return String pathnameDefaultVO
	 */
	public void setPathnameDefaultVO(DataModelContext dataModelContext) {
		StringBuffer pathname = new StringBuffer();

		pathname.append(dataModelContext.getProjectPath());
		pathname.append("src/main/java/");
		pathname.append(dataModelContext.getPackageName()
				.replaceAll("\\.", "/"));
		pathname.append("/");
		pathname.append(dataModelContext.getEntity().getLcName());
		pathname.append("/service/");
		pathname.append(dataModelContext.getEntity().getPcName());
		pathname.append("DefaultVO.java");

		this.pathnameDefaultVO = pathname.toString();
	}

	private String pathnameVO;

	public String getPathnameVO() {
		return pathnameVO;
	}

	/**
	 * DefaultVO 경로
	 * 
	 * @param dataModelContext
	 * @return String pathnameVO
	 */
	public void setPathnameVO(DataModelContext dataModelContext) {
		StringBuffer pathname = new StringBuffer();

		pathname.append(dataModelContext.getProjectPath());
		pathname.append("src/main/java/");
		pathname.append(dataModelContext.getPackageName()
				.replaceAll("\\.", "/"));
		pathname.append("/");
		pathname.append(dataModelContext.getEntity().getLcName());
		pathname.append("/service/");
		pathname.append(dataModelContext.getEntity().getPcName());
		pathname.append("VO.java");

		this.pathnameVO = pathname.toString();
	}

	private String pathnameServiceImpl;

	public String getPathnameServiceImpl() {
		return pathnameServiceImpl;
	}

	/**
	 * ServiceImpl 경로
	 * 
	 * @param dataModelContext
	 * @return String pathnameServiceImpl
	 */
	public void setPathnameServiceImpl(DataModelContext dataModelContext) {
		StringBuffer pathname = new StringBuffer();

		pathname.append(dataModelContext.getProjectPath());
		pathname.append("src/main/java/");
		pathname.append(dataModelContext.getPackageName()
				.replaceAll("\\.", "/"));
		pathname.append("/");
		pathname.append(dataModelContext.getEntity().getLcName());
		pathname.append("/service/impl/");
		pathname.append(dataModelContext.getEntity().getPcName());
		pathname.append("ServiceImpl.java");

		this.pathnameServiceImpl = pathname.toString();
	}

	private String pathnameDAO;

	public String getPathnameDAO() {
		return pathnameDAO;
	}

	/**
	 * DAO 경로
	 * 
	 * @param dataModelContext
	 * @return String pathnameDAO
	 */
	public void setPathnameDAO(DataModelContext dataModelContext) {
		StringBuffer pathname = new StringBuffer();

		pathname.append(dataModelContext.getProjectPath());
		pathname.append("src/main/java/");
		pathname.append(dataModelContext.getPackageName()
				.replaceAll("\\.", "/"));
		pathname.append("/");
		pathname.append(dataModelContext.getEntity().getLcName());
		pathname.append("/service/impl/");
		pathname.append(dataModelContext.getEntity().getPcName());
		pathname.append("DAO.java");

		this.pathnameDAO = pathname.toString();
	}

	private String pathnameController;

	public String getPathnameController() {
		return pathnameController;
	}

	/**
	 * Controller 경로
	 * 
	 * @param dataModelContext
	 * @return String pathnameController
	 */
	public void setPathnameController(DataModelContext dataModelContext) {
		StringBuffer pathname = new StringBuffer();

		pathname.append(dataModelContext.getProjectPath());
		pathname.append("src/main/java/");
		pathname.append(dataModelContext.getPackageName()
				.replaceAll("\\.", "/"));
		pathname.append("/");
		pathname.append(dataModelContext.getEntity().getLcName());
		pathname.append("/web/");
		pathname.append(dataModelContext.getEntity().getPcName());
		pathname.append("Controller.java");

		this.pathnameController = pathname.toString();
	}

	private String pathnameListView;

	public String getPathnameListView() {
		return pathnameListView;
	}

	/**
	 * ListView 경로
	 * 
	 * @param dataModelContext
	 * @return String pathnameListView
	 */
	public void setPathnameListView(DataModelContext dataModelContext) {
		StringBuffer pathname = new StringBuffer();

		pathname.append(dataModelContext.getProjectPath());
		pathname.append("src/main/webapp/WEB-INF/jsp/");
		// pathname.append(dataModelContext.getPackageName()
		// .replaceAll("\\.", "/"));
		// pathname.append("/");
		pathname.append("egovframework/rte/");
		pathname.append(dataModelContext.getEntity().getCcName());
		pathname.append("/");
		pathname.append(dataModelContext.getEntity().getPcName());
		pathname.append("List.jsp");

		this.pathnameListView = pathname.toString();
	}

	private String pathnameRegisterView;

	public String getPathnameRegisterView() {
		return pathnameRegisterView;
	}

	/**
	 * RegisterView 경로
	 * 
	 * @param dataModelContext
	 * @return String pathnameRegisterView
	 */
	public void setPathnameRegisterView(DataModelContext dataModelContext) {
		StringBuffer pathname = new StringBuffer();

		pathname.append(dataModelContext.getProjectPath());
		pathname.append("src/main/webapp/WEB-INF/jsp/");
		// pathname.append(dataModelContext.getPackageName()
		// .replaceAll("\\.", "/"));
		// pathname.append("/");
		pathname.append("egovframework/rte/");
		pathname.append(dataModelContext.getEntity().getCcName());
		pathname.append("/");
		pathname.append(dataModelContext.getEntity().getPcName());
		pathname.append("Register.jsp");

		this.pathnameRegisterView = pathname.toString();
	}

	private String sqlMapConfigPathname;

	public String getSqlMapConfigPathname() {
		return sqlMapConfigPathname;
	}

	/**
	 * sqlMapConfigPathname 경로
	 * 
	 * @param dataModelContext
	 * @return String pathnameRegisterView
	 */
	public void setSqlMapConfigPathname(DataModelContext dataModelContext) {
		StringBuffer pathname = new StringBuffer();

		pathname.append(dataModelContext.getProjectPath());
		pathname.append("src/main/resources/egovframework/sqlmap/rte/sql-map-config.xml");

		this.sqlMapConfigPathname = pathname.toString();
	}

	private String sqlMapResource;

	public String getSqlMapResource() {
		return sqlMapResource;
	}

	/**
	 * sqlMapResource 경로
	 * 
	 * @param dataModelContext
	 * @return String sqlMapResource
	 */
	public void setSqlMapResource(DataModelContext dataModelContext) {
		StringBuffer pathname = new StringBuffer();

		pathname.append("    <sqlMap resource=\"");
		pathname.append(dataModelContext.getPackageNamePath());
		pathname.append("/sqlmap/");
		pathname.append(dataModelContext.getEntity().getLcName());
		pathname.append("/");
		pathname.append(dataModelContext.getEntity().getPcName());
		pathname.append("_SQL_");
		pathname.append(NamingUtils
				.convertUppercaseFirstLetter(dataModelContext.getVender()));
		pathname.append(".xml\"/>");

		this.sqlMapResource = pathname.toString();
	}

	public String getProjectSrcMainJavaPath() {
		StringBuffer stringBuffer = new StringBuffer();

		stringBuffer.append(projectPath);
		stringBuffer.append("src/main/java/");
		stringBuffer.append(getPackageNamePath());

		return stringBuffer.toString();
	}

	public String getProjectSrcMainResourcesPath() {
		StringBuffer stringBuffer = new StringBuffer();

		stringBuffer.append(projectPath);
		stringBuffer.append("src/main/resources/");
		stringBuffer.append(getPackageNamePath());

		return stringBuffer.toString();
	}

	public String getProjectJspPath() {
		StringBuffer stringBuffer = new StringBuffer();

		stringBuffer.append(projectPath);
		stringBuffer.append("src/main/webapp/WEB-INF/jsp/");
		stringBuffer.append(getPackageNamePath());

		return stringBuffer.toString();
	}

	private String sqlMap;

	public String getSqlMap() {
		return sqlMap;
	}

	public void setSqlMap(String sqlMap) {
		this.sqlMap = sqlMap;
	}

	private String temp;

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	private String indexJspPathname;

	public String getIndexJspPathname() {
		return indexJspPathname;
	}

	public void setIndexJsp(DataModelContext dataModelContext) {
		// indexJspPathname
		StringBuilder indexJspPathnameStringBuilder = new StringBuilder();

		indexJspPathnameStringBuilder.append(dataModelContext.getProjectPath());
		indexJspPathnameStringBuilder.append("src/main/webapp/index.jsp");

		this.indexJspPathname = indexJspPathnameStringBuilder.toString();
	}

	@Override
	public String toString() {
		return "DataModelContext [author=" + author + ", createDate="
				+ createDate + ", team=" + team + ", packageName="
				+ packageName + ", entity=" + entity + ", attributes="
				+ attributes + ", primaryKeys=" + primaryKeys + ", vender="
				+ vender + ", voPackage=" + voPackage + ", servicePackage="
				+ servicePackage + ", implPackage=" + implPackage
				+ ", daoPackage=" + daoPackage + ", controllerPackage="
				+ controllerPackage + ", projectPath=" + projectPath
				+ ", isWriteStringToFile=" + isWriteStringToFile + "]";
	}

}
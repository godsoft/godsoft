package test;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import kr.godsoft.egovframe.generator.columns.java.ColumnsClient;
import kr.godsoft.egovframe.generator.columns.java.impl.ColumnsClientImpl;
import kr.godsoft.egovframe.generator.columns.service.ColumnsDefaultVO;
import model.Attribute;
import model.DataModelContext;
import model.Entity;
import operation.CrudCodeGen;

import org.incava.util.diff.Diff;
import org.incava.util.diff.Difference;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import egovframework.com.utl.fcc.service.EgovDateUtil;
import egovframework.rte.psl.dataaccess.util.EgovMap;

/**
 * 
 * CRUD 코드 생성 JUNIT 테스트 클래스
 * <p>
 * <b>NOTE:</b> CRUD 코드 생성 클래스
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
public class CrudCodeGenTest {
	/**
	 * 코드생성 인스턴스
	 */
	private static CrudCodeGen crudCodeGen;
	/**
	 * 데이타모델
	 */
	private static DataModelContext dataModel;

	// private SampleClient sampleClient;

	private static List<EgovMap> columns;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ColumnsClient columnsClient = new ColumnsClientImpl();

		ColumnsDefaultVO searchVO = new ColumnsDefaultVO();
		searchVO.setSearchCondition("1");
		searchVO.setSearchKeyword("egovfrm");
		searchVO.setRecordCountPerPage(1000);

		columns = columnsClient.selectColumnsList(searchVO);

		// for (int i = 0, size = columns.size(); i < size; i++) {
		// EgovMap egovMap = columns.get(i);
		//
		// // System.out.println("tableCatalog=" +
		// // egovMap.get("tableCatalog"));
		// System.out.println("tableSchema=" + egovMap.get("tableSchema"));
		// System.out.println("tableName=" + egovMap.get("tableName"));
		// System.out.println("columnName=" + egovMap.get("columnName"));
		// System.out.println("ordinalPosition="
		// + egovMap.get("ordinalPosition"));
		// System.out.println("columnDefault=" + egovMap.get("columnDefault"));
		// System.out.println("dataType=" + egovMap.get("dataType"));
		// System.out.println("characterMaximumLength="
		// + egovMap.get("characterMaximumLength"));
		// System.out.println("columnKey=" + egovMap.get("columnKey"));
		// System.out.println("columnComment=" + egovMap.get("columnComment"));
		// }
	}

	/**
	 * 설정
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		crudCodeGen = new CrudCodeGen();

		dataModel = new DataModelContext();

		dataModel.setPackageName("kr.godsoft.egovframe.test.sqlmap");
		dataModel.setAuthor("이백행");
		dataModel.setTeam("실행환경 개발팀");

		String currentDate = EgovDateUtil.getCurrentDate(null);
		System.out.println("currentDate=" + currentDate);

		dataModel.setCreateDate("2009.02.01");

		Entity entity = new Entity("SAMPLE2");

		dataModel.setEntity(entity);

		List<Attribute> attributes = new ArrayList<Attribute>();
		List<Attribute> primaryKeys = new ArrayList<Attribute>();

		// Attribute attr = new Attribute("ID");
		// attr.setJavaType("String");
		// attributes.add(attr);
		// primaryKeys.add(attr);
		//
		// attr = new Attribute("NAME");
		// attr.setJavaType("String");
		// attributes.add(attr);
		// // primaryKeys.add(attr);
		//
		// attr = new Attribute("DESCRIPTION");
		// attr.setJavaType("String");
		// attributes.add(attr);
		//
		// attr = new Attribute("USE_YN");
		// attr.setJavaType("String");
		// attributes.add(attr);
		//
		// attr = new Attribute("REG_USER");
		// attr.setJavaType("String");
		// attributes.add(attr);

		for (int i = 0, size = columns.size(); i < size; i++) {
			EgovMap egovMap = columns.get(i);

			Attribute attr = new Attribute(egovMap.get("columnName").toString());
			// attr.setJavaType("String");
			attr.setType(egovMap.get("dataType").toString());
			attributes.add(attr);
			// primaryKeys.add(attr);
		}

		dataModel.setAttributes(attributes);
		dataModel.setPrimaryKeys(primaryKeys);
	}

	/**
	 * 목표값과 비교
	 * 
	 * @param templateFile
	 * @param targetFile
	 * @throws Exception
	 */
	private void genAndDiff(String templateFile, String targetFile)
			throws Exception {
		String result = crudCodeGen.generate(dataModel, templateFile);
		String[] targetLines = readResource(targetFile);
		String[] sourceLines = readString(result);

		List<Difference> diffs = (new Diff<String>(sourceLines, targetLines))
				.diff();

		for (Difference diff : diffs) {
			int delStart = diff.getDeletedStart();
			int delEnd = diff.getDeletedEnd();
			int addStart = diff.getAddedStart();
			int addEnd = diff.getAddedEnd();
			String from = toString(delStart, delEnd);
			String to = toString(addStart, addEnd);
			String type = delEnd != Difference.NONE
					&& addEnd != Difference.NONE ? "c"
					: (delEnd == Difference.NONE ? "a" : "d");

			System.out.println(from + type + to);

			if (delEnd != Difference.NONE) {
				printLines(delStart, delEnd, "<", sourceLines);
				if (addEnd != Difference.NONE) {
					System.out.println("---");
				}
			}
			if (addEnd != Difference.NONE) {
				printLines(addStart, addEnd, ">", targetLines);
			}
		}

		assertEquals(diffs.size(), 0);
	}

	/**
	 * SQLMAP 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSQLMap() throws Exception {
		String templateFile = "templates/crud/src/main/resources/pkg/EgovSample_Sample2_SQL.vm";
		String targetFile = "templates/crud/src/main/resources/pkg/EgovSample_Sample2_SQL.xml";

		genAndDiff(templateFile, targetFile);
	}

	/**
	 * 서비스 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testService() throws Exception {
		String templateFile = "templates/crud/src/main/java/pkg/service/EgovSample2Service.vm";
		String targetFile = "templates/crud/src/main/java/pkg/service/EgovSample2Service.jav";

		genAndDiff(templateFile, targetFile);
	}

	/**
	 * 
	 * vo 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testVO() throws Exception {
		String templateFile = "templates/crud/src/main/java/pkg/service/Sample2VO.vm";
		String targetFile = "templates/crud/src/main/java/pkg/service/Sample2VO.jav";

		genAndDiff(templateFile, targetFile);
	}

	/**
	 * 서비스 구현체 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testServiceImpl() throws Exception {
		String templateFile = "templates/crud/src/main/java/pkg/service/impl/EgovSample2ServiceImpl.vm";
		String targetFile = "templates/crud/src/main/java/pkg/service/impl/EgovSample2ServiceImpl.jav";

		genAndDiff(templateFile, targetFile);
	}

	/**
	 * dao 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testDAO() throws Exception {
		String templateFile = "templates/crud/src/main/java/pkg/service/impl/Sample2DAO.vm";
		String targetFile = "templates/crud/src/main/java/pkg/service/impl/Sample2DAO.jav";

		genAndDiff(templateFile, targetFile);
	}

	/**
	 * 컨트롤러 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testController() throws Exception {
		String templateFile = "templates/crud/src/main/java/pkg/web/EgovSample2Controller.vm";
		String targetFile = "templates/crud/src/main/java/pkg/web/EgovSample2Controller.jav";

		genAndDiff(templateFile, targetFile);
	}

	/**
	 * 목록 뷰 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testListView() throws Exception {
		String templateFile = "templates/crud/src/webapp/WEB-INF/jsp/pkg/egovSample2List.vm";
		String targetFile = "templates/crud/src/webapp/WEB-INF/jsp/pkg/egovSample2List.jsp";

		genAndDiff(templateFile, targetFile);
	}

	/**
	 * 등록 뷰 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testRegisterView() throws Exception {
		String templateFile = "templates/crud/src/webapp/WEB-INF/jsp/pkg/egovSample2Register.vm";
		String targetFile = "templates/crud/src/webapp/WEB-INF/jsp/pkg/egovSample2Register.jsp";

		genAndDiff(templateFile, targetFile);
	}

	/**
	 * 라인 출력
	 * 
	 * @param start
	 * @param end
	 * @param ind
	 * @param lines
	 */
	protected void printLines(int start, int end, String ind, String[] lines) {
		for (int lnum = start; lnum <= end; ++lnum) {
			System.out.println(ind + " " + lines[lnum]);
		}
	}

	/**
	 * 스트링 변환
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	protected String toString(int start, int end) {
		// adjusted, because file lines are one-indexed, not zero.

		StringBuffer buf = new StringBuffer();

		// match the line numbering from diff(1):
		buf.append(end == Difference.NONE ? start : (1 + start));

		if (end != Difference.NONE && start != end) {
			buf.append(",").append(1 + end);
		}
		return buf.toString();
	}

	/**
	 * 파일 리소스 읽기
	 * 
	 * @param fileName
	 * @return
	 */
	protected String[] readResource(String fileName) {
		try {
			InputStream is = getClass().getClassLoader().getResourceAsStream(
					fileName);
			InputStreamReader sr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(sr);
			List<String> contents = new ArrayList<String>();
			String in;
			while ((in = br.readLine()) != null) {
				contents.add(in);
			}
			return (String[]) contents.toArray(new String[] {});
		} catch (Exception e) {
			System.err.println("error reading " + fileName + ": " + e);
			System.exit(1);
			return null;
		}
	}

	/**
	 * 데이타를 스트링 배열로 변환
	 * 
	 * @param data
	 * @return
	 */
	protected String[] readString(String data) {
		try {
			StringReader sr = new StringReader(data);
			BufferedReader br = new BufferedReader(sr);
			List<String> contents = new ArrayList<String>();
			String in;
			while ((in = br.readLine()) != null) {
				contents.add(in);
			}
			return (String[]) contents.toArray(new String[] {});
		} catch (Exception e) {
			System.err.println("error reading " + e);
			System.exit(1);
			return null;
		}
	}
}

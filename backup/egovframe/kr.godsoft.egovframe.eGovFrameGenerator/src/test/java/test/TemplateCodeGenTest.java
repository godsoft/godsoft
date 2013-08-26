package test;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import operation.TemplateCodeGen;

import org.incava.util.diff.Diff;
import org.incava.util.diff.Difference;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * 템플릿 코드 생성 JUNIT 테스트 클래스
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
public class TemplateCodeGenTest {
	/**
	 * 템플릿 코드 생성
	 */
	private TemplateCodeGen templateCodeGen;
	/**
	 * 정보 맵
	 */
	private Map<String, String> map;

	/**
	 * 설정
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		templateCodeGen = new TemplateCodeGen();

	}

	/**
	 * 목표값과 비교
	 * 
	 * @param templateFile
	 * @param valueFile
	 * @param targetFile
	 * @throws Exception
	 */
	private void genAndDiff(String templateFile, String valueFile,
			String targetFile) throws Exception {
		// value Setting
		convertFile2Map(valueFile);
		// template code Gen
		String result = templateCodeGen.generate(map, templateFile);
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
	 * 캐쉬 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testCache() throws Exception {
		String templateFile = "eGovFrameTemplates/cache/cache.vm";
		String targetFile = "eGovFrameTemplatesTarget/cache/ehcache-default.xm";
		String valueFile = "eGovFrameTemplatesTestValue/cache/cache.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * Ehcache 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testEhcache() throws Exception {
		String templateFile = "eGovFrameTemplates/cache/ehcacheConfigForSpring.vm";
		String targetFile = "eGovFrameTemplatesTarget/cache/context-cache.xm";
		String valueFile = "eGovFrameTemplatesTestValue/cache/ehcache.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * DataSource 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testDataSource() throws Exception {
		String templateFile = "eGovFrameTemplates/datasource/c3p0.vm";
		String targetFile = "eGovFrameTemplatesTarget/datasource/datasource.xm";
		String valueFile = "eGovFrameTemplatesTestValue/datasource/datasource.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * Jndi Datasource 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testJndiDatasource() throws Exception {
		String templateFile = "eGovFrameTemplates/datasource/jeus.vm";
		String targetFile = "eGovFrameTemplatesTarget/datasource/jndiDatasource.xm";
		String valueFile = "eGovFrameTemplatesTestValue/datasource/jndiDatasource.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * DataSource Transaction 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testDataSourceTransaction() throws Exception {
		String templateFile = "eGovFrameTemplates/transaction/datasource.vm";
		String targetFile = "eGovFrameTemplatesTarget/transaction/datasourceTransaction.xm";
		String valueFile = "eGovFrameTemplatesTestValue/transaction/datasource.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * Jpa Transaction 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testJpaTransaction() throws Exception {
		String templateFile = "eGovFrameTemplates/transaction/jpa.vm";
		String targetFile = "eGovFrameTemplatesTarget/transaction/jpa.xm";
		String valueFile = "eGovFrameTemplatesTestValue/transaction/jpa.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * Jta Transaction 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testJtaTransaction() throws Exception {
		String templateFile = "eGovFrameTemplates/transaction/jta.vm";
		String targetFile = "eGovFrameTemplatesTarget/transaction/jta.xm";
		String valueFile = "eGovFrameTemplatesTestValue/transaction/jta.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * Sequence ID Gen 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSequenceIDGen() throws Exception {
		String templateFile = "eGovFrameTemplates/idGeneration/sequenceId.vm";
		String targetFile = "eGovFrameTemplatesTarget/idGeneration/sequenceId.xm";
		String valueFile = "eGovFrameTemplatesTestValue/idGeneration/sequenceId.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * Table ID Gen 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testTableIDGen() throws Exception {
		String templateFile = "eGovFrameTemplates/idGeneration/tableId.vm";
		String targetFile = "eGovFrameTemplatesTarget/idGeneration/tableId.xm";
		String valueFile = "eGovFrameTemplatesTestValue/idGeneration/tableId.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * UUID Gen 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testUUIDGen() throws Exception {
		String templateFile = "eGovFrameTemplates/idGeneration/uuId.vm";
		String targetFile = "eGovFrameTemplatesTarget/idGeneration/uuId.xm";
		String valueFile = "eGovFrameTemplatesTestValue/idGeneration/uuId.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * Property Config 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testPropertyConfig() throws Exception {
		String templateFile = "eGovFrameTemplates/property/property.vm";
		String targetFile = "eGovFrameTemplatesTarget/property/property.xm";
		String valueFile = "eGovFrameTemplatesTestValue/property/property.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * Datail Bean Job Schedule 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testDatailBeanJobSchedule() throws Exception {
		String templateFile = "eGovFrameTemplates/scheduling/beanJob.vm";
		String targetFile = "eGovFrameTemplatesTarget/scheduling/beanJob.xm";
		String valueFile = "eGovFrameTemplatesTestValue/scheduling/beanJob.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * Method Invoking Job Schedule 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testMethodInvokingJobSchedule() throws Exception {
		String templateFile = "eGovFrameTemplates/scheduling/methodJob.vm";
		String targetFile = "eGovFrameTemplatesTarget/scheduling/methodJob.xm";
		String valueFile = "eGovFrameTemplatesTestValue/scheduling/methodJob.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * Simple Trigger 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSimpleTrigger() throws Exception {
		String templateFile = "eGovFrameTemplates/scheduling/simpleTrigger.vm";
		String targetFile = "eGovFrameTemplatesTarget/scheduling/simpleTrigger.xm";
		String valueFile = "eGovFrameTemplatesTestValue/scheduling/simpleTrigger.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * Cron Trigger 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testCronTrigger() throws Exception {
		String templateFile = "eGovFrameTemplates/scheduling/cronTrigger.vm";
		String targetFile = "eGovFrameTemplatesTarget/scheduling/cronTrigger.xm";
		String valueFile = "eGovFrameTemplatesTestValue/scheduling/cronTrigger.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * Scheduler 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testScheduler() throws Exception {
		String templateFile = "eGovFrameTemplates/scheduling/scheduler.vm";
		String targetFile = "eGovFrameTemplatesTarget/scheduling/scheduler.xm";
		String valueFile = "eGovFrameTemplatesTestValue/scheduling/scheduler.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * Console Appender 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testConsoleAppender() throws Exception {
		String templateFile = "eGovFrameTemplates/logging/console.vm";
		String targetFile = "eGovFrameTemplatesTarget/logging/console.xm";
		String valueFile = "eGovFrameTemplatesTestValue/logging/console.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * File Appender 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testFileAppender() throws Exception {
		String templateFile = "eGovFrameTemplates/logging/file.vm";
		String targetFile = "eGovFrameTemplatesTarget/logging/file.xm";
		String valueFile = "eGovFrameTemplatesTestValue/logging/file.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * Rolling File Appender 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testRollingFileAppender() throws Exception {
		String templateFile = "eGovFrameTemplates/logging/rollingFile.vm";
		String targetFile = "eGovFrameTemplatesTarget/logging/rollingFile.xm";
		String valueFile = "eGovFrameTemplatesTestValue/logging/rollingFile.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * Daily Rolling File Appender 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testDailyRollingFileAppender() throws Exception {
		String templateFile = "eGovFrameTemplates/logging/dailyRollingFile.vm";
		String targetFile = "eGovFrameTemplatesTarget/logging/dailyRollingFile.xm";
		String valueFile = "eGovFrameTemplatesTestValue/logging/dailyRollingFile.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * JDBC Appender 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testJDBCAppender() throws Exception {
		String templateFile = "eGovFrameTemplates/logging/jdbc.vm";
		String targetFile = "eGovFrameTemplatesTarget/logging/jdbc.xm";
		String valueFile = "eGovFrameTemplatesTestValue/logging/jdbc.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * EgovDB Appender 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testEgovDBAppender() throws Exception {
		String templateFile = "eGovFrameTemplates/logging/egovDb.vm";
		String targetFile = "eGovFrameTemplatesTarget/logging/egovDb.xm";
		String valueFile = "eGovFrameTemplatesTestValue/logging/egovDb.properties";
		genAndDiff(templateFile, valueFile, targetFile);
	}

	/**
	 * EgovJDBC Appender 생성 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testEgovJDBCAppender() throws Exception {
		String templateFile = "eGovFrameTemplates/logging/egovJdbc.vm";
		String targetFile = "eGovFrameTemplatesTarget/logging/egovJdbc.xm";
		String valueFile = "eGovFrameTemplatesTestValue/logging/egovJdbc.properties";
		genAndDiff(templateFile, valueFile, targetFile);
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
		BufferedReader br = null;

		try {
			InputStream is = getClass().getClassLoader().getResourceAsStream(
					fileName);
			InputStreamReader sr = new InputStreamReader(is);
			br = new BufferedReader(sr);
			List<String> contents = new ArrayList<String>();
			String in;
			while ((in = br.readLine()) != null) {
				contents.add(in);
			}
			return (String[]) contents.toArray(new String[] {});
		} catch (Exception e) {
			System.err.println("error reading " + fileName + ": " + e);
			// System.exit(1);
			return null;
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 스트링 변환
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
			// System.exit(1);
			return null;
		}
	}

	/**
	 * 파일을 맵으로 변환
	 * 
	 * @param filePath
	 * @throws IOException
	 */
	public void convertFile2Map(String filePath) throws IOException {
		InputStream is = getClass().getClassLoader().getResourceAsStream(
				filePath);
		InputStreamReader sr = new InputStreamReader(is);
		BufferedReader reader = new BufferedReader(sr);
		map = new HashMap<String, String>();
		String line = "";
		while ((line = reader.readLine()) != null) {
			String[] str = getField(line);
			if (str != null)
				map.put(str[0], str[1]);
		}
		reader.close();
	}

	/**
	 * 필드 정보 얻기
	 * 
	 * @param line
	 * @return
	 */
	private String[] getField(String line) {
		if (line != null && line.indexOf("=") >= 0)
			return line.split("=");
		return null;
	}
}
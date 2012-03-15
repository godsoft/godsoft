package operation;

import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

/**
 * 
 * 설정 템플릿 코드 생성 클래스
 * <p>
 * <b>NOTE:</b> 설정 템플릿 코드 생성 클래스
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
public class TemplateCodeGen {
	/**
	 * 코드 생성
	 * 
	 * @param map
	 * @param templateFile
	 * @return
	 * @throws Exception
	 */
	public String generate(Map map, String templateFile) throws Exception {
		StringWriter sw = new StringWriter();
		generate(map, templateFile, sw);

		System.out.println(sw.toString());

		return sw.toString();
	}

	/**
	 * 
	 * 코드 생성
	 * 
	 * @param map
	 * @param templateFile
	 * @param writer
	 * @throws Exception
	 */
	private void generate(Map map, String templateFile, Writer writer)
			throws Exception {
		String templateEncoding = "UTF-8";

		Properties p = new Properties();
		p.setProperty("resource.loader", "class");
		p.setProperty("class.resource.loader.class",
				"org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");

		p.setProperty("file.resource.loader.cache", "false");
		p.setProperty("file.resource.loader.modificationCheckInterval", "0");

		Velocity.init(p);

		VelocityContext context = new VelocityContext(map);

		Template template = null;

		try {
			template = Velocity.getTemplate(templateFile, templateEncoding);
		} catch (ResourceNotFoundException rnfe) {
			rnfe.printStackTrace();
		} catch (ParseErrorException pee) {
			// syntax error: problem parsing the template
		} catch (MethodInvocationException mie) {
			// something invoked in the template
			// threw an exception
		} catch (Exception e) {
		}

		if (context != null && writer != null) {
			template.merge(context, writer);
		}

	}

}

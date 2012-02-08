package operation;

import java.io.StringWriter;
import java.io.Writer;
import java.util.Properties;

import model.DataModelContext;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

/**
 * 
 * CRUD 코드 생성 클래스
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
public class CrudCodeGen {
	/**
	 * 
	 * 코드 생성
	 * 
	 * @param dataModel
	 * @param templateFile
	 * @return
	 * @throws Exception
	 */
	public String generate(DataModelContext dataModel, String templateFile)
			throws Exception {
		StringWriter sw = new StringWriter();
		generate(dataModel, templateFile, sw);

		System.out.println(sw.toString());

		return sw.toString();
	}

	/**
	 * 코드 생성
	 * 
	 * @param dataModel
	 * @param templateFile
	 * @param writer
	 * @throws Exception
	 */
	private void generate(DataModelContext dataModel, String templateFile,
			Writer writer) throws Exception {
		String templateEncoding = "UTF-8";

		Properties p = new Properties();
		p.setProperty("resource.loader", "class");
		p.setProperty("class.resource.loader.class",
				"org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");

		p.setProperty("file.resource.loader.cache", "false");
		p.setProperty("file.resource.loader.modificationCheckInterval", "0");

		Velocity.init(p);

		VelocityContext context = new VelocityContext();

		// context.put("package", dataModel.getPackageName());
		// context.put("entity", dataModel.getEntity());
		// context.put("attributes", dataModel.getAttributes());
		// context.put("primaryKeys", dataModel.getPrimaryKeys());
		// context.put("createDate", dataModel.getCreateDate());
		// context.put("author", dataModel.getAuthor());

		context.put("model", dataModel);

		// context.put("voPackage",
		// "kr.godsoft.egovframe.generator.crud.service");
		context.put("voPackage", dataModel.getVoPackage());
		context.put("servicePackage", dataModel.getServicePackage());
		context.put("implPackage", dataModel.getImplPackage());

		context.put("author", dataModel.getAuthor());
		context.put("createDate", dataModel.getCreateDate());

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

		template.merge(context, writer);

	}

}

package godsoft.codegen.cmm.operation;

import godsoft.codegen.cmm.model.DataModelContext;

import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

public class CrudCodeGen {

	public String generate(DataModelContext dataModel, String templateFile) throws Exception {
		StringWriter sw = new StringWriter();
		generate(dataModel, templateFile, sw);

		System.out.println(sw.toString());

		return sw.toString();
	}

	private void generate(DataModelContext dataModel, String templateFile, Writer writer) throws Exception {
		String templateEncoding = "UTF-8";

		Properties p = new Properties();
		p.setProperty("resource.loader", "class");
		p.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");

		p.setProperty("file.resource.loader.cache", "false");
		p.setProperty("file.resource.loader.modificationCheckInterval", "0");

		Velocity.init(p);

		VelocityContext context = new VelocityContext();

		context.put("model", dataModel);
		//		context.put("package", dataModel.getPackageName());
		//		context.put("entity", dataModel.getEntity());
		//		context.put("attributes", dataModel.getAttributes());
		//		context.put("primaryKeys", dataModel.getPrimaryKeys());
		//		context.put("createDate", dataModel.getCreateDate());
		//		context.put("author", dataModel.getAuthor());

		Map<String, Object> packageMap = packageMap(dataModel);
		context.put("voPackage", packageMap.get("service"));
		context.put("daoPackage", packageMap.get("serviceImpl"));

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

		if (template != null) {
			template.merge(context, writer);
		}
	}

	private Map<String, Object> packageMap(DataModelContext dataModel) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();

		if (dataModel.getEntity() != null) {
			String entity = dataModel.getEntity().getLcName().replaceAll("_", "");

			map.put("service", String.format("%s.%s.service", dataModel.getPackageName(), entity));

			map.put("serviceImpl", String.format("%s.%s.service.impl", dataModel.getPackageName(), entity));

			map.put("controller", String.format("%s.%s.web", dataModel.getPackageName(), entity));
		}

		return map;
	}

}

package s2sample.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import s2sample.form.EchoForm;

public class EchoAction {

	@Resource
	@ActionForm
	protected EchoForm echoForm;

	@Execute(validator=false)
	public String index() {
		return "input.jsp";
	}

	@Execute(validator=false)
	public String echo() {
		return "input.jsp";
//		return "index?redirect=true";
	}

	@Execute(validator=false)
	public String echo2() {
		return "/test/index?redirect=true";
	}

	@Execute(validator=false)
	public String back() {
		return "input.jsp";
	}

}

package s2sample.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import s2sample.form.TestForm;

public class TestAction {

	@Resource
	@ActionForm
	protected TestForm testForm;

	@Execute(validator=false)
	public String index() {
		return "input.jsp";
	}

	@Execute(validator=false)
	public String echo() {
		return "echo.jsp";
	}

	@Execute(validator=false)
	public String echo2() {
		return "echo2.jsp";
	}


}

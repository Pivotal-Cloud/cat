package com.dianping.cat.system.page.login;

import com.dianping.cat.system.SystemPage;
import com.site.web.mvc.view.BaseJspViewer;

public class JspViewer extends BaseJspViewer<SystemPage, Action, Context, Model> {
	@Override
	protected String getJspFilePath(Context ctx, Model model) {
		Action action = model.getAction();

		switch (action) {
		case LOGIN:
			return JspFile.LOGIN.getPath();
		case LOGOUT:
			return com.dianping.cat.report.page.home.JspFile.VIEW.getPath();
		default:
		}

		throw new RuntimeException("Unknown action: " + action);
	}
}

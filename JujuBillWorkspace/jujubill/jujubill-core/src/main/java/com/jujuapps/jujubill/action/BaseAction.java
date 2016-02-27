package com.jujuapps.jujubill.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements ServletRequestAware, ServletContextAware, SessionAware {
	
	private static final long serialVersionUID = 109L;
	
	protected Map<String,Object> session = new HashMap<String,Object>();
	protected HttpServletRequest request;
	protected ServletContext context;
	
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}

	public void setServletContext(ServletContext arg0) {
		this.context = arg0;
	}

	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public ServletContext getContext() {
		return context;
	}

	public Map<String, Object> getSession() {
		return session;
	}

}

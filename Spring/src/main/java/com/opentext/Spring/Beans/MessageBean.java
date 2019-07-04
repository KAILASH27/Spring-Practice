package com.opentext.Spring.Beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBean implements InitializingBean, DisposableBean {
	private String message;

	// Setters and Getters
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	// method for bean initialization phase (method name can be anything)
	// public void init() {
	// System.out.println("init phase---");
	// }
	// method for bean Destruction phase (method name can be anything)
	// public void destroy() {
	// System.out.println("destroy phase----");
	// }

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy phase****");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initial phase****");

	}

}// End Class

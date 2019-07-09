package com.opentext.SptingWeb.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.opentext.SpringWeb.model.ModelClass;

@Controller
public class SpringWebController {

	@RequestMapping(path = "/LoginForm", method = RequestMethod.GET)
	public String loginForm() throws IOException {
		return "LoginForm";
	}// End of loginform()

	@RequestMapping(path = "/authenticate", method = RequestMethod.POST)
	public String authenticate(HttpServletRequest req) throws IOException {

		String username = req.getParameter("username");
		String password = req.getParameter("password");

		ModelClass model = new ModelClass();
		if (model.authenticate(username, password)) {
			return "HomePage";
		}
		return "LoginPage";

	}// End of authenticate
}// End of Controller

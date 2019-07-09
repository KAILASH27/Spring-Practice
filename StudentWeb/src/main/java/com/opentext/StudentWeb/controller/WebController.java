package com.opentext.StudentWeb.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.opentext.StudentWeb.Studentdto.StudentInfo;
import com.opentext.StudentWeb.model.ModelClass;

@Controller
public class WebController {

	private ModelClass model = new ModelClass();

	@RequestMapping(path = "/StudentForm", method = RequestMethod.GET)
	public String studentForm() throws IOException {
		return "StudentForm";
	}// End of studentForm()

	@RequestMapping(path = "/authenticate", method = RequestMethod.POST)
	public String authenticate(StudentInfo st) {

		model.pass(st);
		return "HomePage";

	}
}

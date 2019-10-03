package com.ab.controller.viewofcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewInSpringBoot {

	@RequestMapping(value="/view", method = RequestMethod.GET)
	public String getView() {
		return "view";
	}
}

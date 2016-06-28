 package org.pritech.onlineexamapp.controller;

import org.pritech.onlineexamapp.jpa.entity.WebPageDetails;
import org.pritech.onlineexamapp.service.WebPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@Autowired
	private WebPageService webPageService;

	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/index1")
	public ModelAndView index1(){
		ModelAndView model = new ModelAndView("index1");
		WebPageDetails webPageDetails = webPageService.displayWebPage("test");
		model.addObject("webPageContent", webPageDetails.getPageContent());
		return model;
	}

}

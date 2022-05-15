package com.app.springbootmysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.app.springbootmysql.repository.DiaryRepository;

@RestController
public class DiaryController {
	
	private static final String VIEW_INDEX = "index";
	@Autowired
	DiaryRepository repo;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView index(ModelAndView modelAndView){
		modelAndView.setViewName(VIEW_INDEX);
		modelAndView.addObject("diary", repo.findAll());
		return modelAndView;
	}
}

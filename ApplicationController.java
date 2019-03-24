package com.pearsonVue.VueStatusUpdates;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import Repository.UserRepository;
import model.SaveData;

@Controller
public class ApplicationController {
	
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("login")
	public ModelAndView signIn() {
		ModelAndView mv = new ModelAndView();
		System.out.println("Hi");
		mv.setViewName("welcome");
		return mv;
	}
	
	@RequestMapping("welcome")
	public ModelAndView welcome() {
		ModelAndView mv = new ModelAndView();
		System.out.println("Hello");
		mv.setViewName("welcome");
		return mv;
		
		
	}
	
	@RequestMapping("create")
	public ModelAndView create() {
		ModelAndView mv = new ModelAndView();
		System.out.println("Hello create..");
		mv.setViewName("create");
		return mv;
		
	}
	
	@RequestMapping("search")
	public ModelAndView search() {
		ModelAndView mv = new ModelAndView();
		System.out.println("Hello search..");
		mv.setViewName("search");
		return mv;
		
	}
	
	@RequestMapping(path="/saveData", method=RequestMethod.GET)
	public @ResponseBody String save(@RequestParam("name") String name
			, @RequestParam("teamName") String teamName, 
			@RequestParam("teamUpdates") String teamUpdates) {
		
		SaveData saveobj = new SaveData();
		saveobj.setName(name);
		saveobj.setTeamName(teamName);
		saveobj.setTeamUpdates(teamUpdates);
		saveobj.setCreatedDateTime(new Date());

		userRepository.save(saveobj);
		
		return "Saved Successfully!";
		
	}
	
}

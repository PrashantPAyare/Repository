package com.pearsonVue.VueStatusUpdates;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import Repository.UserRepository;
import model.SaveData;

@RestController
@Transactional
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
	
	@RequestMapping(path="/saveData", method=RequestMethod.POST)
	public @ResponseBody String save(@RequestParam("username") String username
			, @RequestParam("teamName") String teamName, 
			@RequestParam("teamUpdates") String teamUpdates) {
		
		teamUpdates = teamUpdates.replaceAll("(\r\n|\n)", "  -");
		
		SaveData saveobj = new SaveData();
		saveobj.setId(saveobj.getId());
		saveobj.setUsername(username);
		saveobj.setTeamName(teamName);
		saveobj.setTeamUpdates(teamUpdates);
		saveobj.setCreatedDateTime(new Date());
		userRepository.save(saveobj);		
		return "Saved Successfully!";	
		
	}
	
	@RequestMapping(path="/deleteData", method=RequestMethod.POST)
	public @ResponseBody String delete(@RequestParam(value = "username", required = false) String username) {
		SaveData obj = new SaveData();
		obj.setUsername(username);
		userRepository.deleteByUsername(obj.getUsername());
		System.out.println("Deleting...");
		return "Deleted Successfully!";	
	}
	
	@RequestMapping(path="/searchData", method=RequestMethod.POST)
	public @ResponseBody List<SaveData> searchRecord(@RequestParam("teamName") String teamName) {
		SaveData findobj = new SaveData();
		findobj.setTeamName(teamName);
		final List<SaveData> existingData = userRepository.findAllByTeamName(findobj.getTeamName());
		System.out.println("Searching..."+teamName);
		return existingData;
	}
}
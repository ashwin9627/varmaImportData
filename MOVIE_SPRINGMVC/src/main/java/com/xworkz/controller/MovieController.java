package com.xworkz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.Model.service.MovieService;
import com.xworkz.dto.MovieDTO;

@Component
@RequestMapping("/")
public class MovieController {

	public MovieController() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	// here we are getting all the parameters by calling add attribute
	/*
	 * @RequestMapping(value="/moviebooking2.do",method=RequestMethod.POST) public
	 * String Onsave(MovieDTO dto,Model model) {
	 * System.out.println("invoked onsave"); model.addAttribute("moviename",
	 * dto.getMoviename()); model.addAttribute("date", dto.getDate());
	 * model.addAttribute("nooftickets", dto.getNooftickets());
	 * model.addAttribute("theater", dto.getTheater());
	 * 
	 * return "MovieSuccess";
	 * 
	 * }
	 */

	// this method is by call directly DTO in add attribute

	@RequestMapping(value = "/moviebooking3.do", method = RequestMethod.POST)
	public String Onsave1(MovieDTO dto, Model model) {
		System.out.println("invoked onsave");
		model.addAttribute("movieDTO", dto);
		return "/MovieSuccess.jsp";
	}
	@Autowired
	private MovieService movieservice;
	
	
	@RequestMapping(value="/moviebooking.do", method=RequestMethod.POST)
	public String Onsave2(MovieDTO dto,Model model)
	{
		model.addAttribute("MovieDTO", dto);
		movieservice.Save(dto);
		return "/MovieSuccess.jsp";
		
	}

}

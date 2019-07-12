package com.xworkz.Model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.Model.DAO.MovieDAO;
import com.xworkz.dto.MovieDTO;


@Component
public class MovieService {
	
	@Autowired
	private MovieDAO dao;
	
	public MovieService() {
		System.out.println("created \t");
	}
	
	public void Save(MovieDTO dto)
	{
		System.out.println("invoked save method");
		dao.save(dto);
	}

}

package com.xworkz.Model.DAO;

import org.springframework.stereotype.Component;

import com.xworkz.dto.MovieDTO;

@Component
public class MovieDAO {
	 
	public void save(MovieDTO dto)
	{
		System.out.println("invoked save\t");
	}

}

package com.xworkz.dto;

import java.io.Serializable;

public class MovieDTO implements Serializable{
	private String moviename;
	private String date;
	private String nooftickets;
	private String theater;
	
	public MovieDTO() {
		System.out.println("created\t"+this.getClass().getSimpleName());	
		}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getNooftickets() {
		return nooftickets;
	}

	public void setNooftickets(String nooftickets) {
		this.nooftickets = nooftickets;
	}

	public String getTheater() {
		return theater;
	}

	public void setTheater(String theater) {
		this.theater = theater;
	}

	@Override
	public String toString() {
		return "MovieDTO [moviename=" + moviename + ", date=" + date + ", nooftickets=" + nooftickets + ", theater="
				+ theater + "]";
	}
	
	

}

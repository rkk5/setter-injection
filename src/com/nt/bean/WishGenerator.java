package com.nt.bean;

import java.util.Date;

public class WishGenerator {
	private String name;
	private int  date;
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String WishGenerateMsg()
	{
	return "good morning:"+name+"-->+date";
		
	}

}

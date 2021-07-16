package com.fis.webapp.service;

import org.springframework.stereotype.Component;

@Component
public class RetrieveService {

	public String getUserName(String e1)
	{
		int index=e1.lastIndexOf('@');
		return e1.substring(0, index);
	}
	
	public String getDomain(String e1)
	{
		int index=e1.lastIndexOf('@');
		int index1=e1.lastIndexOf(".");
		return e1.substring(index+1, index1);
	}
	public String getGender(int i)
	{
		if(i==1)
			return "Female";
		return "Male";
	}
	
}

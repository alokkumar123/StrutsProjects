package com.qainfotech;

import com.opensymphony.xwork2.ActionSupport;

public class LoginEx extends ActionSupport{
	
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	public String execute()
	{System.out.println("hello");
		if(userName.equals("Alok"))
		{System.out.println("hello1");
			return SUCCESS;

		}else{
			System.out.println("hello2");
			return ERROR;
			
		}
	}
}

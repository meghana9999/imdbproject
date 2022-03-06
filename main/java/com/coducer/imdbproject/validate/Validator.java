package com.coducer.imdbproject.validate;

import java.util.Base64;

import javax.ws.rs.HeaderParam;

public class Validator {
	
	private String validUserName;
	private String validPassword;
	
	public Validator() {
		validUserName = "test";
		validPassword = "test";
	}
	
	
	public boolean checkLogin(@HeaderParam("authorization") String auth) {
		if(isAuthenticated(auth)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

	private boolean isAuthenticated(String auth) {
		String[] authSplit = auth.split("\\s+");
		String authInfo = authSplit[1];
		
		byte[] bytes = Base64.getDecoder().decode(authInfo);
		String decodeString =new String(bytes);
		String[] decodeStringSplit = decodeString.split(":");
		String userName = decodeStringSplit[0];
		String password = decodeStringSplit[1];
		
		if(userName.equals(validUserName) && password.equals(validPassword))
		{
			return true;
		}
		else {
			return false;
		}
	}
}

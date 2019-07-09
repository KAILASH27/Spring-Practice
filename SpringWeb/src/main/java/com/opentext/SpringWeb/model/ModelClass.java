package com.opentext.SpringWeb.model;

public class ModelClass {
	public boolean authenticate(String username, String password) {

		if (username.equals("qwerty") && password.equals("asdfg")) {
			return true;
		}

		return false;
	}// End of authenticate()
}// End of class

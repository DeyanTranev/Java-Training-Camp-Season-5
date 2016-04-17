package hw10;

import java.util.*;

public class SecuredNotepad extends SimpleNotepad {
	
	private int passHash;

	public SecuredNotepad(int numberOfPages, String password) {
		super(numberOfPages);
		if (password.length() >= 5 && this.hasLowerCase(password) && this.hasUpperCase(password) && this.hasDigit(password)) {
			this.passHash = password.hashCode();
		}
		else {
			throw new SecurityException("Password offerred does not comply with requirements - at least 5 symbols,"
					+ " must contain a lower case, an upper case and a number!");
		}
		
		// TODO Auto-generated constructor stub
	}
	
	boolean hasLowerCase(String text) {
		for (int index = 0; index < text.length(); index++) {
			if (text.charAt(index)>=97 && text.charAt(index)<=122) {
				return true;
			}
		}
		return false;
	}
	
	boolean hasUpperCase(String text) {
		for (int index = 0; index < text.length(); index++) {
			if (text.charAt(index)>=65 && text.charAt(index)<=90) {
				return true;
			}
		}
		return false;
	}
	
	boolean hasDigit(String text) {
		for (int index = 0; index < text.length(); index++) {
			if (text.charAt(index)>=48 && text.charAt(index)<=57) {
				return true;
			}
		}
		return false;
	}
	
	
	public void addTextToPage(String text, int pagenum, String password) {
		// TODO Auto-generated method stub
		super.addTextToPage(text, pagenum);
	}

}

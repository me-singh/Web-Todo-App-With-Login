package webapp.login;

public class CheckUser {
	
	public boolean isValidUser(String name, String password) {
		if(name.equals("amit") && password.equals("chauhan"))
			return true;
		return false;
	}
}

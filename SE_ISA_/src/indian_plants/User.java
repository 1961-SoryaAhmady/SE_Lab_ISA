package indian_plants;

public class User {

	private String username;
	private String password;
	private String email;



	public User(String string,String stringpswd, String stringemail) {
		this.username = string;
		this.password = stringpswd;
		this.email = stringemail;
	}
	
	public Boolean user_register(String string,String stringpswd, String stringemail) {
		
		if(this.username==string &&this.password==stringpswd &&this.email==stringemail) {
			return true;
		}else
		{
			return false;
		}
	}

	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}

}



package linkcode.shop.admin.model;

public class Login {
	
	private String adname;
	private String pass;
	public Login(String adname, String pass) {
		super();
		this.adname = adname;
		this.pass = pass;
	}
	public String getAdname() {
		return adname;
	}
	public void setAdname(String adname) {
		this.adname = adname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	

}

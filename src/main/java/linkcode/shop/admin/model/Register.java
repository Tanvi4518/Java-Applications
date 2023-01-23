package linkcode.shop.admin.model;

public class Register {
	
	private String adNm;
	private String pass;
	public Register(String adNm, String pass) {
		super();
		this.adNm = adNm;
		this.pass = pass;
	}
	public String getAdNm() {
		return adNm;
	}
	public void setAdNm(String adNm) {
		this.adNm = adNm;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	

}

package MyJavaWorld.MyJava.Entity;

import javax.xml.bind.annotation.XmlElement;

public class Authentication {
	private String username;
	private String password;
	private String partner;
	public String getUsername() {
		return username;
	}
	@XmlElement
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	@XmlElement
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPartner() {
		return partner;
	}
	@XmlElement
	public void setPartner(String partner) {
		this.partner = partner;
	}
	
	

}

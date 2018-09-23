package MyJavaWorld.MyJava.Entity;

import javax.xml.bind.annotation.XmlElement;

public class Account {

	 private String name;
     private String address1;
     private String address2;
     private String city;
     private String state;
     private String zip;
     private String country;
     private String email;
     private String login;
     private String phone;
     private String password;
     private String language;
     private String isTest;
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress1() {
		return address1;
	}
	@XmlElement
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	@XmlElement
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	@XmlElement
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	@XmlElement
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	@XmlElement
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	@XmlElement
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	@XmlElement
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPhone() {
		return phone;
	}
	@XmlElement
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	@XmlElement
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLanguage() {
		return language;
	}
	@XmlElement
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getIsTest() {
		return isTest;
	}
	@XmlElement
	public void setIsTest(String isTest) {
		this.isTest = isTest;
	}
     
     

	
}

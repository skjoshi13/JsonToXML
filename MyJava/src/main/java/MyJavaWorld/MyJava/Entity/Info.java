package MyJavaWorld.MyJava.Entity;

import javax.xml.bind.annotation.XmlElement;

public class Info {
private Account accountInformation;
private Site siteInformation;

public Account getAccountInformation() {
	return accountInformation;
}
@XmlElement
public void setAccountInformation(Account accountInformation) {
	this.accountInformation = accountInformation;
}
public Site getSiteInformation() {
	return siteInformation;
}
@XmlElement
public void setSiteInformation(Site siteInformation) {
	this.siteInformation = siteInformation;
}




}

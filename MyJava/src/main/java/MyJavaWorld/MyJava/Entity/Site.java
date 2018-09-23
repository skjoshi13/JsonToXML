package MyJavaWorld.MyJava.Entity;

import javax.xml.bind.annotation.XmlElement;

public class Site {
	private String subscription;
    private String domain;
    private String domainEmail;
    private String trustedDomain;
	public String getSubscription() {
		return subscription;
	}
	@XmlElement
	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}
	public String getDomain() {
		return domain;
	}
	@XmlElement
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getDomainEmail() {
		return domainEmail;
	}
	@XmlElement
	public void setDomainEmail(String domainEmail) {
		this.domainEmail = domainEmail;
	}
	public String getTrustedDomain() {
		return trustedDomain;
	}
	@XmlElement
	public void setTrustedDomain(String trustedDomain) {
		this.trustedDomain = trustedDomain;
	}
    
    

}

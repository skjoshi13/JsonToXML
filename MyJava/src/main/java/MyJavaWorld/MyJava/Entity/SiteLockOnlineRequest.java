package MyJavaWorld.MyJava.Entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SiteLockOnlineRequest {

	private Info provisionAccount;
	private Authentication authentication;


	public Info getProvisionAccount() {
		return provisionAccount;
	}

	@XmlElement
	public void setProvisionAccount(Info provisionAccount) {
		this.provisionAccount = provisionAccount;
	}

	public Authentication getAuthentication() {
		return authentication;
	}

	@XmlElement
	public void setAuthentication(Authentication authentication) {
		this.authentication = authentication;
	}
	
	
	
}

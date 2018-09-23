package MyJavaWorld.MyJava;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import MyJavaWorld.MyJava.Entity.Authentication;
import MyJavaWorld.MyJava.Entity.Info;
import MyJavaWorld.MyJava.Entity.SiteLockOnlineRequest;
import MyJavaWorld.MyJava.Entity.Site;

public class TestJAXB{

public static void main(String args[]){

String jsonString = getSitelockAccountPayload();
ObjectMapper mapper = new ObjectMapper();

try {
	SiteLockOnlineRequest payload = mapper.readValue(jsonString, SiteLockOnlineRequest.class);
	Authentication auth = new Authentication();
	auth.setPartner("Netregistry");
	auth.setPassword("asdfaSDDF");
	auth.setUsername("melbourneit");
	payload.setAuthentication(auth);

	//creating the JAXB context
    JAXBContext jContext = JAXBContext.newInstance(SiteLockOnlineRequest.class);
    
    //creating the marshaller object
    Marshaller marshallObj = jContext.createMarshaller();
    
    //setting the property to show xml format output
    marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    
    //setting the values in POJO class
    /*Site site = new Site();
    site.setDomain("domain");
    site.setDomainEmail("a@b.com");
    site.setSubscription("3182");
    site.setTrustedDomain("true");
    
    Info info = new Info();
    info.setSiteInformation(site);
    Payload payload = new Payload();
    payload.setProvisionAccount(info);*/
    
    StringWriter sw = new StringWriter();
    marshallObj.marshal(payload, sw);
    
String xmlString = sw.toString();
    
    System.out.println(xmlString);
    
    //calling the marshall method
   
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    

}

private static String getSitelockAccountPayload() {

        JSONObject account = new JSONObject();
        account.put("name", "Sumit");
        account.put("address1", "address1");
        account.put("address2", "address2");
        account.put("city", "Sydney");
        account.put("state", "NSW");
        account.put("zip", "2007");
        account.put("country", "AU");
        account.put("email", "dev@netregistry.net");
        account.put("login", "sb123dd");
        account.put("phone", "123456789");
        account.put("password", "qwerty123");
        account.put("language", "EN");
        account.put("isTest", "No");

        JSONObject site = new JSONObject();
        site.put("subscription", "3248");
        site.put("domain", "abc.com");
        site.put("domainEmail", "test@abc.com");
        site.put("trustedDomain", "yes");

        JSONObject info = new JSONObject();
        info.put("accountInformation", account);
        info.put("siteInformation", site);

        JSONObject payload = new JSONObject();
        payload.put("provisionAccount", info);

        JSONObject request = new JSONObject();
        request.put("payload", payload);
        request.put("partner", "Netregistry");

        return payload.toString();
    }
}
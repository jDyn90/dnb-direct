package api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class Application {
	
	public static void main(String args[]) {
		post();
	}
	
	public static void post() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		
		headers.add("x-dnb-user", "P200000EA442D7528BB4D908BE4EE6AA");
		headers.add("x-dnb-pwd", "P@Ycom123");
		
		HttpEntity<HttpHeaders> request = new HttpEntity<HttpHeaders>(headers);
		
		RestTemplate rt = new RestTemplate();
		String url = "https://direct.dnb.com/Authentication/V2.0/";
		
		System.out.println(rt.postForObject(url, request, String.class));
	}
}
package sudaJava;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingHttpClient2 {
	public static void main(String[] args) {
		HttpClient httpClient=HttpClient.newHttpClient();
	try {
		HttpRequest httpRequest=HttpRequest.newBuilder().uri(new URI("https://etax.rra.gov.rw/landingPage")).GET().build();
		System.out.println(httpRequest);
		HttpResponse<String> httpResponse=httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		System.out.println("status code "+httpResponse.statusCode());
		//System.out.println(httpResponse.body());
		HttpResponse<Path>responseToFile=httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofFile(Paths.get("C:\\Users\\shu2207083104\\Desktop\\java17IO\\volDisc.html")));
		System.out.println("file path "+responseToFile.body());
	} catch (URISyntaxException | IOException | InterruptedException e) {
		e.printStackTrace();
	}
	
	}
}

package com.ecom.affiliate.client;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Component;

import com.ecom.affiliate.exception.FeedServiceException;

@Component("fkClient")
public class FKServiceClient {

	public String get(String requestUrl) throws FeedServiceException {
//			url = new URL("https://affiliate-api.flipkart.net/affiliate/api/hotspotum.json");

		URL url;
		HttpURLConnection conn = null;
		StringBuffer sb = null;
		try {
			url = new URL(requestUrl);

			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			conn.setRequestProperty("Fk-Affiliate-Id", "hotspotum");
			conn.setRequestProperty("Fk-Affiliate-Token", "820546c9c02a451a87c6edda6b0bb165");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
//			BufferedReader br = new BufferedReader(new FileReader("D:\\Dev\\Spring_boot\\affiliate\\src\\main\\resources\\response.json"));

			String output;
			sb = new StringBuffer();
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				sb.append(output);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			conn.disconnect();
		}
		return sb.toString();

	}
/*
	@SuppressWarnings("unused")
	private void getUsingTemplate(String requestUrl) throws FeedServiceException {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.set("Fk-Affiliate-Id", "hotspotum");
		headers.set("Fk-Affiliate-Token", "820546c9c02a451a87c6edda6b0bb165");
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<String> response;
		try {
			response = restTemplate.exchange(new URI(requestUrl), HttpMethod.GET, entity, String.class);

			if (response.getStatusCode() != HttpStatus.OK) {
				throw new FeedServiceException("Invalid status code" + response.getStatusCode());
			}
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(response.getBody());

		} catch (RestClientException | URISyntaxException | ParseException e) {
			e.printStackTrace();
		}

	}*/

	/*public static void main(String[] args) {
		try {
			new FKServiceClient().get("https://affiliate-api.flipkart.net/affiliate/api/hotspotum.json");
		} catch (FeedServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}

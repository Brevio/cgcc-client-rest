package br.com.cgcc.apis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import request.RequestOrquestrador;
import response.ResponseOrquestrador;

public class OcrClient {

	@Value("${url.orquestrador.ocr}")
	private String URL;
	
	private RestTemplate restTemplate = new RestTemplate();
	
	
	public ResponseEntity<ResponseOrquestrador> getOcr (RequestOrquestrador request) {
		
		return restTemplate.postForEntity(URL, request, ResponseOrquestrador.class);
	}

}

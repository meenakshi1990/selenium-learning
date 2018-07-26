package org.cloudmantra.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class gethoa {

	@SuppressWarnings("deprecation")
	@Test
	public void getdevices(){   
		//String accessToken="eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJvM3hIX1ptM1MtX0xKZ1pWU3l6a0RWdVMwcUFtOFdtV21CbWRMU1ZEcC1vIn0.eyJqdGkiOiIxNmUwNDA4ZC0wNDc1LTQ2YTctOGU5OS1kN2NjYzkzZGZlNzYiLCJleHAiOjE1MzEyNDY5MjIsIm5iZiI6MCwiaWF0IjoxNTMxMjEwOTIyLCJpc3MiOiJodHRwOi8vMTMuMjMyLjE0NC4yNTU6ODA4MC9hdXRoL3JlYWxtcy9hdXRoZW50aWNhdGUiLCJhdWQiOiJuZXdhY2NlbGVyaXRlIiwic3ViIjoiYTUzYWRmNTktMzlhNS00NGU1LThiNDItNmFkYjc3NDRjMzViIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoibmV3YWNjZWxlcml0ZSIsImF1dGhfdGltZSI6MCwic2Vzc2lvbl9zdGF0ZSI6IjZiYjIxZGIwLWM3ODItNDYzYS1iY2VhLWZlMzM1ZmYzOWIzZSIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiKiJdLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOlsiYWNjb3VudF9hZG1pbiIsImhvYV91c2VyIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NlbGVyaXRlIjp7InJvbGVzIjpbInVtYV9wcm90ZWN0aW9uIl19LCJyZWFsbS1tYW5hZ2VtZW50Ijp7InJvbGVzIjpbInZpZXctcmVhbG0iLCJ2aWV3LWlkZW50aXR5LXByb3ZpZGVycyIsIm1hbmFnZS1pZGVudGl0eS1wcm92aWRlcnMiLCJpbXBlcnNvbmF0aW9uIiwicmVhbG0tYWRtaW4iLCJjcmVhdGUtY2xpZW50IiwibWFuYWdlLXVzZXJzIiwicXVlcnktcmVhbG1zIiwidmlldy1hdXRob3JpemF0aW9uIiwicXVlcnktY2xpZW50cyIsInF1ZXJ5LXVzZXJzIiwibWFuYWdlLWV2ZW50cyIsIm1hbmFnZS1yZWFsbSIsInZpZXctZXZlbnRzIiwidmlldy11c2VycyIsInZpZXctY2xpZW50cyIsIm1hbmFnZS1hdXRob3JpemF0aW9uIiwibWFuYWdlLWNsaWVudHMiLCJxdWVyeS1ncm91cHMiXX19LCJzY29wZSI6ImVtYWlsIHByb2ZpbGUiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsInByZWZlcnJlZF91c2VybmFtZSI6InRyaWd5YV9tbSJ9.hUt0EvLViM4NxwiUwpzjwSqke0-Nweqir7EY0q_WS8SgyRvnpvq0AW-nEwIe7BHn19y4_U_RjPMypUOlSb3l7cyIAR2wMlZ_plEBt7yEG3ymVPs5GhxHYHsl5xNzxZ07vpWTwvr4f_tJiq1cLlUBMkGoatPUvLRzPc5nQwoGlcAWz9eYK41rdJsP9xkRqfz2qGpcnW9oA_DQ8AzjVG3cwbPpY0nl7x7eEn2wgcRjSgV_WQSuPV1RnN83zYwsUIjkYxUNbPIBiO_JFPmKCXBDPhThqTRud4MjSnW7J0w2RlvS7GfYqr_Lgp9dxYSWmxWaEcZhb58MnuY9_Z9RwHhl7Q";
		
		RestAssured.baseURI = "http://accelerite-lb-273493239.ap-south-1.elb.amazonaws.com:3000";
 
		
		RequestSpecification httpRequest = RestAssured.given();
 
		
		Response response = httpRequest.request(Method.GET, "/accounts");
 
		//httpRequest.auth().oauth2(accessToken);
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
		int statuscode=response.getStatusCode();
		String statusline=response.getStatusLine();
		Assert.assertEquals(statuscode,200);
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK", "Correct status code returned");
		
}
}
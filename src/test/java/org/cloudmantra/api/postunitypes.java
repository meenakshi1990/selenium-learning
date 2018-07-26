package org.cloudmantra.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.json.JSONException;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postunitypes {
	Properties prop;
	
	public void read(String Filepath) {
		File file = new File("C:\\Users\\Administrator\\eclipse-workspace\\api\\util\\datafile.properties");
	
	  
	FileInputStream fileInput = null;{
	try {
		fileInput = new FileInputStream(file);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	Properties prop = new Properties();
	
	//load properties file
	try {
		prop.load(fileInput);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	}
	

	@Test(priority=1)
	public void createunit()
	{		
		
		RestAssured.baseURI = "http://accelerite-lb-273493239.ap-south-1.elb.amazonaws.com:3001";
		String accesstoken2="eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJvM3hIX1ptM1MtX0xKZ1pWU3l6a0RWdVMwcUFtOFdtV21CbWRMU1ZEcC1vIn0.eyJqdGkiOiI5ZTQ3MGMzNi01YzQxLTRjYmQtYjZmYy1iOGIyNmQzYWNjNWQiLCJleHAiOjE1MzI0NDI5NTMsIm5iZiI6MCwiaWF0IjoxNTMyNDA2OTUzLCJpc3MiOiJodHRwOi8vMTMuMjMyLjE0NC4yNTU6ODA4MC9hdXRoL3JlYWxtcy9hdXRoZW50aWNhdGUiLCJhdWQiOiJuZXdhY2NlbGVyaXRlIiwic3ViIjoiYTUzYWRmNTktMzlhNS00NGU1LThiNDItNmFkYjc3NDRjMzViIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoibmV3YWNjZWxlcml0ZSIsImF1dGhfdGltZSI6MCwic2Vzc2lvbl9zdGF0ZSI6IjU5YjEwMDNmLTZkY2YtNGQ1My1iNGZkLTQ5NjkyM2JmZDk3MiIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiaHR0cDovL2FjY2VsZXJpdGUtbGItMjczNDkzMjM5LmFwLXNvdXRoLTEuZWxiLmFtYXpvbmF3cy5jb20vYXBpLWRvY3MvIiwiKiJdLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOltudWxsLCJhY2NvdW50X2FkbWluIiwiaG9hX3VzZXIiLCJ1bWFfYXV0aG9yaXphdGlvbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImFjY2VsZXJpdGUiOnsicm9sZXMiOlsidW1hX3Byb3RlY3Rpb24iXX0sInJlYWxtLW1hbmFnZW1lbnQiOnsicm9sZXMiOlsidmlldy1yZWFsbSIsInZpZXctaWRlbnRpdHktcHJvdmlkZXJzIiwibWFuYWdlLWlkZW50aXR5LXByb3ZpZGVycyIsImltcGVyc29uYXRpb24iLCJyZWFsbS1hZG1pbiIsImNyZWF0ZS1jbGllbnQiLCJtYW5hZ2UtdXNlcnMiLCJxdWVyeS1yZWFsbXMiLCJ2aWV3LWF1dGhvcml6YXRpb24iLCJxdWVyeS1jbGllbnRzIiwicXVlcnktdXNlcnMiLCJtYW5hZ2UtZXZlbnRzIiwibWFuYWdlLXJlYWxtIiwidmlldy1ldmVudHMiLCJ2aWV3LXVzZXJzIiwidmlldy1jbGllbnRzIiwibWFuYWdlLWF1dGhvcml6YXRpb24iLCJtYW5hZ2UtY2xpZW50cyIsInF1ZXJ5LWdyb3VwcyJdfX0sInNjb3BlIjoiZW1haWwgcHJvZmlsZSIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwicm9sZXMiOiJbbnVsbCwgaG9hX3VzZXIsIHVtYV9hdXRob3JpemF0aW9uLCBob2FfdXNlciwgYWNjb3VudF9hZG1pbl0iLCJncm91cHMiOlsiL1Rlc3QiXSwicHJlZmVycmVkX3VzZXJuYW1lIjoidHJpZ3lhX21tIiwiZW1haWwiOiJtYW5pc2hhX21haGFqYW5AY2xvdWRtYW50cmEubmV0In0.FJLD45evHSrXIDEKx3raBhmDQ4UJSddm0kdL70rfT2xXo0oCGmPznW_KXyGNCY0PINoqM2paY-fP4I6U_VKJKZeAhunU-aMces082Apu83bYM70xAx3nd6a6yCXs-EJACwLyFFZwPPSvlFU-u2WunIajLN6YnHQh1FdCJ7b_A_zrUljZSfXO2IwFZh59zmhZMBeR9PSyE8XLToW24MWbGmPoswr_2T2Gq1XVZU_zeN1F7julqnXsiGn4qwVsWWlYXomahAZ1YDjmKza1At1V6NK5yCX7idWYEPVN1GgIqlWPIqtVKYjeQvU4Whp9I4-y_D5B9cUuXUCqdILtfa3ynw";
		//String accessToken1="eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJvM3hIX1ptM1MtX0xKZ1pWU3l6a0RWdVMwcUFtOFdtV21CbWRMU1ZEcC1vIn0.eyJqdGkiOiI0ODY2MWY5ZC00NWE5LTQ2MzctYTUwZS04Y2IyZWU3NjAxY2IiLCJleHAiOjE1MzIzODAzODQsIm5iZiI6MCwiaWF0IjoxNTMyMzQ0Mzg0LCJpc3MiOiJodHRwOi8vMTMuMjMyLjE0NC4yNTU6ODA4MC9hdXRoL3JlYWxtcy9hdXRoZW50aWNhdGUiLCJhdWQiOiJuZXdhY2NlbGVyaXRlIiwic3ViIjoiYTUzYWRmNTktMzlhNS00NGU1LThiNDItNmFkYjc3NDRjMzViIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoibmV3YWNjZWxlcml0ZSIsImF1dGhfdGltZSI6MCwic2Vzc2lvbl9zdGF0ZSI6IjJmYjQ0NTA4LWJjYWUtNDY1OS1iMjgxLWNhZWJiYWIxODEwNiIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiaHR0cDovL2FjY2VsZXJpdGUtbGItMjczNDkzMjM5LmFwLXNvdXRoLTEuZWxiLmFtYXpvbmF3cy5jb20vYXBpLWRvY3MvIiwiKiJdLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOltudWxsLCJhY2NvdW50X2FkbWluIiwiaG9hX3VzZXIiLCJ1bWFfYXV0aG9yaXphdGlvbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImFjY2VsZXJpdGUiOnsicm9sZXMiOlsidW1hX3Byb3RlY3Rpb24iXX0sInJlYWxtLW1hbmFnZW1lbnQiOnsicm9sZXMiOlsidmlldy1yZWFsbSIsInZpZXctaWRlbnRpdHktcHJvdmlkZXJzIiwibWFuYWdlLWlkZW50aXR5LXByb3ZpZGVycyIsImltcGVyc29uYXRpb24iLCJyZWFsbS1hZG1pbiIsImNyZWF0ZS1jbGllbnQiLCJtYW5hZ2UtdXNlcnMiLCJxdWVyeS1yZWFsbXMiLCJ2aWV3LWF1dGhvcml6YXRpb24iLCJxdWVyeS1jbGllbnRzIiwicXVlcnktdXNlcnMiLCJtYW5hZ2UtZXZlbnRzIiwibWFuYWdlLXJlYWxtIiwidmlldy1ldmVudHMiLCJ2aWV3LXVzZXJzIiwidmlldy1jbGllbnRzIiwibWFuYWdlLWF1dGhvcml6YXRpb24iLCJtYW5hZ2UtY2xpZW50cyIsInF1ZXJ5LWdyb3VwcyJdfX0sInNjb3BlIjoiZW1haWwgcHJvZmlsZSIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwicm9sZXMiOiJbbnVsbCwgaG9hX3VzZXIsIHVtYV9hdXRob3JpemF0aW9uLCBob2FfdXNlciwgYWNjb3VudF9hZG1pbl0iLCJncm91cHMiOlsiL1Rlc3QiXSwicHJlZmVycmVkX3VzZXJuYW1lIjoidHJpZ3lhX21tIiwiZW1haWwiOiJtYW5pc2hhX21haGFqYW5AY2xvdWRtYW50cmEubmV0In0.dEe5ua6aEIhMV08r67MGBHiQbRVHktHex6e72EDIHm7B7jMzPFf_NXzD8riyoF1SuNCrWKlcihEF2uwA7JyLXH5JcIKzFnNFBW3yzlzB6hVnh56NIQIKS8Mv04K9hyyF9R-0tWf6HfDDmUD5U2Px_7YKIncI56es0JTFbkc6Y9bm7goJy3w4b0o-3j4hZqWniA-uc8iRGiSMCdp9-ExQEjO5jMXPLHOOwG18EGCWPNiiPQoDHDu28Ab46KfmtuM9nZET5gS3iiNaI9trkzXJbLfDzYlRWogPNppWY7KR2gJgZ-9Rbrop8qNDtrgasmovVLUT9fvjZ6-q0tglIC30CA";
		//String accesstoken="eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJvM3hIX1ptM1MtX0xKZ1pWU3l6a0RWdVMwcUFtOFdtV21CbWRMU1ZEcC1vIn0.eyJqdGkiOiJhMDdiODhlMC05ZDlkLTQ4MDktOGQyMy03NTM1ZTZjMmY5YmEiLCJleHAiOjE1MzIzODQ4MTcsIm5iZiI6MCwiaWF0IjoxNTMyMzQ4ODE3LCJpc3MiOiJodHRwOi8vMTMuMjMyLjE0NC4yNTU6ODA4MC9hdXRoL3JlYWxtcy9hdXRoZW50aWNhdGUiLCJhdWQiOiJuZXdhY2NlbGVyaXRlIiwic3ViIjoiYTUzYWRmNTktMzlhNS00NGU1LThiNDItNmFkYjc3NDRjMzViIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoibmV3YWNjZWxlcml0ZSIsImF1dGhfdGltZSI6MCwic2Vzc2lvbl9zdGF0ZSI6IjRkMWNiNjJkLWNlY2YtNGYxOS05ZmFlLTAzMTk5OTI0NGMyMSIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiaHR0cDovL2FjY2VsZXJpdGUtbGItMjczNDkzMjM5LmFwLXNvdXRoLTEuZWxiLmFtYXpvbmF3cy5jb20vYXBpLWRvY3MvIiwiKiJdLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOltudWxsLCJhY2NvdW50X2FkbWluIiwiaG9hX3VzZXIiLCJ1bWFfYXV0aG9yaXphdGlvbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImFjY2VsZXJpdGUiOnsicm9sZXMiOlsidW1hX3Byb3RlY3Rpb24iXX0sInJlYWxtLW1hbmFnZW1lbnQiOnsicm9sZXMiOlsidmlldy1yZWFsbSIsInZpZXctaWRlbnRpdHktcHJvdmlkZXJzIiwibWFuYWdlLWlkZW50aXR5LXByb3ZpZGVycyIsImltcGVyc29uYXRpb24iLCJyZWFsbS1hZG1pbiIsImNyZWF0ZS1jbGllbnQiLCJtYW5hZ2UtdXNlcnMiLCJxdWVyeS1yZWFsbXMiLCJ2aWV3LWF1dGhvcml6YXRpb24iLCJxdWVyeS1jbGllbnRzIiwicXVlcnktdXNlcnMiLCJtYW5hZ2UtZXZlbnRzIiwibWFuYWdlLXJlYWxtIiwidmlldy1ldmVudHMiLCJ2aWV3LXVzZXJzIiwidmlldy1jbGllbnRzIiwibWFuYWdlLWF1dGhvcml6YXRpb24iLCJtYW5hZ2UtY2xpZW50cyIsInF1ZXJ5LWdyb3VwcyJdfX0sInNjb3BlIjoiZW1haWwgcHJvZmlsZSIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwicm9sZXMiOiJbbnVsbCwgaG9hX3VzZXIsIHVtYV9hdXRob3JpemF0aW9uLCBob2FfdXNlciwgYWNjb3VudF9hZG1pbl0iLCJncm91cHMiOlsiL1Rlc3QiXSwicHJlZmVycmVkX3VzZXJuYW1lIjoidHJpZ3lhX21tIiwiZW1haWwiOiJtYW5pc2hhX21haGFqYW5AY2xvdWRtYW50cmEubmV0In0.Fva_gdciGN3jr7olMQNb6PneMOBFf2KK1frzW_DGcutzMV-2OrDx6OiF0Ta9kvXWHIcO-Z3OqDb1azYJGCq_YzmLeLHEDfXepIPn8Lmy2MxSI4d4skVRNP_mCt30DQWdIyxg0aOxuwGIWVG00Vp5kWl84xLTQuT8zIOaPWjgFfnI08zMksweoJU3ENnYqV6zvylrcfKEKfgTG1L49CPMvZkzP__KneOyFKUQm9JbYLpgOw1yjh4oWRvq8FuugDEKU8tkBSEhUiuXlHo7CHZWX7pr_F58_GgXXs1VQqKhbzPG4jomf08GVT-GHrqpQkVVaYzsSYDZRyuBm3G9zlb0nw";
		RequestSpecification request = RestAssured.given().header("Authorization","Bearer "+accesstoken2);
		request.header("Content-Type", "application/json");
		JSONObject requestParams = new JSONObject();
		requestParams.put("unitName", "tejsd"); // Cast
		requestParams.put("description", "test 1qa test");
		requestParams.put("symbol", "tt");
		request.body(requestParams.toJSONString());
		io.restassured.response.Response response = request.post("/unittypes");
	 
		int statuscode=response.getStatusCode();
		System.out.println("The status code received is " + statuscode);
		String statusline=response.getStatusLine();
		System.out.println("The status line received is "  + statusline);
		Assert.assertEquals(statuscode,200);
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK", "Correct status code returned");
		
		
	}
	
	/* @Test(priority=2)
	public void invalidcreateunit()
	{		
		RestAssured.baseURI ="http://accelerite-lb-273493239.ap-south-1.elb.amazonaws.com:3000";
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject requestParams = new JSONObject();
		requestParams.put("unitName", ""); 
		requestParams.put("description", "test we1q2a test");
		requestParams.put("symbol", "te");
		request.body(requestParams.toJSONString());
		io.restassured.response.Response response = request.post("/unittypes");
	 
		int statuscode=response.getStatusCode();
		System.out.println("The status code received is " + statuscode);
		String statusline=response.getStatusLine();
		System.out.println("The status line received is "  + statusline);
		Assert.assertEquals(statuscode,500);
		//Assert.assertEquals(statusline, "HTTP/1.1 500 Internal server Error");
		
		
	}
	@Test(priority=3)
	public void duplicatecreateunit()
	{		
		RestAssured.baseURI ="http://accelerite-lb-273493239.ap-south-1.elb.amazonaws.com:3000";
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject requestParams = new JSONObject();
		requestParams.put("unitName", "testr"); 
		requestParams.put("description", "test we1q2a test");
		requestParams.put("symbol", "tt");
		request.body(requestParams.toJSONString());
		io.restassured.response.Response response = request.post("/unittypes");
	 
		int statuscode=response.getStatusCode();
		System.out.println("The status code received is " + statuscode);
		String statusline=response.getStatusLine();
		System.out.println("The status line received is "  + statusline);
		Assert.assertEquals(statuscode,200);
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK", "Correct status code returned");
		//Assert.assertEquals(statusline, "HTTP/1.1 500 Internal server Error");
		
		
	}*/
	}

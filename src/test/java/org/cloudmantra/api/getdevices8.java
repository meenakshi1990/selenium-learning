package org.cloudmantra.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getdevices8 extends fileread {
	
	
@Test(priority=4)
		public void getdevices(){ 
		//PzNjAsIm5iZiI6MCwiaWF0IjoxNTMxMzg3MzYwLCJpc3MiOiJodHRwOi8vMTMuMjMyLjE0NC4yNTU6ODA4MC9hdXRoL3JlYWxtcy9hdXRoZW50aWNhdGUiLCJhdWQiOiJuZXdhY2NlbGVyaXRlIiwic3ViIjoiYTUzYWRmNTktMzlhNS00NGU1LThiNDItNmFkYjc3NDRjMzViIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoibmV3YWNjZWxlcml0ZSIsImF1dGhfdGltZSI6MCwic2Vzc2lvbl9zdGF0ZSI6IjA5YTA2ZTdmLWQzNzktNGQzOS1hODBkLWU3ZTM0YTY2OTJmMyIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiKiJdLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOltudWxsLCJhY2NvdW50X2FkbWluIiwiaG9hX3VzZXIiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NlbGVyaXRlIjp7InJvbGVzIjpbInVtYV9wcm90ZWN0aW9uIl19LCJyZWFsbS1tYW5hZ2VtZW50Ijp7InJvbGVzIjpbInZpZXctcmVhbG0iLCJ2aWV3LWlkZW50aXR5LXByb3ZpZGVycyIsIm1hbmFnZS1pZGVudGl0eS1wcm92aWRlcnMiLCJpbXBlcnNvbmF0aW9uIiwicmVhbG0tYWRtaW4iLCJjcmVhdGUtY2xpZW50IiwibWFuYWdlLXVzZXJzIiwicXVlcnktcmVhbG1zIiwidmlldy1hdXRob3JpemF0aW9uIiwicXVlcnktY2xpZW50cyIsInF1ZXJ5LXVzZXJzIiwibWFuYWdlLWV2ZW50cyIsIm1hbmFnZS1yZWFsbSIsInZpZXctZXZlbnRzIiwidmlldy11c2VycyIsInZpZXctY2xpZW50cyIsIm1hbmFnZS1hdXRob3JpemF0aW9uIiwibWFuYWdlLWNsaWVudHMiLCJxdWVyeS1ncm91cHMiXX19LCJzY29wZSI6ImVtYWlsIHByb2ZpbGUiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsInByZWZlcnJlZF91c2VybmFtZSI6InRyaWd5YV9tbSJ9.YA3xsBJ0QmoIt1By9jMISQILmo6FhrlYR7zYH8wY3dl0CtK2z4e93Vup_FCvP7_gQZ1zq0XGiptxDtd4ZS5IvF-Uzcs9i8Rz1J3yBg7MtQewS-Ouz0HsdsdiKGc8jglNlgwe30cwjDp9R5u1SvKlflJGM6OFENAnwY_mz7Bz4fYC6LnFUQ5YVk5c8heOQ7KrKMaVNaIdH2XtdnO20wFn-Xl4vShmCLoXiJnmwA_28KbIpz6CubawnIKTIVB-pU0grc6LZbC5J7FK-uEJYDZVJzyoCcU0XL6UN08iNQDEYtK0dVSxgQHYZlcCrXPhMF_dLQI722SjRKD64B1mVkxi8g";
			RestAssured.baseURI = configProp.getProperty("baseurl");
			RequestSpecification httpRequest = RestAssured.given().header("Authorization","Bearer "+configProp.getProperty("accessToken"));
	        Response response = httpRequest.request(Method.GET, "/realmrole");
	 
	        String responseBody = response.getBody().asString();
			System.out.println("Response Body is =>  " + responseBody);
			//JSONObject id = responseBody.getJSONObject("id");
			int statuscode=response.getStatusCode();
			String statusline=response.getStatusLine();
			Assert.assertEquals(statuscode,200);
			Assert.assertEquals(statusline, "HTTP/1.1 200 OK", "Correct status code returned");
			JSONParser parse = new JSONParser();
			//Type caste the parsed json data in json object
			JSONObject jobj = null;
			try {
				jobj = (JSONObject)parse.parse(responseBody);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//Store the JSON object in JSON array as objects (For level 1 array element i.e Results)
			JSONArray jsonarr_1 = null;
			try {
				jsonarr_1 = (JSONArray) jobj.get("results");
			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//Get data for Results array
			for(int i=0;i<jsonarr_1.length();i++)
			{
			  //Store the JSON objects in an array
			  //Get the index of the JSON object and print the values as per the index
			  try {
				JSONObject jsonobj_1 = (JSONObject)jsonarr_1.get(i);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
	}
//		@Test(priority=5)
//		public void getdeviceswithid(){   
//			//String accessToken="eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJvM3hIX1ptM1MtX0xKZ1pWU3l6a0RWdVMwcUFtOFdtV21CbWRMU1ZEcC1vIn0.eyJqdGkiOiJmOThhYTk4ZC0zMDE5LTRlZTQtYjBkYy1mNDFhZGM1MjEyOTAiLCJleHAiOjE1MzE0MjMzNjAsIm5iZiI6MCwiaWF0IjoxNTMxMzg3MzYwLCJpc3MiOiJodHRwOi8vMTMuMjMyLjE0NC4yNTU6ODA4MC9hdXRoL3JlYWxtcy9hdXRoZW50aWNhdGUiLCJhdWQiOiJuZXdhY2NlbGVyaXRlIiwic3ViIjoiYTUzYWRmNTktMzlhNS00NGU1LThiNDItNmFkYjc3NDRjMzViIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoibmV3YWNjZWxlcml0ZSIsImF1dGhfdGltZSI6MCwic2Vzc2lvbl9zdGF0ZSI6IjA5YTA2ZTdmLWQzNzktNGQzOS1hODBkLWU3ZTM0YTY2OTJmMyIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiKiJdLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOltudWxsLCJhY2NvdW50X2FkbWluIiwiaG9hX3VzZXIiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NlbGVyaXRlIjp7InJvbGVzIjpbInVtYV9wcm90ZWN0aW9uIl19LCJyZWFsbS1tYW5hZ2VtZW50Ijp7InJvbGVzIjpbInZpZXctcmVhbG0iLCJ2aWV3LWlkZW50aXR5LXByb3ZpZGVycyIsIm1hbmFnZS1pZGVudGl0eS1wcm92aWRlcnMiLCJpbXBlcnNvbmF0aW9uIiwicmVhbG0tYWRtaW4iLCJjcmVhdGUtY2xpZW50IiwibWFuYWdlLXVzZXJzIiwicXVlcnktcmVhbG1zIiwidmlldy1hdXRob3JpemF0aW9uIiwicXVlcnktY2xpZW50cyIsInF1ZXJ5LXVzZXJzIiwibWFuYWdlLWV2ZW50cyIsIm1hbmFnZS1yZWFsbSIsInZpZXctZXZlbnRzIiwidmlldy11c2VycyIsInZpZXctY2xpZW50cyIsIm1hbmFnZS1hdXRob3JpemF0aW9uIiwibWFuYWdlLWNsaWVudHMiLCJxdWVyeS1ncm91cHMiXX19LCJzY29wZSI6ImVtYWlsIHByb2ZpbGUiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsInByZWZlcnJlZF91c2VybmFtZSI6InRyaWd5YV9tbSJ9.YA3xsBJ0QmoIt1By9jMISQILmo6FhrlYR7zYH8wY3dl0CtK2z4e93Vup_FCvP7_gQZ1zq0XGiptxDtd4ZS5IvF-Uzcs9i8Rz1J3yBg7MtQewS-Ouz0HsdsdiKGc8jglNlgwe30cwjDp9R5u1SvKlflJGM6OFENAnwY_mz7Bz4fYC6LnFUQ5YVk5c8heOQ7KrKMaVNaIdH2XtdnO20wFn-Xl4vShmCLoXiJnmwA_28KbIpz6CubawnIKTIVB-pU0grc6LZbC5J7FK-uEJYDZVJzyoCcU0XL6UN08iNQDEYtK0dVSxgQHYZlcCrXPhMF_dLQI722SjRKD64B1mVkxi8g";
//			RestAssured.baseURI = configProp.getProperty("baseurl");
//	 
//			
//			
//			RequestSpecification httpRequest = RestAssured.given().header("Authorization","Bearer "+configProp.getProperty("accessToken"));
//			
//			Response response = httpRequest.request(Method.GET, "/device/3c48ac24-9b6f-4957-8267-cc9c7b83d67f");
//	 
//			//httpRequest.auth().oauth2(accessToken);
//			String responseBody = response.getBody().asString();
//			System.out.println("Response Body is =>  " + responseBody);
//			int statuscode=response.getStatusCode();
//			String statusline=response.getStatusLine();
//			Assert.assertEquals(statuscode,200);
//			Assert.assertEquals(statusline, "HTTP/1.1 200 OK", "Correct status code returned");
//			
//	}
//		@Test(priority=6)
//		public void getdeviceswithinvalidid(){   
//			//String accessToken="eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJvM3hIX1ptM1MtX0xKZ1pWU3l6a0RWdVMwcUFtOFdtV21CbWRMU1ZEcC1vIn0.eyJqdGkiOiJmOThhYTk4ZC0zMDE5LTRlZTQtYjBkYy1mNDFhZGM1MjEyOTAiLCJleHAiOjE1MzE0MjMzNjAsIm5iZiI6MCwiaWF0IjoxNTMxMzg3MzYwLCJpc3MiOiJodHRwOi8vMTMuMjMyLjE0NC4yNTU6ODA4MC9hdXRoL3JlYWxtcy9hdXRoZW50aWNhdGUiLCJhdWQiOiJuZXdhY2NlbGVyaXRlIiwic3ViIjoiYTUzYWRmNTktMzlhNS00NGU1LThiNDItNmFkYjc3NDRjMzViIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoibmV3YWNjZWxlcml0ZSIsImF1dGhfdGltZSI6MCwic2Vzc2lvbl9zdGF0ZSI6IjA5YTA2ZTdmLWQzNzktNGQzOS1hODBkLWU3ZTM0YTY2OTJmMyIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiKiJdLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOltudWxsLCJhY2NvdW50X2FkbWluIiwiaG9hX3VzZXIiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NlbGVyaXRlIjp7InJvbGVzIjpbInVtYV9wcm90ZWN0aW9uIl19LCJyZWFsbS1tYW5hZ2VtZW50Ijp7InJvbGVzIjpbInZpZXctcmVhbG0iLCJ2aWV3LWlkZW50aXR5LXByb3ZpZGVycyIsIm1hbmFnZS1pZGVudGl0eS1wcm92aWRlcnMiLCJpbXBlcnNvbmF0aW9uIiwicmVhbG0tYWRtaW4iLCJjcmVhdGUtY2xpZW50IiwibWFuYWdlLXVzZXJzIiwicXVlcnktcmVhbG1zIiwidmlldy1hdXRob3JpemF0aW9uIiwicXVlcnktY2xpZW50cyIsInF1ZXJ5LXVzZXJzIiwibWFuYWdlLWV2ZW50cyIsIm1hbmFnZS1yZWFsbSIsInZpZXctZXZlbnRzIiwidmlldy11c2VycyIsInZpZXctY2xpZW50cyIsIm1hbmFnZS1hdXRob3JpemF0aW9uIiwibWFuYWdlLWNsaWVudHMiLCJxdWVyeS1ncm91cHMiXX19LCJzY29wZSI6ImVtYWlsIHByb2ZpbGUiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsInByZWZlcnJlZF91c2VybmFtZSI6InRyaWd5YV9tbSJ9.YA3xsBJ0QmoIt1By9jMISQILmo6FhrlYR7zYH8wY3dl0CtK2z4e93Vup_FCvP7_gQZ1zq0XGiptxDtd4ZS5IvF-Uzcs9i8Rz1J3yBg7MtQewS-Ouz0HsdsdiKGc8jglNlgwe30cwjDp9R5u1SvKlflJGM6OFENAnwY_mz7Bz4fYC6LnFUQ5YVk5c8heOQ7KrKMaVNaIdH2XtdnO20wFn-Xl4vShmCLoXiJnmwA_28KbIpz6CubawnIKTIVB-pU0grc6LZbC5J7FK-uEJYDZVJzyoCcU0XL6UN08iNQDEYtK0dVSxgQHYZlcCrXPhMF_dLQI722SjRKD64B1mVkxi8g";
//			RestAssured.baseURI = configProp.getProperty("baseurl");
//	 
//			
//			
//			RequestSpecification httpRequest = RestAssured.given().header("Authorization","Bearer "+configProp.getProperty("accessToken"));
//			
//			Response response = httpRequest.request(Method.GET, "/device/fae2717b-0781-4e7e-a4ab-3d9454439fbef823b");
//	 
//			//httpRequest.auth().oauth2(accessToken);
//			String responseBody = response.getBody().asString();
//			System.out.println("Response Body is =>  " + responseBody);
//			int statuscode=response.getStatusCode();
//			String statusline=response.getStatusLine();
//			Assert.assertEquals(statuscode,404);
//			Assert.assertEquals(statusline, "Conflict");
//			
//	}
	}
}

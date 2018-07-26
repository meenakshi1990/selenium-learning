package org.cloudmantra.api;

import org.json.JSONException;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class configurelightcost {
	public JSONObject attributes() throws JSONException{
		JSONObject params = new JSONObject();
	    params.put( "costPerKwh", "2232.3");
	    return params;
	}

	@Test
	public void configurelightcost()
	{		
		RestAssured.baseURI ="http://accelerite-lb-273493239.ap-south-1.elb.amazonaws.com:3000";
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject requestParams = new JSONObject();
		requestParams.put("id", "te1st"); // Cast
		try {
			requestParams.put("attributes", attributes());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.body(requestParams.toJSONString());
		io.restassured.response.Response response = request.post("/configuration/light/cost");
	 
		int statuscode=response.getStatusCode();
		System.out.println("The status code received is " + statuscode);
		String statusline=response.getStatusLine();
		System.out.println("The status line received is "  + statusline);
		Assert.assertEquals(statuscode,200);
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK", "Correct status code returned");
	}
}
		
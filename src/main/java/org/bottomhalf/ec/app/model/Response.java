package org.bottomhalf.ec.app.model;

import java.util.Optional;

public class Response implements IResponse{
	private Object data;
	private int statusCode;
	private String message;
	
	private static Response getResponseInstance(Object data,String message) {
		Response response = new Response();
		return response;
	}
	public static Response ok(Optional<Object> data,String message) {
		System.out.println("ok-2");
		Response response=getResponseInstance(data, message);
		response.setStatuscode(200);
		return response;
	}
	public static Response ok(String message) {
		System.out.println("ok-1");
		Response response=getResponseInstance(null, message);
		response.setStatuscode(200);
		return response;
	}
	
	
	public static Response fail(Object data,String message) {
		Response response=getResponseInstance(data, message);
		response.setStatuscode(500);
		return response;
	}
	public static Response auth(Object data,String message) {
		Response response=getResponseInstance(data, message);
		response.setStatuscode(401);
		return response;
	}
	
	//Getters and Setters
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public int getStatuscode() {
		return statusCode;
	}
	public void setStatuscode(int statuscode) {
		this.statusCode = statuscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}

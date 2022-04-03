package com.soap.rpc;

import javax.jws.WebService;

@WebService(endpointInterface="com.soap.rpc.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hllo World JAX-WS "+name;
	}
	
}

package com.infosys.exceltranslator.webservice.app;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.xml.ws.Endpoint;

import com.infosys.exceltranslator.webservice.impl.InitWebServiceImpl;

public class WebServicePublisher {

	public static void main(String[] args) {
		Properties wsProperties = WebServicePublisher.getWebServiceInitProperties();
		String wsAddress = (String) wsProperties.get("exceltranslatorwebservice.publisher.address");
		String wsMethodInit = "/ws/init";
		
		Endpoint.publish(wsAddress + wsMethodInit, new InitWebServiceImpl());
	}
	
	public static Properties getWebServiceInitProperties(){
		Properties wsProperties = new Properties();
		try {
			InputStream fis = WebServicePublisher.class.getClassLoader().getResourceAsStream("properties/webservice-init.properties");
			wsProperties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return wsProperties;
	}

}

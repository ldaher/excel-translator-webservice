/**
 * 
 */
package com.infosys.exceltranslator.webservice.impl;

import javax.jws.WebService;

import com.infosys.exceltranslator.webservice.InitWebService;

/**
 * @author ldaher
 *
 */
@WebService(endpointInterface="com.infosys.exceltranslator.webservice.InitWebService")
public class InitWebServiceImpl implements InitWebService {

	@Override
	public String sayHello(String name, String surname) {
		return "Hi " + name + " " + surname;
	}
}

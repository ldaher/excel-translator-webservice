/**
 * 
 */
package com.infosys.exceltranslator.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * @author ldaher
 *
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface InitWebService {
	
	/**
	 * Returns a simple text message
	 * 
	 * @param name the first name 
	 * @param surname the last name
	 * @return random greeting message
	 */
	@WebMethod
	public String sayHello(@WebParam(name="name") String name, @WebParam(name="surname") String surname);

}

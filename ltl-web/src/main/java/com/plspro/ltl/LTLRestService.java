package com.plspro.ltl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.pls.service.ltl.LTLService;

@Stateless
@Path("/rest")
public class LTLRestService {

	@EJB
	private LTLService ltlService;
	
	@GET
	@Path("/")
	public String test() {
		return "Test!!!" + ltlService;
	}
	
}

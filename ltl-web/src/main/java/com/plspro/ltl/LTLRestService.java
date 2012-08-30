package com.plspro.ltl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.pls.service.ltl.LTLService;
import com.pls.service.ltl.dto.TestDTO;

@Stateless
@Path("/rest")
@Produces(MediaType.APPLICATION_JSON)
public class LTLRestService {

	@EJB
	private LTLService ltlService;

	@GET
	@Path("/test")
	public TestDTO businessMethod(@QueryParam("param") String param) {
		return ltlService.businessMethod(param);
	}
}

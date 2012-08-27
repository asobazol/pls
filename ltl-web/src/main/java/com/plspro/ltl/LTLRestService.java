package com.plspro.ltl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.pls.service.ltl.LTLService;
import com.pls.service.ltl.dto.TestDTO;

@Stateless
@Path("/rest")
public class LTLRestService {

	@EJB
	private LTLService ltlService;

	@GET
	@Path("/test")
	public TestDTO businessMethod(@QueryParam("param") String param) {
		return ltlService.businessMethod(param);
	}
}

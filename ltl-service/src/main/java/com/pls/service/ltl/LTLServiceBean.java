package com.pls.service.ltl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.pls.dao.ltl.CustomerDao;
import com.pls.domain.ltl.Customer;
import com.pls.service.ltl.dto.TestDTO;

@Stateless
public class LTLServiceBean implements LTLService {

	@EJB
	private CustomerDao customerDao;
	
	@Override
	public TestDTO businessMethod(String param) {
		customerDao.persist(new Customer(param));
		return new TestDTO(param);
	}

}

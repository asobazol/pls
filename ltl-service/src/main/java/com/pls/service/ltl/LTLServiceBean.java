package com.pls.service.ltl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.pls.dao.ltl.CustomerDao;
import com.pls.domain.ltl.Customer;

@Stateless
public class LTLServiceBean implements LTLService {

	@EJB
	private CustomerDao customerDao;
	
	@Override
	public String test(String str) {
		customerDao.persist(new Customer(str));
		return str;
	}

}

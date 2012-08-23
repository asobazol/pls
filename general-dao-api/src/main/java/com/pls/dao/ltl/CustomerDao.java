package com.pls.dao.ltl;

import javax.ejb.Local;

import com.pls.dao.AbstractDao;
import com.pls.domain.ltl.Customer;

@Local
public interface CustomerDao extends AbstractDao<Customer, Integer> {
}

package com.pls.dao.ltl;

import javax.ejb.Stateless;

import com.pls.dao.AbstractDaoImpl;
import com.pls.domain.ltl.Customer;

@Stateless
public class CustomerDaoBean extends AbstractDaoImpl<Customer, Integer> implements CustomerDao {
}

package com.pls.dao.ltl;

import javax.ejb.Stateless;

import com.pls.dao.AbstractDaoImpl;
import com.pls.domain.ltl.BillingAddress;

@Stateless
public class BillingAddressDaoBean extends AbstractDaoImpl<BillingAddress, Integer> implements BillingAddressDao {
}

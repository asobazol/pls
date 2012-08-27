package com.pls.service.ltl;

import javax.ejb.Local;

import com.pls.service.ltl.dto.TestDTO;

@Local
public interface LTLService {
	public TestDTO businessMethod(String param);
}

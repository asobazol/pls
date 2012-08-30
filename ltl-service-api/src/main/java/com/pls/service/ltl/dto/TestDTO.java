package com.pls.service.ltl.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "test")
public class TestDTO {

	private String param;
	
	public TestDTO() {
	}

	public TestDTO(String param) {
		this.param = param;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}
}

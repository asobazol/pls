package com.pls.ltl.client;

import com.google.gwt.core.client.JavaScriptObject;

public class TestDTO extends JavaScriptObject {
	
	protected TestDTO() {
	}
	
	public final native String getParam() /*-{
    	return this.param;
	}-*/;
}

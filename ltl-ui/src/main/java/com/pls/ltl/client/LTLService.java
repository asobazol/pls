package com.pls.ltl.client;

import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class LTLService {

	public void businessMethod(String param, final AsyncCallback<TestDTO> callback) throws RequestException {
		String url = "/ltl/rest/test?param=" + param;
		RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, URL.encode(url));
		builder.sendRequest(null, new RequestCallback() {
			
			@Override
			public void onResponseReceived(Request request, Response response) {
				callback.onSuccess((TestDTO) parse(response.getText()));
			}
			
			@Override
			public void onError(Request request, Throwable exception) {
				callback.onFailure(exception);
			}
		});
	}
	
	public static final native Object parse(String json) /*-{
    	return JSON.parse(json);
	}-*/;
}

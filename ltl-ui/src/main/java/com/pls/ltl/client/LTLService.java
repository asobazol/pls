package com.pls.ltl.client;

import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.Window;

public class LTLService {

	public void businessMethod(String param) throws RequestException {
		String url = "/ltl/rest/test?param=" + param;
		RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, URL.encode(url));
		builder.sendRequest(null, new RequestCallback() {
			
			@Override
			public void onResponseReceived(Request request, Response response) {
				Window.alert(response.getText());
			}
			
			@Override
			public void onError(Request request, Throwable exception) {
				Window.alert("Error: " + exception.getMessage());
			}
		});
	}
}

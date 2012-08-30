package com.pls.ltl.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

public class LTLEntryPoint implements EntryPoint, AsyncCallback<TestDTO> {

	private LTLService ltlService = new LTLService();
	
	@Override
	public void onModuleLoad() {
		final TextBox textBox = new TextBox();
		Button button = new Button("Test");
		RootPanel.get().add(textBox);
		RootPanel.get().add(button);
		
		button.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				try {
					ltlService.businessMethod(textBox.getText(), LTLEntryPoint.this);
				} catch (RequestException e) {
					Window.alert(e.getMessage());
				}
			}
		});
	}

	@Override
	public void onFailure(Throwable caught) {
		Window.alert(caught.getMessage());
	}

	@Override
	public void onSuccess(TestDTO result) {
		Window.alert(result.getParam());
	}
}

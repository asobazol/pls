package com.pls.ltl.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

public class LTLEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		TextBox textBox = new TextBox();
		Button button = new Button("Test");
		RootPanel.get().add(textBox);
		RootPanel.get().add(button);
		
		button.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("!!!");
			}
		});
	}

}

package org.vaadin.addons.ratingbar.test;

import javax.servlet.annotation.WebServlet;

import org.vaadin.addons.ratingbar.RatingBar;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.data.util.ObjectProperty;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.communication.PushMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("ratingbar")
@Widgetset("org.vaadin.addons.ratingbar.RatingBarWidgetset")
@Push(PushMode.AUTOMATIC)
public class RatingbarUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = RatingbarUI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);

		Button button = new Button("Click Me");
		final TextField textField = new TextField(new ObjectProperty<Integer>(3, Integer.class));
		final RatingBar ratingBar = new RatingBar((Integer) textField.getPropertyDataSource().getValue());

		button.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				//ratingBar.setValue((Integer) textField.getPropertyDataSource().getValue());
			}
		});

		layout.addComponent(button);
		layout.addComponent(textField);
		layout.addComponent(ratingBar);
	}

}
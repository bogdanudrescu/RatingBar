package org.vaadin.addons.ratingbar.client;

import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Widget;

/**
 * This should show rating info.
 * 
 * @author bogdanudrescu
 */
public class VRatingBar extends Widget {

	/*
	 * A dummy element.
	 */
	private AnchorElement element;

	/**
	 * Create the rating bar.
	 */
	public VRatingBar() {

		element = Document.get().createAnchorElement();

		setElement(element);

		element.setHref("http://www.vaadin.com");
		element.appendChild(Document.get().createTextNode("Go to Vaadin"));

		DivElement ratingsElement = Document.get().createDivElement();
		element.appendChild(ratingsElement);

		for (int i = 0; i < 5; i++) {
			DivElement item = Document.get().createDivElement();
			item.addClassName("burst-12");

			ratingsElement.appendChild(item);
		}

		setValue(12);
	}

	/**
	 * Sets the rating value.
	 * @param value	the rating.
	 */
	public void setValue(double value) {
		callAlert("I receive: " + value);

		element.setHref("vaadin.com/" + value);
		element.getFirstChild().setNodeValue("Go to Vaadin " + value);
	}

	/*
	 * Testing JSNI.
	 */
	private native void callAlert(String message) /*-{
													alert(message);
													}-*/;

}

package org.vaadin.addons.ratingbar.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
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
	private Element element;

	/*
	 * The rating items.
	 */
	private List<Element> items = new ArrayList<Element>(5);

	/**
	 * Create the rating bar.
	 */
	public VRatingBar() {

		element = Document.get().createDivElement();

		// This is actually a horizontal layout ;)
		element.addClassName("v-horizontallayout");
		element.addClassName("v-layout");
		element.addClassName("v-horizontal");

		for (int i = 0; i < 5; i++) {
			DivElement slotElement = Document.get().createDivElement();
			slotElement.addClassName("v-slot"); // Need to add the slot, otherwise won't work.

			DivElement item = Document.get().createDivElement();

			if (i < 3) {
				item.addClassName("v-rating-item-selected");
			} else {
				item.addClassName("v-rating-item");
			}

			items.add(item);

			slotElement.appendChild(item);

			element.appendChild(slotElement);
		}

		setElement(element);

		setValue(12);
	}

	/**
	 * Sets the rating value.
	 * @param value	the rating.
	 */
	public void setValue(double value) {
		callAlert("I receive: " + value);
	}

	/*
	 * Testing JSNI.
	 */
	private native void callAlert(String message) /*-{
													alert(message);
													}-*/;

}

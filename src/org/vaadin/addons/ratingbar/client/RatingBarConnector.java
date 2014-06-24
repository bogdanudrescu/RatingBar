package org.vaadin.addons.ratingbar.client;

import org.vaadin.addons.ratingbar.RatingBar;
import org.vaadin.addons.ratingbar.shared.RatingBarState;

import com.vaadin.client.ui.AbstractFieldConnector;
import com.vaadin.shared.ui.Connect;

/**
 * Connects the widget with the server side.
 * 
 * @author bogdanudrescu
 */
@SuppressWarnings("serial")
@Connect(RatingBar.class)
public class RatingBarConnector extends AbstractFieldConnector {

	//	protected RatingBarState createState() {
	//		//		return new RatingBarState();
	//		return (RatingBarState) super.createState();
	//	}
	//
	//	protected VRatingBar createWidget() {
	//		//		return new VRatingBar();
	//		return GWT.create(VRatingBar.class);
	//	}

	public VRatingBar getWidget() {
		return (VRatingBar) super.getWidget();
	}

	public RatingBarState getState() {
		return (RatingBarState) super.getState();
	}

}

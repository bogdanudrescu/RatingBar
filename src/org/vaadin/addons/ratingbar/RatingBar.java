package org.vaadin.addons.ratingbar;

import org.vaadin.addons.ratingbar.shared.RatingBarState;

import com.vaadin.ui.AbstractField;

/**
 * Rating bar component.
 * 
 * @author bogdanudrescu
 */
@SuppressWarnings("serial")
public class RatingBar extends AbstractField<Double> {

	/*
	 * The rating component state.
	 */
	private RatingBarState state;

	public RatingBar() {
	}

	public RatingBar(int value) {
		setValue(value);
	}

	public RatingBar(double value) {
		setValue(value);
	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.AbstractClientConnector#createState()
	 */
	@Override
	protected RatingBarState createState() {
		state = new RatingBarState();
		return state;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.AbstractField#setValue(java.lang.Object)
	 */
	@Override
	public void setValue(Double value) {
		super.setValue(value);
		//		getState().value = value;
		state.value = value;
	}

	/**
	 * Sets the rating value as an int.
	 * @param value	the rating.
	 */
	public void setValue(int value) {
		System.out.println("-> value: " + value);
		setValue(new Double(value));
	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.AbstractField#getType()
	 */
	@Override
	public Class<? extends Double> getType() {
		return Double.class;
	}

}

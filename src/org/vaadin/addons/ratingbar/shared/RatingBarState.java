package org.vaadin.addons.ratingbar.shared;

import com.vaadin.shared.AbstractFieldState;
import com.vaadin.shared.annotations.DelegateToWidget;

/**
 * Shared state with the rating info.
 * 
 * @author bogdanudrescu
 */
@SuppressWarnings("serial")
public class RatingBarState extends AbstractFieldState {

	/**
	 * The rating.
	 */
	@DelegateToWidget("setValue")
	public double value;

}

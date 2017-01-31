package com.techelevator.shoppingcart;

/**
 * This class represents a shopping cart that you can add different priced items to.  
 */
public class ShoppingCart {

	private int totalNumberOfItems;
	private double totalAmountOwed;

	//
	// Add any properties, along with getters and/or setters, that may be needed to implements the class methods and/or constructors.
	//

	public ShoppingCart() {
		totalNumberOfItems = 0;
		totalAmountOwed = 0.00;
	}

	/**
	 * Adds items to the cart.
	 * 
	 * @param numberOfItems the number of items being added to the cart
	 * @param pricePerItem the price per item being added to the cart
	 */
	public void addItems(int numberOfItems, double pricePerItem) {
		totalNumberOfItems = totalNumberOfItems + numberOfItems;
		totalAmountOwed = totalAmountOwed + numberOfItems * pricePerItem;
	}

	/**
	 * @return the total number of items that have been added to this cart
	 */
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}	

	// don't want to set this, can only change number of items through addItems or Empty methods
	//	public void setTotalNumberOfItems(int totalNumberOfItems) {
	//		this.totalNumberOfItems = totalNumberOfItems;
	//	}


	/**
	 * @return the total price of all items that have been added to the cart
	 */
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}

	/**
	 * The average price of all items that have been added to the cart.  This should be equal to 
	 * the totalAmountOwed divided by the totalNumberOfItems.
	 * 
	 * @return the average price of items added to the cart
	 */

	//user does not need to know how to get the AveragePricePerItem (black box)
	public double getAveragePricePerItem() {
		if(totalNumberOfItems == 0 || totalAmountOwed == 0){
			return 0.00;
		}
		return  totalAmountOwed / totalNumberOfItems;
	}

	/**
	 * Removes all items from this cart.
	 */
	public void empty() {
		totalNumberOfItems = 0;
		totalAmountOwed = 0.00;

	}
}

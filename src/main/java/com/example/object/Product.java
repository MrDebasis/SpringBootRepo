package com.example.object;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
	@JsonProperty(value="id")
	private Integer id;
	
	@JsonProperty(value="item_name")
	private String itemName;
	
	@JsonProperty(value="item_description")
	private String itemDescription;
	
	@JsonProperty(value="price")
	private String price;
	
	@JsonProperty(value="available_Quantity")
	private String availableQuantity;

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return the itemDescription
	 */
	public String getItemDescription() {
		return itemDescription;
	}

	/**
	 * @param itemDescription the itemDescription to set
	 */
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return the availableQuantity
	 */
	public String getAvailableQuantity() {
		return availableQuantity;
	}

	/**
	 * @param availableQuantity the availableQuantity to set
	 */
	public void setAvailableQuantity(String availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	@Override
	public String toString() {
		return "Product [itemName=" + itemName + ", itemDescription=" + itemDescription + ", price=" + price
				+ ", availableQuantity=" + availableQuantity + "]";
	}
	
	

}
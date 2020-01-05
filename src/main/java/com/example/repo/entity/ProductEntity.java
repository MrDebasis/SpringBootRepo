package com.example.repo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PRODUCT")
public class ProductEntity {
	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column(name="ITEM_NAME")
   private String itemName;
	
	@Column(name="ITEM_DESCRIPTION")
	private String itemDescription;
	
	@Column(name="PRICE")
	private String price;
	
	@Column(name="AVAILABLE_QUANTITY")
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
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @param availableQuantity the availableQuantity to set
	 */
	public void setAvailableQuantity(String availableQuantity) {
		this.availableQuantity = availableQuantity;
	}


	@Override
	public String toString() {
		return "ProductEntity [itemName=" + itemName + ", itemDescription=" + itemDescription + ", price=" + price
				+ ", availableQuantity=" + availableQuantity + "]";
	}
	


}

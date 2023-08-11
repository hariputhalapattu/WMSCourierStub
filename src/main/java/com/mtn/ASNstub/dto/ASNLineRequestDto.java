package com.mtn.ASNstub.dto;

import lombok.Data;

@Data
public class ASNLineRequestDto {
	private String lineId;
	private String lineNumber;
	private String itemId;
	private String itemDescription;
	private String quantity;
	private String unitOfMeasure;
	private String creationDate;
	private String insuranceValue;
	private String basePriceValue;
	private String device;
	ASNRequestDeliveryAddress lineDeliveryAddress;// line delivery address
	ASNRequestCollectionAddress lineCollectionAddress;// line collection address

	public String getLineId() {
		return lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public String getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getInsuranceValue() {
		return insuranceValue;
	}

	public void setInsuranceValue(String insuranceValue) {
		this.insuranceValue = insuranceValue;
	}

	public String getBasePriceValue() {
		return basePriceValue;
	}

	public void setBasePriceValue(String basePriceValue) {
		this.basePriceValue = basePriceValue;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public ASNRequestDeliveryAddress getLineDeliveryAddress() {
		return lineDeliveryAddress;
	}

	public void setLineDeliveryAddress(ASNRequestDeliveryAddress lineDeliveryAddress) {
		this.lineDeliveryAddress = lineDeliveryAddress;
	}

	public ASNRequestCollectionAddress getLineCollectionAddress() {
		return lineCollectionAddress;
	}

	public void setLineCollectionAddress(ASNRequestCollectionAddress lineCollectionAddress) {
		this.lineCollectionAddress = lineCollectionAddress;
	}

}

package com.mtn.ASNstub.dto;

import lombok.Data;

@Data
public class WMSLineRequestDto {
	private String orderLine;
	private String erpSoLineId;
	private String skuId;
	private String inventoryItemId;
	private String inventoryStatus;
	private String inputUom;
	private String qty;
	private String unitPrice;
	private String replacementPrice;
	private String taxValue;
	private String notes;
	public String getOrderLine() {
		return orderLine;
	}
	public void setOrderLine(String orderLine) {
		this.orderLine = orderLine;
	}
	public String getErpSoLineId() {
		return erpSoLineId;
	}
	public void setErpSoLineId(String erpSoLineId) {
		this.erpSoLineId = erpSoLineId;
	}
	public String getSkuId() {
		return skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public String getInventoryItemId() {
		return inventoryItemId;
	}
	public void setInventoryItemId(String inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}
	public String getInventoryStatus() {
		return inventoryStatus;
	}
	public void setInventoryStatus(String inventoryStatus) {
		this.inventoryStatus = inventoryStatus;
	}
	public String getInputUom() {
		return inputUom;
	}
	public void setInputUom(String inputUom) {
		this.inputUom = inputUom;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getReplacementPrice() {
		return replacementPrice;
	}
	public void setReplacementPrice(String replacementPrice) {
		this.replacementPrice = replacementPrice;
	}
	public String getTaxValue() {
		return taxValue;
	}
	public void setTaxValue(String taxValue) {
		this.taxValue = taxValue;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
}

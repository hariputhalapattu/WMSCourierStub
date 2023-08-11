package com.mtn.ASNstub.dto;

import java.util.Date;
import java.util.Set;

import lombok.Data;

@Data
public class ASNRequestDto {
	private String sourceSystemId;
	private String sourceSystemName;
	private String targetSystemId;
	private String targetSystemName;
	private String orderNumber;
	private String sourceSalesOrder;
	private String sourcePurchaseOrder;
	private String orderType;
	private String requestType;
	private String priority;
	private String ricaFlag;
	private Date creationDate;
	ASNRequestCollectionAddress requestCollectionAddress;// collection address
	ASNRequestDeliveryAddress requestDeliveryAddress;// delivery address
	ASNRequestDeliveryContact requestDeliveryContact;// delivery contact
	ASNRequestCollectionContact requestCollectionContact;// collection contact
	private String price;

	Set<ASNLineRequestDto> ASNLineRequest; // line details

	public String getSourceSystemId() {
		return sourceSystemId;
	}

	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getSourceSystemName() {
		return sourceSystemName;
	}

	public void setSourceSystemName(String sourceSystemName) {
		this.sourceSystemName = sourceSystemName;
	}

	public String getTargetSystemId() {
		return targetSystemId;
	}

	public void setTargetSystemId(String targetSystemId) {
		this.targetSystemId = targetSystemId;
	}

	public String getTargetSystemName() {
		return targetSystemName;
	}

	public void setTargetSystemName(String targetSystemName) {
		this.targetSystemName = targetSystemName;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getSourceSalesOrder() {
		return sourceSalesOrder;
	}

	public void setSourceSalesOrder(String sourceSalesOrder) {
		this.sourceSalesOrder = sourceSalesOrder;
	}

	public String getSourcePurchaseOrder() {
		return sourcePurchaseOrder;
	}

	public void setSourcePurchaseOrder(String sourcePurchaseOrder) {
		this.sourcePurchaseOrder = sourcePurchaseOrder;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getRicaFlag() {
		return ricaFlag;
	}

	public void setRicaFlag(String ricaFlag) {
		this.ricaFlag = ricaFlag;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public ASNRequestCollectionAddress getRequestCollectionAddress() {
		return requestCollectionAddress;
	}

	public void setRequestCollectionAddress(ASNRequestCollectionAddress requestCollectionAddress) {
		this.requestCollectionAddress = requestCollectionAddress;
	}

	public ASNRequestDeliveryAddress getRequestDeliveryAddress() {
		return requestDeliveryAddress;
	}

	public void setRequestDeliveryAddress(ASNRequestDeliveryAddress requestDeliveryAddress) {
		this.requestDeliveryAddress = requestDeliveryAddress;
	}

	public ASNRequestDeliveryContact getRequestDeliveryContact() {
		return requestDeliveryContact;
	}

	public void setRequestDeliveryContact(ASNRequestDeliveryContact requestDeliveryContact) {
		this.requestDeliveryContact = requestDeliveryContact;
	}

	public ASNRequestCollectionContact getRequestCollectionContact() {
		return requestCollectionContact;
	}

	public void setRequestCollectionContact(ASNRequestCollectionContact requestCollectionContact) {
		this.requestCollectionContact = requestCollectionContact;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Set<ASNLineRequestDto> getASNLineRequest() {
		return ASNLineRequest;
	}

	public void setASNLineRequest(Set<ASNLineRequestDto> aSNLineRequest) {
		ASNLineRequest = aSNLineRequest;
	}

}

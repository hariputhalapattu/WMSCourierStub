package com.mtn.ASNstub.dto;

import java.util.Set;

import lombok.Data;

@Data
public class WMSRequestDto {
	private String transactionSource;
	private String transactionReference;
	private String customerAccNo;
	private String customerName;
	private String consignee;
	private String company;
	private String companyName;
	private String companyType;
	private String vatNumber;
	private String channelId;
	private String dealerId;
	private String erpsoHeaderId;
	private String orderId;
	private String orderType;
	private String referenceOrd;
	private String hostOrderId;
	private String createDate;
	private String requestedDate;
	private String partialDelivery;
	private String fullPallet;
	private String route;
	private String orderPriority;
	private String paymentTerms;
	private String hardcopyInvoiceReqd;
	private String hardcopyManifestReqd;
	WMSContacts wmsContacts;// contacts
	Set<WMSLineRequestDto> wmsLineRequest;// lines

}

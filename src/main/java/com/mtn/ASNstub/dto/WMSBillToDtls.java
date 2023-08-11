package com.mtn.ASNstub.dto;

import lombok.Data;

@Data
public class WMSBillToDtls {
	private String billTo;
	private String street1;
	private String street2;
	private String street3;
	private String street4;
	private String city;
	private String zip;
	private String contact1Name;
	private String contact2Name;
	private String contact1Phone;
	private String contact2Phone;
	private String contact1Email;

	public String getBillTo() {
		return billTo;
	}

	public void setBillTo(String billTo) {
		this.billTo = billTo;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getStreet3() {
		return street3;
	}

	public void setStreet3(String street3) {
		this.street3 = street3;
	}

	public String getStreet4() {
		return street4;
	}

	public void setStreet4(String street4) {
		this.street4 = street4;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getContact1Name() {
		return contact1Name;
	}

	public void setContact1Name(String contact1Name) {
		this.contact1Name = contact1Name;
	}

	public String getContact2Name() {
		return contact2Name;
	}

	public void setContact2Name(String contact2Name) {
		this.contact2Name = contact2Name;
	}

	public String getContact1Phone() {
		return contact1Phone;
	}

	public void setContact1Phone(String contact1Phone) {
		this.contact1Phone = contact1Phone;
	}

	public String getContact2Phone() {
		return contact2Phone;
	}

	public void setContact2Phone(String contact2Phone) {
		this.contact2Phone = contact2Phone;
	}

	public String getContact1Email() {
		return contact1Email;
	}

	public void setContact1Email(String contact1Email) {
		this.contact1Email = contact1Email;
	}

}

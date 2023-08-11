package com.mtn.ASNstub.dto;

import lombok.Data;

@Data
public class WMSContacts {
	WMSBillToDtls wmsBillToDtls;
	WMSShipToDtls wmsShipToDtls;
	public WMSBillToDtls getWmsBillToDtls() {
		return wmsBillToDtls;
	}
	public void setWmsBillToDtls(WMSBillToDtls wmsBillToDtls) {
		this.wmsBillToDtls = wmsBillToDtls;
	}
	public WMSShipToDtls getWmsShipToDtls() {
		return wmsShipToDtls;
	}
	public void setWmsShipToDtls(WMSShipToDtls wmsShipToDtls) {
		this.wmsShipToDtls = wmsShipToDtls;
	}
	
	
}

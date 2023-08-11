package com.mtn.ASNstub.services;

import com.mtn.ASNstub.dto.ASNRequestDto;
import com.mtn.ASNstub.dto.WMSRequestDto;

public interface ASNservice {
	public void asnresp(ASNRequestDto asnreq);
	public void wmsHardReserve(WMSRequestDto request);
}

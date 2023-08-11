package com.mtn.ASNstub.services;

import org.springframework.stereotype.Service;

import com.mtn.ASNstub.dto.ASNRequestDto;
import com.mtn.ASNstub.dto.WMSRequestDto;
import com.mtn.ASNstub.exceptions.BusinessErrorException;

@Service
public class ASNserviceImpl implements ASNservice {

	@Override
	public void asnresp(ASNRequestDto asnreq) {
		if(null != asnreq) {
			if (null == asnreq.getOrderNumber() || null == asnreq.getSourceSalesOrder()) {
				throw new BusinessErrorException("Order Number and Source Sales Order Not Found");
			}
		}else {
			throw new BusinessErrorException("Invalid input request");
		}
	}

	@Override
	public void wmsHardReserve(WMSRequestDto request) {
		if(null != request) {
			if (null == request.getOrderId() || null == request.getHostOrderId()) {
				throw new BusinessErrorException("Order Number and Source Sales Order Not Found");
			}
		}else {
			throw new BusinessErrorException("Invalid input request");
		}
	}
}

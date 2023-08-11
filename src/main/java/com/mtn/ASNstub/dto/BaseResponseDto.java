package com.mtn.ASNstub.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mtn.ASNstub.enums.ResponseStatusEnums;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BaseResponseDto {
	@JsonIgnore
	private ResponseStatusEnums status;
	private String statusMessage;
	private String supportMessage;
	private String statusCode;

	public void setStatus(ResponseStatusEnums status) {

		if (status.equals(ResponseStatusEnums.SUCCESS)) {
			this.statusMessage = "Transaction completed successfully";
		} else {
			this.statusMessage = "Transaction was failed";
		}
		this.statusCode = status.getValue();
	}

	public BaseResponseDto(ResponseStatusEnums status, String statusMessage, String supportMessage) {
		super();
		this.supportMessage = supportMessage;

		if (status.equals(ResponseStatusEnums.SUCCESS)) {
			this.statusMessage = "Transaction completed successfully";
		} else {
			this.statusMessage = "Transaction was failed";
		}
		this.status = status;
		this.statusCode = status.getValue();
	}

}

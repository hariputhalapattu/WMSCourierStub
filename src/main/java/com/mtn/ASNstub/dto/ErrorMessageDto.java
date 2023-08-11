package com.mtn.ASNstub.dto;

import com.mtn.ASNstub.enums.ResponseStatusEnums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessageDto extends BaseResponseDto {

	private String errorMessage;

	public ErrorMessageDto(ResponseStatusEnums statusCode, String statusMessage, String supportMessage) {
		super(statusCode, statusMessage, supportMessage);
	}
	
	public ErrorMessageDto(ResponseStatusEnums statusCode, String statusMessage, String supportMessage,String errorMessage) {
		super(statusCode, statusMessage, supportMessage);
		this.errorMessage=errorMessage;
	}
}
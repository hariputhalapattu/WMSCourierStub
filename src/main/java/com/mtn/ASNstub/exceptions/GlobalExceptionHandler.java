package com.mtn.ASNstub.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.mtn.ASNstub.dto.ErrorMessageDto;
import com.mtn.ASNstub.enums.ResponseStatusEnums;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(BusinessErrorException.class)
	protected ResponseEntity<ErrorMessageDto> handleBusinessErrorException(BusinessErrorException ex) {
		ex.printStackTrace();
		ErrorMessageDto errorMessageDto = new ErrorMessageDto(ResponseStatusEnums.BUSINESS_ERROR,
				ex.getLocalizedMessage(), ex.getLocalizedMessage(), ex.getMessage());

		return new ResponseEntity<ErrorMessageDto>(errorMessageDto, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	protected ResponseEntity<ErrorMessageDto> handleException(Exception ex) {
		ErrorMessageDto errorMessageDto = new ErrorMessageDto(ResponseStatusEnums.TECHNICAL_ERROR,
				ex.getLocalizedMessage(), ex.getLocalizedMessage(), ex.getMessage());

		return new ResponseEntity<ErrorMessageDto>(errorMessageDto, HttpStatus.BAD_REQUEST);
	}
}

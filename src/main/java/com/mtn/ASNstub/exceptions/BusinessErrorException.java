package com.mtn.ASNstub.exceptions;

public class BusinessErrorException extends RuntimeException {

	public BusinessErrorException() {
		super();
	}

	public BusinessErrorException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BusinessErrorException(String message, Throwable cause) {
		super(message, cause);
	}

	public BusinessErrorException(String message) {
		super(message);
	}

	public BusinessErrorException(Throwable cause) {
		super(cause);
	}

}

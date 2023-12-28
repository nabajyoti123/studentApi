package com.imaginnovate.studentModule.exception;

public class InvalidDOBException extends Exception {
	
	String message;

	public InvalidDOBException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidDOBException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InvalidDOBException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidDOBException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidDOBException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}

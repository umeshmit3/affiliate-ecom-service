package com.ecom.affiliate.exception;

public class FeedServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FeedServiceException(String msg) {
		super(msg);
	}

	public FeedServiceException(Throwable exception) {
		super(exception);
	}

}

package com.infytel.InfytelSwaggerDocumentation.exceptions;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class NoSuchCustomerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8569462958003517640L;

	public NoSuchCustomerException(String errors) {
		super(errors);
	}
}

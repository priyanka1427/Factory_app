package com.factory.utilities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ApiResponse<T> {

	private int status;
	private String message;
	private T result;

	public ApiResponse(int status, String message, T result) {
		this.status = status;
		this.message = message;
		this.result = result;
	}

	public ApiResponse() {

	}

}

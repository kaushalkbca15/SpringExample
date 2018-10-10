package com.kk.spring.response;

import java.sql.Timestamp;

/**
 * @author kaushalbca15
 *
 */
public class BaseResponse {

	private String resposeCode;
	private String responseMessage;
	private Timestamp timeStamp;
	private Class<?> resposeData;

	public String getResposeCode() {
		return resposeCode;
	}

	public void setResposeCode(String resposeCode) {
		this.resposeCode = resposeCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public Timestamp getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Class<?> getResposeData() {
		return resposeData;
	}

	public void setResposeData(Class<?> resposeData) {
		this.resposeData = resposeData;
	}

	@Override
	public String toString() {
		return "BaseResponse [resposeCode=" + resposeCode + ", responseMessage=" + responseMessage + ", timeStamp="
				+ timeStamp + ", resposeData=" + resposeData + "]";
	}

}

package cl.ddiaz.ejb.patron.to;

import java.io.Serializable;

public class ResponseTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Boolean status;
	private String message;
	private Object response;
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getResponse() {
		return response;
	}
	public void setResponse(Object response) {
		this.response = response;
	}

}

package fa.training.bfams.model;

public class DataRespone {
	private int status ; 
	
	private String message;
	
	private Object data;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public DataRespone(int status, String message, Object data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public DataRespone(Object data) {
		super();
		this.data = data;
		this.status = 200;
		this.message = "Thành công";
	}
	
	
	
	
}

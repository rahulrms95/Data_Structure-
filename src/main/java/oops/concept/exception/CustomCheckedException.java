package oops.concept.exception;

public class CustomCheckedException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorMsg;

	public CustomCheckedException(String msg)
	{
		super(msg);
	}

	public CustomCheckedException(String msg,Throwable t)
	{
		super(msg,t);
	}

	public CustomCheckedException(String msg,Throwable t,String error)
	{
		super(msg,t);
		this.errorMsg = error;
	}

	public String getMessage()
	{
		return this.errorMsg;
	}
	
	public String getError() {
		return this.errorMsg;
	}
}


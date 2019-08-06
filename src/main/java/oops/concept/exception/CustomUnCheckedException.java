package oops.concept.exception;

public class CustomUnCheckedException extends Exception{

	/**
	 * 
	 */
	private String errorMsg;
	private static final long serialVersionUID = 1L;
	
	
	public CustomUnCheckedException(String msg)
	{
		super(msg);
	}

	public CustomUnCheckedException(String msg,Throwable t)
	{
		super(msg,t);
	}

	public CustomUnCheckedException(String msg,Throwable t,String error)
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

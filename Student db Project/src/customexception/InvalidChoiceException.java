package customexception;


public class InvalidChoiceException extends Exception {
	private String msg;
	public InvalidChoiceException(String msg)
	{
		this.msg=msg;
	}
	
	public String getMsg()
	{
		return msg;
	}

}



package customexception;

public class EmployeNotFoundEXception 
{
	public class EmployeNotFoundException extends RuntimeException{

		private String msg;
		public void StudentNotFoundException (String msg)
		{
			this.msg=msg;
		}
		
		public String getMsg()
		{
			return msg;
		}
	}
}





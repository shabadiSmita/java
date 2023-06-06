package com;

interface Amazon 
{
  int id=100;
  void purchase();
	public static void main(String[] args) {
		
	}
	class Paytm implements Amazon
	{
		@Override
		public void purchase()
		{
			System.out.println("purchasing laptop");
		}
	}
	class Mainclass
	{
		public static void main(String[] args)
		{
			Paytm paytm=new Paytm();
			paytm.purchase();
					
		}
	}
}



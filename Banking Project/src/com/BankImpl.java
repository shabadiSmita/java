package com;

public class BankImpl implements Bank
{
    int balance;
	BankImpl(int balance)
	{
		this.balance=balance;	
	}
	@Override
	public void deposite(int amount)
	{
		System.out.println("depositing rs."+amount);
		balance=balance+amount;				//balance +=amount;
		System.out.println("amount deposited sucessfully");
	}
	public void withdraw(int amount)
	{
		if(amount<=balance)
		{
			System.out.println("withdrawing rs."+amount);
			balance=balance-amount;			//balance -=amount;
			System.out.println("amount withdrawn sucessfully");
		}
		else
		{
			try 
			{
				throw new InsufficientBalanceException("Insufficient Funds");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public int checkBalanace() {
		return balance;
	}
}


/** Documentation Comment -->Rules to Develop Custome Exception
* ---------------------------------------
* 1.create a class with the exception name
* 2a. if class extends Exception --> checked Exception
* 2b. if class extends RuntimeException  -->unchecked Exception
* 3. Override getMessage() -->(variable,Constructor,method)
* 4. invoke the exception object using throw keyword and handle it using try and catch block
*/

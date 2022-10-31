package JavaProject;

import JavaProject.BankAccount.SavingAcc;

public class mmbanksavingaccount  extends SavingAcc{
	public mmbanksavingaccount(int accNo, String accName, float accBal, boolean isSalaried) {
		super(accNo, accName, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}

	private float MINBAL;

	@Override
	public float withdraw() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}

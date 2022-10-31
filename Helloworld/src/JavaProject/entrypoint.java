package JavaProject;

public class entrypoint {
	public static void main(String[] args) {
}
	mmfactory bankfactory=new mmfactory();
	 mmbanksavingaccount SavingAcc=new  mmbanksavingaccount();
	 mmbankcurrentaccount CurrentAcc=new mmbankcurrentaccount ();
	 SavingAcc.withdraw();
	 SavingAcc.toString();
	 CurrentAcc.withdraw();
	 CurrentAcc.toString();
}
}

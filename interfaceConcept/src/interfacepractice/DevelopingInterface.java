package interfacepractice;

public class DevelopingInterface implements Bankingclient,Domainclient {

	public static void main(String[] args) {
		DevelopingInterface d=new DevelopingInterface();
		d.checkingbalance();
		d.paycreditcard();
		d.transferbalance();
		Domainclient dc=new DevelopingInterface();
		dc.investment();

	}

	@Override
	public void paycreditcard() {
		System.out.println("paycreditcard implemented");
		
	}

	@Override
	public void transferbalance() {
		System.out.println("transferbalance implemented");
		
	}

	@Override
	public void checkingbalance() {
		System.out.println("checkingbalance implemented");
		
	}

	@Override
	public void investment() {
		System.out.println("investement");
		
	}

}

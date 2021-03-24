package superKeywordPracticeDemo;

public class childDemo extends parentDemo {
	String name="QAClickAcademy";
	public childDemo() {
		super();
		System.out.println("child class constructor");
	}
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);//super keyword refers to the parent classname.
		
		
	}
	public void getData() {
		super.getData();
		System.out.println("I am in child class");
	}

	public static void main(String[] args) {
		childDemo cd=new childDemo();
		cd.getStringData();
		cd.getData();
		
	}

}

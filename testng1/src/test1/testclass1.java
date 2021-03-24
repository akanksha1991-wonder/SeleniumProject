package test1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testclass1 {
@Test
	public void tcs() {
		System.out.println("hello");
	}
@BeforeTest
public void prerequisite() {
	System.out.println("i will execute first");
}
}

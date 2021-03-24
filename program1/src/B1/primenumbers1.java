package B1;

import java.util.Scanner;

public class primenumbers1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int temp=0;
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println(num+"is prime no.");
		}
		else {
			System.out.println(num+"is not a prime no.");
		}
		
	}

}

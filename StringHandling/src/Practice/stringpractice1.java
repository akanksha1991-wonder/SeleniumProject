package Practice;

public class stringpractice1 {

	public static void main(String[] args) {
		String str= "Payment $100 paid";//<--Object for string//There is no need to create an object like eg.- String str1=new String("Payment $100 paid") for only string.
		System.out.println(str.charAt(8));
		System.out.println(str.indexOf("$"));// To know the index place of a character.
		System.out.println(str.substring(8));// To know text from the 8th index.
				

	}

}

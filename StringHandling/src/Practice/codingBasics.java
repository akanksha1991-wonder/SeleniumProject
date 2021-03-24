package Practice;

public class codingBasics {

	public static void main(String[] args) {
		//Sum of numbers in the arrays.
		//Array is a collection of object.
		int sum=0;
		int a[]= {2,5,4,8,7};
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		
			int c[]= {2,5,8,7,4,6,3};
			for(int i=0; i<c.length;i++)
			{
				if(c[i]==7) {
					System.out.println(i);
					break;
				}
			}
			
		

	}
	

	
}

import java.util.Scanner;
 public class add {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first num: ");
		int num1=sc.nextInt();
		
		System.out.println("enter the sec num: ");
		int num2=sc.nextInt();
		
		int result=num1+num2;
		
		System.out.println("the sum is "+result);
		
		sc.close();
	}

}

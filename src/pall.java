import java.util.Scanner;
public class pall {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int num = sc.nextInt();
		int a = num;
		int rev=0;
		while(num>0)
		{
		int r=num%10;
		 rev=rev*10+r;
		 num=num/10;
		}
		if(a == rev)
			System.out.println("It is a pallindrome");
		else
			System.out.println("It is not a pallindrome");
		sc.close();
	}

}
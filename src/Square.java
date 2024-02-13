import java.util.Scanner;
public class Square {

	public static void Square() { //yesma if static void lekhyo vane
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sq = num * num;
		System.out.println("The square is "+sq);		
	}
	public static void main(String[] args)
	{
		 Square(); // ya tala new hudaina natra we need to write new for calling function
	}

}

import java.util.Scanner;
 class Input {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the value of principle");
		int p = input.nextInt();
		System.out.println("Enter the value of time");
		int t = input.nextInt();
		System.out.println("Enter the value of rate");
		int r = input.nextInt();
		
		double si = (p*t*r)/100;
		System.out.println("The simple interest is: " +si);
		
		input.close();
	}
}

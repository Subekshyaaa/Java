
public class twoFunction {

	public static int twoFunction(int x, int y) {
		return x+y;
		
	}
	
	public static double nextFunction(double x, double y)
	{
		return x+y;
	}
	public static void main(String[] args) {
		int num1 = twoFunction (2,4);
		double num2 = nextFunction (7.5,7.8);
		System.out.println("The sum is "+num1);
		System.out.println("The sum is "+num2);
        
	}

}

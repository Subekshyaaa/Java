
public class typeConversion {

	public void Run() {
		// thulo bata sano ma lagna explicit
		// int->short->byte (ex)
		System.out.println("this is for implicit");
		int a = 20;
		double b = a;
		
		// implicit
		System.out.println(a);
		System.out.println(b);
		System.out.println(b);
		
		System.out.println("This is for explicit");
		double  d = 23.33;
		int i = (int)d;
		System.out.println(d);
		System.out.println(i);
		
		int num = 10;
		System.out.println("The integer value is:"+num);
		String data = String.valueOf(num);
		System.out.println("The striing value is "+ data);
		
		String data2 = "10";
		System.out.println("the string data is "+ data2);
		
		int num2 = Integer.parseInt(data);
		System.out.println("The integer value is: "+num2);		
		}
	

}

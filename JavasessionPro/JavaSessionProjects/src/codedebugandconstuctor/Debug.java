package codedebugandconstuctor;

public class Debug {
	
	public void m1()
	{
		System.out.println("this is 1st method");
		System.out.println("this is 1st comment");
	}

	public void m2()
	{
		System.out.println("this is 2nd method");
		System.out.println("this is 2nd comment");
	}
	
	public static void main(String[] args) {
		
		System.out.println("This is my main method");
		System.out.println("Put Debug point");
		Debug ob = new Debug();
		ob.m1();
		System.out.println("m1 method executed");
		ob.m2();
		System.out.println("m2 method executed");
		System.out.println("Debug done");
	}
}

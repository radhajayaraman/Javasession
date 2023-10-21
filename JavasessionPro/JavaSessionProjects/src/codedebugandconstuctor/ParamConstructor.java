package codedebugandconstuctor;

//Constructor Type

/*
 * Default Constructor
 * Parameterized Constructor
 * Construtor is used to assign values to object, 
 * used to constructing values
 */
public class ParamConstructor {

	public ParamConstructor()
	{
		System.out.println("This is Default constructor");
	}
	
	public ParamConstructor(int a)
	{
		System.out.println("This is one parameterized constructor");
	}
	
	public ParamConstructor(int a, int b)
	{
		System.out.println("This is two parameterized constructor");
	}
	
	public ParamConstructor(int a, int b, int c)
	{
		System.out.println("This is three parameterized constructor");

	}
	
	public static void main(String[] args) {
		
		ParamConstructor obj = new ParamConstructor();
		ParamConstructor obj1 = new ParamConstructor(100);
		ParamConstructor obj2 = new ParamConstructor(100, 200);
		ParamConstructor obj3 = new ParamConstructor(100, 200, 300);
		
	}
}

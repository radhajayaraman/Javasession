package codedebugandconstuctor;

public class ConstrAssignValApproach2 {
	
	int a,b,c,d,e;
	
	public void m1(int a1, int a2, int a3,int a4,int a5)
	
	{
		a=a1;
		b=a2;
		c=a3;
		d=a4;
		e=a5;
	}
	
	public static void main(String[] args) {
		
		ConstrAssignValApproach2 obj = new ConstrAssignValApproach2();
		obj.m1(100,111,200,234,123);
	}

}

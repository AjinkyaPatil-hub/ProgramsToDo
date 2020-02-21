
class A{
	A(){
		System.out.println("In AA CONST");
	}
	{
		System.out.println("in A instance");
	}
	
	static {
		System.out.println("in A static");
	}
}
class B extends A{
	
	B(){
		System.out.println("In B CONST");
	}
	static{
		System.out.println("in B static");
	}
	{
		System.out.println("in b instance");
	}
}


public class Test {

	public static void main(String[] args) {
		B b = new B();
	}

}


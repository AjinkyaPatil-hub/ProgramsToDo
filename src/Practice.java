
public class Practice {

	public static void foo(Integer i,Integer j) {
		int temp = i;
		i=j;
		j=temp;
	}
	public static void f(Integer i) {
		System.out.println("integer");
	}
	public static void f(String i) {
		System.out.println("String");
	}
	
	public static void main(String[] args) {
		Integer a=5;
		Integer b=6;
		foo(a,b);
		System.out.println(a+":"+b);
		String s=null;
		f(s);
		
	}
}

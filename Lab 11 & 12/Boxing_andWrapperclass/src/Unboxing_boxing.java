
public class Unboxing_boxing {

	public static void main(String[] args) {
		//boxing
		//Primitive to Wrapper
		int a=10;
		System.out.println();
		Integer i=a;
		System.out.println(i);
		//unboxing
		//The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing. 
		Integer in=new Integer(12);
		int num=in;
		System.out.println(in);
		System.out.println(num);
	}

}

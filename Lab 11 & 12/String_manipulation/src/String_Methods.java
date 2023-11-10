
public class String_Methods {

	public static void main(String[] args) {
		String s="hello";
		String s1="hello";
		String s2="welcome";
		String s3="welcome";
		String s4=new String("hello");
		//charAt()
		char ch=s3.charAt(0);
		System.out.println(ch);
		//concat()
		System.out.println(s1.concat(s2));
		//upper case
		System.out.println(s3);
		//equals()
		
		System.out.println(s1.toUpperCase());
   System.out.println("s1 is equals to s is :"+s1.equals(s));
   //System.out.println("s1 is equals to s4 is :"+s1.equals(s4));
   System.out.println("s1 is equals to s3 is :"+s1.equals(s3));
   
   //compareTo()
   System.out.println(s1.compareTo(s));//0 because strings are same
   System.out.println(s1.compareTo(s3));//-15 because s3 >s1
   System.out.println(s3.compareTo(s1));//15 because s3 >s1
	}

}

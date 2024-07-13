
public class EqualStringDemo_240708 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "PCY";
		System.out.println("a = " + a);
		
		String b = new String("Hello, PCY!");
		System.out.println("b = " + b);
		
		
		System.out.println(a.equals(b)); // false
		
		
		String c = "Irish";
		System.out.println("c = " + c);
		
		String d = "Irish";
		System.out.println("d = " + d);
		
		System.out.println(c == d); // true
		
	}

}

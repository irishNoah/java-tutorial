package polymorphism;

class O{
	public void methodA(int val) {
		System.out.println("You put integer");
	}
	
	public void methodA(String val) {
		System.out.println("You put character");
	}
}


public class PolymorphismOverloadingDemo {

	public static void main(String[] args) {
		O o = new O();
		
		o.methodA(null);
		o.methodA(10);
		o.methodA("10");
		o.methodA("hello world");
	}

}

package interfaces.example1;

interface I{
	public void z();
}

interface F{
	public void f();
}

class A implements I, F{
	public void z(){
		System.out.println("zzz");
	}
	
	public void f() {
		System.out.println("fff");
	}
}


public class CalculatorConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.z();
		a.f();
	}

}

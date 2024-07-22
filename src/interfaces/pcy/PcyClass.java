package interfaces.pcy;

class CalcOnPcyInterface implements PcyInterfaceTest{
	int a, b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void plus() {
		System.out.println("plus() is " + (this.a + this.b));
	}
	
	public void minus(){
		System.out.println("minus() is " + (this.a - this.b));
	}
	
	public void multiply(){
		System.out.println("multiply() is " + (this.a * this.b));
	}
	
	public void divide(){
		System.out.println("divide() is " + (this.a / this.b));
	}
	
	public void run() {
		System.out.println("----- Start run()!!! -----");
		plus();
		minus();
		multiply();
		divide();
		System.out.println("----- End run()!!! -----");
	}
}


public class PcyClass {

	public static void main(String[] args) {
		System.out.println("============================================");
		CalcOnPcyInterface p1 = new CalcOnPcyInterface();
		
		p1.setValue(100, 20);
		p1.plus();
		p1.minus();
		p1.multiply();
		p1.divide();
		
		System.out.println("============================================");
		CalcOnPcyInterface p2 = new CalcOnPcyInterface();
		p2.setValue(50, 25);
		p2.run();
	}

}

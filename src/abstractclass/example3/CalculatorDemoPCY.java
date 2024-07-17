package abstractclass.example3;

// 추상 클래스 > 공통으로 사용할 것은 public 키워드로, 추상은 abstract 키워드로! 
abstract class CalculatorPCY{
	public int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public abstract int demoSum();
	
	public abstract int demoMinus();
	
	public void run() {
		System.out.println(" +++++ " + demoSum() +" +++++ ");
		System.out.println(" ----- " + demoMinus() +" ----- ");
	}
}

class RunCalculatorPCY extends CalculatorPCY {
	public int center;
	
	public void setOperands(int left, int right, int center) {
		this.left = left;
		this.right = right;
		this.center = center;
	}
	
	public int demoSum() {
		System.out.println("~~~~~ RunCalculatorPCY class's demoSum() ~~~~~");
		return (this.left + this.right + this.center);
	}

	public int demoMinus() {
		System.out.println("~~~~~ RunCalculatorPCY class's demoMinus() ~~~~~");
		return (this.left - this.right - this.center);
	}
}


public class CalculatorDemoPCY {

	public static void main(String[] args) {
		RunCalculatorPCY r = new RunCalculatorPCY();
		r.setOperands(100, 30, 20);
		r.run();
	}

}

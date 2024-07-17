package abstractclass.example3;

// 추상 클래스 > 공통으로 사용할 것은 public 키워드로, 추상은 abstract 키워드로! 
abstract class Calculator{
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

class RunCalculator extends Calculator {
	public int demoSum() {
		System.out.println("~~~~~ runCalculator class's demoSum() ~~~~~");
		return (this.left + this.right);
	}

	public int demoMinus() {
		System.out.println("~~~~~ runCalculator class's demoMinus() ~~~~~");
		return (this.left - this.right);
	}
}


public class CalculatorDemo {

	public static void main(String[] args) {
		RunCalculator r = new RunCalculator();
		r.setOperands(20, 10);
		r.run();
	}

}

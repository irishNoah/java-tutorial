package accessmodifier;

class Calculator{
	private int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	private int _sum() {
		return this.left+this.right;
	}
	
	public void sumDecoPlus() {
		System.out.println("~~~~~ Use private int _sum() from sumDecoPlus()!!!!! ~~~~~");
		System.out.println(" +++ " + _sum() + " +++ ");
	}
	
	public void sumDecoMinus() {
		System.out.println("~~~~~ Use private int _sum() from sumDecoMinus()!!!!! ~~~~~");
		System.out.println(" --- " + _sum() + " --- ");
	}
}



public class CalculatorDemo {

	public static void main(String[] args) {
		System.out.println("===== Calculator c1 =====");
		Calculator c1 = new Calculator();
		 c1.setOperands(30, 40);
		// c1._sum(); // error
		c1.sumDecoPlus();
		c1.sumDecoMinus();
	}

}

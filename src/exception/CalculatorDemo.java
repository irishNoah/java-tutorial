package exception;

class Calculator{
	private int a, b;
	
	public void setOperands(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void sum() {
		System.out.println("sum() is " + (this.a + this.b));
	}
	
	public void divide() {
		try {
			System.out.println("나눗셈 결과");
			System.out.println("divide() is " + (this.a / this.b));
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException 에러 발생!!!");
			System.out.println("e.getMessage() = " + e.getMessage());
			System.out.println("e.toString() = " + e.toString());
			System.out.println("e.printStackTrace() is ");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("Exception 에러 발생!!!");
			e.printStackTrace();
		}finally {
			System.out.println("~~~~~ finally ~~~~~");
		}
	}
	
}


public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.setOperands(20, 10);
		c1.sum();
		c1.divide();
		
		System.out.println("===================================");
		
		c1.setOperands(50, 0);
		c1.sum();
		c1.divide();
	}

}

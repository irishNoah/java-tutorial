
class Calc{
		int arg1, arg2;
		
		public void setCalc(int arg1, int arg2) {
			this.arg1 = arg1;
			this.arg2 = arg2;
		}
		
		
		public void plusCalc() {
			System.out.println(this.arg1 + this.arg2);
		}
		
		public void minusCalc() {
			System.out.println(this.arg1 - this.arg2);
		}
		
		public void multipleCalc() {
			System.out.println(this.arg1 * this.arg2);
		}
		
		public void avgCalc() {
			System.out.println((this.arg1 + this.arg2) / 2);
		}
		
	}


public class CalculatorDemo_240709 {

	
	public static void main(String[] args) {
		// Calculator
		Calc c1 = new Calc();
		c1.setCalc(20, 10);
		c1.minusCalc();
		
		Calc c2 = new Calc();
		c2.setCalc(100, 30);
		c2.avgCalc();
	}

}

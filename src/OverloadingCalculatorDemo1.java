
class OverloadingCalculator1{
	int left, right;
	int third = 0;
	
	public OverloadingCalculator1() {};
	
	public OverloadingCalculator1(int left, int right) {
		System.out.println("OverloadingCalculator1(int left, int right)");
		this.left = left;
		this.right = right;
	};
	
	public OverloadingCalculator1(int left, int right, int third) {
		System.out.println("OverloadingCalculator1(int left, int right, int third)");
		this.left = left;
		this.right = right;
		this.third = third;
		
	};
	
	public void setOperands(int left, int right) {
		System.out.println("setOperands(int left, int right)");
		this.left = left;
		this.right = right;
	}
	
	public void setOperands(int left, int right, int third) {
		System.out.println("setOperands(int left, int right, int third)");
		this.left = left;
		this.right = right;
		this.third = third;
	}
	
	public void sum(){
        System.out.println(this.left+this.right+this.third);
    }
      
    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}



public class OverloadingCalculatorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== o1 =====");
		OverloadingCalculator1 o1 = new OverloadingCalculator1(10, 20 , 30);
		o1.sum();
		o1.avg();
		
		System.out.println("===== o2 =====");
		OverloadingCalculator1 o2 = new OverloadingCalculator1();
		o2.setOperands(40, 50, 60);
		o2.sum();
		o2.avg();
		
		System.out.println("===== o3 =====");
		OverloadingCalculator1 o3 = new OverloadingCalculator1(40, 50);
		o3.sum();
		o3.avg();
		
		System.out.println("===== o4 =====");
		OverloadingCalculator1 o4 = new OverloadingCalculator1();
		o4.setOperands(40, 50);
		o4.sum();
		o4.avg();
	}

}

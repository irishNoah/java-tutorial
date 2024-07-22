package interfaces.example2;

// 인터페이스를 구현한 가짜 클래스
class CalculatorDummy implements Calculatable{
	public void setOperands(int first, int second, int third) {}
	
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }

}

// 인터페이스에 따라서 구현된 클래스
class Calculator implements Calculatable{
	int first, second, third;
	
	public void setOperands(int first, int second, int third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
    public int sum(){
        return (this.first + this.second + this.third);
    }
    public int avg(){
        return ((this.first + this.second + this.third) / 3);
    }

}

public class CalculatorConsumer {

	public static void main(String[] args) {
		CalculatorDummy c = new CalculatorDummy();
        c.setOperands(10, 20, 30);
        System.out.println(c.sum()+c.avg());
        
        Calculator c2 = new Calculator();
        c2.setOperands(40, 50, 60);
        System.out.println(c2.sum()+c2.avg());
	}
}

package abstractclass.example2;

abstract class A{
    public abstract int b();
        
    //추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다. 
    public void d(){
        System.out.println("world");
    }
}

class B extends A{
	public int b() {
		System.out.println("class B - public int b() >>> b() is abstract in class A");
		return 0;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.b();
		obj.d();
	}

}

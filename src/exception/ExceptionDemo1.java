package exception;

class A{
    private int[] arr = new int[3];
    A(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    public void z(int first, int second){
        //System.out.println(arr[first] / arr[second]);
        
    	try {
    		System.out.println(arr[first] / arr[second]);
    	}catch(ArithmeticException e) {
    		System.out.println("~~~~~ Error 발생 - 수학 ~~~~~");
    		e.printStackTrace();
    	}catch(ArrayIndexOutOfBoundsException e){
    		System.out.println("~~~~~ Error 발생 - 배열 크기 ~~~~~");
    		System.out.println(e.getMessage());
    		System.out.println("------------------------------");
    		System.out.println(e.toString());
    		System.out.println("------------------------------");
    		e.printStackTrace();
    	}finally {
    		System.out.println("~~~~~ finally!!! ~~~~~");
    	}
    	
    }
}
 
public class ExceptionDemo1 {
    public static void main(String[] args) {
        A a = new A();
        a.z(10, 1);
    }
}
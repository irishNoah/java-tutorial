package accessmodifier;

class A {
    public void methodPublicA() {
    	// this method can use in other class
    	System.out.println("=====  class A methodPublicA() =====");
	}
    
    private void methodPrivateA() {
    	// this method can't use in other class
    	System.out.println("=====  class A methodPrivateA() =====");
    }
    
    public void runMethodPrivateAInMain() {
    	System.out.println("!!!!!  under print line is printed from runMethodPrivateAInMain() !!!!!");
    	
    	// this method can print methodPrivateA
    	methodPrivateA(); 
    }
}

public class AccessDemo1 {
    public static void main(String[] args) {
    	A a1 = new A();
    	
    	a1.methodPublicA(); // print ok
    	// a1.methodPrivateA(); // error
    	a1.runMethodPrivateAInMain(); // print ok
    }
}
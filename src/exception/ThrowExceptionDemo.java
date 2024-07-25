package exception;

import java.io.*;

class B{
    void run() throws FileNotFoundException, IOException{
    	BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
        String input = null;
        
        while((input = bReader.readLine()) != null) {
        	System.out.println("Member is " + input);
        }
    }
}
class C{
    void run() throws FileNotFoundException, IOException{
        B b = new B();
        b.run();
    }
}

public class ThrowExceptionDemo {
    public static void main(String[] args) {
         C c = new C();
         
         try {
        	 c.run();
         } catch(FileNotFoundException f){
        	 f.printStackTrace();
         } catch(IOException i) {
        	 i.printStackTrace();
         } finally {
        	 System.out.print("Done!");
         }
        
    }   
}
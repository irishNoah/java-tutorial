package exception;
import java.io.*;

public class CheckedExceptionDemo {
	public static void main(String[] args) {
		BufferedReader bReader = null;
		String input = "";
		
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		}catch(FileNotFoundException f){
			f.printStackTrace();
		}finally {
			System.out.println("----- out.txt!!! -----");
		}
		
		try {
			while((input = bReader.readLine()) != null) {
				System.out.println(input);
			}
		}catch(IOException i) {
			i.printStackTrace();
		}finally {
			System.out.println("----- print -----");
		}
		
		
	}

}

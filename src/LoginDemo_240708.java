
public class LoginDemo_240708 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = args[0];
		String password = args[1];
		if (id.equals("egoing")) {
			if (password.equals("111111")) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
				System.out.println("yeah~");
			}

		} else {
			System.out.println("wrong");
		}
	}

}

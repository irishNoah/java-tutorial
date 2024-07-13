
public class ForeachDemo_240708 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] members = {"이후근", "송운철", "김우찬", "박창영", 
				"장선희", "소지영", "양영은", "유승주", "선우유정"};
		
		System.out.println(members[3]);
		System.out.println("------------------");
		
		for(String m : members) {
			System.out.println("m = " + m);
		}
		
	}

}

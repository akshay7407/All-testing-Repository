package tutorial;

public class isPrim {
	
	public static boolean ISPRime(int a) {
		
		if (a<=1) {
			return false;
		}
		
		for (int i=2;i<a;i++) {
			if (a%i==0) {
				return false;
			}
			
		}
		return true;
		
	}
	public static void main(String[] args) {
		
		System.out.println(ISPRime(3));
	}

}

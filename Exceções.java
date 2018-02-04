package exceções;

public class Exceções {

	public static void main(String[] args) {
		int[] numero = {12,13,14,15,16};
		try {
			for(int i = 0 ; i<=5 ; i++) {
			System.out.println(numero[i]);}
			}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}

package ud5;
import java.util.Scanner;

public class RepasoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String cad = in.nextLine();
		String cad2 = in.nextLine();
		
		int num1 = Integer.parseInt(cad);
		int num2 = Integer.parseInt(cad2);
		
		int rspo = num1 + num2;
		System.out.println(rspo);
	}

}

package que1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String expr = s.next();

		if (Bracket.areBracketsBalanced(expr))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}

}

package com.barsha.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Double i;
		int k = 0;

		ArrayList<Double> list = new ArrayList<Double>();
		Operation operation = new Operation();

		while (k == 0 || k == 1) {

			System.out.println("menu:");
			System.out.println("press 1 for addition" + "(+)");
			System.out.println("press 2 for subtraction" + "(-)");
			System.out.println("press 3 for multiplication" + "(*)");
			System.out.println("press 4 for division" + "(/)");
			
			if (k == 0) {
				System.out.println("press 5 for input" + "(<-)");
			} else {
				System.out.println("press 5 to change your input" + "(<-)");
			}
	
			System.out.println("press other numbers for exit" + "(->)");

			Scanner scanner2 = new Scanner(System.in);
			int j = scanner2.nextInt();

			switch (j) {
			case 1:
				i = operation.addition(list);
				System.out.println("ans=" + i);
				break;
			case 2:
				i = operation.subtraction(list);
				System.out.println("ans=" + i);
				break;
			case 3:
				i = operation.multiplication(list);
				System.out.println("ans=" + i);
				break;
			case 4:
				i = operation.division(list);
				System.out.println("ans=" + i);
				break;
			case 5:
				list = operation.getNum();
				k++;
				break;
			default:
				k = -1;
				System.out.println("successfully exited...thank you for using my calculator :D :D");
				break;
			}

		}
	}
}

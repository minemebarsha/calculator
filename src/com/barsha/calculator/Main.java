package com.barsha.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Double i;
		int k = 0;

		ArrayList<Double> list = new ArrayList<Double>();
		Operation operation = new Operation();

		while (true) {

			if (k == 0) {
				operation.printCommand(k);
				k++;
			} else {
				operation.printCommand(k);
			}

			Scanner scanner2 = new Scanner(System.in);
			int j = scanner2.nextInt();

			switch (j) {
			case 0:
				System.out
						.println("successfully exited...thank you for using my calculator :D :D");
				return;
			case 1:
				list = operation.getNum();
				break;
			case 2:
				if (list.isEmpty()) {
					System.out.println("error..please follow menu :@ :@");
					k = 0;
					break;
				} else {

					list = operation.update(list);
					break;
				}
			case 3:
				if (list.isEmpty()) {
					System.out.println("error..please follow menu :@ :@");
					k = 0;
					break;
				} else {

					i = operation.addition(list);
					System.out.println("ans=" + i);
					System.out.println("inputs:");
					operation.printInputs(list);
					break;
				}
			case 4:
				if (list.isEmpty()) {
					System.out.println("error..please follow menu :@ :@");
					k = 0;
					break;
				} else {

					i = operation.subtraction(list);
					System.out.println("ans=" + i);
					System.out.println("inputs:");
					operation.printInputs(list);
					break;
				}

			case 5:
				if (list.isEmpty()) {
					System.out.println("error..please follow menu :@ :@");
					k = 0;
					break;
				} else {

					i = operation.multiplication(list);
					System.out.println("ans=" + i);
					System.out.println("inputs:,");
					operation.printInputs(list);
					break;

				}
			case 6:
				if (list.isEmpty()) {
					System.out.println("error..please follow menu :@ :@");
					k = 0;
					break;
				} else {

					i = operation.division(list);
					System.out.println("ans=" + i);
					System.out.println("inputs:");
					operation.printInputs(list);
					break;
				}

			default:
				if (list.isEmpty()) {
					k = 0;
				} else {
					k = 1;
				}
				System.out.println("error..please follow menu :@ :@");
				break;
			}

		}
	}
}

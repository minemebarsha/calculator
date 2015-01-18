package com.barsha.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Operation {

	Double ans = 0.0;
	ArrayList<Double> arrayList = new ArrayList<Double>();

	public ArrayList<Double> getNum() {

		System.out.println("how many numbers you want to input????");
		Scanner scanner = new Scanner(System.in);
		int j = scanner.nextInt();

		if (j < 2) {

			System.out
					.println("error...please input mininmum 2 numbers...try again :( :(");
			return (arrayList);

		} else {

			System.out.println("enter the numbers:");
			for (int k = 0; k < j; k++) {
				Scanner scanner2 = new Scanner(System.in);
				Double l = null;
				for (int i = k; i == k; i++) {
					System.out.print(i + 1 + " " + "no. input= ");
					l = scanner2.nextDouble();
				}

				arrayList.add(l);
			}
			return (arrayList);

		}
	}

	public Double addition(ArrayList<Double> list) {
		ans = 0.0;
		for (int i = 0; i < list.size(); i++) {
			ans = ans + list.get(i);
		}
		return ans;
	}

	public Double subtraction(ArrayList<Double> list) {
		ans = 0.0;
		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				ans = list.get(i) - ans;
			} else {
				ans = ans - list.get(i);
			}

		}
		return ans;
	}

	public Double multiplication(ArrayList<Double> list) {

		this.ans = 1.0;
		for (int i = 0; i < list.size(); i++) {
			ans = ans * list.get(i);
		}
		return ans;
	}

	public Double division(ArrayList<Double> list) {
		this.ans = 1.0;

		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				ans = list.get(i) / ans;
			} else {
				ans = ans / list.get(i);
			}
		}
		return ans;
	}

	public void printInputs(ArrayList<Double> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			for (int k = i; k == i; k++) {
				System.out.print(i + 1 + " " + "no. input= ");
				System.out.println(arrayList.get(i));

			}
		}
	}

	public void printCommand(int i) {
		if (i == 0) {
			System.out.println("menu:");
			System.out.println("enter 1 for input" + "(<-)");
			System.out.println("enter 0 for exit" + "(->)");
		} else if (i == 1) {
			System.out.println("menu:");
			System.out.println("enter 1 for new input (<-)");
			System.out.println("enter 2 to update  input" + "(><)");
			System.out.println("enter 3 for addition (+)");
			System.out.println("enter 4 for subtraction (-)");
			System.out.println("enter 5 for multiplication (*)");
			System.out.println("enter 6 for division (/)");
			System.out.println("enter 0 for exit (->)");
		} else {
			return;
		}
	}

	public ArrayList<Double> update(ArrayList<Double> list) {
		System.out.println("which no. of input you want to update???");
		Scanner scanner = new Scanner(System.in);
		int index = scanner.nextInt();

		Scanner scanner2 = new Scanner(System.in);
		System.out.println("enter the input:");
		Double item = scanner2.nextDouble();

		list.set(index - 1, item);
		System.out.println("updated inputs:");
		printInputs(list);

		return (list);
	}
}

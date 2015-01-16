package com.barsha.calculator;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class Operation {

	static Double ans = 0.0;

	public ArrayList<Double> getNum() {

		ArrayList<Double> arrayList = new ArrayList<Double>();

		System.out.println("how many numbers you want to input????");
		Scanner scanner = new Scanner(System.in);
		int j = scanner.nextInt();

		if (j < 2) {

			System.out.println("error...please input mininmum 2 numbers...try again :( :(");
			return (arrayList);

		} else {

			System.out.println("type the numbers:");
			for (int k = 0; k < j; k++) {
				Scanner scanner2 = new Scanner(System.in);
				Double l = scanner2.nextDouble();
				arrayList.add(l);
			}
			return (arrayList);

		}
	}

	public Double addition(ArrayList<Double> list) {
		for (int i = 0; i < list.size(); i++) {
			ans = ans + list.get(i);
		}
		return ans;
	}

	public Double subtraction(ArrayList<Double> list) {
		for (int i = 0; i < list.size(); i++) {
			ans = list.get(i) - ans;
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
			ans = list.get(i) / ans;
		}
		return ans;
	}
}

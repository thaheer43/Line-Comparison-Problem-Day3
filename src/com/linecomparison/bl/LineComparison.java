package com.linecomparison.bl;

import java.util.Scanner;

public class LineComparison {
	public int x1, x2, y1, y2;

	public void Input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter x1 and y1 ");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		System.out.println(" the valve of (x1,y1) : " + x1 + " , " + y1);

	}

	public double formula() {
		double linelength = Math.sqrt(Math.pow(x2 - x1, 2) - Math.pow(y2 - y1, 2));
		return linelength;

	}

	public static void condition(double linelength1, double linelength2) {
		if (linelength1 > linelength2) {
			System.out.println(" line 1 is greater than line 2");
		}

		else if (linelength1 < linelength2) {
			System.out.println(" line 1 is lesser than line 2 ");

		}

		else {
			System.out.println(" both the lines are equal ");
		}

	}

	public static void main(String[] args) {
		LineComparison line1 = new LineComparison();
		line1.Input();
		double linelength1 = line1.formula();
		System.out.println(" length of the line 1 = " + linelength1);
		LineComparison line2 = new LineComparison();
		line2.Input();
		double linelength2 = line2.formula();
		System.out.println(" length of the line 2 = " + linelength2);

		System.out.println(" length of the line 1 = " + linelength1);
		System.out.println(" length of the line 2 = " + linelength2);
		condition(linelength1, linelength2);

	}
}

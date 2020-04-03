package thuchanh;

import java.util.Scanner;

public class ptb1 {
	void nhap() {
		Scanner sc = new Scanner(System.in);
		float x = 0, y = 0;
		while (x == 0 && y == 0) {
			System.out.println("\n Nhap lai!!!");
			System.out.println("Nhap x = ");
			x = sc.nextFloat();
			System.out.println("Nhap y = ");
			y = sc.nextFloat();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ptb1 Q = new ptb1();
		Q.nhap();
	}

}

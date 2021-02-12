package design.pattern;

import java.util.Scanner;

public class ZohoCorps {

	public static void main(String[] args) {
		// WELCOME
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the alphabets");
		int n = sc.nextInt();
		
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j+" ");
			}	
			for (int i1 = 1; i1 < 7; i1++) {
				for (int j = 7; j >= i1; j--) {
					System.out.print(j+" ");
				}
				System.out.println();
		}
	}
	}
	}

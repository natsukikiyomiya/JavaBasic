package practice06.copy;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		for (int i = 1; i <= 5; i ++) {
			System.out.print("□");
			if (i % 5 == 0) {
				System.out.println();
			}
		}
		for	(int i = 1; i <= 1; i ++) {
			System.out.print("■");
			for	(i = 1; i <= 4; i ++) {
				System.out.print("□");
				if (i % 4 == 0) {
					System.out.println();
				}
			}
		}
		for (int i = 1; i <= 2; i ++) {
			System.out.print("■");
		}
			for (int i = 1; i <= 3; i ++) {
				System.out.print("□");
				if (i % 3 == 0) {
					System.out.println();
				}
			}
		for (int i = 1; i <= 3; i ++) {
			System.out.print("■");
		}
			for (int i = 1; i <= 2; i ++) {
				System.out.print("□");
				if (i % 2 == 0) {
					System.out.println();
				}
			}
		for (int i = 1; i <= 4; i ++) {
			System.out.print("■");
		}
			for (int i = 1; i <= 1; i ++) {
				System.out.println("□");
			}
		for (int i = 1; i <= 5; i ++) {
				System.out.print("■");
				if (i % 5 == 0) {
					System.out.println();
				}
			}
		for (int i = 1; i <= 4; i ++) {
			System.out.print("■");
		}
			for (int i = 1; i <= 1; i ++) {
				System.out.println("□");
			}
		for (int i = 1; i <= 3; i ++) {
				System.out.print("■");
			}
		for (int i = 1; i <= 2; i ++) {
			System.out.print("□");
			if (i % 2 == 0) {
				System.out.println();
			}
		}
		for (int i = 1; i <= 2; i ++) {
			System.out.print("■");
		}
			for (int i = 1; i <= 3; i ++) {
				System.out.print("□");
				if (i % 3 == 0) {
					System.out.println();
				}
			}
		for	(int i = 1; i <= 1; i ++) {
			System.out.print("■");
			for	(i = 1; i <= 4; i ++) {
				System.out.print("□");
				if (i % 4 == 0) {
					System.out.println();
				}
			}
		}
	}
}

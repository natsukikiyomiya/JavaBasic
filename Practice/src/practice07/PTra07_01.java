package practice07;
/*
 * PTra07_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_01 {
	public static void main(String[] args) {

		// ★ int型の配列arrayを宣言してください
		int [] array;

		// ★ 変数arrayの配列を5個の領域で確保してください
		array = new int [5];

		// ★ 変数arrayにそれぞれ、[1,4,7,10,13] を代入してください
		array[1] = 1;
		array[2] = 4;
		array[3] = 7;
		array[4] = 10;
		array[5] = 13;

		// ★ 変数arrayに格納されている値を前から順番に全て表示してください
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println(array[5]);
	}
}

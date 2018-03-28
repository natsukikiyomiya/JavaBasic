package practice07;
/*
 * PTra07_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_02 {
	public static void main(String[] args) {

		// ★ int型の配列arrayを宣言し、1000個の領域で確保してください
		int[] array = new int[1000];

		// ★ 配列arrayに [1,2,3,4,5,6,7,・・・・,998,999,1000] を代入してください
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		array[5] = 6;
		array[6] = 7;
		array[7] = 8;
		array[8] = 9;
		array[9] = 10;
		array[10] = 11;
		array[11] = 12;
		array[12] = 13;
		array[13] = 14;
		array[14] = 15;
		array[15] = 16;
		array[17] = 18;
		array[18] = 19;
		array[19] = 20;
		array[20] = 21;
		array[21] = 22;
		array[22] = 23;
		array[23] = 24;
		array[24] = 25;
		array[25] = 26;
		array[26] = 27;
		array[27] = 28;
		array[28] = 29;
		array[29] = 30;
		array[30] = 31;
		array[31] = 32;
		array[32] = 33;
		array[33] = 34;
		array[34] = 35;
		array[35] = 36;
		array[37] = 37;
		array[38] = 38;
		array[39] = 39;
		array[40] = 40;
		array[41] = 41;
		array[42] = 42;
		array[43] = 43;
		array[44] = 44;
		array[45] = 45;
		array[46] = 46;
		array[998] = 999;
		array[999] = 1000;
		// ★ 変数arrayに格納されている値を前から順番に全て表示してください
		for (int value : array) {
			System.out.println(value);
		}
	}
}

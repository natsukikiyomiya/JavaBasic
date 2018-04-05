package practice07;
/*
 * PTra07_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_04 {
	public static void main(String[] args) {

		// ★ int型の配列trumpを宣言し、52個の領域を確保してください
		int[]trump = new int[52];

		// ★ 配列trumpに、[1,2,3,4,5,・・・・,52] を代入してください
		trump[0] = 1;
		trump[1] = 2;
		trump[2] = 3;
		trump[3] = 4;
		trump[4] = 5;
		trump[5] = 6;
		trump[6] = 7;
		trump[7] = 8;
		trump[8] = 9;
		trump[9] = 10;
		trump[10] = 11;
		trump[11] = 12;
		trump[12] = 13;
		trump[13] = 14;
		trump[14] = 15;
		trump[15] = 16;
		trump[16] = 17;
		trump[17] = 18;
		trump[18] = 19;
		trump[19] = 20;
		trump[20] = 21;
		trump[21] = 22;
		trump[22] = 23;
		trump[23] = 24;
		trump[24] = 25;
		trump[25] = 26;
		trump[26] = 27;
		trump[27] = 28;
		trump[28] = 29;
		trump[29] = 30;
		trump[30] = 31;
		trump[31] = 32;
		trump[32] = 33;
		trump[33] = 34;
		trump[34] = 35;
		trump[35] = 36;
		trump[36] = 37;
		trump[37] = 38;
		trump[38] = 39;
		trump[39] = 40;
		trump[40] = 41;
		trump[41] = 42;
		trump[42] = 43;
		trump[43] = 44;
		trump[44] = 45;
		trump[45] = 46;
		trump[46] = 47;
		trump[47] = 48;
		trump[48] = 49;
		trump[49] = 50;
		trump[50] = 51;
		trump[51] = 52;

		// ★ 0～51の中からランダムで値を取得して、変数indexに代入してください
		int index = new java.util.Random().nextInt(53);
		


		// ★ 配列trumpのindex番目の中に入っている数字を出力してください
		System.out.println(index);
	}
}

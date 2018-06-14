package practice10;
/*
 * PTra10_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
import java.util.Scanner;

public class PTra10_03 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// Userクラスを作成後に着手してください
		// ★ User型の変数usを宣言してください
		User us;

		// ★ 変数usに、Userクラスのインスタンスを作成・代入してください
		us = new User();
		System.out.println("ユーザID（数字）、 ユーザ名、メールアドレス、パスワードをカンマ区切りで入力してください");

		// ★ java.util.Scannerクラスをインスタンス化し、変数scannerに代入してください

		Scanner scanner = new Scanner(System.in);

		// ★ 入力された値を、String型の変数lineに格納してください
		int num = scanner.nextInt();
		String line = scanner.next();

		// ★ 変数lineに格納されている値を','で区切り、配列にしてください（Stringクラスのメソッドを使用します）

		String[] mz = line.split(",");

		// ★ 配列にした値を、usの各フィールドに代入してください
		// ユーザIDに該当する値が数値でなかった場合は、エラーでプログラムが止まっても良いです
		num = us.userId;
		mz[0] = us.userNm;
		mz[1] = us.mail;
		mz[2] = us.password;


		// ★ 変数usに格納されているインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください
		System.out.print(us.userId + ",");
		System.out.print(us.userNm);
		System.out.print(us.mail);
		System.out.print(us.password);

	}
}

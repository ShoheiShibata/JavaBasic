package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
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
		 */
		System.out.print(" ");
		for(int i = 1;i <= 5;i++) {
			System.out.print("□");
				}
			System.out.println("");
			System.out.print(" ");
			for(int a = 1;a <= 5;a++) {
				switch(a) {
				case 1:
					System.out.print("■");
					break;
				case 2:
				case 3:
				case 4:
				case 5:
					System.out.print("□");
					break;
				default:
				}
			}
				System.out.println("");
				System.out.print(" ");
				for(int b = 1;b <= 5;b++) {
					switch(b) {
				case 1:
				case 2:
					System.out.print("■");
					break;
				case 3:
				case 4:
				case 5:
					System.out.print("□");
					break;
				default:
					}
				}
				System.out.println("");
				System.out.print(" ");
					for(int c = 1;c <= 5;c++) {
						switch(c) {
						case 1:
						case 2:
						case 3:
							System.out.print("■");
							break;
						case 4:
						case 5:
							System.out.print("□");
							break;
						default:
						}
					}
					System.out.println("");
					System.out.print(" ");
						for(int d = 1;d <= 5;d++) {
							switch(d) {
							case 1:
							case 2:
							case 3:
							case 4:
								System.out.print("■");
								break;
							case 5:
								System.out.print("□");
								break;
							default:
							}
						}
						System.out.println("");
						System.out.print(" ");


	}
}

package practice06;
/*
 * PTra06_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_03 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * ■
		 * ■
		 * ■
		 * ■
		 * ■
		 */
		for(int i = 1;i <= 5;i++) {
			System.out.print(" ");
			System.out.println("■");
			if(i == 5) {
				System.out.println("/");
				
			}
		}

	}
}

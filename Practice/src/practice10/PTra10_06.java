package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[] car = new Car[3];

		Car car1 = new Car();
		car1.color = "赤";
		car1.gasoline = 20;

		Car car2 = new Car();
		car2.color = "青";
		car2.gasoline = 30;

		Car car3 = new Car();
		car3.color = "黄";
		car3.gasoline = 40;

		car[0] = car1;
		car[1] = car2;
		car[2] = car3;

		final int distance = 300;

		for(int i = 0;i < car.length;i++) {
			int sum = 0;
			int count = 0;
			while(true) {
				int result = car[i].run();
				count++;
				if( result == -1) {
					System.out.println("目的地に到達できませんでした");
					break;
				}
				sum += result;
				System.out.println("距離：" + sum + " ガソリン：" + car[i].gasoline);
				if(sum > distance) {
					System.out.println("目的地にまで" + count + "時間かかりました。残りのガソリンは、" + car[i].gasoline + "リットルです");
					break;
				}
			}
		}
	}
}

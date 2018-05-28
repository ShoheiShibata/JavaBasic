/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;
public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		 ArrayList<Player> array = new ArrayList<>();
	        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) {
	            	Player player = new Player();
	                String line = scanner.nextLine();
	                String[] list = line.split(",", 0);
	                player.setPosition(list[0]);
	                player.setName(list[1]);
	                player.setCountry(list[2]);
	                player.setTeam(list[3]);
	                array.add(player);
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
	        Collections.shuffle(array);
	        int gkcount = 0;
	        int dfcount = 0;
	        int mfcount = 0;
	        int fwcount = 0;

	        for (int i = array.size() -1; i >= 0; i--) {
	        	if(array.get(i).getPosition().equals("DF") || array.get(i).getPosition().equals("MF") || array.get(i).getPosition().equals("FW")) {
	        		array.remove(i);
	        	}
	        }
	        	for(Player toString : array) {
	     	        if(gkcount < 1) {
	        		System.out.println(toString.toString());
	        	}
	     	        gkcount++;
	        	}


	        	for (int i = array.size() -1; i >= 0; i--) {
			 		if(array.get(i).getPosition().equals("GK") || array.get(i).getPosition().equals("MF") || array.get(i).getPosition().equals("FW")) {
			 			array.remove(i);
			 		}
		        }
			        for(Player toString : array) {
			        	if(dfcount < 4) {
			        	System.out.println(toString.toString());
			        }
			        	dfcount++;
			        }


				        for (int i = array.size() -1; i >= 0; i--) {
				 		if(array.get(i).getPosition().equals("GK") || array.get(i).getPosition().equals("DF") || array.get(i).getPosition().equals("FW")) {
				 			array.remove(i);
				 		}
			        }
				        for(Player toString : array) {
				        	if(mfcount < 4) {
				        	System.out.println(toString.toString());
				        }
				        	mfcount++;
				        }


				        for (int i = array.size() -1; i >= 0; i--) {
				        	if(array.get(i).getPosition().equals("GK") || array.get(i).getPosition().equals("DF") || array.get(i).getPosition().equals("MF")) {
					 			array.remove(i);
					 		}
				        }
					        for(Player toString : array) {
					        	if(fwcount < 2) {
					        	System.out.println(toString.toString());
					        }
					        	fwcount++;
					        }
	}
}

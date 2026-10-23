package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
		
	public void playGame() {
		
		String myHand = getMyChoice();
		String enemyHand = getRandom();
		
		String batlle = myHand + "_" + enemyHand;
		
		HashMap<String ,String > win = new HashMap<String, String>(){
			{
				
				put("グー_グー","あいこ");
				put("グー_チョキ","勝ち");
				put("グー_パー","負け");
				put("チョキ_グー","負け");
				put("チョキ_チョキ","あいこ");
				put("チョキ_パー","勝ち");
				put("パー_グー","勝ち");
				put("パー_チョキ","負け");
				put("パー_パー","あいこ");
				
				};
			};
		System.out.println("自分の手は"+ myHand + "です,相手の手は"+ enemyHand);
		System.out.println(win.get(batlle));
	}
	
		public String getMyChoice() {
			HashMap<String ,String > myH = new HashMap<String, String>(){
			{
				
				put("r","グー");
				put("s","チョキ");
				put("p","パー");
				
				};
			};
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("自分のじゃんけんの手を入力しましょうグーはrockのrを入力しましょう\n"
					+ "チョキはscissorsのsを入力しましょう\n"
					+ "パーはpaperのpを入力しましょう");
					String hand = scanner.next();
			
					while(true) {
						if((hand.equals("r") || hand.equals("S") || hand.equals("p"))) {
							return myH.get(hand);
							
						}else {
							System.out.println("正しい手を入力しなおしてください");
							hand=scanner.next();
						}
					}
		}
		
		public	String	getRandom()	{
			
			HashMap<String ,String > enH = new HashMap<String, String>(){
				{
					
					put("r","グー");
					put("s","チョキ");
					put("p","パー");
					
					};
				};
			String [] eH= {"r","s","p"};
			
			int i = (int)Math.floor(Math.random()*3);
			
			return enH.get(eH[i]);
			
		}
	}



	


	


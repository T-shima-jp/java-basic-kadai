package kadai_018;
//mainクラス
public class KatoExec_Chapter18  {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18("加藤","東京都中野区〇×");	
		
		taro.setGivenname("太郎");
		taro.execIntroduce();
		
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18("加藤","東京都中野区〇×");
		
		ichiro.setGivenname("一郎");	
		ichiro.execIntroduce();
		
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18("加藤","東京都中野区〇×");
		
		ichiro.setGivenname("花子");
		ichiro.execIntroduce();
	}

}

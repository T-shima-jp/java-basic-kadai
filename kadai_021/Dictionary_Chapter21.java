package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public String[] fnames;
	
	public Dictionary_Chapter21( String[] name ) {
		this.fnames = name;
	}
		
	HashMap<String ,String > hash = new HashMap<String, String>(){
		{
		
		put("apple","りんご");
		put("peach","桃");
		put("banana","バナナ");
		put("lemon","レモン");
		put("pear","梨");
		put("kiwi","キウィ");
		put("strawberry","いちご");
		put("grape","ぶどう");
		put("muscat","マスカット");
		put("cherry","さくらんぼ");
		};
	};
	
	public void search() {
		
		for(String fruit : fnames) {
			
			if(hash.get(fruit)!=null) {
				System.out.println( fruit + "の意味は" + hash.get(fruit));
			}else {
				System.out.println( fruit +"は辞書に存在しません");
			}
		}
	}
}

	

	




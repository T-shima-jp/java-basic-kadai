package kadai_018;
//子クラス
public class KatoIchiro_Chapter18 extends Kato_Chapter18{

	public KatoIchiro_Chapter18(String familyName,String address) {
		this.familyName = familyName;
		this.address = address;
	}
	
	public void setGivenname(String givenName) {
		this.givenName = givenName;
	}
	
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
}

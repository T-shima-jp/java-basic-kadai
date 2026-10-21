package kadai_018;
//子クラス
public class KatoTaro_Chapter18 extends Kato_Chapter18{
	
	public KatoTaro_Chapter18(String familyName,String address) {
		this.familyName = familyName;
		this.address = address;
	}
	
	public void setGivenname(String givenName) {
		this.givenName = givenName;
	}
	
	public void eachIntroduce() {
		System.out.println("Javaが得意です");
	}
}

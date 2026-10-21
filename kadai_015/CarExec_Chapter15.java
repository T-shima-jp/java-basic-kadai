package kadai_015;

public class CarExec_Chapter15 {
	private int gear = 1;
	private int speed = 10;
	
	public CarExec_Chapter15() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void changeGear(int afterGear){
		
		switch (afterGear) {
		case 1 -> this.speed =10;
		case 2 -> this.speed =20;
		case 3 -> this.speed =30;
		case 4 -> this.speed =40;
		case 5 -> this.speed =50;
		default ->this.speed =10;
		}
		
		System.out.println("ギア"+this.gear+"から"+ afterGear +"に切り替えました");
		
	}
	
	public void run() {
		
		System.out.println("速度は時速" + this.speed + "kmです");
		
	}
}

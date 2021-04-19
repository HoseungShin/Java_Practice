package mc.sn.day2;

public class Game369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<51; i++) {
			int tenNum=i/10;
			int oneNum=i%10;
			
			if(oneNum == 3 || oneNum == 6 || oneNum == 9) {
				if(tenNum == 3 || tenNum == 6 || tenNum == 9) {
					System.out.println(i + "¦¦");
				}else {
					System.out.println(i + "¦");
				}
			}
		}
	}

}

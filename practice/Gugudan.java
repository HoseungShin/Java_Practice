package mc.sn.project;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k=0; k<8; k++) {
			int dan = k+2;
			for (int i=0; i<9; i++) {
				//int number = i+1   <- 로 해놓고 아래 println 안에서 number 변수로 활용 가능
				System.out.println(dan+"X"+(i+1)+"="+dan*(i+1));
			}
			System.out.println(); //단이 끝나는 시점이 어딘지 잘 찾아서 넣어야 함.

		}
	}
}

package mc.sn.project;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k=0; k<8; k++) {
			int dan = k+2;
			for (int i=0; i<9; i++) {
				//int number = i+1   <- �� �س��� �Ʒ� println �ȿ��� number ������ Ȱ�� ����
				System.out.println(dan+"X"+(i+1)+"="+dan*(i+1));
			}
			System.out.println(); //���� ������ ������ ����� �� ã�Ƽ� �־�� ��.

		}
	}
}

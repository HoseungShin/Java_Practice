package mc.sn.project;

public class MyCallender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		int day = 0;
		int space = 0;
		for(int i=1;i<=31;i++) {
			day = i;
			System.out.print(day+"\t");
			if ((day+space)%7==0) {
				System.out.println();
			}
		}
	}

}

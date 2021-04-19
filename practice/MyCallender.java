package mc.sn.project;

public class MyCallender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("일\t월\t화\t수\t목\t금\t토");
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

package mc.sn.day2;

public class TestOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int number = 123456;
		int a = 1+1;
		System.out.println(number);
		System.out.println(a);
		
		int c = number - 123450;
		System.out.println(c);
		int splitNum = number %10;
		System.out.println(splitNum);
		int sNum1 = number - splitNum;
		int sNum2 = sNum1 / 10;
		int sNum3 = sNum2 % 10;
		System.out.println(sNum3);
		
		double sNum4 = number / 10.0;
		System.out.println(sNum4);	

		int num = 532;
		num = num / 100 * 100;
		System.out.println(num);
		double pi = 3.141592;
		int p = (int)pi;
		System.out.println(p);
		double pi2 = p;
		System.out.println(pi2);
		
		System.out.println("numberÀÇ °ªÀº"+number);
		*/
		int sum =0;
		int number = 1234;
		
		int numB1 = number % 10;
		number = number / 10;
		System.out.println(numB1);
		sum = sum + numB1;
		
		int numB2 = number % 10;
		number = number / 10;
		System.out.println(numB2);
		
		int numB3 = number % 10;
		number = number / 10;
		System.out.println(numB3);
		
		int numB4 = number % 10;
		number = number / 10;
		System.out.println(numB4);
		
		int total = numB1 + numB2 + numB3 + numB4;
		System.out.println(total);
	}

}

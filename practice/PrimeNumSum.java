package mc.sn.project;

public class PrimeNumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeSum = 0; //소수의 합 구하는 합계 변수
		int number = 0; //소수 임시 저장소
		for(int i =0;i<99;i++) {
			number = i+2; //2부터 100까지의 수에서 반복문 돌리기
			//System.out.println(i+2);
			
			int divNum = 0; //약수 개수를 저장하는 임시 변수
			for(int j=1; j<=number; j++) { //1부터 자기자신까지 반복문 돌리기
				if ((number)%j==0) { //소수를 1부터 자기자신까지의 값으로 나누었을 때 나머지가 0이면 
					divNum = divNum + 1; //divNum 변수에 1을 추가 *divNum이 2이면 소수
				} //if 닫아주고
			} //for 루프도 여기서 끝
			if (divNum==2) {  //위에서 루프 돌린 이후에 divNum값 확인, 값이 2이면 진행
				primeSum = primeSum + number; //소수 합계에 해당 소수 더해줌
				System.out.println(number);	//일단 소수는 출력
			} //if 닫아주고
		} //for 루프 처음 것도 닫아줌. 소수는 계속 출력될거고, 합계는 누적돼 기록됨.
		System.out.println(primeSum); //소수 합계만 최종적으로 딱 한 번 출력.
	} //성공적.
}


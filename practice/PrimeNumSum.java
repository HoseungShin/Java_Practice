package mc.sn.project;

public class PrimeNumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeSum = 0; //�Ҽ��� �� ���ϴ� �հ� ����
		int number = 0; //�Ҽ� �ӽ� �����
		for(int i =0;i<99;i++) {
			number = i+2; //2���� 100������ ������ �ݺ��� ������
			//System.out.println(i+2);
			
			int divNum = 0; //��� ������ �����ϴ� �ӽ� ����
			for(int j=1; j<=number; j++) { //1���� �ڱ��ڽű��� �ݺ��� ������
				if ((number)%j==0) { //�Ҽ��� 1���� �ڱ��ڽű����� ������ �������� �� �������� 0�̸� 
					divNum = divNum + 1; //divNum ������ 1�� �߰� *divNum�� 2�̸� �Ҽ�
				} //if �ݾ��ְ�
			} //for ������ ���⼭ ��
			if (divNum==2) {  //������ ���� ���� ���Ŀ� divNum�� Ȯ��, ���� 2�̸� ����
				primeSum = primeSum + number; //�Ҽ� �հ迡 �ش� �Ҽ� ������
				System.out.println(number);	//�ϴ� �Ҽ��� ���
			} //if �ݾ��ְ�
		} //for ���� ó�� �͵� �ݾ���. �Ҽ��� ��� ��µɰŰ�, �հ�� ������ ��ϵ�.
		System.out.println(primeSum); //�Ҽ� �հ踸 ���������� �� �� �� ���.
	} //������.
}


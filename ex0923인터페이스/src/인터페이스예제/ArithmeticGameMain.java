package �������̽�����;

import java.util.Scanner;

public class ArithmeticGameMain {

	public static void main(String[] args) {

		// ����� ���
		// ����Ƚ�� üũ, 5������ ������ �� �ְԲ� ���� �ۼ�
		Scanner sc = new Scanner(System.in);
		//GameDummy p1 = new GameDummy();// ---> �ӽ� �׽�Ʈ �뵵
		PlusGame p1 = new PlusGame();

		int count = 0;// ������ ������ üũ�ϴ� ����

		// 1. �� 5������ ����
		for (int i = 0; i < 5; i++) {

			// 2. ���� �����ϴ� ���
			p1.makeRandom();
			// 3. ���� ���
			for (int j = 0; j < 3; j++) {
				System.out.println(p1.getQuizMsg());
				int answer = sc.nextInt();
				// 4. �� ������ ������ ���� �� �ִ� ��ȸ�� 3��
				if (p1.checkAnswer(answer)) {
					// ������ �����
					count++;
					break;
				} else {
					// ������ ������ ���ߴ�
					System.out.print("�����Դϴ�!!");
				}
			}
		}
		// 5. ���� ���� Ƚ���� ���
		System.out.println("������ ������" + count + "�� �Դϴ�");
	}
	//��¹� �Է��� �ȵſ�
	System.out.println("����");
	//�ڵ��ϼ��ϸ� �̷��Եſ�
	private void syso() {
		// TODO Auto-generated method stub

	}

}

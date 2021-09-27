package 인터페이스예제;

import java.util.Scanner;

public class ArithmeticGameMain {

	public static void main(String[] args) {

		// 입출력 담당
		// 정답횟수 체크, 5문제를 제시할 수 있게끔 로직 작성
		Scanner sc = new Scanner(System.in);
		//GameDummy p1 = new GameDummy();// ---> 임시 테스트 용도
		PlusGame p1 = new PlusGame();

		int count = 0;// 정답의 개수를 체크하는 역할

		// 1. 총 5문제를 제시
		for (int i = 0; i < 5; i++) {

			// 2. 난수 생성하는 기능
			p1.makeRandom();
			// 3. 문제 출력
			for (int j = 0; j < 3; j++) {
				System.out.println(p1.getQuizMsg());
				int answer = sc.nextInt();
				// 4. 한 문제당 정답을 맞출 수 있는 기회는 3번
				if (p1.checkAnswer(answer)) {
					// 정답을 맞췄다
					count++;
					break;
				} else {
					// 정답을 맞추지 못했다
					System.out.print("오답입니다!!");
				}
			}
		}
		// 5. 맞은 정답 횟수를 출력
		System.out.println("정답의 개수는" + count + "개 입니다");
	}
	//출력문 입력이 안돼요
	System.out.println("수정");
	//자동완성하면 이렇게돼용
	private void syso() {
		// TODO Auto-generated method stub

	}

}

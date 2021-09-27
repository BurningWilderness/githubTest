package 인터페이스예제;

import java.util.Random;

public class PlusGame implements IGame {

	private Random ran;
	private int num1;
	private int num2;

	@Override
	public void makeRandom() {
		ran = new Random();
		num1 = ran.nextInt(9) + 1;
		num2 = ran.nextInt(9) + 1;

	}

	@Override
	public String getQuizMsg() {
		// 4 + 6 =
		String a = num1 + " + " + num2 + " = ";
		return a;
	}

	@Override
	public boolean checkAnswer(int answer) {
		if (num1 + num2 == answer) {
			return true;
		} else {
			return false;
		}
		// return num1 + num2 == answer; --> 참이면 true, 거짓이면 false
		// 비교연산자는 결과값으로 boolean을 되돌려준다

	}
}

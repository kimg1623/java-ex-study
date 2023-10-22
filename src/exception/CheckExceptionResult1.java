package exception;

public class CheckExceptionResult1 {
	/***
     * 요약 : 예외가 발생 했을 때 try catch finally문의 구조를 확인하기
     * 예외 클래스의 상속을 이해한다.
     */
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) throw new ArithmeticException();	// ArithmethicException은 RuntimeException의 자손
			System.out.println(2); // 윗줄에서 예외가 발생하면 실행되지 않음
		} catch(RuntimeException r) {
			System.out.println(3);
			return;
		} catch(Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5); // 예외와 상관없이 항상 실행되는 문장
		}
		System.out.println(6);
	}

	public static void main(String[] args) {
		method(true);
		method(false);
		// 실행결과
		// 1
		// 3
		// 5
		// 1
		// 2
		// 5
		// 6
	} 

}
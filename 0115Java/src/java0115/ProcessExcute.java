package java0115;

import java.io.IOException;

public class ProcessExcute {

	public static void main(String[] args) {
		// Runtime 클래스의 인스턴스 2개 생성
		Runtime d1 = Runtime.getRuntime();
		Runtime d2 = Runtime.getRuntime();
		
		//해시코드 출력
		//해시코드가 동일하게 출력
		//Runtime은 인스턴스를 1개만 만들 수 있는 클래스
		//생성하는 메소드를 여러 번 호출해도 하나만 가지고 작업 - Singleton 패턴
		System.out.println("d1: " + System.identityHashCode(d1));
		System.out.println("d2: " + System.identityHashCode(d2));
		
		//메모장 실행
		try {
			d1.exec("notepad.exe C:\\Users\\tlghk\\Desktop\\0115.txt");  //notepad.exe 와  URL의 사이에는 공백을 줘야 한다.\
			
		} catch (IOException e) {
			e.printStackTrace();
		

		}		
	}

}


















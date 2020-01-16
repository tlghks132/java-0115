package java0115;

public class StringTest {

	public static void main(String[] args) {
		String str = "Hello";
		//String은 자신의 데이터를 수정할 수 없기 때문에 메소드를 호출하거나 + 연산을 하면 결과를 리턴 한다.
		//원본에는 변화가 생기지 않늗다.
		String result = str + "Java";
		str.toUpperCase();
		System.out.println(str);
		
		System.out.println("==========  ===========");
		
		//문자열을 heap에 저장해서 내용을 변경할 수 있는 클래스의 인스턴스 생성
		StringBuilder sb = new StringBuilder("Hello");
		//해시코드 출력
		System.out.println(System.identityHashCode(sb));
		
		//기존 내용에 Java를 이어붙이기 한다.
		sb.append("Java");
		System.out.println(sb);
		//해시코드 출력 : 이전 해시코드와 동일 - 현재 영역에서 작업을 수행
		System.out.println(System.identityHashCode(sb));
		
	}

}













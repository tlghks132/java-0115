package java0115;

public class Main {

	public static void main(String[] args) {
		// 미지정자 자료형 1개를 갖는 클래스의 인스턴스 만들기
		Integer [] ar = {100,200,300};
		//클래스를 만들 때 사용한 P 가 Integer로 치환되서 동작
		Generics <Integer> obj1 = new Generics<Integer>(ar);
		//메소드 호출
		obj1.disp();
		
		String [] br = {"강호동", "유재석"};
		//클래스를 만들 때 사용한 P 가  String 로 치환되서 동작
		Generics <String> obj2 = new Generics<String>(br);
		obj1.disp();	
	}

}

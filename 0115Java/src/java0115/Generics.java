package java0115;

//Generics을 적용된 클래스
public class Generics <P>{
	//P라는 미지정 자료형 배열
	private P [] data;
	
	//생성자
	public Generics(P [] data) {
		this.data = data;
		
	}
	
	//메소드
	public void disp() {
		for(P temp : data) {
			System.out.println(temp + "\t");
		}
		System.out.println();
	}

}

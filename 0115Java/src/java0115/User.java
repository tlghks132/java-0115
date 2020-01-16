package java0115;

public class User implements Comparable<User> {
	private int num;
	private String name;
	private int score;

	// 접근자 메소드 : getters and setters
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// 저장된 값을 빠르게 확인하기 위한 메소드
	@Override
	public String toString() {
		return "User [num = " + num + " name= " + name + ", score =" + score + "]";	
	}
		@Override
		public int compareTo(User o) {
			if(this.num > o.num) {
				return 1;
			}else if(this.num == o.num) {
				return 0;
			}else{
				return -1;
			}
		}
}

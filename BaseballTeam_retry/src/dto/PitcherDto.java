package dto;
/*
 * 투수 개인 정보 java beans
 */
public class PitcherDto extends HumanDto {
	private int win; // 승
	private int lose; // 패
	private Double ERA;// 방어율 Earned Run Average

	public PitcherDto() {
	}

	public PitcherDto(int number, String name, int age, Double height, int win, int lose, Double ERA) {
		super(number, name, age, height);// 부모 클래스까지 생성자로 초기화 상속시 항상 생성자에서 이것도 잘 고려
		this.win = win;
		this.lose = lose;
		this.ERA = ERA;
	}
	/*
	 * 승리 횟수를 돌려준다.
	 */
	public int getWin() {
		return win;
	}

	/*
	 * 패배 횟수를 돌려준다.
	 */
	public int getLose() {
		return lose;
	}

	/*
	 * 방어율을 돌려준다.
	 */
	public Double getERA() {
		return ERA;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public void setERA(Double ERA) {
		this.ERA = ERA;
	}
	
	
	@Override
	public String toString() {
		return "PitcherDto [win=" + win + ", lose=" + lose + ", ERA=" + ERA + "]";
	}
	//여기가 file.txt에 들어갈때 토큰 달고 한줄씩 쓰게하는 템플릿 부분. Ex)김사과-22-11110-3333-1111
	//투수 : 번호(할당), 이름, 나이, 키(height) 승, 패, 방어율 
	@Override
	public String writePlayerInfo() {
		//이거 직접 source -> Override/implement Method 눌러서 내려서 쓴것. 바로 부모클래스의 getter에 접근 가능하다.
		return getNumber() + "-" + getName() + "-" + getAge() + "-" + getHeight() + "-" + getWin() + "-" + getLose()
				+ "-" + getERA();
	}
	
}

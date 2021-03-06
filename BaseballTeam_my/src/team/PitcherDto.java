package team;

/*
 * 투수 개인 정보 java beans
 */
public class PitcherDto extends HumanDto {
	private int win; // 승
	private int lose; // 패
	private Double ERA;// 방어율 Earned Run Average

	public PitcherDto() {
	}

	public PitcherDto(int win, int lose, Double eRA) {
		this.win = win;
		this.lose = lose;
		ERA = eRA;
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

	public void setERA(Double eRA) {
		ERA = eRA;
	}

	@Override
	public String toString() {
		return "Pitcher [number= " + super.getNumber() + ", name= " + super.getName() + ", win=" + win + ", lose=" + lose
				+ ", ERA=" + ERA + "]";
	}

}

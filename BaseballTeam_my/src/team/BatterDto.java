package team;
/*
 * 타자 개인정보 java beans
 */
public class BatterDto extends HumanDto {
	private int AB; //타수 at Bat
	private int safety; // 안타수
	private Double BA; // 타율 Batting average
	
	public BatterDto() {
	}

	public BatterDto(int aB, int safety, Double bA) {
		super();
		AB = aB;
		this.safety = safety;
		BA = bA;
	}
	
	/*
	 * 타수를 돌려준다.
	 */
	public int getAB() {
		return AB;
	}

	/*
	 * 안타수를 돌려준다.
	 */
	public int getSafety() {
		return safety;
	}

	/*
	 * 타율을 돌려준다.
	 */
	public Double getBA() {
		return BA;
	}

	public void setAB(int aB) {
		AB = aB;
	}

	public void setSafety(int safety) {
		this.safety = safety;
	}

	public void setBA(Double bA) {
		BA = bA;
	}

	@Override
	public String toString() {
		return "Batter [number=" + super.getNumber() + ", name=" + super.getName() + ", AB=" + AB + ", safety=" + safety
				+ ", BA=" + BA + "]";
	}
	
}

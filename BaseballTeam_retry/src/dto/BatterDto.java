package dto;
/*
 * 타자 개인정보 java beans
 */
public class BatterDto extends HumanDto {
	private int AB; //타수 at Bat
	private int safety; // 안타수
	private Double BA; // 타율 Batting average
	
	public BatterDto() {
	}

	public BatterDto(int number, String name, int age, Double height, int AB, int safety, Double BA) {
		super(number, name, age, height);
		this.AB = AB;
		this.safety = safety;
		this.BA = BA;
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

	public void setAB(int AB) {
		this.AB = AB;
	}

	public void setSafety(int safety) {
		this.safety = safety;
	}

	public void setBA(Double BA) {
		this.BA = BA;
	}

	@Override
	public String toString() {
		return "BatterDto [AB=" + AB + ", safety=" + safety + ", BA=" + BA + "]";
	}

	//번호(할당), 이름, 나이, 키(height), 타수, 안타수, 타율
	@Override
	public String writePlayerInfo() {
		// TODO Auto-generated method stub
		return getNumber() + "-" + getName() + "-" + getAge() + "-" + getHeight() + "-" + getAB() + "-" + getSafety()
				+ "-" + getBA();
	}
	
	
}

package cls;

public class NameCard {
	String name;
	String phone;
	String email;
	
	PrintNameCard pNameCard;//인스턴스만 만듬 생성안함
	
	public NameCard(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public void setPrintNameCard(PrintNameCard p) {
		// TODO Auto-generated method stub
		pNameCard = p;
	}
	
	public void print() {
		pNameCard.print(this);
	}
	
	PrintPhoneCard pPhoneCard;
	
	public void setPrintPhoneCard(PrintPhoneCard p) {
		pPhoneCard = p;
	}
	
	public void printPhone() {
		pPhoneCard.print(this);
	}
}

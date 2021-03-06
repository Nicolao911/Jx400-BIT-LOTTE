package main;

/*
 * java beans
 */
public class AddressBookDTO {
	String fileName;// 주소록 파일 이름 : fileName.txt 확인해야될듯
	String name; // 이름
	int age; // 나이
	String phone; // 전화번호
	String address;// 주소
	String memo;// 메모
	public AddressBookDTO() {
	}

	public AddressBookDTO(String fileName, String name, int age, String phone, String address, String memo) {
		this.fileName = fileName;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.memo = memo;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override
	public String toString() {
		return "AddressBookDTO [fileName=" + fileName + ", name=" + name + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + ", memo=" + memo + "]";
	}
}

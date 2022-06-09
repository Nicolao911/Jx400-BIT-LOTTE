package dto;

import java.io.Serializable;

//Data Transfer Object -> 생활기록부중에 종이 한장 데이터 하나 -> 데이터
//Value Object -> 데이터 : 읽기전용으로 사용할떄가 많다. 그 이외에는 둘이 같다
public class MemberDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String password;
	private String name;
	private int age;
	
	public MemberDto() {
	}	
	
	public MemberDto(String id, String password, String name, int age) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	@Override
	public String toString() {
		return "MemberDto [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + "]";
	}

	
}

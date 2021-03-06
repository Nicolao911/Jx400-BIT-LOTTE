package main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Generic : 자료형의 변수 클래스 생성시 멤버 변수의 자료형을 인스턴스 만들때 설정할수있다.
		 * 			같은 클래스에서 다양한 자료형(클래스 자료형 : String , Integer)을 사용하고 싶을때
		 * 			정의하는 요소
		 * 
		 */
		box<Integer> box = new box/* <Integer> */(123);//T는 wrapper class로 선언 int가 아니라 Integer로
		// 뒤에 제네릭은 생략해도 된다.
		
		System.out.println(box.getTemp() + 1);
		
		box<String> sbox = new box("hello");
		System.out.println(sbox.getTemp() + 1);
		
		//제네릭은 두개 이상도 사용가능
		
		boxmap<String, Integer> bmap = new boxmap/* <String, Integer> */("홍길동", 22);
		System.out.println(bmap.getName());
		System.out.println(bmap.getValue());
	}
}
//T는 Template의 약자 사용자 지정이라 아무글자도 되지만 대부분 T라고 씀.
class box<T>{
	T temp;
	
	public box(T temp) {
		this.temp = temp;
	}

	public T getTemp() {
		return temp;
	}

	public void setTemp(T temp) {
		this.temp = temp;
	}
	
}

class boxmap<K, V>{
	K name;
	V value;
	
	public boxmap(K name, V value) {
		this.name = name;
		this.value = value;
	}

	public K getName() {
		return name;
	}

	public void setName(K name) {
		this.name = name;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
}
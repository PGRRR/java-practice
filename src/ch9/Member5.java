package ch9;

public class Member5 {
	String name;
	String tel;
	String address;
	
	Member5(){
		this("no name");
		System.out.println("no parameter constructor after this()");
	}
	
	Member5(String name){
		this("test", "222", "NEWYORK");
		System.out.println("one parameter constructor after this()");
		System.out.println("parameter : " + name);
	}
	
	Member5(String name, String tel, String address){
		System.out.println("three parameter constructor call");
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
}

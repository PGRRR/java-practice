package ch9;

public class Member3 {
	String name;
	String tel;
	String address;
	
	Member3(String name, String tel, String address){
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	Member3(String _name, String _tel){
		name = _name;
		tel = _tel;
	}
	
	void print(String name) {
		System.out.println("name : " + this.name + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
}

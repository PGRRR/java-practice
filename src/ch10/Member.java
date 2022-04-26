package ch10;

public class Member {
	private String name;
	private String tel;
	private String address;

	public void printMember() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}

	public String getName() { // getter
		return name;
	}

	public void setName(String name) { // setter
		this.name = name;
	}

	public String getTel() { // getter
		return tel;
	}

	public void setTel(String tel) { // setter
		this.tel = tel;
	}

	public String getAddress() { // getter
		return address;
	}

	public void setAddress(String address) { // setter
		this.address = address;
	}
}

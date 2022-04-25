package javaBasic;
class Data_1 {
	int value;
	
	//Data_1(){} // default constructor auto gen
}

class Data_2 {
	int value;
	Data_2(){} // default constructor
	Data_2(int x){ // constructor with parameter
		value = x;
	}
}


public class DefaultConstructor0425 {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // without default constructor error
		// without parameter error
	}

}

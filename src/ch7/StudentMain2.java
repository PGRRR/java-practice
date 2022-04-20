package ch7;

public class StudentMain2 {

	public static void main(String[] args) {
		Student s3 = new Student();
		s3.name = "Yu";
		s3.kor = 70;
		s3.eng = 80;
		s3.math = 90;
		s3.eval_sum();
		s3.eval_avg();
		System.out.println("Object s3 info");
		s3.print();

		Student s4 = new Student();
		s4.name = "Park";
		s4.kor = 100;
		s4.eng = 80;
		s4.math = 76;
		s4.eval_sum();
		s4.eval_avg();
		System.out.println("Object s4 info");
		s4.print();
		
		Student s5 = new Student();
		s5.name = "Lee";
		s5.kor = 100;
		s5.eng = 100;
		s5.math = 100;
		s5.eval_sum();
		s5.eval_avg();
		System.out.println("Object s5 info");
		s5.print();
	}

}

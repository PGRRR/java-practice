package ch7;

public class StudentMain1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.name = "kim";
		s1.kor = 90;
		s1.eng = 95;
		s1.math = 100;
		s1.sum = s1.kor + s1.eng + s1.math;
		s1.avg = (float) s1.sum / 3;
		
		System.out.println("Object s1 info");
		System.out.println("name : " + s1.name);
		System.out.println("kor : " + s1.kor);
		System.out.println("eng : " + s1.eng);
		System.out.println("math : " + s1.math);
		System.out.println("sum : " + s1.sum);
		System.out.println("avg : " + s1.avg);
		System.out.println();

		s2.name = "one";
		s2.kor = 80;
		s2.eng = 90;
		s2.math = 70;
		s2.sum = s2.kor + s2.eng + s2.math;
		s2.avg = (float) s2.sum / 3;
		
		System.out.println("Object s2 info");
		System.out.println("name : " + s2.name);
		System.out.println("kor : " + s2.kor);
		System.out.println("eng : " + s2.eng);
		System.out.println("math : " + s2.math);
		System.out.println("sum : " + s2.sum);
		System.out.println("avg : " + s2.avg);
		System.out.println();

		s3.name = "n_u";
		s3.kor = 100;
		s3.eng = 100;
		s3.math = 100;
		s3.sum = s3.kor + s3.eng + s3.math;
		s3.avg = (float) s3.sum / 3;
		
		System.out.println("Object s3 info");
		System.out.println("name : " + s3.name);
		System.out.println("kor : " + s3.kor);
		System.out.println("eng : " + s3.eng);
		System.out.println("math : " + s3.math);
		System.out.println("sum : " + s3.sum);
		System.out.println("avg : " + s3.avg);
		System.out.println();
		
	}

}

package ch4;

public class IfElse0407 {

	public static void main(String[] args) {
		int a = 10, b=20;
		boolean flag=false;
		if(a>10) {
			System.out.println("a�� 10���� ũ��");
		}else {
			System.out.println("a�� 10���� ũ�� �ʴ�");
		}
		if(a==10 && b>=20) {
			System.out.println("������ ������");
		}else {
			System.out.println("������ �������� ����");
		}
		if(flag) {
			System.out.println("��");
		}else {
			System.out.println("����");
		}
	}
}

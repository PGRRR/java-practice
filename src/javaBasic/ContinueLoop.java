package javaBasic;

import java.util.Scanner;

public class ContinueLoop {

	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);

		outer : 
			while(true) {
				System.out.println("(1) square");
				System.out.println("(2) square root");
				System.out.println("(3) log");
				System.out.println("Choose your menu (1~3) - exit : 0 >");

				String tmp = sc.nextLine();
				menu = Integer.parseInt(tmp);

				if(menu == 0) {
					System.out.println("Program end");
					break;
				} else if (!(1 <= menu && menu <= 3)) {
					System.out.println("Wrong menu - exit : 0");
					continue;
				}
				for(;;) {
					System.out.println("Please write the number - exit : 0, program end : 99 >");
					tmp = sc.nextLine();
					num = Integer.parseInt(tmp);

					if(num == 0) {
						break;
					}
					if(num == 99) {
						break outer;
					}
					switch(menu) {
					case 1:
						System.out.println("result = " + num * num);
						break;
					case 2:
						System.out.println("result = " + Math.sqrt(num));
						break;
					case 3:
						System.out.println("result = " + Math.log(num));
						break;
					}
				}
			}
		System.out.println("Program end");
	}
}
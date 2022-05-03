package ch13.game;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Character character = null;
        PlayGame pg = null;
        System.out.println("Choose your character \n1.Picachu 2.Gobbok 3.Lee");
        int x = sc.nextInt();
        switch(x){
            case 1:
                character = new Picachu();
                break;
            case 2:
                character = new Gobook();
            case 3:
                character = new Lee();
                break;
            default:
                System.out.println("Wrong");
        }
        if (character == null){
            System.out.println("Exit Game");
            return;
        } else {
            pg = new PlayGame(character);
        }
        while (true){
            pg.printMenu(sc);
            if(pg.isExit()){
                System.out.println("Exit Game");
                break;
            }
        }
    }
}

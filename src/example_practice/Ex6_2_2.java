package example_practice;

class SutdaCard {
    int num;
    boolean isKwang;


    SutdaCard(){}
    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    String info(){

        return num + (isKwang ? "K" : "");
    }
    public void setNum(int num) {
        if (!(0 < num && num <= 10)) return;
        this.num = num;
    }

    public void setKwang(boolean kwang) {
        isKwang = kwang;
    }
}

public class Ex6_2_2 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

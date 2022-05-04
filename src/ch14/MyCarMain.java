package ch14;

public class MyCarMain {
    public static void main(String[] args) {
        MyCar mc = new MyCar("Cruze", "Chevrolet", 12);
        mc.CarInfo();
    }
}

class MyCar {
    String model;
    String company;
    int year;

    MyCar() {
    }

    MyCar(String model, String company, int year) {
        this.model = model;
        this.company = company;
        this.year = year;
    }

    void CarInfo(){
        System.out.printf("Model : %s, Company : %s, Year : %s", model, company, year);
    }
}



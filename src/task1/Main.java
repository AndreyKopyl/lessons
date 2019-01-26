package task1;

public class Main {

    void useToyota(Car toyota){
        toyota.driving();
        toyota.stopTheCar();
        System.out.println("maximum speed: " + toyota.getMaxSpeed());
        System.out.println("number of seats: " + toyota.getNumOfSeats());
    }

    void useBMW(Toyota bmw){
        bmw.driving();
        bmw.stopTheCar();
        System.out.println("maximum speed: " + bmw.getMaxSpeed());
        System.out.println("number of seats: " + bmw.getNumOfSeats());
    }

    public static void main(String[] args){
        Main main = new Main();
        Car toyota = new Toyota();
        Toyota bmw = new BMW();
        main.useToyota(toyota);
        main.useBMW(bmw);

    }
}

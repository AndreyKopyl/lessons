package task1;

public class Car {

    private int speed;
    private int maxSpeed = 240;
    private int numOfSeats = 4;

    public void driving(){
        System.out.println("driving cars");
    }

    public int getNumOfSeats(){
        return numOfSeats;
    }

    public final void stopTheCar(){
        speed = 0;
        System.out.println("car stopped");
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

}

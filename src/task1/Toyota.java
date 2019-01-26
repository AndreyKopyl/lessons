package task1;

public class Toyota extends Car {

    private int numOfSeats = 2;
    private int maxSpeed = 320;

    @Override
    public int getNumOfSeats(){
        return numOfSeats;
    }

    @Override
    public int getMaxSpeed(){
        return maxSpeed;
    }

}

package com.company;

public class Car extends Vehile  {
    private int numberOfSeats;

    public Car (int Seats){
        this.numberOfSeats = Seats;
    }

    public int getSeats(){
        return numberOfSeats;
    }

    @Override
    public void start(){
        System.out.println("start");
    }

    @Override
    public void stop(){
        System.out.println("stop");
    }

}

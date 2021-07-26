package task2;

public class Main {
    public static void main(String args[]) {

    }
}

enum Opt {
    ADD, REMOVE, SHOW, SORT;
}

class Bmw extends Car{
    private String brand;
    private String model;

    public Bmw(String brand, String model){
        this.brand=brand;
        this.model=model;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

class Mersedes extends Car{
    private String brand;
    private String model;

    public Mersedes(String brand, String model){
        this.brand=brand;
        this.model=model;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

interface Alarm {
    default String turnAlarmOn(){
        return "AAAAAAA";
    }
    default String  turnAlarmOff(){
        return "-------";
    }
}

interface Vehicle {
    String getBrand();
    boolean speedUp();
    boolean slowDown();
}

class Car implements Vehicle, Alarm {
    private String brand;
    private boolean speed;
    private boolean slow;

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public boolean speedUp() {
        return speed;
    }

    @Override
    public boolean slowDown() {
        return slow;
    }
}
package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        List<Car> cars = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("choose smth from list: ");
        for (Opt option: Opt.values()){
            System.out.print(option + " ");
        }
        String selected = sc.next().toUpperCase();

        switch (Opt.valueOf(selected)) {
            case ADD -> {
                System.out.println("What to add BMV(1) or Mersedes (2): ");
                int a = sc.nextInt();
                switch (a) {
                    case 1 -> cars.add(new Bmw(sc.next(), sc.next()));
                    case 2 -> cars.add(new Mersedes(sc.next(), sc.next()));
                }
            }
            case REMOVE ->{

            }
        }
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
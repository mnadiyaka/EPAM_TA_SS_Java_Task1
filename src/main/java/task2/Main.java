package task2;

import java.util.logging.Logger;

public class Main {
    public static void main(String args[]) {

    }
}

enum Opt {
    ADD, REMOVE, SHOW, SORT;
}

class Bmw {
}

class Mersedes {
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
}

class Car {//implements Vehicle, Alarm {
}
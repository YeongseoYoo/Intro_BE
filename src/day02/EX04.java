package day02;

public class EX04 {
    public static void main(String[] args){
        Bus bus = new Bus();
        bus.run();
        bus.getWheelNum();

        Taxi taxi = new Taxi();
        taxi.run();
        taxi.getWheelNum();

    }
}

class Car {
    int wheel = 4;

    void getWheelNum(){
        System.out.println("바퀴의 개수는" + wheel + "개입니다.");
    }
    void run(){
        System.out.println("부아앙");
    }

}

class Bus{
    int wheel = 4;
    Bus(){

    }

    void getWheelNum(){
        System.out.println("바퀴의 개수는" + wheel + "개입니다.");
    }
    void run(){
        System.out.println("부릉부릉");
    }
    void ring(){
        System.out.println("삐--");
    }
}

class Taxi extends Car{
    int wheel = 4;

    Taxi(){

    }

    void getWheelNum(){
        System.out.println("바퀴의 개수는" + wheel + "개입니다.");
    }
    void run(){
        System.out.println("빵빵");
    }
}


package day02;

public class Practice1 {
    public static void main(String[] args) {
        Person sonny = new Person("쏘니");
        Person beckham = new Person("베컴");

        SamsungPhone sonnyPhone = new SamsungPhone(sonny);
        ApplePhone beckhamPhone = new ApplePhone(beckham);

        sonnyPhone.turnOn();
        sonnyPhone.getSound();

        beckhamPhone.turnOn();
        beckhamPhone.getSound();
    }
}

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void turnOn() {

    }
}

class Phone {
    private final Person owner;

    Phone(Person owner) {
        this.owner = owner;
    }

    void buyPhone(String brand) {
        System.out.println(owner.getName() + "가 " + brand + "핸드폰을 샀습니다.");
    }

    void getSound() {
        System.out.println("bbeep");
    }
}

class SamsungPhone extends Phone {
    SamsungPhone(Person owner) {
        super(owner);
        buyPhone("삼성");
    }

    void turnOn() {
        System.out.println("야 내 폰 켜볼게");
    }

    void getSound() {
        System.out.println("삐비빅");
    }
}

class ApplePhone extends Phone {
    ApplePhone(Person owner) {
        super(owner);
        buyPhone("애플");
    }


    void turnOn() {
        System.out.println("turn on");
    }

    void getSound() {
        System.out.println("bbeep");
    }
}

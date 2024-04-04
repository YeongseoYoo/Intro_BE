package day02;

public class EX01 {
    public static void main(String[] args){
        Animal dog = new Animal("제이", "멍멍");
        System.out.println(dog.name);
        dog.cry();

    }
}

class Animal{
    String name;
    String sound;
    void cry(){
        System.out.println(sound);
    }

    Animal(String name, String sound){
        this.name = name;
        this.sound = sound;

    }
}
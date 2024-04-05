package day03;

public class EX03 {
    public static void main(String[]args){
        Garden garden = new Garden();
        Dog dog = new Dog();
        Cat cat = new Cat();
        garden.getSound(dog); //이렇게 하면 월월이 나와야 하고
        garden.getSound(cat); //이렇게 하면 야옹이 나와야 한다
        //class Garden
        //class Dob, Cat extends Pet
        //getSound : 매개변수로 전달받은 동물 의 울음소리

    }
}

class Garden{
    Dog dog;
    Pet pet;
    void getSound(Pet pet){
//        if (pet instanceof Dog){
//            System.out.println("월월");
//        } else if (pet instanceof Cat) {
//            System.out.println("야옹");
//
//        }
        pet.cry(); // instanceof를 잘 안쓴다! 다형성으로 이렇게 간결하게 작성 가능하기 때문에!
    }


}

class Pet{

    void cry(){

    }
}
class Dog extends Pet{

    Dog(){

    }
    void cry(){
        System.out.println("월월");

    }
}

class Cat extends Pet{

    Cat(){

    }
    void cry(){
        System.out.println("야옹");

    }
}
package day03;

public class EX02 {
    public static void main(String[]args){
        Parent parent1 = new Parent();
        parent1.method();

        Parent parent2 = new Child();
        parent2.method(); //상속받은 부모의 메소드가 나온다.


        Child child = new Child();
        child.method();

    }
}
class Parent{
    void method(){
        System.out.println("부모 메소드");
    }

}

class Child extends Parent{

    @Override
    void method(){
        System.out.println("자식 메소드");
    }

}

package day01;

public class EX06 {
    public static void main(String[]args){
        Person person = new Person("사람이름");
        Person youngseo = new Person("유영서");

        System.out.println(youngseo.name);
    }
}

class Person{
    String name;
    //생성자
    Person(String name){
        this.name = name;

    }
    //변수 : 부품 역할

}
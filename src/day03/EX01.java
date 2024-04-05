package day03;

public class EX01 {
    public static void main(String[] args){
        //Cow, Chicken: cry() 음메 야옹
        //Farm: getSound() - cow, chicken의 cry
        //Animal: 상속 - 오버라이딩

        Cow cow = new Cow();
        Chicken chicken = new Chicken();
        Farm farm = new Farm(cow, chicken);
    }
}


class Animal{


    void cry(){
        System.out.println("동물 울음소리");
    }
}

class Cow extends Animal{

    Cow(){

    }
    @Override
    void cry() {
        System.out.println("음매");
    }
}

class Farm{
    Cow cow;
    Chicken chicken;

    //필드 값을 초기화해주는 생성자 필요
    Farm(Cow cow ,Chicken chicken){
        this.cow = cow;
        this.chicken = chicken;
    }
    void getSound(){
        cow.cry();
        chicken.cry();
    }
}

class Chicken extends Animal{
    String name;
    Chicken(){

    }

    @Override
    void cry() {
        System.out.println("꼬끼오");
    }
}

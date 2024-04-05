package day03;

public class EX04 {
    public static void main(String[]args){
        //레시피 클래스는 getInfo를 가지고 잇따
        //파스타레시피 - 자식: makesource
        //스테이크레시피 - grill

    }
}

class Recipe{ //부모 클래스
    String name; // 쉐프
    Recipe(String name){
        this.name =name;
    }

    void getInfo(){
        System.out.println("이 레시피는 "+ name + "쉐프님의 레시피입니다.");
    }

}

//class PastaRecipe extends Recipe{
//    void makeSource(){
//        System.out.println("");
//    }
//
//}

class StakeRecipe extends Recipe{
    StakeRecipe(String name){
        super(name);
    }

}
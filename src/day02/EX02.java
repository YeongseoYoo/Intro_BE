package day02;

public class EX02 {
    public static void main(String[]args){
        Coffee americano = new Coffee(4500);
        Barista chunsik = new Barista("춘식");
//        americano.setPrice(3000);
//        americano.getInfo();

        chunsik.getCoffeInfo(americano);
        chunsik.makeCoffee();
    }
}

class Coffee{
    int price;
//    private String temp;
//    private String size;

    Coffee(int price){
        this.price = price;
//        this.temp = temp;
//        this.size = size;
    }

    void setPrice(int price){
        if (price >= this.price) {
            this.price = price;
        }
    }
    int getPrice(){
        return price;
    }
}

class Barista{
    String name;

    Barista(String name){
        this.name = name;
    }
    void getCoffeInfo(Coffee coffee){
        System.out.println("이 커피는 " + coffee.getPrice() + "원입니다.");
    }

    void makeCoffee() {
        System.out.println("커피 여기 있습니다~");
    }
}
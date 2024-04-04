package day01;

public class EX07 {
    public static void main(String[]args){
        //객체 생성
        Notebook Laptop1 = new Notebook("samsung");
        Notebook Laptop2 = new Notebook("LG");
    }
}

class Notebook {
    String brand;
    Notebook(String brand){
        this.brand = brand;
    }
}
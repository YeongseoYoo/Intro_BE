package day03;

public class EX05 {
    public static void  main(String[]args){
        //OTT : 넷플, 티빙
        //printOpeningLogo() : sout "넷플" "티빙"
        //netflix.play() -> print "영상 시작"
        //netflix.finish() : sout "다 봤다"
        //각각의 클래스마다 메소도는 3개
        Netflix netflix = new Netflix();
        netflix.play();
        netflix.finish();
        Tiving tiving = new Tiving();
        tiving.play();
        tiving.finish();


    }
}
abstract class OTT{
    abstract void printOpeningLogo();
    void play(){
        printOpeningLogo();
        System.out.println("영상 시작");

    }

    void finish(){
        System.out.println("다 봤다 \n");

    }

}

class Netflix extends OTT{

    @Override
    void printOpeningLogo(){
        System.out.println("Netflix");
    }



}

class Tiving extends OTT{
    @Override
    void printOpeningLogo(){
        System.out.println("Tiving");
    }


}

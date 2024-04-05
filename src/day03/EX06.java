package day03;

public class EX06 {
    public static void main(String[] args) {

    }
}

interface Phone {
    void charge();
    void useKaKaotalk();
    void useYoutube();
    void checkBattery();
}



class ApplePhone {
    private final int BATTERY_MAX_CAPA =  100; //fix되는 변수 = 상수
    private int batteryStatus = 70; //현재 배터리
    private boolean isOn = true ; //켜져 있다.'

    boolean getIsOn(){
        return isOn;
    }

    void charge(){
        if (batteryStatus == 100) {
            System.out.println("100%입니다.");
            return; //return은 값을 반환하는 용도로도 사용되지만 메소드를 종료시키는 역할도 수행한다.
        }else if (batteryStatus == 95) {
                batteryStatus = 100;
            }
        else{
            batteryStatus += 10;
        }
        System.out.println(batteryStatus + "%가 되었습니다.");

    }

    void operateKakaotalk(){
        if (isOn){
            batteryStatus -= 5;
            if (batteryStatus == 0){
                turnOff();
            }
        }
    }

    void printBattery(){
        System.out.println(batteryStatus+ "%");
    }


}

class Person {
    //charge()
    //useKakaotalk()
    ApplePhone phone;



    //사람이 핸드폰을 들고 태어나지 않기 때문에 생성자에 쓰지않는다.
    //buyPhone() 이 필요한 이유
    void buyPhone(ApplePhone phone){
        this.phone = phone;
    }

    void chargePhone(){
        phone.charge(); //phone에 다 해 놨을 때 이렇게 간단하게 작성 가능!
    }

    void operateKakaotalk(){
        if (phone.getIsOn()){
            phone.operateKakaotalk();
        }
        //켜져 있어야 쓸 수 있다

    }
}



//AppleHone: 배터리용량(정수) 100
//charge() + 10
// useKaKaotalk() -5
//useyoutube() - 10
//배터리 용량 확인
// turnOn : False - >True
// turnOff
//Person class : 애플폰 유저, APplephone 모두 구현
//0일 때 turnOff 하면 useKakaotalk() 에서 if문 안줘도 될 수도??
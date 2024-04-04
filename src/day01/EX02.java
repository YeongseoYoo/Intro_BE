package day01;

import java.util.Scanner;
public class EX02 {
    public static void main(String[] args) {
        // num 변수의 값이 9 면 a, 8이면 b, 7이면 c, 6이하면 f
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result;
        switch (num) {
            case 9:
                result = "a";
                break;
            case 8:
                result = "b";
                break;
            case 7:
                result = "c";
                break;
            default:
                result = "f";
        }
        System.out.println(result);
    }
}

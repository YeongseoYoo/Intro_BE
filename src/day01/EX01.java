package day01;

import java.util.Scanner;
public class EX01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        String result;
        if (score >= 90) {
            result = "A";
        } else if (score >= 80) {
            result = "B";
        } else if ( score >= 70) {
            result = "C";
        }
        else {
            result = "F";
        }
        System.out.println(result);
    }
}

package personal;

import java.util.Scanner;

public class StaticPractice {
    static Scanner sc = new Scanner(System.in);
    static int B, H;
    static boolean flag = true;

    static {
        try {
            B = sc.nextInt();
            H = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid format");
            flag = false;
        }
    }

    static {
        if (flag && (B <= 0 || H <= 0)) {
            flag = false;
            System.out.println("Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print("Area = " + area);
        }
    }
}

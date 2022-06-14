package personal;

import java.util.Scanner;

public class CalculateBonusSalary {
    public static void main(String[] args) {
        int years = 0;
        double salary = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter years of service in whole numbers only: ");
        try {
            years = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid entry");
            System.exit(0);
        }
        if (years < 0) {
            System.out.println("Years of service can not be less than 0");
            System.exit(0);
        } else if (years < 3) {
            System.out.println("We need more years of service from you");
            System.exit(0);
        }
        System.out.println("Enter your salary: ");
        try {
            salary = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid entry");
            System.exit(0);
        }
        if (salary <= 0) {
            System.out.println("Salary can not be in zeroes or in negative");
            System.exit(0);
        }
        System.out.println("Your total salary including bonus is: " + CalculateBonus(years, salary));
    }
    static double CalculateBonus(int years, double salary) {
        double bonus = 0;
        if (years >= 3 && years <= 5) {
            bonus = salary * 0.05;
        } else {
            bonus = salary * 0.1;
        }
        return salary+bonus;
    }
}

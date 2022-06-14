package personal;

import java.util.Scanner;

//6 digits password.
//Should not contain date of birth.
//Should not contain 3 consecutive digits.
//Same digit is not repeated more than 2 times.
//
public class TurkishAirlinesPassword {
    private int dob, password;
    String errMsg;

    public TurkishAirlinesPassword() {
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean passwordLength(String strPassword) {
        if (strPassword.length() != 6) {
            errMsg = "password has to be 6 digits long only. Try again.";
            return false;
        }
        return true;
    }

    public boolean dobInPassword(String strPassword, String strDob) {
        if (strPassword.contains(strDob)) {
            errMsg = "Date of birth can not be your password. Try again.";
            return false;
        }
        return true;
    }

    public boolean checkConsecutiveDigits(String strPassword) {
        for (int i = 0; i < strPassword.length() - 2; i++) {
            if (strPassword.charAt(i + 1) == strPassword.charAt(i) + 1 &&
                    strPassword.charAt(i + 2) == strPassword.charAt(i) + 2) {
                errMsg = "Password can not have 3 consecutive digits. Try again.";
                return false;
            }
        }
        return true;
    }

    public boolean checkRepeatDigits(String strPassword) {
        for (int i = 0; i < strPassword.length() - 1; i++) {
            int counter = 1;
            for (int j = i + 1; j < strPassword.length(); j++) {
                if (strPassword.charAt(i) == strPassword.charAt(j)) {
                    counter++;
                }
            }
            if (counter > 2) {
                errMsg = "Same digit can not be repeated more than twice in password. Try agian.";
                return false;
            }
        }
        return true;
    }
}

class AirlineUsers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TurkishAirlinesPassword user1 = new TurkishAirlinesPassword();

        System.out.println("enter date of birth in mmddyy format: ");
        try {
            user1.setDob(sc.nextInt());
            System.out.println("enter password in 6 digits: ");
            user1.setPassword(sc.nextInt());
        } catch (Exception e) {
            System.out.println("Invalid input format. Try again.");
            System.exit(0);
        }

        String strPassword = String.valueOf(user1.getPassword());

        if (!user1.passwordLength(strPassword) || !user1.dobInPassword(strPassword, String.valueOf(user1.getDob()))
                || !user1.checkConsecutiveDigits(strPassword) || !user1.checkRepeatDigits(strPassword)) {
            System.out.println(user1.errMsg);
        }


    }
}






package personal;

import java.util.Arrays;

public class ListOfPrimes {
    public static void main(String[] args) {

        int[] arrayOfPrimes = new int[20];
        arrayOfPrimes[0] = 2;
        int myNum = 3;
        boolean isPrime = true;
        int i = 1, temp;
        while (i < 20) {
            for (temp = 2; temp < myNum; temp++) {
                if (myNum % temp == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                arrayOfPrimes[i] = myNum;
                i++;}
            isPrime = true;
            myNum++;

        }
        System.out.println(Arrays.toString(arrayOfPrimes));
    }
}


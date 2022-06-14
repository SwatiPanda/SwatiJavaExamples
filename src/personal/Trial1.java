package personal;

//*****************************************
//Find minimum and maximum from an array. *
//Group6: Ayida, Swati, Victoriya         *
//*****************************************

public class Trial1 {
    public static void main(String[] args) {

        int[] array = new int[]{12, -1, 210, 12, 34, 1, 3, 90, 0, 100};
        int holdMin = array[0], holdMax = array[0];

        for (int number : array) {
            holdMin = Math.min(holdMin, number);
            holdMax = Math.max(holdMax, number);
        }

        System.out.println("Min number: " + holdMin + "\nMax number: " + holdMax);

    }
}

package personal;

public class ArithmeticOperators {
    public static void main(String[] args) {



        /** ==============Arithmetic shorthands===============
         *   a += b;
         *   c -=a;
         *   d *= a;
         *   a /= b
         */
//        double a = 11.5;
//        boolean exp = (a%2 == 0);
//        System.out.println(exp);
//        System.out.println(a/2);
//        System.out.println(a%2);
        int x, y, z;
        y = 5;
        if(y++ > 5){
            System.out.println("");
        }
        System.out.println((3 + 4 * 2)/5 - 10 % (7 - 5) * (10 + 3 + 2));
        int n1 = 1, n2 = 5; System.out.println(++n1 * n2--);

    }
}

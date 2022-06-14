package personal;

public class OopConstructorTest {

        int modelYear;
        String modelName;

        public OopConstructorTest(int year, String name) {
            modelYear = year;
            modelName = name;

        }

        public static void main(String[] args) {
            OopConstructorTest myCar = new OopConstructorTest(1969, "Mustang");
            System.out.println(myCar.modelYear + " " + myCar.modelName);
        }
    }

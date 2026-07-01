package harshitt;

public class typecasting {

    static void main(String[] args) {
          // Automatic type casting ( Widening Type Casting)

        int num= 99;
        double decimal= num;
        //  small unit convert to larger one automaticly
        System.out.println("Widening Type Casting");
        System.out.println("integer value "  + num);
        System.out.println("double value "  +decimal);

        System.out.println("\n"); // used to leave a line '\n'.

        // manual type casting(Narrowing Type Casting)
         double number = 465.544;
         int integer = (int) number;
        System.out.println("Narrowing Casting:");
        System.out.println("Double value: " + number);
        System.out.println("Converted to int: " +integer);

    }
}

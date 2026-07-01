public class Main {
    public static void main(String[] args) {
        // Primitive data types..
      int a = 474;              //  store 4  bytes
      short b = 20;             // store 2 bytes
      long amount = 549813;     // store 8 bytes
      float  price = 450.24f;   // store 4 bytes. used to contain decimals.
      double pi= 3.14159265359; //store 8 bytes. used to contain large  decimals.
      char grade = 'A';         // store 2 bytes. store single character.
      boolean condition = true; // store 2 bytes .  true/ false
      System.out.println(a+b+amount+price+pi);
      // typecasting order
      // byte → short → int → long → float → double
  }
}

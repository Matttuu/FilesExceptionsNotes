package SprintTwo;

/*You should remember one thing that whenever you try to print the object directly to the console,
the toString() method is called by itself. So in case you want to change the implementation of
toString() you can override it.*/
public class Main {
    public static void main(String[] args) {

        String data = "Hello world";

        System.out.println(data.toString());  // You don't need "toString()" because this happens on it own.

        Employee emp = new Employee(12, "Jacob");
        System.out.println(emp);



        double leave = 232.53;

        int pop = 78272 -(int) leave;  // Converting leave to be an integer by casting, but we'll lose the ".00" information'
        System.out.println(pop);


        System.out.println( (double) 9/ 2); // We can override by default by casting and tell it what type it should be.


        /** Equal method explained
         * If you use String s1 == String s2, it'll say they are the same because String is NOT a primitive type.
         * But if you do String s2 = "Hi ";
         * s2 = s2 + "there";      Then the result will show they are NOT equal.
         * The == points to the reference. And the String class is immuteable
         * The java compiler is smart enough to recognize that String is immuteable, so the compiler thinks they are the same.
         * But you can work around by making use of "line 29-30" code.
         * So with strings and objects we use .equals
         */


        Person p = new Person(); // Object 1
        Person q = new Person(); // Object 2
        p.name = "bob"; // Initializing
        q.name = "bob"; // Initializing

         if(p == q) { // test they are referencing the exact same object, this is only true if "p" and "q" are the same object.
          //   if (p.equals(q)) { // Does the same thing as the " == " operators.
            System.out.println("They are equal");
        }
        else {
            System.out.println("They are NOT equal");
        }
    }
}

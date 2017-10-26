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
    }
}

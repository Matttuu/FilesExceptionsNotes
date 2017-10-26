package SprintOne;

// By using the Overloading method the computer chooses the best method for the program to run.

public class Overloading {
    public static void main(String[] args) {

        System.out.println("The average of three integers: 3, 5, 8 is: " +
                average(3, 5, 8));

        System.out.println("The average of three doubles: 4.0, 6.0, 18.0 is: " +
                average(4.0, 6.0, 18));


    }
    public static double average(int x, int y, int z)
    {
        return (x + y + z) / 3.0; // When we divide with a double, the computer will automatically choose the larger of the two, int or double and return the double value
    }

    public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }

}

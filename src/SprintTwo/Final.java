package SprintTwo;

public class Final {

    // pi is a universal constant, about as constant as anything can be.
    public static final double PI = 3.141592653589793;

    public final double radius;
    public final double xPos;
    public final double yPos;
    public final double zPos;

    Final(double x, double y, double z, double r) {
        radius = r;
        xPos = x;
        yPos = y;
        zPos = z;
    }

}


// A final method can't be overriden or hidden by subclasses.
/** public class Base
 {
 public       void m1() {...}
 public final void m2() {...}

 public static       void m3() {...}
 public static final void m4() {...}
 }

 public class Derived extends Base
 {
 public void m1() {...}  // OK, overriding Base#m1()
 public void m2() {...}  // forbidden

 public static void m3() {...}  // OK, hiding Base#m3()
 public static void m4() {...}  // forbidden
 } */

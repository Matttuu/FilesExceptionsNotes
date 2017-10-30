package SprintThree;

/** Object cloning, we are making an exact copy of an object with a different name
 * If we don't implement catch exception the program would throw.
 */

public class Dublering implements Cloneable {

    private String dname;

    public Dublering(String dname) {
        this.dname = dname;
    }

    public String getName() {
        return dname;
    }
    // Overriding clone() method of Object class
    public Object clone()throws CloneNotSupportedException{
        return (Dublering)super.clone();
    }

    public static void main(String[] args) {
        Dublering obj1 = new Dublering("Tommy");
        try {
            Dublering obj2 = (Dublering) obj1.clone();
            System.out.println(obj2.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}

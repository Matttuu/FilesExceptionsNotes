package SprintOne;

// A Java superclass is a class which gives a method or methods to a Java subclass.
// A Java class may be either a subclass, a superclass, both, or neither!

public class SuperClassSubClassDemo {

    public static void main(String[] args) {

        SuperClass mySuperClassObject = new SuperClass();
        SubClass mySubClassObject = new SubClass();

        mySuperClassObject.getMessage();
        mySubClassObject.getMessage();

        mySuperClassObject.setMessage(" Hey you! This is a Super Class");
        mySubClassObject.setMessage(" Hey you! This is a Sub Class");

        mySubClassObject.getMessage();
        mySuperClassObject.getMessage();
    }

}

package SprintOne;

// This SubClass inherits everything from SuperClass, by using 'extends'

// The extended SubClasses can overwrite the SuperClass' attributes, but the overrite will only affect this specific class.
public class SubClass extends SuperClass{

    public SubClass() {
        super();
    }

    public void getMessage(){
        System.out.println(" This is the SUBCLASS message" + objectMessage);
    }

}

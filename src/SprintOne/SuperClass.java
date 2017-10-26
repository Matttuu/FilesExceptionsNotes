package SprintOne;

// This Class is a SuperClass, this class contains all the common attributes.
// In the SubClass you inherit everything from the SuperClass, and can add more specific attributes to it.

public class SuperClass {

    public SuperClass() {
        super();
    }
    String objectMessage = " This is the original SuperClass message.";

    public void getMessage(){
        System.out.println(" This is the SUPERCLASS message" + objectMessage);
    }

    public void setMessage(String newMessage){
        this.objectMessage = newMessage;
    }


}

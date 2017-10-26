package SprintTwo;

// Instead of building an object new object everytime you use a method from that thing.
// you can build one reference variable of the superclass and assign it to objects of the subclass and loop through them
// with the polymorphic array.
public class apples {
    public static void main(String[] args) {
        // Bucky is reference variable, which refers to control the stuff in this class/object.
        // Anything that inherits from the superclass which is food, can be assigned to Bucky.
        // tuna bucky = new tuna();
        // food bucky = new tuna();

        food bucky[] = new food[2];
        bucky[0] = new potpie();
        bucky[1] = new tuna();

        for(int x=0; x<2; ++x){
            bucky[x].eat();
        }


        food f1 = new tuna();
        food f2 = new potpie();

        // The f1 reference variable is an instance of the tuna class.

        if(f1 instanceof  tuna){
            System.out.println("I'm a tuna");
        }

        // The f2 reference variable is an instance of the potpie class.
        if (f2 instanceof  potpie){
            System.out.println("I'm a potpie");
        }

    }
}

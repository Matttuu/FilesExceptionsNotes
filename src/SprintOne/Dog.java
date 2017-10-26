package SprintOne;

public class Dog extends Animal{

    public String toString(){
        return "Hello";
    }

    @Override
    void isItOnEarth() {
        super.isItOnEarth();
    }

    String name;
    String breed;

    Dog(String n, String b){
        name = n;
        breed = b;
    }

    void printName(){
        System.out.println(name);
    }
    void printBreed(){
        System.out.println(breed);
    }

    void bark(){
        System.out.println("woof ");
    }

    void dig(){
        System.out.println("wah ");
    }
}

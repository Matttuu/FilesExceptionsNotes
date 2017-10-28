package SprintTwo;

public class Person {

    public String name;

    /** Two persons are the same if they have the same name. */

    public boolean equals (Person other) {
        return name.equals(other.name); //
    }
}
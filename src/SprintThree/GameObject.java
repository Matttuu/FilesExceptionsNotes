package SprintThree;
/**  An abstract class is a class that exists purely to be extended.
 *  You can not create an instance of an abstract class. */
public abstract class GameObject {

    public abstract void draw();

    public static void main(String[] args) {

        GameObject player = new Player();
        player.draw();

        GameObject menu = new Menu();
        menu.draw();
    }

}

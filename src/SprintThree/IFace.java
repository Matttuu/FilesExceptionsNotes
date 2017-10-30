package SprintThree;

/** In this example, Drawable interface has onle one method.
 * It's implementation is provided by Rectangle and Circle classes.
 * In real scenario, interace is defined by someone but implementation
 * is provided by different implmentation providers.
 * And, it is used by someone else.
 * The implementation part is hidden by the user which uses the interface.
 *
 * We use the interface: To achieve abstraction |
 * By interface, we can support the functionality of multiple inheritance
 */
public class IFace {
    }

//Interface declaration: by first user
interface Drawable{
    void draw();
}
//Implementation: by second user
class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}
class Circle implements Drawable{
    public void draw(){System.out.println("drawing circle");}
}
//Using interface: by third user
class TestInterface1{
    public static void main(String args[]){
        Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()
        d.draw();
    }}
import java.io.File;

public class TestFileClass {
    public static void main(String[] args) {
        File file = new File("images/blomst.jpg");
        System.out.println("Does it exist? " + file.exists());
        System.out.println("Last modified on " +
        new java.util.Date(file.lastModified()));


    }
}

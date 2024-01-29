package structure.composite;

/** leaf object */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("square");
    }
}
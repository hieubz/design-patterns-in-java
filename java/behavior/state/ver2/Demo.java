package behavior.state.ver2;

public class Demo {

    public static void main(String[] args) {
        // As we’ve been changing the state of our context,
        // the behavior was changing but the class remains the same
        Package pkg = new Package();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();
    }
}

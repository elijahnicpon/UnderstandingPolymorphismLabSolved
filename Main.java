import java.awt.*;
import java.util.Date;

public class Main {
    // TODO 1.1: Declare a Bird, an Animal, and a Hummingbird.
    static Animal a1;
    static Bird b2;
    static Hummingbird b3;

    public static void main(String[] args) {
        // TODO 1.2: Try to instantiate the values created in the previous step.
        b3 = new Hummingbird(true, new Date(), "Lijah", BeakSize.SMALL, true, Color.BLACK, 2);

        // TODO: 3.2 Instantiate a Hawk, then call both implementations of `killVermin()` from Main.java
        Hawk h1 = new Hawk(true, new Date(), "Lijah", BeakSize.SMALL, true, Color.BLACK, 2);
        h1.killVermin();
        h1.killVermin(2);

        // TODO 4.1: call the toString method of your Hummingbird from TODO 1.2
            // TODO 4.3 & TODO 4.5: Run it again.
        System.out.println(b3.toString());

        // TODO 5.1: Create an Object with a Static type of Bird and Dynamic type of Hummingbird.

        Bird b5 = new Hummingbird(true, new Date(), "Lijah", BeakSize.SMALL, true, Color.BLACK, 2);


        // TODO 5.2: Try to create an Object with a static type of Hawk and dynamic type of Hummingbird.

        // lol

        // TODO 5.3:

        // This is where I made a mistake. Since Bird and Animal are both abstract, we cannot instantiate them.
        // (We could still demonstrate downcasting by calling a
        // Anyways, go ahead and make Bird a concrete class by removing "abstract" from the class declaration.
        // Then, instantiate makeNoise() to satisfy Animal.java.
        // Now, try downcasting from a Bird to a Hummingbird or Hawk.



    }
}

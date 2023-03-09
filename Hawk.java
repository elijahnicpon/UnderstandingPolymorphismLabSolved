import java.awt.*;
import java.util.Date;
import java.util.Random;

public class Hawk extends Bird {
    private int verminKilled;

    public Hawk(boolean isAlive, Date dob, String name,                         //Animal
                BeakSize beakSize, boolean flightCapable, Color wingColor,      //Bird
                int verminKilled) {                                             //Hawk
        super(isAlive, dob, name, beakSize, flightCapable, wingColor);
        this.verminKilled = verminKilled;
    }

    // TODO 2.3.2 Implement makeNoise() here.

    @Override
    public void makeNoise() {
        System.out.println("hawk noises!");
    }


    // TODO 3.1: Overload killVermin() to take in an int.
    public void killVermin(int i) {
        verminKilled += i;
        System.out.println(getName() + " murdered " + i + " vermin."
                + "\n total: " + verminKilled);
    }

    public void killVermin() {
        int randomInt = (int) Math.random() * 5;
        verminKilled += randomInt;
        System.out.println(getName() + " murdered " + randomInt + " vermin."
                + "\n total: " + verminKilled);
    }

    @Override
    public void fly() {
        System.out.println("flying! (but with wings flapping faster)");
    }
}

import java.awt.*;
import java.util.Date;

public abstract class Bird extends Animal {
    private BeakSize beakSize;
    private boolean flightCapable;
    private Color wingColor;

    public Bird(boolean isAlive, Date dob, String name,                         //Animal
                BeakSize beakSize, boolean flightCapable, Color wingColor) {    //Bird
        super(isAlive, dob, name);
        this.beakSize = beakSize;
        this.flightCapable = flightCapable;
        this.wingColor = wingColor;
    }

    public abstract void fly();

    public void layEgg() {
        System.out.println("laying egg: plop!");
    }

    // TODO 2.2: Implement makeNoise() here.
//    public void makeNoise() {
//        System.out.println("chirp");
//    }


    @Override
    public String toString() {
        return super.toString() + "\n"
                + "beakSize: " + beakSize + ", flightCapable" + flightCapable + ", wingColor:" + wingColor.toString();
    }



}

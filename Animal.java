import java.util.Date;

public abstract class Animal {
    private boolean isAlive;
    private Date dob;

    private String name;

    public Animal(boolean isAlive, Date dob, String name) {
        this.isAlive = isAlive;
        this.dob = dob;
        this.name = name;
    }

    public int getAge() {
        if (!isAlive) return -1;
        else return dob.getYear() - new Date().getYear();
    }

    // TODO 2.1: Declare an abstract method in Animal.java called makeNoise().
    public abstract void makeNoise();

    public void die() {
        isAlive = false;
        System.out.println("rip, " + name);
    }

    // TODO 4.4: add a super.toString() call to this toString() method.
    @Override
    public String toString() {
        return super.toString() + "\n" + name +  ", isAlive: " + isAlive + ", dob: " + dob.toString();
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

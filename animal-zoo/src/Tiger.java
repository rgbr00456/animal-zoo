public class Tiger extends Animal implements Eat, Walk {
    private int numberOfStripes;
    private double speed;
    private int soundLevel;

    public Tiger(String name, int numberOfStripes, double speed, int soundLevel) {
        super(name);
        this.numberOfStripes = numberOfStripes;
        this.speed = speed;
        this.soundLevel = soundLevel;

        setHeight(110);
        setWeight(100);
        setAge(5);
    }
    @Override
    public void eatingFood() {
        System.out.println("Tiger is eating meat.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat");
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    @Override
    public void walking() {
        System.out.println("I'm walking at " + speed + " speed.");
    }
}
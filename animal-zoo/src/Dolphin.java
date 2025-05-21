public class Dolphin extends Animal implements Eat, Swim {
    private String color;
    private double swimmingSpeed;

    public Dolphin(String name, String color, double swimmingSpeed) {
        super(name);
        this.color = color;
        this.swimmingSpeed = swimmingSpeed;

        setHeight(76);
        setWeight(550);
        setAge(2);
    }
    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSwimmingSpeed() { // Getter correto
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) { // Setter correto
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swimming() {
        System.out.println("I'm swimming at " + swimmingSpeed + " speed.");
    }
}
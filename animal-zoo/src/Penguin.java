public class Penguin extends Animal implements Walk, Swim {
    private String color;
    private double swimSpeed;
    private double walkSpeed;
    boolean isSwimming = false;

    public Penguin(String name, String color, double swimSpeed) {
        super(name);
        this.color = color;
        this.swimSpeed = swimSpeed;
        this.walkSpeed = 0;// valor padrão
        this.isSwimming = false;
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    // Getters
    public String getColor() {
        return color;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public double getWalkSpeed() {
        return walkSpeed;
    }

    // Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public void setWalkSpeed(double walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    // Implementações de interfaces
    @Override
    public void swimming() {
        if(isSwimming) {
            System.out.println(nameOfAnimal + " is swimming at " + swimSpeed + " km/h.");
        } else {
            System.out.println(nameOfAnimal + " is not swimming right now.");
        }
    }

    @Override
    public void walking() {
        System.out.println(nameOfAnimal + " is waddling at " + walkSpeed + " km/h.");
    }

    @Override
    public void eatingFood() {
        System.out.println(nameOfAnimal + " is eating fish.");
    }
}

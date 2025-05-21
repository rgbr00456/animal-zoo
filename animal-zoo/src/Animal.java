abstract public class Animal implements Eat {

    public String nameOfAnimal;

    public double weight;

    public double height;

    public int age;

    public Animal() {
        nameOfAnimal = "Unkown Animal";
    }

    public Animal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public String nameOfAnimal() {
        return nameOfAnimal;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void eatingFood (){
        System.out.println("The animal " + nameOfAnimal + " is eating food.");
    }

    public void eatingCompleted (){
        System.out.println("The animal " + nameOfAnimal + "ate.");
    }

}

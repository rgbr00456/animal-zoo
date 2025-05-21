import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int continueOuterLoop;

        do {
            int animalChoice = animalChoiceMenu(keyboard);
            Animal animal = null;

            switch (animalChoice) {
                case 1: // Tiger
                    animal = createTiger(keyboard);
                    break;
                case 2: // Dolphin
                    animal = createDolphin(keyboard);
                    break;
                case 3: // Penguin
                    animal = createPenguin(keyboard);
                    break;
                default:
                    System.out.println("Invalid option.");
            }

            if (animal != null) {
                handleAnimalDetails(keyboard, animal);
            }

            System.out.println("Continue main menu? (1-Yes / 2-No)");
            continueOuterLoop = keyboard.nextInt();
        } while (continueOuterLoop == 1);
    }

    private static int animalChoiceMenu(Scanner keyboard) {
        System.out.println("******* ZOO ANIMAL choice menu *******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.print("Enter choice of animal (1-3): ");
        return keyboard.nextInt();
    }

    private static Animal createTiger(Scanner keyboard) {
        System.out.print("Number of stripes: ");
        int stripes = keyboard.nextInt();
        System.out.print("Speed (km/h): ");
        double speed = keyboard.nextDouble();
        System.out.print("Roar sound level (dB): ");
        int roar = keyboard.nextInt();
        return new Tiger("Tiger", stripes, speed, roar);
    }

    private static Animal createDolphin(Scanner keyboard) {
        System.out.print("Dolphin name: ");
        String name = keyboard.next();
        System.out.print("Color: ");
        String color = keyboard.next();
        System.out.print("Swim speed (km/h): ");
        double swimSpeed = keyboard.nextDouble();
        return new Dolphin(name, color, swimSpeed);
    }

    private static Animal createPenguin(Scanner keyboard) {
        System.out.print("Penguin name: ");
        String name = keyboard.next();
        System.out.print("Color: ");
        String color = keyboard.next();
        System.out.print("Initial swim speed (km/h): ");
        double swimSpeed = keyboard.nextDouble();
        return new Penguin(name, color, swimSpeed);
    }

    private static void handleAnimalDetails(Scanner keyboard, Animal animal) {
        int choice;
        do {
            choice = animalDetailsMenu(keyboard, animal);
            switch (choice) {
                case 1:
                    setProperties(keyboard, animal);
                    break;
                case 2:
                    displayProperties(animal);
                    break;
                case 3:
                    displayMovement(animal);
                    break;
                case 4:
                    animal.eatingFood();
                    animal.eatingCompleted();
                    break;
                default:
                    System.out.println("Invalid option.");
            }
            System.out.println("Continue with this animal? (1-Yes / 2-No)");
        } while (keyboard.nextInt() == 1);
    }

    private static int animalDetailsMenu(Scanner keyboard, Animal animal) {
        System.out.println("******* ANIMAL details menu for: " + animal.nameOfAnimal() + " *******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");
        System.out.print("Enter choice (1-4): ");
        return keyboard.nextInt();
    }

    private static void setProperties(Scanner keyboard, Animal animal) {
        System.out.print("Weight (kg): ");
        animal.setWeight(keyboard.nextDouble());
        System.out.print("Height (cm): ");
        animal.setHeight(keyboard.nextDouble());
        System.out.print("Age (years): ");
        animal.setAge(keyboard.nextInt());

        if (animal instanceof Tiger) {
            Tiger tiger = (Tiger) animal;
            System.out.print("Number of stripes: ");
            tiger.setNumberOfStripes(keyboard.nextInt());
            System.out.print("Speed (km/h): ");
            tiger.setSpeed(keyboard.nextDouble());
            System.out.print("Roar sound level (dB): ");
            tiger.setSoundLevel(keyboard.nextInt());
        } else if (animal instanceof Dolphin) {
            Dolphin dolphin = (Dolphin) animal;
            System.out.print("Color: ");
            dolphin.setColor(keyboard.next());
            System.out.print("Swim speed (km/h): ");
            dolphin.setSwimmingSpeed(keyboard.nextDouble());
        } else if (animal instanceof Penguin) {
            Penguin penguin = (Penguin) animal;
            System.out.print("Is the penguin swimming (true/false): ");
            penguin.setSwimming(keyboard.nextBoolean());
            System.out.print("Enter the walk speed of the penguin (km/h): ");
            penguin.setWalkSpeed(keyboard.nextDouble());
            System.out.print("Enter the swim speed of the penguin (km/h): ");
            penguin.setSwimSpeed(keyboard.nextDouble());
        }
    }

    private static void displayProperties(Animal animal) {
        System.out.println("Age: " + animal.getAge() + " years");
        System.out.println("Height: " + animal.getHeight() + " cm");
        System.out.println("Weight: " + animal.getWeight() + " kg");

        if (animal instanceof Tiger) {
            Tiger tiger = (Tiger) animal;
            System.out.println("Stripes: " + tiger.getNumberOfStripes());
            System.out.println("Speed: " + tiger.getSpeed() + " km/h");
            System.out.println("Roar level: " + tiger.getSoundLevel() + " dB");
        } else if (animal instanceof Dolphin) {
            Dolphin dolphin = (Dolphin) animal;
            System.out.println("Color: " + dolphin.getColor());
            System.out.println("Swim speed: " + dolphin.getSwimmingSpeed() + " km/h");
        } else if (animal instanceof Penguin) {
            Penguin penguin = (Penguin) animal;
            // Removed color display and adjusted labels
            System.out.println("Walking Speed: " + penguin.getWalkSpeed() + " km/h");
            System.out.println("Swimming Speed: " + penguin.getSwimSpeed() + " km/h");
            System.out.println("Currently Swimming: " + penguin.isSwimming());
        }
    }

    private static void displayMovement(Animal animal) {
        if (animal instanceof Walk) {
            ((Walk) animal).walking();
        }
        if (animal instanceof Swim) {
            ((Swim) animal).swimming();
        }
    }
}
interface Flyable {
    void fly();

    abstract class Bird implements Flyable {
        String species;

        public Bird(String species) {
            this.species = species;
            System.out.println("Bird constructor: species = " + species);
        }
    }


    class Eagle extends Bird {
        public Eagle(String species) {
            super(species);
            System.out.println("Eagle constructor");
        }

        public void fly() {
            System.out.println(species + " is flying!");
        }
    }

    class Main {
        public static void main(String[] args) {
            Flyable myEagle = new Eagle("Golden Eagle");
            myEagle.fly();
        }
    }
}

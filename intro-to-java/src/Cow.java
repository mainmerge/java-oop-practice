public class Cow extends Animal {

    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Moo");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println(name + " eats grass");
        } else {
            System.out.println(name + " cannot eat meat");
        }
    }
}

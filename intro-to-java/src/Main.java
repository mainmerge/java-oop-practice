public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Barsik");
        Food meat = new Meat();
        Food grass = new Grass();

        cat.eat(meat);
        cat.eat(grass);
    }
}

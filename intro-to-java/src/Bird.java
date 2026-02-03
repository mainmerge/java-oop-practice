public class Bird extends Pet {
    private double wingSpan;

    public Bird(String name, int age, double wingSpan) {
        super(name, "Bird", age);
        this.wingSpan = wingSpan;
    }
}

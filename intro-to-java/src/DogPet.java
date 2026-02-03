public class DogPet extends Pet {
    private String favoriteToy;

    public DogPet(String name, int age, String favoriteToy) {
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }
}

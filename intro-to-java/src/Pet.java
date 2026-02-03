public class Pet {
    protected String name;
    protected String species;
    protected int age;

    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public void showInfo() {
        System.out.println(name + ", " + species + ", age: " + age);
    }

    public int humanAge() {
        return age * 7;
    }
}

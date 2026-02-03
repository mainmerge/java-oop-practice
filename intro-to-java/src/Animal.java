public abstract class Animal {
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void makeSound();
    public void walk(){
        System.out.println(name + " " + "is walking.");
    };

    public void eat(Food food) {
        System.out.println(name + " eats " + food.getType());
    }
}

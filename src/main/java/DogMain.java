public class DogMain {
    public static void main(String[] args) {
        Dog Doggy = new Dog();
        Doggy.speed = 5;
        Doggy.breed = "Buldog";
        Doggy.name = "Din";

        Doggy.run();
        System.out.println(Doggy.info());

    }
}

package animal_exercise;

public class Spider extends Animal {

    protected Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("The spider is eating");
    }
}

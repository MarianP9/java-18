package initialization;

public class BaseClass {
    private int var = 100;

    static {
        System.out.println("BaseClass static block");
    }

    {
        System.out.println("BaseClass regular block");
        var = 100;
    }

    public BaseClass() {
        System.out.println("Base constructor");
    }
}

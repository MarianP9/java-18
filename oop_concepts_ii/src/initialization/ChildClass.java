package initialization;

public class ChildClass extends BaseClass {
    static {
        System.out.println("Child static block");
    }

    {
        System.out.println("Child regular block");
    }

    public ChildClass() {
        System.out.println("Child constructor");
    }
}

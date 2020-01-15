package primitiveAndNonprimitive;

public class Examples {
    public static void main(String[] args) {
        int primitiveValue = 5;
        System.out.println("primitiveValue is " + primitiveValue);
        changePrimitiveValue(primitiveValue);
        System.out.println("primitiveValue is " + primitiveValue);

        Test test = new Test();
        test.setInstanceValue(888);
        System.out.println("instanceValue is " + test.getInstanceValue());
        changeObjectValue(test);
        System.out.println("instanceValue is " + test.getInstanceValue());

    }

    public static void changePrimitiveValue(int value) {
        value = 100;
    }

    public static void changeObjectValue(Test object) {
        object.setInstanceValue(1000);
    }
}

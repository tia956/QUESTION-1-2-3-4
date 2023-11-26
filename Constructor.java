public class Example {
    private int num;

    public Example(int num) {
        this.num = num;
    }

    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    public static void staticMethod1() {
        System.out.println("This is static method 1.");
    }

    public static void staticMethod2() {
        System.out.println("This is static method 2.");
    }
}
